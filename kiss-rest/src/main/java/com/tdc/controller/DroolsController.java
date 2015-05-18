package com.tdc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tdc.component.bean.CableUnitSO;
import com.tdc.component.bean.CableUnitTreeSO;
import com.tdc.component.bean.DroolsSO;
import com.tdc.component.service.CableUnitService;
import com.tdc.component.service.DroolsService;


@RestController
@RequestMapping("/drools")
public class DroolsController {
	

	//@Autowired
	//private DroolsService droolsService;

	@RequestMapping(value="/authorize",method = RequestMethod.GET,  produces="application/json")
	public DroolsSO authorize() {
		DroolsSO droolsSO= new DroolsSO();
		List<String> authorizedFields= new ArrayList<String>();
		authorizedFields.add("addInstallations");
		authorizedFields.add("move");
		authorizedFields.add("toXAL");
		authorizedFields.add("exportExcel");
		droolsSO.setEnableFields(authorizedFields);
		return( droolsSO);
		
		
		
	}
}
