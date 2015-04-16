package com.tdc.component.bean;

import java.io.Serializable;
import java.util.Date;

public class AddressIdSO implements Serializable{

	
	private long addressId;
	private Date startdate;
	
	public long getAddressId() {
		return addressId;
	}
	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	
	
}
