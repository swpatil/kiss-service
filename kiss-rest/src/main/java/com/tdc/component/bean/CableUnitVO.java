package com.tdc.component.bean;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;


public class CableUnitVO {
	
	private String anlAnlaegsnr;
	private String anlAnlaegsnavn;
	
	private Set<CaseFolderVO> caseFolder = new HashSet<CaseFolderVO>();

  	

	
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
	public Set<CaseFolderVO> getCaseFolder() {
		return caseFolder;
	}
	public void setCaseFolder(Set<CaseFolderVO> caseFolder) {
		this.caseFolder = caseFolder;
	}
	
	

}
