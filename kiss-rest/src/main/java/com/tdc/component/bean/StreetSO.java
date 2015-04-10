package com.tdc.component.bean;

import java.io.Serializable;
import java.util.Date;

public class StreetSO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private MunicipalitySO municipalities;
	
	private Short streetcode;
	private String streetname;
	private String streetnameAbbreviated;
	private String source;
	private Date enddate;
	private String initials;
	private Date createddate;
	public MunicipalitySO getMunicipalities() {
		return municipalities;
	}
	public void setMunicipalities(MunicipalitySO municipalities) {
		this.municipalities = municipalities;
	}
	public Short getStreetcode() {
		return streetcode;
	}
	public void setStreetcode(Short streetcode) {
		this.streetcode = streetcode;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public String getStreetnameAbbreviated() {
		return streetnameAbbreviated;
	}
	public void setStreetnameAbbreviated(String streetnameAbbreviated) {
		this.streetnameAbbreviated = streetnameAbbreviated;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public String getInitials() {
		return initials;
	}
	public void setInitials(String initials) {
		this.initials = initials;
	}
	public Date getCreateddate() {
		return createddate;
	}
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	
	

}
