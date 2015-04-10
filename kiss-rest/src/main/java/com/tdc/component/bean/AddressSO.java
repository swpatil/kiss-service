package com.tdc.component.bean;

import java.io.Serializable;
import java.util.Date;

public class AddressSO implements Serializable {

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
	private StreetSO streets;

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

	public StreetSO getStreets() {
		return streets;
	}

	public void setStreets(StreetSO streets) {
		this.streets = streets;
	}

}
