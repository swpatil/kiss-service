package com.tdc.component.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class MunicipalitySO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private short municipalitycode;
	private RegionSO regions;
	private String municipalityname;
	private Set<StreetSO> streetses = new HashSet<StreetSO>(0);
	public short getMunicipalitycode() {
		return municipalitycode;
	}
	public void setMunicipalitycode(short municipalitycode) {
		this.municipalitycode = municipalitycode;
	}
	public RegionSO getRegions() {
		return regions;
	}
	public void setRegions(RegionSO regions) {
		this.regions = regions;
	}
	public String getMunicipalityname() {
		return municipalityname;
	}
	public void setMunicipalityname(String municipalityname) {
		this.municipalityname = municipalityname;
	}
	public Set<StreetSO> getStreetses() {
		return streetses;
	}
	public void setStreetses(Set<StreetSO> streetses) {
		this.streetses = streetses;
	}
	
	
	

}
