package com.tdc.persistence.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Support2149Id generated by hbm2java
 */
@Embeddable
public class Support2149Id implements java.io.Serializable {

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
	private String primdwa;
	private String primarysag;
	private String primtilbkontr;
	private String primaddrint;
	private Long inststatus;
	private String varenr;
	private String progpakke;
	private String inststattext;
	private Character inkluditilbud;
	private Character adddelete;
	private Character existing;
	private Character removed;
	private Character added;
	private String primfap;
	private Character inststatusaendret;
	private Character showincontract;
	private Long tekniskstatus;
	private Date restjobdone;
	private Character packageselection;
	private Long addressid;
	private String location;
	private BigDecimal installationseq;

	public Support2149Id() {
	}

	public Support2149Id(String id, Date crd, Date impt, Date expt, Date impd,
			Date expd, Date modt, String cru, Date delt, Date modd,
			String impu, String expu, Date deld, String modu, String delu,
			Date crt, String primdwa, String primarysag, String primtilbkontr,
			String primaddrint, Long inststatus, String varenr,
			String progpakke, String inststattext, Character inkluditilbud,
			Character adddelete, Character existing, Character removed,
			Character added, String primfap, Character inststatusaendret,
			Character showincontract, Long tekniskstatus, Date restjobdone,
			Character packageselection, Long addressid, String location,
			BigDecimal installationseq) {
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
		this.primdwa = primdwa;
		this.primarysag = primarysag;
		this.primtilbkontr = primtilbkontr;
		this.primaddrint = primaddrint;
		this.inststatus = inststatus;
		this.varenr = varenr;
		this.progpakke = progpakke;
		this.inststattext = inststattext;
		this.inkluditilbud = inkluditilbud;
		this.adddelete = adddelete;
		this.existing = existing;
		this.removed = removed;
		this.added = added;
		this.primfap = primfap;
		this.inststatusaendret = inststatusaendret;
		this.showincontract = showincontract;
		this.tekniskstatus = tekniskstatus;
		this.restjobdone = restjobdone;
		this.packageselection = packageselection;
		this.addressid = addressid;
		this.location = location;
		this.installationseq = installationseq;
	}

	@Column(name = "ID", length = 19)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "CRD", length = 7)
	public Date getCrd() {
		return this.crd;
	}

	public void setCrd(Date crd) {
		this.crd = crd;
	}

	@Column(name = "IMPT", length = 7)
	public Date getImpt() {
		return this.impt;
	}

	public void setImpt(Date impt) {
		this.impt = impt;
	}

	@Column(name = "EXPT", length = 7)
	public Date getExpt() {
		return this.expt;
	}

	public void setExpt(Date expt) {
		this.expt = expt;
	}

	@Column(name = "IMPD", length = 7)
	public Date getImpd() {
		return this.impd;
	}

	public void setImpd(Date impd) {
		this.impd = impd;
	}

	@Column(name = "EXPD", length = 7)
	public Date getExpd() {
		return this.expd;
	}

	public void setExpd(Date expd) {
		this.expd = expd;
	}

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

	@Column(name = "DELT", length = 7)
	public Date getDelt() {
		return this.delt;
	}

	public void setDelt(Date delt) {
		this.delt = delt;
	}

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

	@Column(name = "CRT", length = 7)
	public Date getCrt() {
		return this.crt;
	}

	public void setCrt(Date crt) {
		this.crt = crt;
	}

	@Column(name = "PRIMDWA", length = 22)
	public String getPrimdwa() {
		return this.primdwa;
	}

	public void setPrimdwa(String primdwa) {
		this.primdwa = primdwa;
	}

	@Column(name = "PRIMARYSAG", length = 19)
	public String getPrimarysag() {
		return this.primarysag;
	}

	public void setPrimarysag(String primarysag) {
		this.primarysag = primarysag;
	}

	@Column(name = "PRIMTILBKONTR", length = 19)
	public String getPrimtilbkontr() {
		return this.primtilbkontr;
	}

	public void setPrimtilbkontr(String primtilbkontr) {
		this.primtilbkontr = primtilbkontr;
	}

	@Column(name = "PRIMADDRINT", length = 19)
	public String getPrimaddrint() {
		return this.primaddrint;
	}

	public void setPrimaddrint(String primaddrint) {
		this.primaddrint = primaddrint;
	}

	@Column(name = "INSTSTATUS", precision = 10, scale = 0)
	public Long getInststatus() {
		return this.inststatus;
	}

	public void setInststatus(Long inststatus) {
		this.inststatus = inststatus;
	}

	@Column(name = "VARENR", length = 15)
	public String getVarenr() {
		return this.varenr;
	}

	public void setVarenr(String varenr) {
		this.varenr = varenr;
	}

	@Column(name = "PROGPAKKE")
	public String getProgpakke() {
		return this.progpakke;
	}

	public void setProgpakke(String progpakke) {
		this.progpakke = progpakke;
	}

	@Column(name = "INSTSTATTEXT")
	public String getInststattext() {
		return this.inststattext;
	}

	public void setInststattext(String inststattext) {
		this.inststattext = inststattext;
	}

	@Column(name = "INKLUDITILBUD", length = 1)
	public Character getInkluditilbud() {
		return this.inkluditilbud;
	}

	public void setInkluditilbud(Character inkluditilbud) {
		this.inkluditilbud = inkluditilbud;
	}

	@Column(name = "ADDDELETE", length = 1)
	public Character getAdddelete() {
		return this.adddelete;
	}

	public void setAdddelete(Character adddelete) {
		this.adddelete = adddelete;
	}

	@Column(name = "EXISTING", length = 1)
	public Character getExisting() {
		return this.existing;
	}

	public void setExisting(Character existing) {
		this.existing = existing;
	}

	@Column(name = "REMOVED", length = 1)
	public Character getRemoved() {
		return this.removed;
	}

	public void setRemoved(Character removed) {
		this.removed = removed;
	}

	@Column(name = "ADDED", length = 1)
	public Character getAdded() {
		return this.added;
	}

	public void setAdded(Character added) {
		this.added = added;
	}

	@Column(name = "PRIMFAP", length = 19)
	public String getPrimfap() {
		return this.primfap;
	}

	public void setPrimfap(String primfap) {
		this.primfap = primfap;
	}

	@Column(name = "INSTSTATUSAENDRET", length = 1)
	public Character getInststatusaendret() {
		return this.inststatusaendret;
	}

	public void setInststatusaendret(Character inststatusaendret) {
		this.inststatusaendret = inststatusaendret;
	}

	@Column(name = "SHOWINCONTRACT", length = 1)
	public Character getShowincontract() {
		return this.showincontract;
	}

	public void setShowincontract(Character showincontract) {
		this.showincontract = showincontract;
	}

	@Column(name = "TEKNISKSTATUS", precision = 10, scale = 0)
	public Long getTekniskstatus() {
		return this.tekniskstatus;
	}

	public void setTekniskstatus(Long tekniskstatus) {
		this.tekniskstatus = tekniskstatus;
	}

	@Column(name = "RESTJOBDONE", length = 7)
	public Date getRestjobdone() {
		return this.restjobdone;
	}

	public void setRestjobdone(Date restjobdone) {
		this.restjobdone = restjobdone;
	}

	@Column(name = "PACKAGESELECTION", length = 1)
	public Character getPackageselection() {
		return this.packageselection;
	}

	public void setPackageselection(Character packageselection) {
		this.packageselection = packageselection;
	}

	@Column(name = "ADDRESSID", precision = 10, scale = 0)
	public Long getAddressid() {
		return this.addressid;
	}

	public void setAddressid(Long addressid) {
		this.addressid = addressid;
	}

	@Column(name = "LOCATION", length = 30)
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Column(name = "INSTALLATIONSEQ", precision = 22, scale = 0)
	public BigDecimal getInstallationseq() {
		return this.installationseq;
	}

	public void setInstallationseq(BigDecimal installationseq) {
		this.installationseq = installationseq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Support2149Id))
			return false;
		Support2149Id castOther = (Support2149Id) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getCrd() == castOther.getCrd()) || (this.getCrd() != null
						&& castOther.getCrd() != null && this.getCrd().equals(
						castOther.getCrd())))
				&& ((this.getImpt() == castOther.getImpt()) || (this.getImpt() != null
						&& castOther.getImpt() != null && this.getImpt()
						.equals(castOther.getImpt())))
				&& ((this.getExpt() == castOther.getExpt()) || (this.getExpt() != null
						&& castOther.getExpt() != null && this.getExpt()
						.equals(castOther.getExpt())))
				&& ((this.getImpd() == castOther.getImpd()) || (this.getImpd() != null
						&& castOther.getImpd() != null && this.getImpd()
						.equals(castOther.getImpd())))
				&& ((this.getExpd() == castOther.getExpd()) || (this.getExpd() != null
						&& castOther.getExpd() != null && this.getExpd()
						.equals(castOther.getExpd())))
				&& ((this.getModt() == castOther.getModt()) || (this.getModt() != null
						&& castOther.getModt() != null && this.getModt()
						.equals(castOther.getModt())))
				&& ((this.getCru() == castOther.getCru()) || (this.getCru() != null
						&& castOther.getCru() != null && this.getCru().equals(
						castOther.getCru())))
				&& ((this.getDelt() == castOther.getDelt()) || (this.getDelt() != null
						&& castOther.getDelt() != null && this.getDelt()
						.equals(castOther.getDelt())))
				&& ((this.getModd() == castOther.getModd()) || (this.getModd() != null
						&& castOther.getModd() != null && this.getModd()
						.equals(castOther.getModd())))
				&& ((this.getImpu() == castOther.getImpu()) || (this.getImpu() != null
						&& castOther.getImpu() != null && this.getImpu()
						.equals(castOther.getImpu())))
				&& ((this.getExpu() == castOther.getExpu()) || (this.getExpu() != null
						&& castOther.getExpu() != null && this.getExpu()
						.equals(castOther.getExpu())))
				&& ((this.getDeld() == castOther.getDeld()) || (this.getDeld() != null
						&& castOther.getDeld() != null && this.getDeld()
						.equals(castOther.getDeld())))
				&& ((this.getModu() == castOther.getModu()) || (this.getModu() != null
						&& castOther.getModu() != null && this.getModu()
						.equals(castOther.getModu())))
				&& ((this.getDelu() == castOther.getDelu()) || (this.getDelu() != null
						&& castOther.getDelu() != null && this.getDelu()
						.equals(castOther.getDelu())))
				&& ((this.getCrt() == castOther.getCrt()) || (this.getCrt() != null
						&& castOther.getCrt() != null && this.getCrt().equals(
						castOther.getCrt())))
				&& ((this.getPrimdwa() == castOther.getPrimdwa()) || (this
						.getPrimdwa() != null && castOther.getPrimdwa() != null && this
						.getPrimdwa().equals(castOther.getPrimdwa())))
				&& ((this.getPrimarysag() == castOther.getPrimarysag()) || (this
						.getPrimarysag() != null
						&& castOther.getPrimarysag() != null && this
						.getPrimarysag().equals(castOther.getPrimarysag())))
				&& ((this.getPrimtilbkontr() == castOther.getPrimtilbkontr()) || (this
						.getPrimtilbkontr() != null
						&& castOther.getPrimtilbkontr() != null && this
						.getPrimtilbkontr()
						.equals(castOther.getPrimtilbkontr())))
				&& ((this.getPrimaddrint() == castOther.getPrimaddrint()) || (this
						.getPrimaddrint() != null
						&& castOther.getPrimaddrint() != null && this
						.getPrimaddrint().equals(castOther.getPrimaddrint())))
				&& ((this.getInststatus() == castOther.getInststatus()) || (this
						.getInststatus() != null
						&& castOther.getInststatus() != null && this
						.getInststatus().equals(castOther.getInststatus())))
				&& ((this.getVarenr() == castOther.getVarenr()) || (this
						.getVarenr() != null && castOther.getVarenr() != null && this
						.getVarenr().equals(castOther.getVarenr())))
				&& ((this.getProgpakke() == castOther.getProgpakke()) || (this
						.getProgpakke() != null
						&& castOther.getProgpakke() != null && this
						.getProgpakke().equals(castOther.getProgpakke())))
				&& ((this.getInststattext() == castOther.getInststattext()) || (this
						.getInststattext() != null
						&& castOther.getInststattext() != null && this
						.getInststattext().equals(castOther.getInststattext())))
				&& ((this.getInkluditilbud() == castOther.getInkluditilbud()) || (this
						.getInkluditilbud() != null
						&& castOther.getInkluditilbud() != null && this
						.getInkluditilbud()
						.equals(castOther.getInkluditilbud())))
				&& ((this.getAdddelete() == castOther.getAdddelete()) || (this
						.getAdddelete() != null
						&& castOther.getAdddelete() != null && this
						.getAdddelete().equals(castOther.getAdddelete())))
				&& ((this.getExisting() == castOther.getExisting()) || (this
						.getExisting() != null
						&& castOther.getExisting() != null && this
						.getExisting().equals(castOther.getExisting())))
				&& ((this.getRemoved() == castOther.getRemoved()) || (this
						.getRemoved() != null && castOther.getRemoved() != null && this
						.getRemoved().equals(castOther.getRemoved())))
				&& ((this.getAdded() == castOther.getAdded()) || (this
						.getAdded() != null && castOther.getAdded() != null && this
						.getAdded().equals(castOther.getAdded())))
				&& ((this.getPrimfap() == castOther.getPrimfap()) || (this
						.getPrimfap() != null && castOther.getPrimfap() != null && this
						.getPrimfap().equals(castOther.getPrimfap())))
				&& ((this.getInststatusaendret() == castOther
						.getInststatusaendret()) || (this
						.getInststatusaendret() != null
						&& castOther.getInststatusaendret() != null && this
						.getInststatusaendret().equals(
								castOther.getInststatusaendret())))
				&& ((this.getShowincontract() == castOther.getShowincontract()) || (this
						.getShowincontract() != null
						&& castOther.getShowincontract() != null && this
						.getShowincontract().equals(
								castOther.getShowincontract())))
				&& ((this.getTekniskstatus() == castOther.getTekniskstatus()) || (this
						.getTekniskstatus() != null
						&& castOther.getTekniskstatus() != null && this
						.getTekniskstatus()
						.equals(castOther.getTekniskstatus())))
				&& ((this.getRestjobdone() == castOther.getRestjobdone()) || (this
						.getRestjobdone() != null
						&& castOther.getRestjobdone() != null && this
						.getRestjobdone().equals(castOther.getRestjobdone())))
				&& ((this.getPackageselection() == castOther
						.getPackageselection()) || (this.getPackageselection() != null
						&& castOther.getPackageselection() != null && this
						.getPackageselection().equals(
								castOther.getPackageselection())))
				&& ((this.getAddressid() == castOther.getAddressid()) || (this
						.getAddressid() != null
						&& castOther.getAddressid() != null && this
						.getAddressid().equals(castOther.getAddressid())))
				&& ((this.getLocation() == castOther.getLocation()) || (this
						.getLocation() != null
						&& castOther.getLocation() != null && this
						.getLocation().equals(castOther.getLocation())))
				&& ((this.getInstallationseq() == castOther
						.getInstallationseq()) || (this.getInstallationseq() != null
						&& castOther.getInstallationseq() != null && this
						.getInstallationseq().equals(
								castOther.getInstallationseq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getCrd() == null ? 0 : this.getCrd().hashCode());
		result = 37 * result
				+ (getImpt() == null ? 0 : this.getImpt().hashCode());
		result = 37 * result
				+ (getExpt() == null ? 0 : this.getExpt().hashCode());
		result = 37 * result
				+ (getImpd() == null ? 0 : this.getImpd().hashCode());
		result = 37 * result
				+ (getExpd() == null ? 0 : this.getExpd().hashCode());
		result = 37 * result
				+ (getModt() == null ? 0 : this.getModt().hashCode());
		result = 37 * result
				+ (getCru() == null ? 0 : this.getCru().hashCode());
		result = 37 * result
				+ (getDelt() == null ? 0 : this.getDelt().hashCode());
		result = 37 * result
				+ (getModd() == null ? 0 : this.getModd().hashCode());
		result = 37 * result
				+ (getImpu() == null ? 0 : this.getImpu().hashCode());
		result = 37 * result
				+ (getExpu() == null ? 0 : this.getExpu().hashCode());
		result = 37 * result
				+ (getDeld() == null ? 0 : this.getDeld().hashCode());
		result = 37 * result
				+ (getModu() == null ? 0 : this.getModu().hashCode());
		result = 37 * result
				+ (getDelu() == null ? 0 : this.getDelu().hashCode());
		result = 37 * result
				+ (getCrt() == null ? 0 : this.getCrt().hashCode());
		result = 37 * result
				+ (getPrimdwa() == null ? 0 : this.getPrimdwa().hashCode());
		result = 37
				* result
				+ (getPrimarysag() == null ? 0 : this.getPrimarysag()
						.hashCode());
		result = 37
				* result
				+ (getPrimtilbkontr() == null ? 0 : this.getPrimtilbkontr()
						.hashCode());
		result = 37
				* result
				+ (getPrimaddrint() == null ? 0 : this.getPrimaddrint()
						.hashCode());
		result = 37
				* result
				+ (getInststatus() == null ? 0 : this.getInststatus()
						.hashCode());
		result = 37 * result
				+ (getVarenr() == null ? 0 : this.getVarenr().hashCode());
		result = 37 * result
				+ (getProgpakke() == null ? 0 : this.getProgpakke().hashCode());
		result = 37
				* result
				+ (getInststattext() == null ? 0 : this.getInststattext()
						.hashCode());
		result = 37
				* result
				+ (getInkluditilbud() == null ? 0 : this.getInkluditilbud()
						.hashCode());
		result = 37 * result
				+ (getAdddelete() == null ? 0 : this.getAdddelete().hashCode());
		result = 37 * result
				+ (getExisting() == null ? 0 : this.getExisting().hashCode());
		result = 37 * result
				+ (getRemoved() == null ? 0 : this.getRemoved().hashCode());
		result = 37 * result
				+ (getAdded() == null ? 0 : this.getAdded().hashCode());
		result = 37 * result
				+ (getPrimfap() == null ? 0 : this.getPrimfap().hashCode());
		result = 37
				* result
				+ (getInststatusaendret() == null ? 0 : this
						.getInststatusaendret().hashCode());
		result = 37
				* result
				+ (getShowincontract() == null ? 0 : this.getShowincontract()
						.hashCode());
		result = 37
				* result
				+ (getTekniskstatus() == null ? 0 : this.getTekniskstatus()
						.hashCode());
		result = 37
				* result
				+ (getRestjobdone() == null ? 0 : this.getRestjobdone()
						.hashCode());
		result = 37
				* result
				+ (getPackageselection() == null ? 0 : this
						.getPackageselection().hashCode());
		result = 37 * result
				+ (getAddressid() == null ? 0 : this.getAddressid().hashCode());
		result = 37 * result
				+ (getLocation() == null ? 0 : this.getLocation().hashCode());
		result = 37
				* result
				+ (getInstallationseq() == null ? 0 : this.getInstallationseq()
						.hashCode());
		return result;
	}

}
