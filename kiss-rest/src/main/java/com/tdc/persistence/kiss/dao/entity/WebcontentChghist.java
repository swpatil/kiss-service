package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * WebcontentChghist generated by hbm2java
 */
@Entity
@Table(name = "WEBCONTENT_CHGHIST", schema = "PCRM")
public class WebcontentChghist implements java.io.Serializable {

	private WebcontentChghistId id;
	private String audAction;
	private Serializable audTimestamp;
	private String audOsuser;
	private String audDbuser;
	private String audUserterminal;
	private Date crd;
	private String cru;
	private Date modd;
	private String modu;
	private Date impd;
	private String impu;
	private String code;
	private String head;
	private String textcontent;
	private Date invalidated;
	private Date validfrom;
	private Date validto;
	private BigDecimal indexkey;
	private String cattr01;
	private String cattr02;
	private String primwebcontenttype;

	public WebcontentChghist() {
	}

	public WebcontentChghist(WebcontentChghistId id) {
		this.id = id;
	}

	public WebcontentChghist(WebcontentChghistId id, String audAction,
			Serializable audTimestamp, String audOsuser, String audDbuser,
			String audUserterminal, Date crd, String cru, Date modd,
			String modu, Date impd, String impu, String code, String head,
			String textcontent, Date invalidated, Date validfrom, Date validto,
			BigDecimal indexkey, String cattr01, String cattr02,
			String primwebcontenttype) {
		this.id = id;
		this.audAction = audAction;
		this.audTimestamp = audTimestamp;
		this.audOsuser = audOsuser;
		this.audDbuser = audDbuser;
		this.audUserterminal = audUserterminal;
		this.crd = crd;
		this.cru = cru;
		this.modd = modd;
		this.modu = modu;
		this.impd = impd;
		this.impu = impu;
		this.code = code;
		this.head = head;
		this.textcontent = textcontent;
		this.invalidated = invalidated;
		this.validfrom = validfrom;
		this.validto = validto;
		this.indexkey = indexkey;
		this.cattr01 = cattr01;
		this.cattr02 = cattr02;
		this.primwebcontenttype = primwebcontenttype;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "audId", column = @Column(name = "AUD_ID", nullable = false, length = 19)),
			@AttributeOverride(name = "id", column = @Column(name = "ID", nullable = false, length = 19)) })
	public WebcontentChghistId getId() {
		return this.id;
	}

	public void setId(WebcontentChghistId id) {
		this.id = id;
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

	@Column(name = "CODE", length = 128)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "HEAD", length = 512)
	public String getHead() {
		return this.head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	@Column(name = "TEXTCONTENT", length = 2048)
	public String getTextcontent() {
		return this.textcontent;
	}

	public void setTextcontent(String textcontent) {
		this.textcontent = textcontent;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "INVALIDATED", length = 7)
	public Date getInvalidated() {
		return this.invalidated;
	}

	public void setInvalidated(Date invalidated) {
		this.invalidated = invalidated;
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

	@Column(name = "INDEXKEY", precision = 22, scale = 0)
	public BigDecimal getIndexkey() {
		return this.indexkey;
	}

	public void setIndexkey(BigDecimal indexkey) {
		this.indexkey = indexkey;
	}

	@Column(name = "CATTR01")
	public String getCattr01() {
		return this.cattr01;
	}

	public void setCattr01(String cattr01) {
		this.cattr01 = cattr01;
	}

	@Column(name = "CATTR02")
	public String getCattr02() {
		return this.cattr02;
	}

	public void setCattr02(String cattr02) {
		this.cattr02 = cattr02;
	}

	@Column(name = "PRIMWEBCONTENTTYPE", length = 19)
	public String getPrimwebcontenttype() {
		return this.primwebcontenttype;
	}

	public void setPrimwebcontenttype(String primwebcontenttype) {
		this.primwebcontenttype = primwebcontenttype;
	}

}
