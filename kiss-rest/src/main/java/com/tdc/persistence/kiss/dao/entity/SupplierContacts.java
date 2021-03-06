package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * SupplierContacts generated by hbm2java
 */
@Entity
@Table(name = "SUPPLIER_CONTACTS", schema = "PCRM", uniqueConstraints = @UniqueConstraint(columnNames = {
		"KISS_SUPPLIERID", "SFDC_PARTYID" }))
public class SupplierContacts implements java.io.Serializable {

	private String id;
	private String cru;
	private Date crd;
	private Date crt;
	private String modu;
	private Date modd;
	private Date modt;
	private Date delt;
	private String delu;
	private String kissSupplierid;
	private String sfdcPartyid;
	private String sfdcActorRoleid;

	public SupplierContacts() {
	}

	public SupplierContacts(String id) {
		this.id = id;
	}

	public SupplierContacts(String id, String cru, Date crd, Date crt,
			String modu, Date modd, Date modt, Date delt, String delu,
			String kissSupplierid, String sfdcPartyid, String sfdcActorRoleid) {
		this.id = id;
		this.cru = cru;
		this.crd = crd;
		this.crt = crt;
		this.modu = modu;
		this.modd = modd;
		this.modt = modt;
		this.delt = delt;
		this.delu = delu;
		this.kissSupplierid = kissSupplierid;
		this.sfdcPartyid = sfdcPartyid;
		this.sfdcActorRoleid = sfdcActorRoleid;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 19)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "CRU", length = 19)
	public String getCru() {
		return this.cru;
	}

	public void setCru(String cru) {
		this.cru = cru;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRD", length = 7)
	public Date getCrd() {
		return this.crd;
	}

	public void setCrd(Date crd) {
		this.crd = crd;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRT", length = 7)
	public Date getCrt() {
		return this.crt;
	}

	public void setCrt(Date crt) {
		this.crt = crt;
	}

	@Column(name = "MODU", length = 19)
	public String getModu() {
		return this.modu;
	}

	public void setModu(String modu) {
		this.modu = modu;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "MODD", length = 7)
	public Date getModd() {
		return this.modd;
	}

	public void setModd(Date modd) {
		this.modd = modd;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "MODT", length = 7)
	public Date getModt() {
		return this.modt;
	}

	public void setModt(Date modt) {
		this.modt = modt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DELT", length = 7)
	public Date getDelt() {
		return this.delt;
	}

	public void setDelt(Date delt) {
		this.delt = delt;
	}

	@Column(name = "DELU", length = 19)
	public String getDelu() {
		return this.delu;
	}

	public void setDelu(String delu) {
		this.delu = delu;
	}

	@Column(name = "KISS_SUPPLIERID", length = 19)
	public String getKissSupplierid() {
		return this.kissSupplierid;
	}

	public void setKissSupplierid(String kissSupplierid) {
		this.kissSupplierid = kissSupplierid;
	}

	@Column(name = "SFDC_PARTYID", length = 18)
	public String getSfdcPartyid() {
		return this.sfdcPartyid;
	}

	public void setSfdcPartyid(String sfdcPartyid) {
		this.sfdcPartyid = sfdcPartyid;
	}

	@Column(name = "SFDC_ACTOR_ROLEID", length = 19)
	public String getSfdcActorRoleid() {
		return this.sfdcActorRoleid;
	}

	public void setSfdcActorRoleid(String sfdcActorRoleid) {
		this.sfdcActorRoleid = sfdcActorRoleid;
	}

}
