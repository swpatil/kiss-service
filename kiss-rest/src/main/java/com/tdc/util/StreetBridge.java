package com.tdc.util;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import org.hibernate.search.bridge.TwoWayStringBridge;

import com.tdc.persistence.ams.dao.entity.StreetsId;

public class StreetBridge implements TwoWayStringBridge {

	@Override
	public String objectToString(Object arg0) {
		String retString = null;

		if (arg0 instanceof StreetsId) {
			StreetsId id = (StreetsId) arg0;
			StringBuilder sb = new StringBuilder();
			retString = sb.append(id.getStreetId()).append("_")
					.append(id.getStartdate()).toString();
		}

		return retString;
	}

	@Override
	public Object stringToObject(String arg0) {
		String[] fields = arg0.split("_");

		StreetsId streetsId = new StreetsId();
		streetsId.setStreetId(Long.parseLong(fields[0]));
		
		java.util.Date date;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSS")
			.parse(fields[1]);
			streetsId.setStartdate(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

		return streetsId;
	}

}
