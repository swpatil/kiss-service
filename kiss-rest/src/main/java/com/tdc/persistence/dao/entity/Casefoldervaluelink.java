package com.tdc.persistence.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Casefoldervaluelink generated by hbm2java
 */
@Entity
@Table(name = "CASEFOLDERVALUELINK", schema = "PCRM")
public class Casefoldervaluelink implements java.io.Serializable {

	private String id;
	private Casefolder casefolder;
	private Date crd;
	private String cru;
	private Date modd;
	private String modu;
	private Date deld;
	private String delu;
	private Date impd;
	private String impu;
	private Date expd;
	private String expu;
	private String primgeneraltypevalue;
	private String primgeneraltypevalue01;
	private Date validfrom;
	private Date validto;

	public Casefoldervaluelink() {
	}

	public Casefoldervaluelink(String id) {
		this.id = id;
	}

	public Casefoldervaluelink(String id, Casefolder casefolder, Date crd,
			String cru, Date modd, String modu, Date deld, String delu,
			Date impd, String impu, Date expd, String expu,
			String primgeneraltypevalue, String primgeneraltypevalue01,
			Date validfrom, Date validto) {
		this.id = id;
		this.casefolder = casefolder;
		this.crd = crd;
		this.cru = cru;
		this.modd = modd;
		this.modu = modu;
		this.deld = deld;
		this.delu = delu;
		this.impd = impd;
		this.impu = impu;
		this.expd = expd;
		this.expu = expu;
		this.primgeneraltypevalue = primgeneraltypevalue;
		this.primgeneraltypevalue01 = primgeneraltypevalue01;
		this.validfrom = validfrom;
		this.validto = validto;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 19)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRIMCASEFOLDER")
	public Casefolder getCasefolder() {
		return this.casefolder;
	}

	public void setCasefolder(Casefolder casefolder) {
		this.casefolder = casefolder;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRD", length = 7)
	public Date getCrd() {
		return this.crd;
	}

	public void setCrd(Date crd) {
		this.crd = crd;
	}

	@Column(name = "CRU", length = 19)
	public String getCru() {
		return this.cru;
	}

	public void setCru(String cru) {
		this.cru = cru;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "MODD", length = 7)
	public Date getModd() {
		return this.modd;
	}

	public void setModd(Date modd) {
		this.modd = modd;
	}

	@Column(name = "MODU", length = 19)
	public String getModu() {
		return this.modu;
	}

	public void setModu(String modu) {
		this.modu = modu;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DELD", length = 7)
	public Date getDeld() {
		return this.deld;
	}

	public void setDeld(Date deld) {
		this.deld = deld;
	}

	@Column(name = "DELU", length = 19)
	public String getDelu() {
		return this.delu;
	}

	public void setDelu(String delu) {
		this.delu = delu;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "IMPD", length = 7)
	public Date getImpd() {
		return this.impd;
	}

	public void setImpd(Date impd) {
		this.impd = impd;
	}

	@Column(name = "IMPU", length = 19)
	public String getImpu() {
		return this.impu;
	}

	public void setImpu(String impu) {
		this.impu = impu;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EXPD", length = 7)
	public Date getExpd() {
		return this.expd;
	}

	public void setExpd(Date expd) {
		this.expd = expd;
	}

	@Column(name = "EXPU", length = 19)
	public String getExpu() {
		return this.expu;
	}

	public void setExpu(String expu) {
		this.expu = expu;
	}

	@Column(name = "PRIMGENERALTYPEVALUE", length = 19)
	public String getPrimgeneraltypevalue() {
		return this.primgeneraltypevalue;
	}

	public void setPrimgeneraltypevalue(String primgeneraltypevalue) {
		this.primgeneraltypevalue = primgeneraltypevalue;
	}

	@Column(name = "PRIMGENERALTYPEVALUE01", length = 50)
	public String getPrimgeneraltypevalue01() {
		return this.primgeneraltypevalue01;
	}

	public void setPrimgeneraltypevalue01(String primgeneraltypevalue01) {
		this.primgeneraltypevalue01 = primgeneraltypevalue01;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "VALIDFROM", length = 7)
	public Date getValidfrom() {
		return this.validfrom;
	}

	public void setValidfrom(Date validfrom) {
		this.validfrom = validfrom;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "VALIDTO", length = 7)
	public Date getValidto() {
		return this.validto;
	}

	public void setValidto(Date validto) {
		this.validto = validto;
	}

}
