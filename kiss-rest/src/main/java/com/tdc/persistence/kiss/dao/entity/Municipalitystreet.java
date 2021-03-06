package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
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
 * Municipalitystreet generated by hbm2java
 */
@Entity
@Table(name = "MUNICIPALITYSTREET", schema = "PCRM")
public class Municipalitystreet implements java.io.Serializable {

	private String id;
	private Date crd;
	private String cru;
	private Date modd;
	private String modu;
	private Date deld;
	private String delu;
	private Date impd;
	private String impu;
	private Date expd;
	private String expu;
	private String code;
	private Character ktasCode;
	private String nameStandard;
	private String nameNice;
	private String nameClean;
	private String primmunicipality;
	private String sourceSystem;
	private String streetcode;
	private BigDecimal commRating;
	private Set<Streetpostalcode> streetpostalcodes = new HashSet<Streetpostalcode>(
			0);
	private Set<Address> addresses = new HashSet<Address>(0);

	public Municipalitystreet() {
	}

	public Municipalitystreet(String id) {
		this.id = id;
	}

	public Municipalitystreet(String id, Date crd, String cru, Date modd,
			String modu, Date deld, String delu, Date impd, String impu,
			Date expd, String expu, String code, Character ktasCode,
			String nameStandard, String nameNice, String nameClean,
			String primmunicipality, String sourceSystem, String streetcode,
			BigDecimal commRating, Set<Streetpostalcode> streetpostalcodes,
			Set<Address> addresses) {
		this.id = id;
		this.crd = crd;
		this.cru = cru;
		this.modd = modd;
		this.modu = modu;
		this.deld = deld;
		this.delu = delu;
		this.impd = impd;
		this.impu = impu;
		this.expd = expd;
		this.expu = expu;
		this.code = code;
		this.ktasCode = ktasCode;
		this.nameStandard = nameStandard;
		this.nameNice = nameNice;
		this.nameClean = nameClean;
		this.primmunicipality = primmunicipality;
		this.sourceSystem = sourceSystem;
		this.streetcode = streetcode;
		this.commRating = commRating;
		this.streetpostalcodes = streetpostalcodes;
		this.addresses = addresses;
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
	@Column(name = "DELD", length = 7)
	public Date getDeld() {
		return this.deld;
	}

	public void setDeld(Date deld) {
		this.deld = deld;
	}

	@Column(name = "DELU", length = 19)
	public String getDelu() {
		return this.delu;
	}

	public void setDelu(String delu) {
		this.delu = delu;
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

	@Column(name = "CODE", length = 9)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "KTAS_CODE", length = 1)
	public Character getKtasCode() {
		return this.ktasCode;
	}

	public void setKtasCode(Character ktasCode) {
		this.ktasCode = ktasCode;
	}

	@Column(name = "NAME_STANDARD")
	public String getNameStandard() {
		return this.nameStandard;
	}

	public void setNameStandard(String nameStandard) {
		this.nameStandard = nameStandard;
	}

	@Column(name = "NAME_NICE")
	public String getNameNice() {
		return this.nameNice;
	}

	public void setNameNice(String nameNice) {
		this.nameNice = nameNice;
	}

	@Column(name = "NAME_CLEAN")
	public String getNameClean() {
		return this.nameClean;
	}

	public void setNameClean(String nameClean) {
		this.nameClean = nameClean;
	}

	@Column(name = "PRIMMUNICIPALITY", length = 4)
	public String getPrimmunicipality() {
		return this.primmunicipality;
	}

	public void setPrimmunicipality(String primmunicipality) {
		this.primmunicipality = primmunicipality;
	}

	@Column(name = "SOURCE_SYSTEM", length = 5)
	public String getSourceSystem() {
		return this.sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	@Column(name = "STREETCODE", length = 4)
	public String getStreetcode() {
		return this.streetcode;
	}

	public void setStreetcode(String streetcode) {
		this.streetcode = streetcode;
	}

	@Column(name = "COMM_RATING", precision = 22, scale = 0)
	public BigDecimal getCommRating() {
		return this.commRating;
	}

	public void setCommRating(BigDecimal commRating) {
		this.commRating = commRating;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "municipalitystreet")
	public Set<Streetpostalcode> getStreetpostalcodes() {
		return this.streetpostalcodes;
	}

	public void setStreetpostalcodes(Set<Streetpostalcode> streetpostalcodes) {
		this.streetpostalcodes = streetpostalcodes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "municipalitystreet")
	public Set<Address> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

}
