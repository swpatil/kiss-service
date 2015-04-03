package com.tdc.component.bean;

import java.util.List;

public class CableunitInfrastructureBean {
	
	private String cableUnitNumber;
  	private String cableUnitName;  	
  	private List<CaseInfrastructureBean> caseInfrastructures;
  	private String validCaseNumber;
  	
  	
	public String getCableUnitNumber() {
		return cableUnitNumber;
	}
	public void setCableUnitNumber(String cableUnitNumber) {
		this.cableUnitNumber = cableUnitNumber;
	}
	public String getCableUnitName() {
		return cableUnitName;
	}
	public void setCableUnitName(String cableUnitName) {
		this.cableUnitName = cableUnitName;
	}
	public List<CaseInfrastructureBean> getCaseInfrastructures() {
		return caseInfrastructures;
	}
	public void setCaseInfrastructures(
			List<CaseInfrastructureBean> caseInfrastructures) {
		this.caseInfrastructures = caseInfrastructures;
	}
	public String getValidCaseNumber() {
		return validCaseNumber;
	}
	public void setValidCaseNumber(String validCaseNumber) {
		this.validCaseNumber = validCaseNumber;
	}
  	
  	
  	
  	

}
