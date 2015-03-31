package com.tdc.persistence.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VFdbCableunitprogsupplyId generated by hbm2java
 */
@Embeddable
public class VFdbCableunitprogsupplyId implements java.io.Serializable {

	private int nodeId;
	private String hfnr;
	private String anlaegsnr;
	private BigDecimal startFrekvens;
	private BigDecimal slutFrekvens;
	private String pakkeGruppering;
	private int pakkenr;
	private String pakkenavn;
	private String leveringstype;
	private String proveprogram;
	private String area;
	private String band;
	private String kanal;
	private BigDecimal frekvens;
	private String gruppering;
	private Integer varenummer;
	private String varenavn;
	private String overlap;
	private Date validFrom;
	private Date validTo;
	private BigDecimal parentChKeySeq;
	private String vendor;

	public VFdbCableunitprogsupplyId() {
	}

	public VFdbCableunitprogsupplyId(int nodeId, int pakkenr) {
		this.nodeId = nodeId;
		this.pakkenr = pakkenr;
	}

	public VFdbCableunitprogsupplyId(int nodeId, String hfnr, String anlaegsnr,
			BigDecimal startFrekvens, BigDecimal slutFrekvens,
			String pakkeGruppering, int pakkenr, String pakkenavn,
			String leveringstype, String proveprogram, String area,
			String band, String kanal, BigDecimal frekvens, String gruppering,
			Integer varenummer, String varenavn, String overlap,
			Date validFrom, Date validTo, BigDecimal parentChKeySeq,
			String vendor) {
		this.nodeId = nodeId;
		this.hfnr = hfnr;
		this.anlaegsnr = anlaegsnr;
		this.startFrekvens = startFrekvens;
		this.slutFrekvens = slutFrekvens;
		this.pakkeGruppering = pakkeGruppering;
		this.pakkenr = pakkenr;
		this.pakkenavn = pakkenavn;
		this.leveringstype = leveringstype;
		this.proveprogram = proveprogram;
		this.area = area;
		this.band = band;
		this.kanal = kanal;
		this.frekvens = frekvens;
		this.gruppering = gruppering;
		this.varenummer = varenummer;
		this.varenavn = varenavn;
		this.overlap = overlap;
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.parentChKeySeq = parentChKeySeq;
		this.vendor = vendor;
	}

	@Column(name = "NODE_ID", nullable = false, precision = 9, scale = 0)
	public int getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}

	@Column(name = "HFNR", length = 11)
	public String getHfnr() {
		return this.hfnr;
	}

	public void setHfnr(String hfnr) {
		this.hfnr = hfnr;
	}

	@Column(name = "ANLAEGSNR", length = 10)
	public String getAnlaegsnr() {
		return this.anlaegsnr;
	}

	public void setAnlaegsnr(String anlaegsnr) {
		this.anlaegsnr = anlaegsnr;
	}

	@Column(name = "START_FREKVENS", precision = 22, scale = 0)
	public BigDecimal getStartFrekvens() {
		return this.startFrekvens;
	}

	public void setStartFrekvens(BigDecimal startFrekvens) {
		this.startFrekvens = startFrekvens;
	}

	@Column(name = "SLUT_FREKVENS", precision = 22, scale = 0)
	public BigDecimal getSlutFrekvens() {
		return this.slutFrekvens;
	}

	public void setSlutFrekvens(BigDecimal slutFrekvens) {
		this.slutFrekvens = slutFrekvens;
	}

	@Column(name = "PAKKE_GRUPPERING", length = 50)
	public String getPakkeGruppering() {
		return this.pakkeGruppering;
	}

	public void setPakkeGruppering(String pakkeGruppering) {
		this.pakkeGruppering = pakkeGruppering;
	}

	@Column(name = "PAKKENR", nullable = false, precision = 7, scale = 0)
	public int getPakkenr() {
		return this.pakkenr;
	}

	public void setPakkenr(int pakkenr) {
		this.pakkenr = pakkenr;
	}

	@Column(name = "PAKKENAVN")
	public String getPakkenavn() {
		return this.pakkenavn;
	}

	public void setPakkenavn(String pakkenavn) {
		this.pakkenavn = pakkenavn;
	}

	@Column(name = "LEVERINGSTYPE", length = 8)
	public String getLeveringstype() {
		return this.leveringstype;
	}

	public void setLeveringstype(String leveringstype) {
		this.leveringstype = leveringstype;
	}

	@Column(name = "PROVEPROGRAM", length = 1)
	public String getProveprogram() {
		return this.proveprogram;
	}

	public void setProveprogram(String proveprogram) {
		this.proveprogram = proveprogram;
	}

	@Column(name = "AREA", length = 6)
	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "BAND", length = 6)
	public String getBand() {
		return this.band;
	}

	public void setBand(String band) {
		this.band = band;
	}

	@Column(name = "KANAL", length = 10)
	public String getKanal() {
		return this.kanal;
	}

	public void setKanal(String kanal) {
		this.kanal = kanal;
	}

	@Column(name = "FREKVENS", precision = 22, scale = 0)
	public BigDecimal getFrekvens() {
		return this.frekvens;
	}

	public void setFrekvens(BigDecimal frekvens) {
		this.frekvens = frekvens;
	}

	@Column(name = "GRUPPERING", length = 50)
	public String getGruppering() {
		return this.gruppering;
	}

	public void setGruppering(String gruppering) {
		this.gruppering = gruppering;
	}

	@Column(name = "VARENUMMER", precision = 7, scale = 0)
	public Integer getVarenummer() {
		return this.varenummer;
	}

	public void setVarenummer(Integer varenummer) {
		this.varenummer = varenummer;
	}

	@Column(name = "VARENAVN")
	public String getVarenavn() {
		return this.varenavn;
	}

	public void setVarenavn(String varenavn) {
		this.varenavn = varenavn;
	}

	@Column(name = "OVERLAP", length = 3)
	public String getOverlap() {
		return this.overlap;
	}

	public void setOverlap(String overlap) {
		this.overlap = overlap;
	}

	@Column(name = "VALID_FROM", length = 7)
	public Date getValidFrom() {
		return this.validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	@Column(name = "VALID_TO", length = 7)
	public Date getValidTo() {
		return this.validTo;
	}

	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}

	@Column(name = "PARENT_CH_KEY_SEQ", precision = 22, scale = 0)
	public BigDecimal getParentChKeySeq() {
		return this.parentChKeySeq;
	}

	public void setParentChKeySeq(BigDecimal parentChKeySeq) {
		this.parentChKeySeq = parentChKeySeq;
	}

	@Column(name = "VENDOR", length = 20)
	public String getVendor() {
		return this.vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VFdbCableunitprogsupplyId))
			return false;
		VFdbCableunitprogsupplyId castOther = (VFdbCableunitprogsupplyId) other;

		return (this.getNodeId() == castOther.getNodeId())
				&& ((this.getHfnr() == castOther.getHfnr()) || (this.getHfnr() != null
						&& castOther.getHfnr() != null && this.getHfnr()
						.equals(castOther.getHfnr())))
				&& ((this.getAnlaegsnr() == castOther.getAnlaegsnr()) || (this
						.getAnlaegsnr() != null
						&& castOther.getAnlaegsnr() != null && this
						.getAnlaegsnr().equals(castOther.getAnlaegsnr())))
				&& ((this.getStartFrekvens() == castOther.getStartFrekvens()) || (this
						.getStartFrekvens() != null
						&& castOther.getStartFrekvens() != null && this
						.getStartFrekvens()
						.equals(castOther.getStartFrekvens())))
				&& ((this.getSlutFrekvens() == castOther.getSlutFrekvens()) || (this
						.getSlutFrekvens() != null
						&& castOther.getSlutFrekvens() != null && this
						.getSlutFrekvens().equals(castOther.getSlutFrekvens())))
				&& ((this.getPakkeGruppering() == castOther
						.getPakkeGruppering()) || (this.getPakkeGruppering() != null
						&& castOther.getPakkeGruppering() != null && this
						.getPakkeGruppering().equals(
								castOther.getPakkeGruppering())))
				&& (this.getPakkenr() == castOther.getPakkenr())
				&& ((this.getPakkenavn() == castOther.getPakkenavn()) || (this
						.getPakkenavn() != null
						&& castOther.getPakkenavn() != null && this
						.getPakkenavn().equals(castOther.getPakkenavn())))
				&& ((this.getLeveringstype() == castOther.getLeveringstype()) || (this
						.getLeveringstype() != null
						&& castOther.getLeveringstype() != null && this
						.getLeveringstype()
						.equals(castOther.getLeveringstype())))
				&& ((this.getProveprogram() == castOther.getProveprogram()) || (this
						.getProveprogram() != null
						&& castOther.getProveprogram() != null && this
						.getProveprogram().equals(castOther.getProveprogram())))
				&& ((this.getArea() == castOther.getArea()) || (this.getArea() != null
						&& castOther.getArea() != null && this.getArea()
						.equals(castOther.getArea())))
				&& ((this.getBand() == castOther.getBand()) || (this.getBand() != null
						&& castOther.getBand() != null && this.getBand()
						.equals(castOther.getBand())))
				&& ((this.getKanal() == castOther.getKanal()) || (this
						.getKanal() != null && castOther.getKanal() != null && this
						.getKanal().equals(castOther.getKanal())))
				&& ((this.getFrekvens() == castOther.getFrekvens()) || (this
						.getFrekvens() != null
						&& castOther.getFrekvens() != null && this
						.getFrekvens().equals(castOther.getFrekvens())))
				&& ((this.getGruppering() == castOther.getGruppering()) || (this
						.getGruppering() != null
						&& castOther.getGruppering() != null && this
						.getGruppering().equals(castOther.getGruppering())))
				&& ((this.getVarenummer() == castOther.getVarenummer()) || (this
						.getVarenummer() != null
						&& castOther.getVarenummer() != null && this
						.getVarenummer().equals(castOther.getVarenummer())))
				&& ((this.getVarenavn() == castOther.getVarenavn()) || (this
						.getVarenavn() != null
						&& castOther.getVarenavn() != null && this
						.getVarenavn().equals(castOther.getVarenavn())))
				&& ((this.getOverlap() == castOther.getOverlap()) || (this
						.getOverlap() != null && castOther.getOverlap() != null && this
						.getOverlap().equals(castOther.getOverlap())))
				&& ((this.getValidFrom() == castOther.getValidFrom()) || (this
						.getValidFrom() != null
						&& castOther.getValidFrom() != null && this
						.getValidFrom().equals(castOther.getValidFrom())))
				&& ((this.getValidTo() == castOther.getValidTo()) || (this
						.getValidTo() != null && castOther.getValidTo() != null && this
						.getValidTo().equals(castOther.getValidTo())))
				&& ((this.getParentChKeySeq() == castOther.getParentChKeySeq()) || (this
						.getParentChKeySeq() != null
						&& castOther.getParentChKeySeq() != null && this
						.getParentChKeySeq().equals(
								castOther.getParentChKeySeq())))
				&& ((this.getVendor() == castOther.getVendor()) || (this
						.getVendor() != null && castOther.getVendor() != null && this
						.getVendor().equals(castOther.getVendor())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getNodeId();
		result = 37 * result
				+ (getHfnr() == null ? 0 : this.getHfnr().hashCode());
		result = 37 * result
				+ (getAnlaegsnr() == null ? 0 : this.getAnlaegsnr().hashCode());
		result = 37
				* result
				+ (getStartFrekvens() == null ? 0 : this.getStartFrekvens()
						.hashCode());
		result = 37
				* result
				+ (getSlutFrekvens() == null ? 0 : this.getSlutFrekvens()
						.hashCode());
		result = 37
				* result
				+ (getPakkeGruppering() == null ? 0 : this.getPakkeGruppering()
						.hashCode());
		result = 37 * result + this.getPakkenr();
		result = 37 * result
				+ (getPakkenavn() == null ? 0 : this.getPakkenavn().hashCode());
		result = 37
				* result
				+ (getLeveringstype() == null ? 0 : this.getLeveringstype()
						.hashCode());
		result = 37
				* result
				+ (getProveprogram() == null ? 0 : this.getProveprogram()
						.hashCode());
		result = 37 * result
				+ (getArea() == null ? 0 : this.getArea().hashCode());
		result = 37 * result
				+ (getBand() == null ? 0 : this.getBand().hashCode());
		result = 37 * result
				+ (getKanal() == null ? 0 : this.getKanal().hashCode());
		result = 37 * result
				+ (getFrekvens() == null ? 0 : this.getFrekvens().hashCode());
		result = 37
				* result
				+ (getGruppering() == null ? 0 : this.getGruppering()
						.hashCode());
		result = 37
				* result
				+ (getVarenummer() == null ? 0 : this.getVarenummer()
						.hashCode());
		result = 37 * result
				+ (getVarenavn() == null ? 0 : this.getVarenavn().hashCode());
		result = 37 * result
				+ (getOverlap() == null ? 0 : this.getOverlap().hashCode());
		result = 37 * result
				+ (getValidFrom() == null ? 0 : this.getValidFrom().hashCode());
		result = 37 * result
				+ (getValidTo() == null ? 0 : this.getValidTo().hashCode());
		result = 37
				* result
				+ (getParentChKeySeq() == null ? 0 : this.getParentChKeySeq()
						.hashCode());
		result = 37 * result
				+ (getVendor() == null ? 0 : this.getVendor().hashCode());
		return result;
	}

}
