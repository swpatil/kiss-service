package com.tdc.persistence.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * IcalcdataLocalId generated by hbm2java
 */
@Embeddable
public class IcalcdataLocalId implements java.io.Serializable {

	private String id;
	private Date crd;
	private Date crt;
	private String cru;
	private Date impt;
	private Date impd;
	private String impu;
	private Date expt;
	private Date expd;
	private String expu;
	private Date modt;
	private Date modd;
	private String modu;
	private Date delt;
	private String delu;
	private Date deld;
	private String code;
	private String heading;
	private String sourcevalue;
	private String sourcedescript;
	private String sourcefieldname;
	private String sourcedatatype;
	private String primdc;
	private String primicr;
	private String osuname;
	private Boolean datapricecalclock;
	private String primbasicpricecalc;
	private String primdatapricecalc;
	private String primcalcrequest;

	public IcalcdataLocalId() {
	}

	public IcalcdataLocalId(String id, Date crd, Date crt, String cru,
			Date impt, Date impd, String impu, Date expt, Date expd,
			String expu, Date modt, Date modd, String modu, Date delt,
			String delu, Date deld, String code, String heading,
			String sourcevalue, String sourcedescript, String sourcefieldname,
			String sourcedatatype, String primdc, String primicr,
			String osuname, Boolean datapricecalclock,
			String primbasicpricecalc, String primdatapricecalc,
			String primcalcrequest) {
		this.id = id;
		this.crd = crd;
		this.crt = crt;
		this.cru = cru;
		this.impt = impt;
		this.impd = impd;
		this.impu = impu;
		this.expt = expt;
		this.expd = expd;
		this.expu = expu;
		this.modt = modt;
		this.modd = modd;
		this.modu = modu;
		this.delt = delt;
		this.delu = delu;
		this.deld = deld;
		this.code = code;
		this.heading = heading;
		this.sourcevalue = sourcevalue;
		this.sourcedescript = sourcedescript;
		this.sourcefieldname = sourcefieldname;
		this.sourcedatatype = sourcedatatype;
		this.primdc = primdc;
		this.primicr = primicr;
		this.osuname = osuname;
		this.datapricecalclock = datapricecalclock;
		this.primbasicpricecalc = primbasicpricecalc;
		this.primdatapricecalc = primdatapricecalc;
		this.primcalcrequest = primcalcrequest;
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

	@Column(name = "CRT", length = 7)
	public Date getCrt() {
		return this.crt;
	}

	public void setCrt(Date crt) {
		this.crt = crt;
	}

	@Column(name = "CRU", length = 19)
	public String getCru() {
		return this.cru;
	}

	public void setCru(String cru) {
		this.cru = cru;
	}

	@Column(name = "IMPT", length = 7)
	public Date getImpt() {
		return this.impt;
	}

	public void setImpt(Date impt) {
		this.impt = impt;
	}

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

	@Column(name = "EXPT", length = 7)
	public Date getExpt() {
		return this.expt;
	}

	public void setExpt(Date expt) {
		this.expt = expt;
	}

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

	@Column(name = "MODT", length = 7)
	public Date getModt() {
		return this.modt;
	}

	public void setModt(Date modt) {
		this.modt = modt;
	}

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

	@Column(name = "DELT", length = 7)
	public Date getDelt() {
		return this.delt;
	}

	public void setDelt(Date delt) {
		this.delt = delt;
	}

	@Column(name = "DELU", length = 19)
	public String getDelu() {
		return this.delu;
	}

	public void setDelu(String delu) {
		this.delu = delu;
	}

	@Column(name = "DELD", length = 7)
	public Date getDeld() {
		return this.deld;
	}

	public void setDeld(Date deld) {
		this.deld = deld;
	}

	@Column(name = "CODE", length = 50)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "HEADING")
	public String getHeading() {
		return this.heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	@Column(name = "SOURCEVALUE")
	public String getSourcevalue() {
		return this.sourcevalue;
	}

	public void setSourcevalue(String sourcevalue) {
		this.sourcevalue = sourcevalue;
	}

	@Column(name = "SOURCEDESCRIPT")
	public String getSourcedescript() {
		return this.sourcedescript;
	}

	public void setSourcedescript(String sourcedescript) {
		this.sourcedescript = sourcedescript;
	}

	@Column(name = "SOURCEFIELDNAME")
	public String getSourcefieldname() {
		return this.sourcefieldname;
	}

	public void setSourcefieldname(String sourcefieldname) {
		this.sourcefieldname = sourcefieldname;
	}

	@Column(name = "SOURCEDATATYPE")
	public String getSourcedatatype() {
		return this.sourcedatatype;
	}

	public void setSourcedatatype(String sourcedatatype) {
		this.sourcedatatype = sourcedatatype;
	}

	@Column(name = "PRIMDC", length = 19)
	public String getPrimdc() {
		return this.primdc;
	}

	public void setPrimdc(String primdc) {
		this.primdc = primdc;
	}

	@Column(name = "PRIMICR", length = 19)
	public String getPrimicr() {
		return this.primicr;
	}

	public void setPrimicr(String primicr) {
		this.primicr = primicr;
	}

	@Column(name = "OSUNAME", length = 10)
	public String getOsuname() {
		return this.osuname;
	}

	public void setOsuname(String osuname) {
		this.osuname = osuname;
	}

	@Column(name = "DATAPRICECALCLOCK", precision = 1, scale = 0)
	public Boolean getDatapricecalclock() {
		return this.datapricecalclock;
	}

	public void setDatapricecalclock(Boolean datapricecalclock) {
		this.datapricecalclock = datapricecalclock;
	}

	@Column(name = "PRIMBASICPRICECALC", length = 19)
	public String getPrimbasicpricecalc() {
		return this.primbasicpricecalc;
	}

	public void setPrimbasicpricecalc(String primbasicpricecalc) {
		this.primbasicpricecalc = primbasicpricecalc;
	}

	@Column(name = "PRIMDATAPRICECALC", length = 19)
	public String getPrimdatapricecalc() {
		return this.primdatapricecalc;
	}

	public void setPrimdatapricecalc(String primdatapricecalc) {
		this.primdatapricecalc = primdatapricecalc;
	}

	@Column(name = "PRIMCALCREQUEST", length = 19)
	public String getPrimcalcrequest() {
		return this.primcalcrequest;
	}

	public void setPrimcalcrequest(String primcalcrequest) {
		this.primcalcrequest = primcalcrequest;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof IcalcdataLocalId))
			return false;
		IcalcdataLocalId castOther = (IcalcdataLocalId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getCrd() == castOther.getCrd()) || (this.getCrd() != null
						&& castOther.getCrd() != null && this.getCrd().equals(
						castOther.getCrd())))
				&& ((this.getCrt() == castOther.getCrt()) || (this.getCrt() != null
						&& castOther.getCrt() != null && this.getCrt().equals(
						castOther.getCrt())))
				&& ((this.getCru() == castOther.getCru()) || (this.getCru() != null
						&& castOther.getCru() != null && this.getCru().equals(
						castOther.getCru())))
				&& ((this.getImpt() == castOther.getImpt()) || (this.getImpt() != null
						&& castOther.getImpt() != null && this.getImpt()
						.equals(castOther.getImpt())))
				&& ((this.getImpd() == castOther.getImpd()) || (this.getImpd() != null
						&& castOther.getImpd() != null && this.getImpd()
						.equals(castOther.getImpd())))
				&& ((this.getImpu() == castOther.getImpu()) || (this.getImpu() != null
						&& castOther.getImpu() != null && this.getImpu()
						.equals(castOther.getImpu())))
				&& ((this.getExpt() == castOther.getExpt()) || (this.getExpt() != null
						&& castOther.getExpt() != null && this.getExpt()
						.equals(castOther.getExpt())))
				&& ((this.getExpd() == castOther.getExpd()) || (this.getExpd() != null
						&& castOther.getExpd() != null && this.getExpd()
						.equals(castOther.getExpd())))
				&& ((this.getExpu() == castOther.getExpu()) || (this.getExpu() != null
						&& castOther.getExpu() != null && this.getExpu()
						.equals(castOther.getExpu())))
				&& ((this.getModt() == castOther.getModt()) || (this.getModt() != null
						&& castOther.getModt() != null && this.getModt()
						.equals(castOther.getModt())))
				&& ((this.getModd() == castOther.getModd()) || (this.getModd() != null
						&& castOther.getModd() != null && this.getModd()
						.equals(castOther.getModd())))
				&& ((this.getModu() == castOther.getModu()) || (this.getModu() != null
						&& castOther.getModu() != null && this.getModu()
						.equals(castOther.getModu())))
				&& ((this.getDelt() == castOther.getDelt()) || (this.getDelt() != null
						&& castOther.getDelt() != null && this.getDelt()
						.equals(castOther.getDelt())))
				&& ((this.getDelu() == castOther.getDelu()) || (this.getDelu() != null
						&& castOther.getDelu() != null && this.getDelu()
						.equals(castOther.getDelu())))
				&& ((this.getDeld() == castOther.getDeld()) || (this.getDeld() != null
						&& castOther.getDeld() != null && this.getDeld()
						.equals(castOther.getDeld())))
				&& ((this.getCode() == castOther.getCode()) || (this.getCode() != null
						&& castOther.getCode() != null && this.getCode()
						.equals(castOther.getCode())))
				&& ((this.getHeading() == castOther.getHeading()) || (this
						.getHeading() != null && castOther.getHeading() != null && this
						.getHeading().equals(castOther.getHeading())))
				&& ((this.getSourcevalue() == castOther.getSourcevalue()) || (this
						.getSourcevalue() != null
						&& castOther.getSourcevalue() != null && this
						.getSourcevalue().equals(castOther.getSourcevalue())))
				&& ((this.getSourcedescript() == castOther.getSourcedescript()) || (this
						.getSourcedescript() != null
						&& castOther.getSourcedescript() != null && this
						.getSourcedescript().equals(
								castOther.getSourcedescript())))
				&& ((this.getSourcefieldname() == castOther
						.getSourcefieldname()) || (this.getSourcefieldname() != null
						&& castOther.getSourcefieldname() != null && this
						.getSourcefieldname().equals(
								castOther.getSourcefieldname())))
				&& ((this.getSourcedatatype() == castOther.getSourcedatatype()) || (this
						.getSourcedatatype() != null
						&& castOther.getSourcedatatype() != null && this
						.getSourcedatatype().equals(
								castOther.getSourcedatatype())))
				&& ((this.getPrimdc() == castOther.getPrimdc()) || (this
						.getPrimdc() != null && castOther.getPrimdc() != null && this
						.getPrimdc().equals(castOther.getPrimdc())))
				&& ((this.getPrimicr() == castOther.getPrimicr()) || (this
						.getPrimicr() != null && castOther.getPrimicr() != null && this
						.getPrimicr().equals(castOther.getPrimicr())))
				&& ((this.getOsuname() == castOther.getOsuname()) || (this
						.getOsuname() != null && castOther.getOsuname() != null && this
						.getOsuname().equals(castOther.getOsuname())))
				&& ((this.getDatapricecalclock() == castOther
						.getDatapricecalclock()) || (this
						.getDatapricecalclock() != null
						&& castOther.getDatapricecalclock() != null && this
						.getDatapricecalclock().equals(
								castOther.getDatapricecalclock())))
				&& ((this.getPrimbasicpricecalc() == castOther
						.getPrimbasicpricecalc()) || (this
						.getPrimbasicpricecalc() != null
						&& castOther.getPrimbasicpricecalc() != null && this
						.getPrimbasicpricecalc().equals(
								castOther.getPrimbasicpricecalc())))
				&& ((this.getPrimdatapricecalc() == castOther
						.getPrimdatapricecalc()) || (this
						.getPrimdatapricecalc() != null
						&& castOther.getPrimdatapricecalc() != null && this
						.getPrimdatapricecalc().equals(
								castOther.getPrimdatapricecalc())))
				&& ((this.getPrimcalcrequest() == castOther
						.getPrimcalcrequest()) || (this.getPrimcalcrequest() != null
						&& castOther.getPrimcalcrequest() != null && this
						.getPrimcalcrequest().equals(
								castOther.getPrimcalcrequest())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getCrd() == null ? 0 : this.getCrd().hashCode());
		result = 37 * result
				+ (getCrt() == null ? 0 : this.getCrt().hashCode());
		result = 37 * result
				+ (getCru() == null ? 0 : this.getCru().hashCode());
		result = 37 * result
				+ (getImpt() == null ? 0 : this.getImpt().hashCode());
		result = 37 * result
				+ (getImpd() == null ? 0 : this.getImpd().hashCode());
		result = 37 * result
				+ (getImpu() == null ? 0 : this.getImpu().hashCode());
		result = 37 * result
				+ (getExpt() == null ? 0 : this.getExpt().hashCode());
		result = 37 * result
				+ (getExpd() == null ? 0 : this.getExpd().hashCode());
		result = 37 * result
				+ (getExpu() == null ? 0 : this.getExpu().hashCode());
		result = 37 * result
				+ (getModt() == null ? 0 : this.getModt().hashCode());
		result = 37 * result
				+ (getModd() == null ? 0 : this.getModd().hashCode());
		result = 37 * result
				+ (getModu() == null ? 0 : this.getModu().hashCode());
		result = 37 * result
				+ (getDelt() == null ? 0 : this.getDelt().hashCode());
		result = 37 * result
				+ (getDelu() == null ? 0 : this.getDelu().hashCode());
		result = 37 * result
				+ (getDeld() == null ? 0 : this.getDeld().hashCode());
		result = 37 * result
				+ (getCode() == null ? 0 : this.getCode().hashCode());
		result = 37 * result
				+ (getHeading() == null ? 0 : this.getHeading().hashCode());
		result = 37
				* result
				+ (getSourcevalue() == null ? 0 : this.getSourcevalue()
						.hashCode());
		result = 37
				* result
				+ (getSourcedescript() == null ? 0 : this.getSourcedescript()
						.hashCode());
		result = 37
				* result
				+ (getSourcefieldname() == null ? 0 : this.getSourcefieldname()
						.hashCode());
		result = 37
				* result
				+ (getSourcedatatype() == null ? 0 : this.getSourcedatatype()
						.hashCode());
		result = 37 * result
				+ (getPrimdc() == null ? 0 : this.getPrimdc().hashCode());
		result = 37 * result
				+ (getPrimicr() == null ? 0 : this.getPrimicr().hashCode());
		result = 37 * result
				+ (getOsuname() == null ? 0 : this.getOsuname().hashCode());
		result = 37
				* result
				+ (getDatapricecalclock() == null ? 0 : this
						.getDatapricecalclock().hashCode());
		result = 37
				* result
				+ (getPrimbasicpricecalc() == null ? 0 : this
						.getPrimbasicpricecalc().hashCode());
		result = 37
				* result
				+ (getPrimdatapricecalc() == null ? 0 : this
						.getPrimdatapricecalc().hashCode());
		result = 37
				* result
				+ (getPrimcalcrequest() == null ? 0 : this.getPrimcalcrequest()
						.hashCode());
		return result;
	}

}
