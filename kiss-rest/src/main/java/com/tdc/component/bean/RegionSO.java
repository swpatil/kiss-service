package com.tdc.component.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

public class RegionSO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private BigDecimal regionid;
	private String regionname;
	private boolean accessClass;
	//private Set<MunicipalitySO> municipalitieses ;
	public BigDecimal getRegionid() {
		return regionid;
	}
	public void setRegionid(BigDecimal regionid) {
		this.regionid = regionid;
	}
	public String getRegionname() {
		return regionname;
	}
	public void setRegionname(String regionname) {
		this.regionname = regionname;
	}
	public boolean isAccessClass() {
		return accessClass;
	}
	public void setAccessClass(boolean accessClass) {
		this.accessClass = accessClass;
	}
	/*public Set<MunicipalitySO> getMunicipalitieses() {
		return municipalitieses;
	}
	public void setMunicipalitieses(Set<MunicipalitySO> municipalitieses) {
		this.municipalitieses = municipalitieses;
	}*/
	
	


}
