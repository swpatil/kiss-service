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
 * Requestbasis generated by hbm2java
 */
@Entity
@Table(name = "REQUESTBASIS", schema = "PCRM")
public class Requestbasis implements java.io.Serializable {

	private String id;
	private Casefolder casefolder;
	private Date crd;
	private Date impt;
	private Date expt;
	private Date impd;
	private Date expd;
	private Date modt;
	private String cru;
	private Date delt;
	private Date modd;
	private String impu;
	private String expu;
	private Date deld;
	private String modu;
	private String delu;
	private Date crt;
	private String code;
	private String head;
	private String primaryopslagstype;
	private String primaryklasseopslag;
	private String endid;
	private String question;
	private String answer;

	public Requestbasis() {
	}

	public Requestbasis(String id) {
		this.id = id;
	}

	public Requestbasis(String id, Casefolder casefolder, Date crd, Date impt,
			Date expt, Date impd, Date expd, Date modt, String cru, Date delt,
			Date modd, String impu, String expu, Date deld, String modu,
			String delu, Date crt, String code, String head,
			String primaryopslagstype, String primaryklasseopslag,
			String endid, String question, String answer) {
		this.id = id;
		this.casefolder = casefolder;
		this.crd = crd;
		this.impt = impt;
		this.expt = expt;
		this.impd = impd;
		this.expd = expd;
		this.modt = modt;
		this.cru = cru;
		this.delt = delt;
		this.modd = modd;
		this.impu = impu;
		this.expu = expu;
		this.deld = deld;
		this.modu = modu;
		this.delu = delu;
		this.crt = crt;
		this.code = code;
		this.head = head;
		this.primaryopslagstype = primaryopslagstype;
		this.primaryklasseopslag = primaryklasseopslag;
		this.endid = endid;
		this.question = question;
		this.answer = answer;
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
	@JoinColumn(name = "PRIMARYSAG")
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

	@Temporal(TemporalType.DATE)
	@Column(name = "IMPT", length = 7)
	public Date getImpt() {
		return this.impt;
	}

	public void setImpt(Date impt) {
		this.impt = impt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EXPT", length = 7)
	public Date getExpt() {
		return this.expt;
	}

	public void setExpt(Date expt) {
		this.expt = expt;
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

	@Temporal(TemporalType.DATE)
	@Column(name = "MODT", length = 7)
	public Date getModt() {
		return this.modt;
	}

	public void setModt(Date modt) {
		this.modt = modt;
	}

	@Column(name = "CRU", length = 19)
	public String getCru() {
		return this.cru;
	}

	public void setCru(String cru) {
		this.cru = cru;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DELT", length = 7)
	public Date getDelt() {
		return this.delt;
	}

	public void setDelt(Date delt) {
		this.delt = delt;
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

	@Temporal(TemporalType.DATE)
	@Column(name = "DELD", length = 7)
	public Date getDeld() {
		return this.deld;
	}

	public void setDeld(Date deld) {
		this.deld = deld;
	}

	@Column(name = "MODU", length = 19)
	public String getModu() {
		return this.modu;
	}

	public void setModu(String modu) {
		this.modu = modu;
	}

	@Column(name = "DELU", length = 19)
	public String getDelu() {
		return this.delu;
	}

	public void setDelu(String delu) {
		this.delu = delu;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRT", length = 7)
	public Date getCrt() {
		return this.crt;
	}

	public void setCrt(Date crt) {
		this.crt = crt;
	}

	@Column(name = "CODE", length = 15)
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

	@Column(name = "PRIMARYOPSLAGSTYPE", length = 19)
	public String getPrimaryopslagstype() {
		return this.primaryopslagstype;
	}

	public void setPrimaryopslagstype(String primaryopslagstype) {
		this.primaryopslagstype = primaryopslagstype;
	}

	@Column(name = "PRIMARYKLASSEOPSLAG", length = 19)
	public String getPrimaryklasseopslag() {
		return this.primaryklasseopslag;
	}

	public void setPrimaryklasseopslag(String primaryklasseopslag) {
		this.primaryklasseopslag = primaryklasseopslag;
	}

	@Column(name = "ENDID", length = 19)
	public String getEndid() {
		return this.endid;
	}

	public void setEndid(String endid) {
		this.endid = endid;
	}

	@Column(name = "QUESTION", length = 1024)
	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	@Column(name = "ANSWER", length = 1024)
	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
