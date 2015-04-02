package com.tdc.component.bean;

import org.springframework.stereotype.Component;


public class CableUnitTreeBean {
	
	private String anlAnlaegsnr;
	private String anlAnlaegsnavn;
	private Short anlKommunenr;
	private Boolean anlEjerkode;
	private Boolean anlAdmKode;
	private Boolean anlAnlaegsform;
	private String signalforskilde;
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
	public Short getAnlKommunenr() {
		return anlKommunenr;
	}
	public void setAnlKommunenr(Short anlKommunenr) {
		this.anlKommunenr = anlKommunenr;
	}
	public Boolean getAnlEjerkode() {
		return anlEjerkode;
	}
	public void setAnlEjerkode(Boolean anlEjerkode) {
		this.anlEjerkode = anlEjerkode;
	}
	public Boolean getAnlAdmKode() {
		return anlAdmKode;
	}
	public void setAnlAdmKode(Boolean anlAdmKode) {
		this.anlAdmKode = anlAdmKode;
	}
	public Boolean getAnlAnlaegsform() {
		return anlAnlaegsform;
	}
	public void setAnlAnlaegsform(Boolean anlAnlaegsform) {
		this.anlAnlaegsform = anlAnlaegsform;
	}
	public String getSignalforskilde() {
		return signalforskilde;
	}
	public void setSignalforskilde(String signalforskilde) {
		this.signalforskilde = signalforskilde;
	}
	

}
