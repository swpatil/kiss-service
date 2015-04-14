package com.tdc.component.bean;

import java.io.Serializable;
import java.util.List;

public class AddressResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<AddressSO> addresses;
	
	private int totalPages;

	public List<AddressSO> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<AddressSO> addresses) {
		this.addresses = addresses;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	
	

}
