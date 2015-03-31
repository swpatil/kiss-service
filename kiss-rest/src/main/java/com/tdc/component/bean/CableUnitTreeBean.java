package com.tdc.component.bean;

import org.springframework.stereotype.Component;

@Component
public class CableUnitTreeBean {
	
	String CuId;
	String CuName;
	
	
	public String getCuId() {
		return CuId;
	}
	public void setCuId(String cuId) {
		CuId = cuId;
	}
	public String getCuName() {
		return CuName;
	}
	public void setCuName(String cuName) {
		CuName = cuName;
	}
	

}
