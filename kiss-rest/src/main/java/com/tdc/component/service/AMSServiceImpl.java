package com.tdc.component.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tdc.component.bean.AddressSO;
import com.tdc.persistence.ams.dao.entity.Addresses;
import com.tdc.persistence.repositories.AddressRepository;

@Service
public class AMSServiceImpl extends CommonServiceImpl implements AMSService {

	@Autowired
	private AddressRepository addressRepository;

	public List<AddressSO> getAddressByCriteria() {

		return null;
	}

	@Transactional(readOnly=true)
	public List<AddressSO> getAllAddressesByHouseAndFloorNr(String hsNr,String floorNr) {
		List<Addresses> addresses = addressRepository.findByHousenoAndFloor(hsNr,floorNr);
		System.out.println(addresses);
		return mapArray(addresses, AddressSO.class);

	}

}
