package com.tdc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tdc.component.bean.AddressSO;
import com.tdc.component.service.AMSService;

@RestController
@RequestMapping("/ams")
public class AMSController {

	@Autowired
	private AMSService amsService;

	@RequestMapping(value = "/addresses/{houseNr}", method = RequestMethod.GET, produces = "application/json")
	public List<AddressSO> findAllAddresses(@PathVariable String houseNr,@RequestParam("floorNr") String floorNr) {
		return amsService.getAllAddressesByHouseAndFloorNr(houseNr, floorNr);
	}
	
	
}
