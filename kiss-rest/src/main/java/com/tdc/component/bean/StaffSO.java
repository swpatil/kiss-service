package com.tdc.component.bean;

import java.io.Serializable;

public class StaffSO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String username;
	
	private String password;
	
	private String loginSuccess;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLoginSuccess() {
		return loginSuccess;
	}

	public void setLoginSuccess(String loginSuccess) {
		this.loginSuccess = loginSuccess;
	}
	
	
	
	

}
