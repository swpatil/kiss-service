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
 * ActorroleChghistDrop generated by hbm2java
 */
@Entity
@Table(name = "ACTORROLE_CHGHIST_DROP", schema = "PCRM")
public class ActorroleChghistDrop implements java.io.Serializable {

	private String audId;
	private String audAction;
	private Serializable audTimestamp;
	private String audOsuser;
	private String audDbuser;
	private String audUserterminal;
	private String id;
	private String heading;
	private Date crd;
	private String code;
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
	private Character masterrole;
	private Character personrole;
	private String primkluamrori;
	private Character angivKopiantal;
	private Character visikontrakt;
	private String key2rule;
	private String oldcode;
	private Date startDate;
	private Date endDate;
	private String description;

	public ActorroleChghistDrop() {
	}

	public ActorroleChghistDrop(String audId, String id) {
		this.audId = audId;
		this.id = id;
	}

	public ActorroleChghistDrop(String audId, String audAction,
			Serializable audTimestamp, String audOsuser, String audDbuser,
			String audUserterminal, String id, String heading, Date crd,
			String code, Date impt, Date expt, Date impd, Date expd, Date modt,
			String cru, Date delt, Date modd, String impu, String expu,
			Date deld, String modu, String delu, Date crt,
			Character masterrole, Character personrole, String primkluamrori,
			Character angivKopiantal, Character visikontrakt, String key2rule,
			String oldcode, Date startDate, Date endDate, String description) {
		this.audId = audId;
		this.audAction = audAction;
		this.audTimestamp = audTimestamp;
		this.audOsuser = audOsuser;
		this.audDbuser = audDbuser;
		this.audUserterminal = audUserterminal;
		this.id = id;
		this.heading = heading;
		this.crd = crd;
		this.code = code;
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
		this.masterrole = masterrole;
		this.personrole = personrole;
		this.primkluamrori = primkluamrori;
		this.angivKopiantal = angivKopiantal;
		this.visikontrakt = visikontrakt;
		this.key2rule = key2rule;
		this.oldcode = oldcode;
		this.startDate = startDate;
		this.endDate = endDate;
		this.description = description;
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

	@Column(name = "ID", nullable = false, length = 19)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "HEADING", length = 250)
	public String getHeading() {
		return this.heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRD", length = 7)
	public Date getCrd() {
		return this.crd;
	}

	public void setCrd(Date crd) {
		this.crd = crd;
	}

	@Column(name = "CODE", length = 25)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	@Column(name = "MASTERROLE", length = 1)
	public Character getMasterrole() {
		return this.masterrole;
	}

	public void setMasterrole(Character masterrole) {
		this.masterrole = masterrole;
	}

	@Column(name = "PERSONROLE", length = 1)
	public Character getPersonrole() {
		return this.personrole;
	}

	public void setPersonrole(Character personrole) {
		this.personrole = personrole;
	}

	@Column(name = "PRIMKLUAMRORI", length = 19)
	public String getPrimkluamrori() {
		return this.primkluamrori;
	}

	public void setPrimkluamrori(String primkluamrori) {
		this.primkluamrori = primkluamrori;
	}

	@Column(name = "ANGIV_KOPIANTAL", length = 1)
	public Character getAngivKopiantal() {
		return this.angivKopiantal;
	}

	public void setAngivKopiantal(Character angivKopiantal) {
		this.angivKopiantal = angivKopiantal;
	}

	@Column(name = "VISIKONTRAKT", length = 1)
	public Character getVisikontrakt() {
		return this.visikontrakt;
	}

	public void setVisikontrakt(Character visikontrakt) {
		this.visikontrakt = visikontrakt;
	}

	@Column(name = "KEY2RULE")
	public String getKey2rule() {
		return this.key2rule;
	}

	public void setKey2rule(String key2rule) {
		this.key2rule = key2rule;
	}

	@Column(name = "OLDCODE", length = 25)
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

	@Column(name = "DESCRIPTION", length = 512)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
