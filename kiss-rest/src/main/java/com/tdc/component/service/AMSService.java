package com.tdc.component.service;

import com.tdc.component.bean.AddressResult;
import com.tdc.util.SearchAddressRequest;

public interface AMSService {

	public AddressResult getAddressByCriteria(SearchAddressRequest addressRequest,int pageNumber);

}
