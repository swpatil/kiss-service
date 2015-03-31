package com.tdc.persistence.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ConstructionprojectypeChghist generated by hbm2java
 */
@Entity
@Table(name = "CONSTRUCTIONPROJECTYPE_CHGHIST", schema = "PCRM")
public class ConstructionprojectypeChghist implements java.io.Serializable {

	private String audId;
	private String audAction;
	private Serializable audTimestamp;
	private String audOsuser;
	private String audDbuser;
	private String audUserterminal;
	private String id;
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
	private String oldcode;
	private Date startDate;
	private Date endDate;

	public ConstructionprojectypeChghist() {
	}

	public ConstructionprojectypeChghist(String audId) {
		this.audId = audId;
	}

	public ConstructionprojectypeChghist(String audId, String audAction,
			Serializable audTimestamp, String audOsuser, String audDbuser,
			String audUserterminal, String id, Date crd, Date impt, Date expt,
			Date impd, Date expd, Date modt, String cru, Date delt, Date modd,
			String impu, String expu, Date deld, String modu, String delu,
			Date crt, String code, String head, String oldcode, Date startDate,
			Date endDate) {
		this.audId = audId;
		this.audAction = audAction;
		this.audTimestamp = audTimestamp;
		this.audOsuser = audOsuser;
		this.audDbuser = audDbuser;
		this.audUserterminal = audUserterminal;
		this.id = id;
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
		this.oldcode = oldcode;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	@Id
	@Column(name = "AUD_ID", unique = true, nullable = false, length = 19)
	public String getAudId() {
		return this.audId;
	}

	public void setAudId(String audId) {
		this.audId = audId;
	}

	@Column(name = "AUD_ACTION", length = 50)
	public String getAudAction() {
		return this.audAction;
	}

	public void setAudAction(String audAction) {
		this.audAction = audAction;
	}

	@Column(name = "AUD_TIMESTAMP")
	public Serializable getAudTimestamp() {
		return this.audTimestamp;
	}

	public void setAudTimestamp(Serializable audTimestamp) {
		this.audTimestamp = audTimestamp;
	}

	@Column(name = "AUD_OSUSER", length = 50)
	public String getAudOsuser() {
		return this.audOsuser;
	}

	public void setAudOsuser(String audOsuser) {
		this.audOsuser = audOsuser;
	}

	@Column(name = "AUD_DBUSER", length = 50)
	public String getAudDbuser() {
		return this.audDbuser;
	}

	public void setAudDbuser(String audDbuser) {
		this.audDbuser = audDbuser;
	}

	@Column(name = "AUD_USERTERMINAL", length = 50)
	public String getAudUserterminal() {
		return this.audUserterminal;
	}

	public void setAudUserterminal(String audUserterminal) {
		this.audUserterminal = audUserterminal;
	}

	@Column(name = "ID", length = 19)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
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

	@Column(name = "OLDCODE", length = 15)
	public String getOldcode() {
		return this.oldcode;
	}

	public void setOldcode(String oldcode) {
		this.oldcode = oldcode;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "START_DATE", length = 7)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "END_DATE", length = 7)
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
