package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CdmroleruleId generated by hbm2java
 */
@Embeddable
public class CdmroleruleId implements java.io.Serializable {

	private String id;
	private Date crd;
	private Date crt;
	private String cru;
	private Date modd;
	private Date modt;
	private String modu;
	private Date deld;
	private Date delt;
	private String delu;
	private Date impd;
	private Date impt;
	private String impu;
	private Date expd;
	private Date expt;
	private String expu;
	private String primarytablename;
	private String primaryrole;
	private Character begr;
	private Character ubegr;
	private Long antalmulige;
	private Long antalneeded;

	public CdmroleruleId() {
	}

	public CdmroleruleId(String id, Date crd, Date crt, String cru, Date modd,
			Date modt, String modu, Date deld, Date delt, String delu,
			Date impd, Date impt, String impu, Date expd, Date expt,
			String expu, String primarytablename, String primaryrole,
			Character begr, Character ubegr, Long antalmulige, Long antalneeded) {
		this.id = id;
		this.crd = crd;
		this.crt = crt;
		this.cru = cru;
		this.modd = modd;
		this.modt = modt;
		this.modu = modu;
		this.deld = deld;
		this.delt = delt;
		this.delu = delu;
		this.impd = impd;
		this.impt = impt;
		this.impu = impu;
		this.expd = expd;
		this.expt = expt;
		this.expu = expu;
		this.primarytablename = primarytablename;
		this.primaryrole = primaryrole;
		this.begr = begr;
		this.ubegr = ubegr;
		this.antalmulige = antalmulige;
		this.antalneeded = antalneeded;
	}

	@Column(name = "ID", unique = true, length = 19)
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

	@Column(name = "MODD", length = 7)
	public Date getModd() {
		return this.modd;
	}

	public void setModd(Date modd) {
		this.modd = modd;
	}

	@Column(name = "MODT", length = 7)
	public Date getModt() {
		return this.modt;
	}

	public void setModt(Date modt) {
		this.modt = modt;
	}

	@Column(name = "MODU", length = 19)
	public String getModu() {
		return this.modu;
	}

	public void setModu(String modu) {
		this.modu = modu;
	}

	@Column(name = "DELD", length = 7)
	public Date getDeld() {
		return this.deld;
	}

	public void setDeld(Date deld) {
		this.deld = deld;
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

	@Column(name = "IMPD", length = 7)
	public Date getImpd() {
		return this.impd;
	}

	public void setImpd(Date impd) {
		this.impd = impd;
	}

	@Column(name = "IMPT", length = 7)
	public Date getImpt() {
		return this.impt;
	}

	public void setImpt(Date impt) {
		this.impt = impt;
	}

	@Column(name = "IMPU", length = 19)
	public String getImpu() {
		return this.impu;
	}

	public void setImpu(String impu) {
		this.impu = impu;
	}

	@Column(name = "EXPD", length = 7)
	public Date getExpd() {
		return this.expd;
	}

	public void setExpd(Date expd) {
		this.expd = expd;
	}

	@Column(name = "EXPT", length = 7)
	public Date getExpt() {
		return this.expt;
	}

	public void setExpt(Date expt) {
		this.expt = expt;
	}

	@Column(name = "EXPU", length = 19)
	public String getExpu() {
		return this.expu;
	}

	public void setExpu(String expu) {
		this.expu = expu;
	}

	@Column(name = "PRIMARYTABLENAME")
	public String getPrimarytablename() {
		return this.primarytablename;
	}

	public void setPrimarytablename(String primarytablename) {
		this.primarytablename = primarytablename;
	}

	@Column(name = "PRIMARYROLE", length = 19)
	public String getPrimaryrole() {
		return this.primaryrole;
	}

	public void setPrimaryrole(String primaryrole) {
		this.primaryrole = primaryrole;
	}

	@Column(name = "BEGR", length = 1)
	public Character getBegr() {
		return this.begr;
	}

	public void setBegr(Character begr) {
		this.begr = begr;
	}

	@Column(name = "UBEGR", length = 1)
	public Character getUbegr() {
		return this.ubegr;
	}

	public void setUbegr(Character ubegr) {
		this.ubegr = ubegr;
	}

	@Column(name = "ANTALMULIGE", precision = 10, scale = 0)
	public Long getAntalmulige() {
		return this.antalmulige;
	}

	public void setAntalmulige(Long antalmulige) {
		this.antalmulige = antalmulige;
	}

	@Column(name = "ANTALNEEDED", precision = 10, scale = 0)
	public Long getAntalneeded() {
		return this.antalneeded;
	}

	public void setAntalneeded(Long antalneeded) {
		this.antalneeded = antalneeded;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CdmroleruleId))
			return false;
		CdmroleruleId castOther = (CdmroleruleId) other;

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
				&& ((this.getModd() == castOther.getModd()) || (this.getModd() != null
						&& castOther.getModd() != null && this.getModd()
						.equals(castOther.getModd())))
				&& ((this.getModt() == castOther.getModt()) || (this.getModt() != null
						&& castOther.getModt() != null && this.getModt()
						.equals(castOther.getModt())))
				&& ((this.getModu() == castOther.getModu()) || (this.getModu() != null
						&& castOther.getModu() != null && this.getModu()
						.equals(castOther.getModu())))
				&& ((this.getDeld() == castOther.getDeld()) || (this.getDeld() != null
						&& castOther.getDeld() != null && this.getDeld()
						.equals(castOther.getDeld())))
				&& ((this.getDelt() == castOther.getDelt()) || (this.getDelt() != null
						&& castOther.getDelt() != null && this.getDelt()
						.equals(castOther.getDelt())))
				&& ((this.getDelu() == castOther.getDelu()) || (this.getDelu() != null
						&& castOther.getDelu() != null && this.getDelu()
						.equals(castOther.getDelu())))
				&& ((this.getImpd() == castOther.getImpd()) || (this.getImpd() != null
						&& castOther.getImpd() != null && this.getImpd()
						.equals(castOther.getImpd())))
				&& ((this.getImpt() == castOther.getImpt()) || (this.getImpt() != null
						&& castOther.getImpt() != null && this.getImpt()
						.equals(castOther.getImpt())))
				&& ((this.getImpu() == castOther.getImpu()) || (this.getImpu() != null
						&& castOther.getImpu() != null && this.getImpu()
						.equals(castOther.getImpu())))
				&& ((this.getExpd() == castOther.getExpd()) || (this.getExpd() != null
						&& castOther.getExpd() != null && this.getExpd()
						.equals(castOther.getExpd())))
				&& ((this.getExpt() == castOther.getExpt()) || (this.getExpt() != null
						&& castOther.getExpt() != null && this.getExpt()
						.equals(castOther.getExpt())))
				&& ((this.getExpu() == castOther.getExpu()) || (this.getExpu() != null
						&& castOther.getExpu() != null && this.getExpu()
						.equals(castOther.getExpu())))
				&& ((this.getPrimarytablename() == castOther
						.getPrimarytablename()) || (this.getPrimarytablename() != null
						&& castOther.getPrimarytablename() != null && this
						.getPrimarytablename().equals(
								castOther.getPrimarytablename())))
				&& ((this.getPrimaryrole() == castOther.getPrimaryrole()) || (this
						.getPrimaryrole() != null
						&& castOther.getPrimaryrole() != null && this
						.getPrimaryrole().equals(castOther.getPrimaryrole())))
				&& ((this.getBegr() == castOther.getBegr()) || (this.getBegr() != null
						&& castOther.getBegr() != null && this.getBegr()
						.equals(castOther.getBegr())))
				&& ((this.getUbegr() == castOther.getUbegr()) || (this
						.getUbegr() != null && castOther.getUbegr() != null && this
						.getUbegr().equals(castOther.getUbegr())))
				&& ((this.getAntalmulige() == castOther.getAntalmulige()) || (this
						.getAntalmulige() != null
						&& castOther.getAntalmulige() != null && this
						.getAntalmulige().equals(castOther.getAntalmulige())))
				&& ((this.getAntalneeded() == castOther.getAntalneeded()) || (this
						.getAntalneeded() != null
						&& castOther.getAntalneeded() != null && this
						.getAntalneeded().equals(castOther.getAntalneeded())));
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
				+ (getModd() == null ? 0 : this.getModd().hashCode());
		result = 37 * result
				+ (getModt() == null ? 0 : this.getModt().hashCode());
		result = 37 * result
				+ (getModu() == null ? 0 : this.getModu().hashCode());
		result = 37 * result
				+ (getDeld() == null ? 0 : this.getDeld().hashCode());
		result = 37 * result
				+ (getDelt() == null ? 0 : this.getDelt().hashCode());
		result = 37 * result
				+ (getDelu() == null ? 0 : this.getDelu().hashCode());
		result = 37 * result
				+ (getImpd() == null ? 0 : this.getImpd().hashCode());
		result = 37 * result
				+ (getImpt() == null ? 0 : this.getImpt().hashCode());
		result = 37 * result
				+ (getImpu() == null ? 0 : this.getImpu().hashCode());
		result = 37 * result
				+ (getExpd() == null ? 0 : this.getExpd().hashCode());
		result = 37 * result
				+ (getExpt() == null ? 0 : this.getExpt().hashCode());
		result = 37 * result
				+ (getExpu() == null ? 0 : this.getExpu().hashCode());
		result = 37
				* result
				+ (getPrimarytablename() == null ? 0 : this
						.getPrimarytablename().hashCode());
		result = 37
				* result
				+ (getPrimaryrole() == null ? 0 : this.getPrimaryrole()
						.hashCode());
		result = 37 * result
				+ (getBegr() == null ? 0 : this.getBegr().hashCode());
		result = 37 * result
				+ (getUbegr() == null ? 0 : this.getUbegr().hashCode());
		result = 37
				* result
				+ (getAntalmulige() == null ? 0 : this.getAntalmulige()
						.hashCode());
		result = 37
				* result
				+ (getAntalneeded() == null ? 0 : this.getAntalneeded()
						.hashCode());
		return result;
	}

}
