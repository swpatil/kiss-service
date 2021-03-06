package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * WAnlxgDocId generated by hbm2java
 */
@Embeddable
public class WAnlxgDocId implements java.io.Serializable {

	private String docTablepk;
	private String anlNr;
	private String anlNavn;
	private String docType;
	private String docSpecifikation;
	private Character docOprindelse;
	private Date docCrdate;
	private BigDecimal docSize;
	private String docFiladresse;
	private String docFilextention;

	public WAnlxgDocId() {
	}

	public WAnlxgDocId(String docTablepk) {
		this.docTablepk = docTablepk;
	}

	public WAnlxgDocId(String docTablepk, String anlNr, String anlNavn,
			String docType, String docSpecifikation, Character docOprindelse,
			Date docCrdate, BigDecimal docSize, String docFiladresse,
			String docFilextention) {
		this.docTablepk = docTablepk;
		this.anlNr = anlNr;
		this.anlNavn = anlNavn;
		this.docType = docType;
		this.docSpecifikation = docSpecifikation;
		this.docOprindelse = docOprindelse;
		this.docCrdate = docCrdate;
		this.docSize = docSize;
		this.docFiladresse = docFiladresse;
		this.docFilextention = docFilextention;
	}

	@Column(name = "DOC_TABLEPK", nullable = false, length = 19)
	public String getDocTablepk() {
		return this.docTablepk;
	}

	public void setDocTablepk(String docTablepk) {
		this.docTablepk = docTablepk;
	}

	@Column(name = "ANL_NR", length = 10)
	public String getAnlNr() {
		return this.anlNr;
	}

	public void setAnlNr(String anlNr) {
		this.anlNr = anlNr;
	}

	@Column(name = "ANL_NAVN", length = 40)
	public String getAnlNavn() {
		return this.anlNavn;
	}

	public void setAnlNavn(String anlNavn) {
		this.anlNavn = anlNavn;
	}

	@Column(name = "DOC_TYPE")
	public String getDocType() {
		return this.docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	@Column(name = "DOC_SPECIFIKATION", length = 70)
	public String getDocSpecifikation() {
		return this.docSpecifikation;
	}

	public void setDocSpecifikation(String docSpecifikation) {
		this.docSpecifikation = docSpecifikation;
	}

	@Column(name = "DOC_OPRINDELSE", length = 1)
	public Character getDocOprindelse() {
		return this.docOprindelse;
	}

	public void setDocOprindelse(Character docOprindelse) {
		this.docOprindelse = docOprindelse;
	}

	@Column(name = "DOC_CRDATE", length = 8)
	public Date getDocCrdate() {
		return this.docCrdate;
	}

	public void setDocCrdate(Date docCrdate) {
		this.docCrdate = docCrdate;
	}

	@Column(name = "DOC_SIZE", precision = 22, scale = 0)
	public BigDecimal getDocSize() {
		return this.docSize;
	}

	public void setDocSize(BigDecimal docSize) {
		this.docSize = docSize;
	}

	@Column(name = "DOC_FILADRESSE")
	public String getDocFiladresse() {
		return this.docFiladresse;
	}

	public void setDocFiladresse(String docFiladresse) {
		this.docFiladresse = docFiladresse;
	}

	@Column(name = "DOC_FILEXTENTION")
	public String getDocFilextention() {
		return this.docFilextention;
	}

	public void setDocFilextention(String docFilextention) {
		this.docFilextention = docFilextention;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof WAnlxgDocId))
			return false;
		WAnlxgDocId castOther = (WAnlxgDocId) other;

		return ((this.getDocTablepk() == castOther.getDocTablepk()) || (this
				.getDocTablepk() != null && castOther.getDocTablepk() != null && this
				.getDocTablepk().equals(castOther.getDocTablepk())))
				&& ((this.getAnlNr() == castOther.getAnlNr()) || (this
						.getAnlNr() != null && castOther.getAnlNr() != null && this
						.getAnlNr().equals(castOther.getAnlNr())))
				&& ((this.getAnlNavn() == castOther.getAnlNavn()) || (this
						.getAnlNavn() != null && castOther.getAnlNavn() != null && this
						.getAnlNavn().equals(castOther.getAnlNavn())))
				&& ((this.getDocType() == castOther.getDocType()) || (this
						.getDocType() != null && castOther.getDocType() != null && this
						.getDocType().equals(castOther.getDocType())))
				&& ((this.getDocSpecifikation() == castOther
						.getDocSpecifikation()) || (this.getDocSpecifikation() != null
						&& castOther.getDocSpecifikation() != null && this
						.getDocSpecifikation().equals(
								castOther.getDocSpecifikation())))
				&& ((this.getDocOprindelse() == castOther.getDocOprindelse()) || (this
						.getDocOprindelse() != null
						&& castOther.getDocOprindelse() != null && this
						.getDocOprindelse()
						.equals(castOther.getDocOprindelse())))
				&& ((this.getDocCrdate() == castOther.getDocCrdate()) || (this
						.getDocCrdate() != null
						&& castOther.getDocCrdate() != null && this
						.getDocCrdate().equals(castOther.getDocCrdate())))
				&& ((this.getDocSize() == castOther.getDocSize()) || (this
						.getDocSize() != null && castOther.getDocSize() != null && this
						.getDocSize().equals(castOther.getDocSize())))
				&& ((this.getDocFiladresse() == castOther.getDocFiladresse()) || (this
						.getDocFiladresse() != null
						&& castOther.getDocFiladresse() != null && this
						.getDocFiladresse()
						.equals(castOther.getDocFiladresse())))
				&& ((this.getDocFilextention() == castOther
						.getDocFilextention()) || (this.getDocFilextention() != null
						&& castOther.getDocFilextention() != null && this
						.getDocFilextention().equals(
								castOther.getDocFilextention())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getDocTablepk() == null ? 0 : this.getDocTablepk()
						.hashCode());
		result = 37 * result
				+ (getAnlNr() == null ? 0 : this.getAnlNr().hashCode());
		result = 37 * result
				+ (getAnlNavn() == null ? 0 : this.getAnlNavn().hashCode());
		result = 37 * result
				+ (getDocType() == null ? 0 : this.getDocType().hashCode());
		result = 37
				* result
				+ (getDocSpecifikation() == null ? 0 : this
						.getDocSpecifikation().hashCode());
		result = 37
				* result
				+ (getDocOprindelse() == null ? 0 : this.getDocOprindelse()
						.hashCode());
		result = 37 * result
				+ (getDocCrdate() == null ? 0 : this.getDocCrdate().hashCode());
		result = 37 * result
				+ (getDocSize() == null ? 0 : this.getDocSize().hashCode());
		result = 37
				* result
				+ (getDocFiladresse() == null ? 0 : this.getDocFiladresse()
						.hashCode());
		result = 37
				* result
				+ (getDocFilextention() == null ? 0 : this.getDocFilextention()
						.hashCode());
		return result;
	}

}
