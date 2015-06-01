package com.tdc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tdc.component.bean.StaffSO;

@RestController
@RequestMapping("/authenticate")
public class LoginController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public StaffSO login(@RequestBody StaffSO staffSO) {

		try {
			Authentication result = null;
			Authentication request = new UsernamePasswordAuthenticationToken(
					staffSO.getUsername(), staffSO.getPassword());
			result = authenticationManager.authenticate(request);
			SecurityContextHolder.getContext().setAuthentication(result);
		} catch (AuthenticationException e) {
			e.printStackTrace();
		}
		StaffSO staffSO2 = new StaffSO();
		staffSO2.setUsername(staffSO.getUsername());
		staffSO2.setLoginSuccess("success");
		return staffSO2;

	}

	@RequestMapping(value = "/logout", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public String logout() {
		SecurityContextHolder.getContext().getAuthentication().setAuthenticated(false); 
		SecurityContextHolder.clearContext();
		return "loggedout";
	}

}
