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
 * CrDocorigin2measurepoint generated by hbm2java
 */
@Entity
@Table(name = "CR_DOCORIGIN2MEASUREPOINT", schema = "PCRM")
public class CrDocorigin2measurepoint implements java.io.Serializable {

	private String id;
	private Docorigin docorigin;
	private Casetomeasurepoint casetomeasurepointByPrimfrommeasurepoint;
	private Casetomeasurepoint casetomeasurepointByPrimtomeasurepoint;
	private Date crd;
	private String cru;
	private Date modd;
	private String modu;
	private Date impd;
	private String impu;
	private Date expd;
	private String expu;
	private String logtrace;

	public CrDocorigin2measurepoint() {
	}

	public CrDocorigin2measurepoint(String id) {
		this.id = id;
	}

	public CrDocorigin2measurepoint(String id, Docorigin docorigin,
			Casetomeasurepoint casetomeasurepointByPrimfrommeasurepoint,
			Casetomeasurepoint casetomeasurepointByPrimtomeasurepoint,
			Date crd, String cru, Date modd, String modu, Date impd,
			String impu, Date expd, String expu, String logtrace) {
		this.id = id;
		this.docorigin = docorigin;
		this.casetomeasurepointByPrimfrommeasurepoint = casetomeasurepointByPrimfrommeasurepoint;
		this.casetomeasurepointByPrimtomeasurepoint = casetomeasurepointByPrimtomeasurepoint;
		this.crd = crd;
		this.cru = cru;
		this.modd = modd;
		this.modu = modu;
		this.impd = impd;
		this.impu = impu;
		this.expd = expd;
		this.expu = expu;
		this.logtrace = logtrace;
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
	@JoinColumn(name = "PRIMDOCORIGIN")
	public Docorigin getDocorigin() {
		return this.docorigin;
	}

	public void setDocorigin(Docorigin docorigin) {
		this.docorigin = docorigin;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRIMFROMMEASUREPOINT")
	public Casetomeasurepoint getCasetomeasurepointByPrimfrommeasurepoint() {
		return this.casetomeasurepointByPrimfrommeasurepoint;
	}

	public void setCasetomeasurepointByPrimfrommeasurepoint(
			Casetomeasurepoint casetomeasurepointByPrimfrommeasurepoint) {
		this.casetomeasurepointByPrimfrommeasurepoint = casetomeasurepointByPrimfrommeasurepoint;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRIMTOMEASUREPOINT")
	public Casetomeasurepoint getCasetomeasurepointByPrimtomeasurepoint() {
		return this.casetomeasurepointByPrimtomeasurepoint;
	}

	public void setCasetomeasurepointByPrimtomeasurepoint(
			Casetomeasurepoint casetomeasurepointByPrimtomeasurepoint) {
		this.casetomeasurepointByPrimtomeasurepoint = casetomeasurepointByPrimtomeasurepoint;
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

	@Column(name = "LOGTRACE", length = 19)
	public String getLogtrace() {
		return this.logtrace;
	}

	public void setLogtrace(String logtrace) {
		this.logtrace = logtrace;
	}

}
