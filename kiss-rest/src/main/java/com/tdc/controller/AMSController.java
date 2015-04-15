package com.tdc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tdc.component.bean.AddressResult;
import com.tdc.component.bean.InstallationSO;
import com.tdc.component.bean.SearchEntityBean;
import com.tdc.component.service.AMSService;
import com.tdc.persistence.ams.dao.entity.Streets;
import com.tdc.util.SearchAddressRequest;

@RestController
@RequestMapping("/ams")
public class AMSController {

	@Autowired
	private AMSService amsService;
	
	@Autowired
	private SearchEntityBean searchEntityBean;


	@RequestMapping(value = "/addresses/search/", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public AddressResult findAllAddressesByCriteria(
			@RequestBody SearchAddressRequest addressRequest,@RequestParam("pageNo") int pageNo) {
		return amsService.getAddressByCriteria(addressRequest,pageNo);
	}
	
	@RequestMapping(value = "/street/search/{streetName}", method = RequestMethod.GET, produces = "application/json")
	public List<String> getInstallationsByCu(@PathVariable String streetName){
		List<Streets> streets= searchEntityBean.hibernatesearch("streetname", streetName, Streets.class);
		List<String> strname = new ArrayList<String>();
		if(streets != null || !streets.isEmpty()){
		for(Streets street :streets){
			strname.add(street.getStreetname());
		}
		}
		
		return strname;
	}

}
