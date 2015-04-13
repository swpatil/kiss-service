package com.tdc.util;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SearchAddressRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String houseno;
	private String floor;
	private String door;
	private String placename;
	private String postalcode;
	private Boolean zapFictive;
	private Date enddate;
	private Date createddate;
	private Short streetcode;
	private String streetname;
	private String source;
	private short municipalitycode;
	private String municipalityname;

	private BigDecimal regionid;
	private String regionname;

	public String getHouseno() {
		return houseno;
	}

	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getDoor() {
		return door;
	}

	public void setDoor(String door) {
		this.door = door;
	}

	public String getPlacename() {
		return placename;
	}

	public void setPlacename(String placename) {
		this.placename = placename;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public Boolean getZapFictive() {
		return zapFictive;
	}

	public void setZapFictive(Boolean zapFictive) {
		this.zapFictive = zapFictive;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
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

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public short getMunicipalitycode() {
		return municipalitycode;
	}

	public void setMunicipalitycode(short municipalitycode) {
		this.municipalitycode = municipalitycode;
	}

	public String getMunicipalityname() {
		return municipalityname;
	}

	public void setMunicipalityname(String municipalityname) {
		this.municipalityname = municipalityname;
	}

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

}
