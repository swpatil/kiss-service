package com.tdc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tdc.component.bean.CableUnitTreeBean;
import com.tdc.component.service.CableUnitService;


@RestController
@RequestMapping("/cableunit")
public class CableUnitController {
	

	@Autowired
	private CableUnitService cableUnitService;

	@RequestMapping(value="/tree/{id}",method = RequestMethod.GET,  produces="application/json")
	public CableUnitTreeBean getCuTree(@PathVariable String id) {
		System.out.println(id);
		return cableUnitService.getCuTreeBeanDetail(id);
	}
	@RequestMapping(value="/cu/{id}",method = RequestMethod.GET,  produces="application/json")
	public CableUnitTreeBean findByCUNumber(@PathVariable String id) {
		System.out.println(id);
		return cableUnitService.findByCUNumber(id);
	}
	
}
