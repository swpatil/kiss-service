package com.tdc.persistence.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * FrequencyrangeKissOld generated by hbm2java
 */
@Entity
@Table(name = "FREQUENCYRANGE_KISS_OLD", schema = "PCRM")
public class FrequencyrangeKissOld implements java.io.Serializable {

	private String id;
	private Date crd;
	private String cru;
	private Date modd;
	private String modu;
	private Date impd;
	private String impu;
	private Date expd;
	private String expu;
	private String hfnr;
	private String anlaegsnr;
	private String varenummer;
	private String varenavn;
	private String startFrekvens;
	private String slutFrekvens;
	private String primvarenr;
	private String primheadend;
	private String primcableunit;
	private Set<ProgsupplyKissOld> progsupplyKissOlds = new HashSet<ProgsupplyKissOld>(
			0);

	public FrequencyrangeKissOld() {
	}

	public FrequencyrangeKissOld(String id) {
		this.id = id;
	}

	public FrequencyrangeKissOld(String id, Date crd, String cru, Date modd,
			String modu, Date impd, String impu, Date expd, String expu,
			String hfnr, String anlaegsnr, String varenummer, String varenavn,
			String startFrekvens, String slutFrekvens, String primvarenr,
			String primheadend, String primcableunit,
			Set<ProgsupplyKissOld> progsupplyKissOlds) {
		this.id = id;
		this.crd = crd;
		this.cru = cru;
		this.modd = modd;
		this.modu = modu;
		this.impd = impd;
		this.impu = impu;
		this.expd = expd;
		this.expu = expu;
		this.hfnr = hfnr;
		this.anlaegsnr = anlaegsnr;
		this.varenummer = varenummer;
		this.varenavn = varenavn;
		this.startFrekvens = startFrekvens;
		this.slutFrekvens = slutFrekvens;
		this.primvarenr = primvarenr;
		this.primheadend = primheadend;
		this.primcableunit = primcableunit;
		this.progsupplyKissOlds = progsupplyKissOlds;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 19)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
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

	@Column(name = "VARENUMMER", length = 15)
	public String getVarenummer() {
		return this.varenummer;
	}

	public void setVarenummer(String varenummer) {
		this.varenummer = varenummer;
	}

	@Column(name = "VARENAVN", length = 50)
	public String getVarenavn() {
		return this.varenavn;
	}

	public void setVarenavn(String varenavn) {
		this.varenavn = varenavn;
	}

	@Column(name = "START_FREKVENS", length = 40)
	public String getStartFrekvens() {
		return this.startFrekvens;
	}

	public void setStartFrekvens(String startFrekvens) {
		this.startFrekvens = startFrekvens;
	}

	@Column(name = "SLUT_FREKVENS", length = 40)
	public String getSlutFrekvens() {
		return this.slutFrekvens;
	}

	public void setSlutFrekvens(String slutFrekvens) {
		this.slutFrekvens = slutFrekvens;
	}

	@Column(name = "PRIMVARENR", length = 50)
	public String getPrimvarenr() {
		return this.primvarenr;
	}

	public void setPrimvarenr(String primvarenr) {
		this.primvarenr = primvarenr;
	}

	@Column(name = "PRIMHEADEND", length = 11)
	public String getPrimheadend() {
		return this.primheadend;
	}

	public void setPrimheadend(String primheadend) {
		this.primheadend = primheadend;
	}

	@Column(name = "PRIMCABLEUNIT", length = 10)
	public String getPrimcableunit() {
		return this.primcableunit;
	}

	public void setPrimcableunit(String primcableunit) {
		this.primcableunit = primcableunit;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "frequencyrangeKissOld")
	public Set<ProgsupplyKissOld> getProgsupplyKissOlds() {
		return this.progsupplyKissOlds;
	}

	public void setProgsupplyKissOlds(Set<ProgsupplyKissOld> progsupplyKissOlds) {
		this.progsupplyKissOlds = progsupplyKissOlds;
	}

}
