package com.tdc.persistence.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * WAnlxgInstId generated by hbm2java
 */
@Embeddable
public class WAnlxgInstId implements java.io.Serializable {

	private String WPk;
	private String anlxgnr;
	private String instadrId;
	private BigDecimal instadrCommrate;
	private String instadrVejnavn;
	private String instadrHusnr;
	private String instadrOpgang;
	private String instadrEtage;
	private String instadrSidedoer;
	private String instadrPostnr;
	private String instadrPostdist;

	public WAnlxgInstId() {
	}

	public WAnlxgInstId(String WPk) {
		this.WPk = WPk;
	}

	public WAnlxgInstId(String WPk, String anlxgnr, String instadrId,
			BigDecimal instadrCommrate, String instadrVejnavn,
			String instadrHusnr, String instadrOpgang, String instadrEtage,
			String instadrSidedoer, String instadrPostnr, String instadrPostdist) {
		this.WPk = WPk;
		this.anlxgnr = anlxgnr;
		this.instadrId = instadrId;
		this.instadrCommrate = instadrCommrate;
		this.instadrVejnavn = instadrVejnavn;
		this.instadrHusnr = instadrHusnr;
		this.instadrOpgang = instadrOpgang;
		this.instadrEtage = instadrEtage;
		this.instadrSidedoer = instadrSidedoer;
		this.instadrPostnr = instadrPostnr;
		this.instadrPostdist = instadrPostdist;
	}

	@Column(name = "W_PK", nullable = false, length = 19)
	public String getWPk() {
		return this.WPk;
	}

	public void setWPk(String WPk) {
		this.WPk = WPk;
	}

	@Column(name = "ANLXGNR", length = 10)
	public String getAnlxgnr() {
		return this.anlxgnr;
	}

	public void setAnlxgnr(String anlxgnr) {
		this.anlxgnr = anlxgnr;
	}

	@Column(name = "INSTADR_ID", length = 22)
	public String getInstadrId() {
		return this.instadrId;
	}

	public void setInstadrId(String instadrId) {
		this.instadrId = instadrId;
	}

	@Column(name = "INSTADR_COMMRATE", precision = 22, scale = 0)
	public BigDecimal getInstadrCommrate() {
		return this.instadrCommrate;
	}

	public void setInstadrCommrate(BigDecimal instadrCommrate) {
		this.instadrCommrate = instadrCommrate;
	}

	@Column(name = "INSTADR_VEJNAVN", length = 40)
	public String getInstadrVejnavn() {
		return this.instadrVejnavn;
	}

	public void setInstadrVejnavn(String instadrVejnavn) {
		this.instadrVejnavn = instadrVejnavn;
	}

	@Column(name = "INSTADR_HUSNR", length = 3)
	public String getInstadrHusnr() {
		return this.instadrHusnr;
	}

	public void setInstadrHusnr(String instadrHusnr) {
		this.instadrHusnr = instadrHusnr;
	}

	@Column(name = "INSTADR_OPGANG", length = 1)
	public String getInstadrOpgang() {
		return this.instadrOpgang;
	}

	public void setInstadrOpgang(String instadrOpgang) {
		this.instadrOpgang = instadrOpgang;
	}

	@Column(name = "INSTADR_ETAGE", length = 2)
	public String getInstadrEtage() {
		return this.instadrEtage;
	}

	public void setInstadrEtage(String instadrEtage) {
		this.instadrEtage = instadrEtage;
	}

	@Column(name = "INSTADR_SIDEDOER", length = 10)
	public String getInstadrSidedoer() {
		return this.instadrSidedoer;
	}

	public void setInstadrSidedoer(String instadrSidedoer) {
		this.instadrSidedoer = instadrSidedoer;
	}

	@Column(name = "INSTADR_POSTNR", length = 4)
	public String getInstadrPostnr() {
		return this.instadrPostnr;
	}

	public void setInstadrPostnr(String instadrPostnr) {
		this.instadrPostnr = instadrPostnr;
	}

	@Column(name = "INSTADR_POSTDIST", length = 30)
	public String getInstadrPostdist() {
		return this.instadrPostdist;
	}

	public void setInstadrPostdist(String instadrPostdist) {
		this.instadrPostdist = instadrPostdist;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof WAnlxgInstId))
			return false;
		WAnlxgInstId castOther = (WAnlxgInstId) other;

		return ((this.getWPk() == castOther.getWPk()) || (this.getWPk() != null
				&& castOther.getWPk() != null && this.getWPk().equals(
				castOther.getWPk())))
				&& ((this.getAnlxgnr() == castOther.getAnlxgnr()) || (this
						.getAnlxgnr() != null && castOther.getAnlxgnr() != null && this
						.getAnlxgnr().equals(castOther.getAnlxgnr())))
				&& ((this.getInstadrId() == castOther.getInstadrId()) || (this
						.getInstadrId() != null
						&& castOther.getInstadrId() != null && this
						.getInstadrId().equals(castOther.getInstadrId())))
				&& ((this.getInstadrCommrate() == castOther
						.getInstadrCommrate()) || (this.getInstadrCommrate() != null
						&& castOther.getInstadrCommrate() != null && this
						.getInstadrCommrate().equals(
								castOther.getInstadrCommrate())))
				&& ((this.getInstadrVejnavn() == castOther.getInstadrVejnavn()) || (this
						.getInstadrVejnavn() != null
						&& castOther.getInstadrVejnavn() != null && this
						.getInstadrVejnavn().equals(
								castOther.getInstadrVejnavn())))
				&& ((this.getInstadrHusnr() == castOther.getInstadrHusnr()) || (this
						.getInstadrHusnr() != null
						&& castOther.getInstadrHusnr() != null && this
						.getInstadrHusnr().equals(castOther.getInstadrHusnr())))
				&& ((this.getInstadrOpgang() == castOther.getInstadrOpgang()) || (this
						.getInstadrOpgang() != null
						&& castOther.getInstadrOpgang() != null && this
						.getInstadrOpgang()
						.equals(castOther.getInstadrOpgang())))
				&& ((this.getInstadrEtage() == castOther.getInstadrEtage()) || (this
						.getInstadrEtage() != null
						&& castOther.getInstadrEtage() != null && this
						.getInstadrEtage().equals(castOther.getInstadrEtage())))
				&& ((this.getInstadrSidedoer() == castOther
						.getInstadrSidedoer()) || (this.getInstadrSidedoer() != null
						&& castOther.getInstadrSidedoer() != null && this
						.getInstadrSidedoer().equals(
								castOther.getInstadrSidedoer())))
				&& ((this.getInstadrPostnr() == castOther.getInstadrPostnr()) || (this
						.getInstadrPostnr() != null
						&& castOther.getInstadrPostnr() != null && this
						.getInstadrPostnr()
						.equals(castOther.getInstadrPostnr())))
				&& ((this.getInstadrPostdist() == castOther
						.getInstadrPostdist()) || (this.getInstadrPostdist() != null
						&& castOther.getInstadrPostdist() != null && this
						.getInstadrPostdist().equals(
								castOther.getInstadrPostdist())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getWPk() == null ? 0 : this.getWPk().hashCode());
		result = 37 * result
				+ (getAnlxgnr() == null ? 0 : this.getAnlxgnr().hashCode());
		result = 37 * result
				+ (getInstadrId() == null ? 0 : this.getInstadrId().hashCode());
		result = 37
				* result
				+ (getInstadrCommrate() == null ? 0 : this.getInstadrCommrate()
						.hashCode());
		result = 37
				* result
				+ (getInstadrVejnavn() == null ? 0 : this.getInstadrVejnavn()
						.hashCode());
		result = 37
				* result
				+ (getInstadrHusnr() == null ? 0 : this.getInstadrHusnr()
						.hashCode());
		result = 37
				* result
				+ (getInstadrOpgang() == null ? 0 : this.getInstadrOpgang()
						.hashCode());
		result = 37
				* result
				+ (getInstadrEtage() == null ? 0 : this.getInstadrEtage()
						.hashCode());
		result = 37
				* result
				+ (getInstadrSidedoer() == null ? 0 : this.getInstadrSidedoer()
						.hashCode());
		result = 37
				* result
				+ (getInstadrPostnr() == null ? 0 : this.getInstadrPostnr()
						.hashCode());
		result = 37
				* result
				+ (getInstadrPostdist() == null ? 0 : this.getInstadrPostdist()
						.hashCode());
		return result;
	}

}
