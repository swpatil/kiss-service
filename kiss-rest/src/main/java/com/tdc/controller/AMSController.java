package com.tdc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tdc.component.bean.AddressResult;
import com.tdc.component.service.AMSService;
import com.tdc.util.SearchAddressRequest;

@RestController
@RequestMapping("/ams")
public class AMSController {

	@Autowired
	private AMSService amsService;


	@RequestMapping(value = "/addresses/search/", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public AddressResult findAllAddressesByCriteria(
			@RequestBody SearchAddressRequest addressRequest,@RequestParam("pageNo") int pageNo) {
		return amsService.getAddressByCriteria(addressRequest,pageNo);
	}

}
