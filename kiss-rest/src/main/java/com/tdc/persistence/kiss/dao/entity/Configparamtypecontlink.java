package com.tdc.persistence.kiss.dao.entity;

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
 * Configparamtypecontlink generated by hbm2java
 */
@Entity
@Table(name = "CONFIGPARAMTYPECONTLINK", schema = "PCRM")
public class Configparamtypecontlink implements java.io.Serializable {

	private String id;
	private Configparametertype configparametertype;
	private Date crd;
	private Date impd;
	private Date expd;
	private String cru;
	private Date modd;
	private String impu;
	private String expu;
	private String modu;
	private String primwebcontent00;
	private String primwebcontent01;
	private Date validfrom;
	private Date validto;

	public Configparamtypecontlink() {
	}

	public Configparamtypecontlink(String id,
			Configparametertype configparametertype, String primwebcontent00,
			String primwebcontent01) {
		this.id = id;
		this.configparametertype = configparametertype;
		this.primwebcontent00 = primwebcontent00;
		this.primwebcontent01 = primwebcontent01;
	}

	public Configparamtypecontlink(String id,
			Configparametertype configparametertype, Date crd, Date impd,
			Date expd, String cru, Date modd, String impu, String expu,
			String modu, String primwebcontent00, String primwebcontent01,
			Date validfrom, Date validto) {
		this.id = id;
		this.configparametertype = configparametertype;
		this.crd = crd;
		this.impd = impd;
		this.expd = expd;
		this.cru = cru;
		this.modd = modd;
		this.impu = impu;
		this.expu = expu;
		this.modu = modu;
		this.primwebcontent00 = primwebcontent00;
		this.primwebcontent01 = primwebcontent01;
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
	@JoinColumn(name = "PRIMCONFIGPARAMETERTYPE", nullable = false)
	public Configparametertype getConfigparametertype() {
		return this.configparametertype;
	}

	public void setConfigparametertype(Configparametertype configparametertype) {
		this.configparametertype = configparametertype;
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
	@Column(name = "IMPD", length = 7)
	public Date getImpd() {
		return this.impd;
	}

	public void setImpd(Date impd) {
		this.impd = impd;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EXPD", length = 7)
	public Date getExpd() {
		return this.expd;
	}

	public void setExpd(Date expd) {
		this.expd = expd;
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

	@Column(name = "IMPU", length = 19)
	public String getImpu() {
		return this.impu;
	}

	public void setImpu(String impu) {
		this.impu = impu;
	}

	@Column(name = "EXPU", length = 19)
	public String getExpu() {
		return this.expu;
	}

	public void setExpu(String expu) {
		this.expu = expu;
	}

	@Column(name = "MODU", length = 19)
	public String getModu() {
		return this.modu;
	}

	public void setModu(String modu) {
		this.modu = modu;
	}

	@Column(name = "PRIMWEBCONTENT00", nullable = false, length = 19)
	public String getPrimwebcontent00() {
		return this.primwebcontent00;
	}

	public void setPrimwebcontent00(String primwebcontent00) {
		this.primwebcontent00 = primwebcontent00;
	}

	@Column(name = "PRIMWEBCONTENT01", nullable = false, length = 128)
	public String getPrimwebcontent01() {
		return this.primwebcontent01;
	}

	public void setPrimwebcontent01(String primwebcontent01) {
		this.primwebcontent01 = primwebcontent01;
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
