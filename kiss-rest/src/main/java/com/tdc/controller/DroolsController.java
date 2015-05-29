package com.tdc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tdc.component.bean.DroolsSO;
import com.tdc.component.bean.InstallationResult;
import com.tdc.component.bean.NyssStaffSO;
import com.tdc.util.DroolsAuthorizationReply;
import com.tdc.util.DroolsAuthorizationRequest;
import com.tdc.util.DroolsTemplate;


@RestController
@RequestMapping("/drools")
public class DroolsController {
	

	@Autowired
	private DroolsAuthorizationRequest droolsAuthorizationRequest;
	
	@Autowired
	DroolsTemplate  droolsTemplate;
	
	@Autowired
	DroolsAuthorizationReply droolsAuthorizationReply;
	


	@RequestMapping(value="/authorize",method = RequestMethod.GET,  produces="application/json")
	public DroolsSO authorize( DroolsAuthorizationRequest droolsAuthorizationRequest) {
		
		

		DroolsAuthorizationRequest droolRequest = new DroolsAuthorizationRequest();
		//Dummy Request Paramaters
		droolRequest.setCaseType(false);
		droolRequest.setGodKendelseYSFlag(false);
		droolRequest.setIdriftDatoFlag(false);
		droolRequest.setMainCaseFlag(false);
		droolRequest.setMpCompleted(false);
		droolRequest.setMpToken(false);
		droolRequest.setMpPCAToken(false);
		droolRequest.setNyIdriftDatoFlag(false);
		droolRequest.setNysalgFlag(false);
		droolRequest.setPcaMpCompleted(false);
		droolRequest.setPotentialFlag(false);
		droolRequest.setRuleProjectName("GuiKontrolKiss");
		droolRequest.setRuleSetName("FeltOgKnapRestriktioner");
		droolRequest.setSagenFlag(false);
		droolRequest.setScreenId("header_menu_toolbar");
		droolRequest.setWinLoginId(true);
		droolRequest.setYoInternFlag(false);
		droolRequest.setTilbudLastFLag(false);
		droolRequest.setTillaegsaftaleFlag(false);

		NyssStaffSO  nyssStaffSO= new NyssStaffSO();
		nyssStaffSO.setId("PCRM-US-----3224119");
		nyssStaffSO.setCity("Odense SØ");
		nyssStaffSO.setDepartment("PY");
		nyssStaffSO.setEmail("lyder@yousee.dk");
		nyssStaffSO.setFirstName("Tina");
		nyssStaffSO.setFullName("Tina Lydersen");
		nyssStaffSO.setLastName("Lydersen");
		nyssStaffSO.setMemberOfKissAdministrator(true);
		nyssStaffSO.setMemberOfKissRead(true);
		nyssStaffSO.setMemberOfKissSuperBruger(false);
		nyssStaffSO.setMemberOfKissUser(true);
		nyssStaffSO.setMobilePhone("30300033");
		nyssStaffSO.setPrimaryTeam("PYF (Foreningsservice)");
		nyssStaffSO.setStreet("Telehøjen 1");
		//nyssStaffSO.setTeams(teams);
		nyssStaffSO.setTitle("Kundekonsulent");
		//nyssStaffSO.setUser(user);
		nyssStaffSO.setUserInitials("lyder");
		nyssStaffSO.setWinLoginName("A53914");
		nyssStaffSO.setWorkPhone("49490");
		nyssStaffSO.setZip("5220");
		droolRequest.setNyssStaffSO(nyssStaffSO);
		DroolsSO droolsSO= new DroolsSO();


		droolsTemplate.prepareDroolsRequest(droolRequest);
		
		droolsAuthorizationReply=droolsTemplate.getAuthorizeFields();
		List<String> authorizedFields= new ArrayList<String>();
		authorizedFields.add("addInstallations");
		authorizedFields.add("move");
		authorizedFields.add("toXAL");
		authorizedFields.add("exportExcel");
		droolsSO.setEnableFields(authorizedFields);
		return( droolsSO);
		
		
		
	}
}
