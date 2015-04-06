package com.tdc.component.bean;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;


public class CableUnitSO {
	
	private String id;
	private String anlAnlaegsnr;
	private String anlAnlaegsnavn;

	
	private Set<CaseFolderSO> caseFolder = new HashSet<CaseFolderSO>();

  	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAnlAnlaegsnr() {
		return anlAnlaegsnr;
	}
	public void setAnlAnlaegsnr(String anlAnlaegsnr) {
		this.anlAnlaegsnr = anlAnlaegsnr;
	}
	public String getAnlAnlaegsnavn() {
		return anlAnlaegsnavn;
	}
	public void setAnlAnlaegsnavn(String anlAnlaegsnavn) {
		this.anlAnlaegsnavn = anlAnlaegsnavn;
	}
	public Set<CaseFolderSO> getCaseFolder() {
		return caseFolder;
	}
	public void setCaseFolder(Set<CaseFolderSO> caseFolder) {
		this.caseFolder = caseFolder;
	}



	

}
