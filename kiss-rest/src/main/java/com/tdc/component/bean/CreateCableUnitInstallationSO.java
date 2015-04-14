package com.tdc.component.bean;

import java.io.Serializable;
import java.util.List;

public class CreateCableUnitInstallationSO implements Serializable {

	private String cableUnitNumber;
	
	private List<Long> addressIds;

	public String getCableUnitNumber() {
		return cableUnitNumber;
	}

	public void setCableUnitNumber(String cableUnitNumber) {
		this.cableUnitNumber = cableUnitNumber;
	}

	public List<Long> getAddressIds() {
		return addressIds;
	}

	public void setAddressIds(List<Long> addressIds) {
		this.addressIds = addressIds;
	}

	
	
	
}
