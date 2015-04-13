package com.tdc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tdc.component.bean.CableUnitSO;
import com.tdc.component.bean.CableUnitTreeSO;
import com.tdc.component.service.CableUnitService;


@RestController
@RequestMapping("/cableunit")
public class CableUnitController {
	

	@Autowired
	private CableUnitService cableUnitService;

	@RequestMapping(value="/tree/{id}",method = RequestMethod.GET,  produces="application/json")
	public CableUnitSO getCuTree(@PathVariable String id) {
		System.out.println(id);
		return cableUnitService.getCuTreeBeanDetail(id);
	}
	
	@RequestMapping(value="/cu/{customerNumber}",method = RequestMethod.GET,  produces="application/json")
	public CableUnitTreeSO findByCUNumber(@PathVariable String customerNumber) {
		return cableUnitService.findByCUNumber(customerNumber);
		
	}
	
	@RequestMapping(value="/cus/{customerNumber}",method = RequestMethod.GET,  produces="application/json")
	public List<String> findCusByNumber(@PathVariable String customerNumber) {
		return cableUnitService.findCusByNumber(customerNumber);
	}
		
	@RequestMapping(value="/search/cus/{customerNumber}",method = RequestMethod.GET,  produces="application/json")
	public List<String> searchCusByNumber(@PathVariable String customerNumber) {
			return cableUnitService.searchCubyNumber(customerNumber);
		
	}
}
