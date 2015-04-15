package com.tdc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tdc.component.bean.CreateCableUnitInstallationSO;
import com.tdc.component.bean.ErrorDetailSO;
import com.tdc.component.bean.InstallationResult;
import com.tdc.component.bean.InstallationSO;
import com.tdc.component.service.InstallationService;

@RestController
@RequestMapping("/installations")
public class InstallationController {

	@Autowired
	private InstallationService installationService;
	
	@RequestMapping(value="/simple/{customerNumber}",method = RequestMethod.GET,  produces="application/json")
	public List<InstallationSO> getInstallationsByCu(@PathVariable String customerNumber){
		return installationService.getInstallationsByCuNumber(customerNumber);
	}
	
	@RequestMapping(value="/{customerNumber}",method = RequestMethod.GET,  produces="application/json")
	public InstallationResult getInstallationsByCustomer(@PathVariable String customerNumber,@RequestParam("pageNo") int pageNo){
		return installationService.getInstallationsByCustomerNumber(customerNumber,pageNo);
	}
	
	@RequestMapping(value="/createInstallations",method = RequestMethod.POST,produces="application/json")
	public ErrorDetailSO addCableunitInstallations(@RequestBody CreateCableUnitInstallationSO cableUnitInstallationSO){
		//System.out.println("Cu number: " +cableUnitInstallationSO.getCableUnitNumber());
		List<Long> addressIds = cableUnitInstallationSO.getAddressIds();
		String cableUnitNumber = cableUnitInstallationSO.getCableUnitNumber();
		/*for(int i =0;i<addIds.length;i++){
			System.out.println(addIds[i]);
		}*/
		return installationService.createCableUnitInstallations(cableUnitNumber, addressIds);
	}
	
}
