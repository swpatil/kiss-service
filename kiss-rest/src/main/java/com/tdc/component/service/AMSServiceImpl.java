package com.tdc.component.service;

import static com.tdc.persistence.repositories.AddressSpecification.search;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tdc.component.bean.AddressSO;
import com.tdc.persistence.ams.dao.entity.Addresses;
import com.tdc.persistence.repositories.AddressRepository;
import com.tdc.util.SearchAddressRequest;

@Service
public class AMSServiceImpl extends CommonServiceImpl implements AMSService {

	@Autowired
	private AddressRepository addressRepository;

	@Transactional(readOnly = true)
	public List<AddressSO> getAddressByCriteria(SearchAddressRequest addressRequest) {
		List<Addresses> addresses = addressRepository
				.findAll(search(addressRequest));
		return mapArray(addresses, AddressSO.class);
	}

	@Transactional(readOnly = true)
	public List<AddressSO> getAllAddressesByHouseAndFloorNr(String hsNr,
			String floorNr) {
		List<Addresses> addresses = addressRepository.findByHousenoAndFloor(
				hsNr, floorNr);
		System.out.println(addresses);
		return mapArray(addresses, AddressSO.class);

	}

}
