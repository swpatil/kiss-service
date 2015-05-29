package com.tdc.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tdc.component.bean.InstallationResult;
import com.tdc.component.bean.InstallationSO;


@RestController
@RequestMapping("/exportToExcel")
public class ExportToExcelHelper {
	
	/**
	 * Workbook Sheet Name
	 */
	private static final String WB_SHEET_NAME = "Sheet1";
	
	/**
	 * Maintain the maximum count of character per column
	 */
	private List<Integer> columnWidths=new ArrayList<Integer>();
	
	/**
	 * Cell Line Seprator
	 */
	private static final String SYSTEM_LINE_SEPRATOR="\n";	
	
	/**
	 * Number pattern for checking number data
	 */
	private Pattern p = Pattern.compile("^[-+]?\\d*\\.{0,1}\\d+$");
	
	/**
	 * Property used in AWT unix OS x-server issue.
	 */
	private static final String JAVA_AWT_HEADLESS="java.awt.headless";	
	
	@RequestMapping(value="/installations",method = RequestMethod.GET)
	public void installationsExcel(HttpServletRequest request,HttpServletResponse response) {
		
		
		HSSFWorkbook wb = new HSSFWorkbook();
		createWBSheetHeadRow(wb,"Street Name",
				"House Nr.",
				"Floor",
				"Location",
				"Side",
				"Status",
				"Locality",
				"Postal Code",
				"Post-Area",
				"Fra kundenr",
				"Til kundenr",
				"Movement Date");
		
		InstallationResult installationResult = (InstallationResult)request.getSession().getAttribute("exportToExsInstallations");
		int rowCount = 0;
		for (InstallationSO installations : installationResult.getInstallations()) {
		rowCount++;	
		createWbSheetDataRow(rowCount,wb,
				installations.getAddress().getStreets().getStreetname(),
				installations.getAddress().getHouseno(),
				installations.getAddress().getFloor(),
				"",
				"",
				"",
				"",
				installations.getAddress().getPostalcode(),
				installations.getAddress().getStreets().getMunicipalities().getMunicipalityname(),
				"",
				"",
				"");
				}
		try {
			exportToExcelSheet(wb, response);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("deprecation")
	private void createWBSheetHeadRow(HSSFWorkbook wb, String... strHead) {
		HSSFSheet wbSheet = wb.createSheet(WB_SHEET_NAME);		
		HSSFCellStyle cellStyle = wb.createCellStyle();
		cellStyle.setAlignment(HSSFCellStyle.ALIGN_LEFT);
		HSSFCellStyle headingStyle = wb.createCellStyle();
		HSSFFont font = wb.createFont();
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		headingStyle.setFont(font);
		// Added for wrapping text. i.e comments which is too long
		headingStyle.setWrapText(false);
		headingStyle.setBorderBottom((short)1);
		headingStyle.setBorderLeft((short)1);
		headingStyle.setBorderRight((short)1);
		headingStyle.setBorderTop((short)1);

		HSSFRow rowHead = wbSheet.createRow(0);

		for (int i = 0; i < strHead.length; i++) {
			HSSFCell cellHeading = rowHead.createCell((short) i);
			cellHeading.setCellValue(new HSSFRichTextString(strHead[i]));
			cellHeading.setCellStyle(headingStyle);
			
			columnWidths.add(getMaximumLength(strHead[i]));			
		}		
	}
	
	/**
	 * This method return the length of string 
	 * if string contains newline character then the length of string
	 * will be equals to the length of maximum token, string tokenized
	 * based on the new line character.
	 * Default length is 1 if input string is null.
	 * @param inputString
	 * @return
	 */
	private int getMaximumLength(String inputString){
		int length=1;
		if(inputString!=null && inputString.contains(SYSTEM_LINE_SEPRATOR)){
			StringTokenizer strTokenizer=new StringTokenizer(inputString,SYSTEM_LINE_SEPRATOR);			
			int maxLength=0;
			while(strTokenizer.hasMoreTokens()){
				String myToken=strTokenizer.nextToken();
				if(myToken!=null && maxLength<myToken.trim().length()){
					maxLength=myToken.trim().length();			
				}
			}
			length=maxLength;			
		}else if(inputString!=null && !inputString.contains(SYSTEM_LINE_SEPRATOR)){
			length=inputString.trim().length();
		}
		return length;
	}
	
	/**
	 * Add new data row in workbook sheet.
	 * 
	 * @param rowCount
	 * @param wbSheet
	 * @param strData
	 */
	@SuppressWarnings("deprecation")
	private void createWbSheetDataRow(int rowCount, HSSFWorkbook wb,
			String... strData) {
		HSSFSheet wbSheet=wb.getSheet(WB_SHEET_NAME);
		HSSFRow rowData = wbSheet.createRow(rowCount);	
		HSSFCellStyle rowStyle = wb.createCellStyle();
		HSSFDataFormat df = wb.createDataFormat();
//		 Added for wrapping text. i.e comments which is too long
		rowStyle.setWrapText(false);
		rowStyle.setBorderBottom((short)1);
		rowStyle.setBorderLeft((short)1);
		rowStyle.setBorderRight((short)1);
		rowStyle.setBorderTop((short)1);
		rowStyle.setAlignment((short)1);
		for (int i = 0; i < strData.length; i++) {
			HSSFCell cellData = rowData.createCell((short) i);
			rowStyle.setDataFormat(df.getFormat("General"));
			cellData.setCellStyle(rowStyle);
			//checking data type as numeric
			if(isIntNumber(strData[i])){
				rowStyle.setDataFormat(df.getFormat("0"));
				cellData.setCellStyle(rowStyle);
				try{					
					cellData.setCellValue(Double.parseDouble(strData[i].trim()));
				}catch(NumberFormatException nfe){
					cellData.setCellValue(new HSSFRichTextString(strData[i] == null ? null:strData[i].trim()));
				}
			}else{
				//set text data
				 cellData.setCellValue(new HSSFRichTextString(strData[i] == null ? null:strData[i].trim()));
			}
			
			if(i<columnWidths.size() && strData[i]!=null){
				int maxLength=getMaximumLength(strData[i]);
				if(columnWidths.get(i)<maxLength){
					columnWidths.set(i,maxLength);
			
				}
			}
		}
	}
	
	//Numberic data checking
	public boolean isIntNumber(String num){  
		if(num!=null){
			Matcher m=p.matcher(num.trim());
			if(m.find()){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Write the workbook at the response outputstream.
	 * 
	 * @param wb
	 * @param response
	 * @throws IOException
	 */
	@SuppressWarnings("deprecation")
	private void exportToExcelSheet(HSSFWorkbook wb,
			HttpServletResponse response) throws IOException {
		response.reset();
		response.setContentType("application/vnd.ms-excel");
		response.setHeader("Content-Disposition",
				"attachment;filename=ExportExcel.xls");
		ServletOutputStream os = response.getOutputStream();
		HSSFSheet wbSheet = wb.getSheet(WB_SHEET_NAME);

		if (wbSheet != null) {
			System.setProperty(JAVA_AWT_HEADLESS, "true");
			HSSFRow rowHead = wbSheet.getRow(0);
			for (int i = 0; i < rowHead.getPhysicalNumberOfCells(); i++) {
				short columnWidth=(short) (columnWidths.get(i) * Integer.valueOf(315));
				if(columnWidth<0)
					columnWidth=Short.MAX_VALUE;
				wbSheet.setColumnWidth((short) i,columnWidth);
			}
		}

		wb.write(os);
		os.flush();
		response.flushBuffer();
	}
	

}
