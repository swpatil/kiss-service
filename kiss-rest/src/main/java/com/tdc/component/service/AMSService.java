package com.tdc.component.service;

import java.util.List;

import com.tdc.component.bean.AddressSO;
import com.tdc.util.SearchAddressRequest;

public interface AMSService {

	public List<AddressSO> getAddressByCriteria(
			SearchAddressRequest addressRequest);

	public List<AddressSO> getAllAddressesByHouseAndFloorNr(String hsNr,
			String floorNr);
}
