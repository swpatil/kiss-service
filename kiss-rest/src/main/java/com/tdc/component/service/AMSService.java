package com.tdc.component.service;

import java.util.List;

import com.tdc.component.bean.AddressSO;

public interface AMSService {

	public List<AddressSO> getAddressByCriteria();

	public List<AddressSO> getAllAddressesByHouseAndFloorNr(String hsNr,String floorNr) ;
}
