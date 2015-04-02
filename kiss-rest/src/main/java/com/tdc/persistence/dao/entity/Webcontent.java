package com.tdc.persistence.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
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
 * Webcontent generated by hbm2java
 */
@Entity
@Table(name = "WEBCONTENT", schema = "PCRM")
public class Webcontent implements java.io.Serializable {

	private String id;
	private Webcontenttype webcontenttype;
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

	public Webcontent() {
	}

	public Webcontent(String id) {
		this.id = id;
	}

	public Webcontent(String id, Webcontenttype webcontenttype, Date crd,
			String cru, Date modd, String modu, Date impd, String impu,
			String code, String head, String textcontent, Date invalidated,
			Date validfrom, Date validto, BigDecimal indexkey, String cattr01,
			String cattr02) {
		this.id = id;
		this.webcontenttype = webcontenttype;
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
	@JoinColumn(name = "PRIMWEBCONTENTTYPE")
	public Webcontenttype getWebcontenttype() {
		return this.webcontenttype;
	}

	public void setWebcontenttype(Webcontenttype webcontenttype) {
		this.webcontenttype = webcontenttype;
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

}