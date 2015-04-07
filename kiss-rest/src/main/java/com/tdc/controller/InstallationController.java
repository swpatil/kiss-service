package com.tdc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tdc.component.bean.InstallationSO;
import com.tdc.component.service.InstallationService;

@RestController
@RequestMapping("/installations")
public class InstallationController {

	@Autowired
	private InstallationService installationService;
	
	@RequestMapping(value="/{customerNumber}",method = RequestMethod.GET,  produces="application/json")
	public List<InstallationSO> getInstallationsByCustomer(@PathVariable String customerNumber){
		return installationService.getInstallationsByCustomerNumber(customerNumber);
	}
}
