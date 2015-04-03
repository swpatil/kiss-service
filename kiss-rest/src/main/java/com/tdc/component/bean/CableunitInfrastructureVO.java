package com.tdc.component.bean;

import java.util.List;

public class CableunitInfrastructureVO {
	
	private String cableUnitNumber;
  	private String cableUnitName;  	
  	private List<CaseInfrastructureVO> caseInfrastructures;
  	private String validCaseNumber;
  	
  	
	public String getCableUnitNumber() {
		return cableUnitNumber;
	}
	public void setCableUnitNumber(String cableUnitNumber) {
		this.cableUnitNumber = cableUnitNumber;
	}
	public String getCableUnitName() {
		return cableUnitName;
	}
	public void setCableUnitName(String cableUnitName) {
		this.cableUnitName = cableUnitName;
	}
	public List<CaseInfrastructureVO> getCaseInfrastructures() {
		return caseInfrastructures;
	}
	public void setCaseInfrastructures(
			List<CaseInfrastructureVO> caseInfrastructures) {
		this.caseInfrastructures = caseInfrastructures;
	}
	public String getValidCaseNumber() {
		return validCaseNumber;
	}
	public void setValidCaseNumber(String validCaseNumber) {
		this.validCaseNumber = validCaseNumber;
	}
  	
  	
  	
  	

}
