package com.tdc.component.service;

import static com.tdc.persistence.repositories.AddressSpecification.search;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tdc.component.bean.AddressResult;
import com.tdc.component.bean.AddressSO;
import com.tdc.persistence.ams.dao.entity.Addresses;
import com.tdc.persistence.repositories.AddressRepository;
import com.tdc.util.SearchAddressRequest;

@Service
public class AMSServiceImpl extends CommonServiceImpl implements AMSService {

	private static final int PAGE_SIZE = 200;

	@Autowired
	private AddressRepository addressRepository;

	@Transactional(readOnly = true)
	public AddressResult getAddressByCriteria(
			SearchAddressRequest addressRequest, int pageNumber) {

		PageRequest request = new PageRequest(pageNumber - 1, PAGE_SIZE);
		Page<Addresses> page = addressRepository.findAll(
				search(addressRequest), request);
		
		List<Addresses> addresses = page.getContent();
		AddressResult addressResult = new AddressResult();
		addressResult.setAddresses(mapArray(addresses, AddressSO.class));
		addressResult.setTotalPages(page.getTotalPages());

		return addressResult;
	}

}
