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
 * Cabletype generated by hbm2java
 */
@Entity
@Table(name = "CABLETYPE", schema = "PCRM")
public class Cabletype implements java.io.Serializable {

	private String id;
	private Cabletypespec cabletypespec;
	private Date crd;
	private Date crt;
	private String cru;
	private Date modd;
	private Date modt;
	private String modu;
	private Date deld;
	private Date delt;
	private String delu;
	private Date impd;
	private Date impt;
	private String impu;
	private Date expd;
	private Date expt;
	private String expu;
	private String primanlaeg;
	private String code;
	private String head;
	private String primforretomrd;
	private String primbusinesssphere;

	public Cabletype() {
	}

	public Cabletype(String id) {
		this.id = id;
	}

	public Cabletype(String id, Cabletypespec cabletypespec, Date crd,
			Date crt, String cru, Date modd, Date modt, String modu, Date deld,
			Date delt, String delu, Date impd, Date impt, String impu,
			Date expd, Date expt, String expu, String primanlaeg, String code,
			String head, String primforretomrd, String primbusinesssphere) {
		this.id = id;
		this.cabletypespec = cabletypespec;
		this.crd = crd;
		this.crt = crt;
		this.cru = cru;
		this.modd = modd;
		this.modt = modt;
		this.modu = modu;
		this.deld = deld;
		this.delt = delt;
		this.delu = delu;
		this.impd = impd;
		this.impt = impt;
		this.impu = impu;
		this.expd = expd;
		this.expt = expt;
		this.expu = expu;
		this.primanlaeg = primanlaeg;
		this.code = code;
		this.head = head;
		this.primforretomrd = primforretomrd;
		this.primbusinesssphere = primbusinesssphere;
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
	@JoinColumn(name = "PRIMKABLINGSTYPE")
	public Cabletypespec getCabletypespec() {
		return this.cabletypespec;
	}

	public void setCabletypespec(Cabletypespec cabletypespec) {
		this.cabletypespec = cabletypespec;
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

	@Temporal(TemporalType.DATE)
	@Column(name = "MODT", length = 7)
	public Date getModt() {
		return this.modt;
	}

	public void setModt(Date modt) {
		this.modt = modt;
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

	@Temporal(TemporalType.DATE)
	@Column(name = "IMPD", length = 7)
	public Date getImpd() {
		return this.impd;
	}

	public void setImpd(Date impd) {
		this.impd = impd;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "IMPT", length = 7)
	public Date getImpt() {
		return this.impt;
	}

	public void setImpt(Date impt) {
		this.impt = impt;
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

	@Temporal(TemporalType.DATE)
	@Column(name = "EXPT", length = 7)
	public Date getExpt() {
		return this.expt;
	}

	public void setExpt(Date expt) {
		this.expt = expt;
	}

	@Column(name = "EXPU", length = 19)
	public String getExpu() {
		return this.expu;
	}

	public void setExpu(String expu) {
		this.expu = expu;
	}

	@Column(name = "PRIMANLAEG", length = 10)
	public String getPrimanlaeg() {
		return this.primanlaeg;
	}

	public void setPrimanlaeg(String primanlaeg) {
		this.primanlaeg = primanlaeg;
	}

	@Column(name = "CODE", length = 50)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "HEAD")
	public String getHead() {
		return this.head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	@Column(name = "PRIMFORRETOMRD", length = 19)
	public String getPrimforretomrd() {
		return this.primforretomrd;
	}

	public void setPrimforretomrd(String primforretomrd) {
		this.primforretomrd = primforretomrd;
	}

	@Column(name = "PRIMBUSINESSSPHERE", length = 50)
	public String getPrimbusinesssphere() {
		return this.primbusinesssphere;
	}

	public void setPrimbusinesssphere(String primbusinesssphere) {
		this.primbusinesssphere = primbusinesssphere;
	}

}
