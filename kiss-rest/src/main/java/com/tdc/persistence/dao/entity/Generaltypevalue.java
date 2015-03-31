package com.tdc.persistence.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Generaltypevalue generated by hbm2java
 */
@Entity
@Table(name = "GENERALTYPEVALUE", schema = "PCRM", uniqueConstraints = @UniqueConstraint(columnNames = {
		"CODE", "INVALIDATED" }))
public class Generaltypevalue implements java.io.Serializable {

	private String id;
	private Generaltype generaltype;
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
	private String head;
	private String description;
	private Date invalidated;
	private Date validfrom;
	private Date validto;
	private BigDecimal indexkey;
	private String cattr01;
	private String cattr02;
	private BigDecimal nattr01;
	private BigDecimal nattr02;
	private Date dattr01;
	private Date dattr02;
	private Character battr01;
	private Character battr02;
	private Date startDate;
	private Date endDate;
	private Character ismandatory;
	private Set<Supplierrequestitem> supplierrequestitems = new HashSet<Supplierrequestitem>(
			0);
	private Set<CrDocorigin2generaltypevalue> crDocorigin2generaltypevalues = new HashSet<CrDocorigin2generaltypevalue>(
			0);
	private Set<Document> documents = new HashSet<Document>(0);
	private Set<Installation> installations = new HashSet<Installation>(0);
	private Set<Constructionproject> constructionprojects = new HashSet<Constructionproject>(
			0);
	private Set<Prodpackagefilter> prodpackagefilters = new HashSet<Prodpackagefilter>(
			0);
	private Set<Contract> contracts = new HashSet<Contract>(0);
	private Set<Prodprogramfilter> prodprogramfilters = new HashSet<Prodprogramfilter>(
			0);
	private Set<Supplierlink> supplierlinks = new HashSet<Supplierlink>(0);

	public Generaltypevalue() {
	}

	public Generaltypevalue(String id) {
		this.id = id;
	}

	public Generaltypevalue(String id, Generaltype generaltype, Date crd,
			String cru, Date modd, String modu, Date deld, String delu,
			Date impd, String impu, Date expd, String expu, String code,
			String head, String description, Date invalidated, Date validfrom,
			Date validto, BigDecimal indexkey, String cattr01, String cattr02,
			BigDecimal nattr01, BigDecimal nattr02, Date dattr01, Date dattr02,
			Character battr01, Character battr02, Date startDate, Date endDate,
			Character ismandatory,
			Set<Supplierrequestitem> supplierrequestitems,
			Set<CrDocorigin2generaltypevalue> crDocorigin2generaltypevalues,
			Set<Document> documents, Set<Installation> installations,
			Set<Constructionproject> constructionprojects,
			Set<Prodpackagefilter> prodpackagefilters, Set<Contract> contracts,
			Set<Prodprogramfilter> prodprogramfilters,
			Set<Supplierlink> supplierlinks) {
		this.id = id;
		this.generaltype = generaltype;
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
		this.head = head;
		this.description = description;
		this.invalidated = invalidated;
		this.validfrom = validfrom;
		this.validto = validto;
		this.indexkey = indexkey;
		this.cattr01 = cattr01;
		this.cattr02 = cattr02;
		this.nattr01 = nattr01;
		this.nattr02 = nattr02;
		this.dattr01 = dattr01;
		this.dattr02 = dattr02;
		this.battr01 = battr01;
		this.battr02 = battr02;
		this.startDate = startDate;
		this.endDate = endDate;
		this.ismandatory = ismandatory;
		this.supplierrequestitems = supplierrequestitems;
		this.crDocorigin2generaltypevalues = crDocorigin2generaltypevalues;
		this.documents = documents;
		this.installations = installations;
		this.constructionprojects = constructionprojects;
		this.prodpackagefilters = prodpackagefilters;
		this.contracts = contracts;
		this.prodprogramfilters = prodprogramfilters;
		this.supplierlinks = supplierlinks;
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
	@JoinColumn(name = "PRIMGENERALTYPE")
	public Generaltype getGeneraltype() {
		return this.generaltype;
	}

	public void setGeneraltype(Generaltype generaltype) {
		this.generaltype = generaltype;
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

	@Column(name = "CODE", length = 50)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "HEAD")
	public String getHead() {
		return this.head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	@Column(name = "DESCRIPTION")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	@Column(name = "NATTR01", precision = 22, scale = 0)
	public BigDecimal getNattr01() {
		return this.nattr01;
	}

	public void setNattr01(BigDecimal nattr01) {
		this.nattr01 = nattr01;
	}

	@Column(name = "NATTR02", precision = 22, scale = 0)
	public BigDecimal getNattr02() {
		return this.nattr02;
	}

	public void setNattr02(BigDecimal nattr02) {
		this.nattr02 = nattr02;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATTR01", length = 7)
	public Date getDattr01() {
		return this.dattr01;
	}

	public void setDattr01(Date dattr01) {
		this.dattr01 = dattr01;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATTR02", length = 7)
	public Date getDattr02() {
		return this.dattr02;
	}

	public void setDattr02(Date dattr02) {
		this.dattr02 = dattr02;
	}

	@Column(name = "BATTR01", length = 1)
	public Character getBattr01() {
		return this.battr01;
	}

	public void setBattr01(Character battr01) {
		this.battr01 = battr01;
	}

	@Column(name = "BATTR02", length = 1)
	public Character getBattr02() {
		return this.battr02;
	}

	public void setBattr02(Character battr02) {
		this.battr02 = battr02;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "START_DATE", length = 7)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "END_DATE", length = 7)
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Column(name = "ISMANDATORY", length = 1)
	public Character getIsmandatory() {
		return this.ismandatory;
	}

	public void setIsmandatory(Character ismandatory) {
		this.ismandatory = ismandatory;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "generaltypevalue")
	public Set<Supplierrequestitem> getSupplierrequestitems() {
		return this.supplierrequestitems;
	}

	public void setSupplierrequestitems(
			Set<Supplierrequestitem> supplierrequestitems) {
		this.supplierrequestitems = supplierrequestitems;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "generaltypevalue")
	public Set<CrDocorigin2generaltypevalue> getCrDocorigin2generaltypevalues() {
		return this.crDocorigin2generaltypevalues;
	}

	public void setCrDocorigin2generaltypevalues(
			Set<CrDocorigin2generaltypevalue> crDocorigin2generaltypevalues) {
		this.crDocorigin2generaltypevalues = crDocorigin2generaltypevalues;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "generaltypevalue")
	public Set<Document> getDocuments() {
		return this.documents;
	}

	public void setDocuments(Set<Document> documents) {
		this.documents = documents;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "generaltypevalue")
	public Set<Installation> getInstallations() {
		return this.installations;
	}

	public void setInstallations(Set<Installation> installations) {
		this.installations = installations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "generaltypevalue")
	public Set<Constructionproject> getConstructionprojects() {
		return this.constructionprojects;
	}

	public void setConstructionprojects(
			Set<Constructionproject> constructionprojects) {
		this.constructionprojects = constructionprojects;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "generaltypevalue")
	public Set<Prodpackagefilter> getProdpackagefilters() {
		return this.prodpackagefilters;
	}

	public void setProdpackagefilters(Set<Prodpackagefilter> prodpackagefilters) {
		this.prodpackagefilters = prodpackagefilters;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "generaltypevalue")
	public Set<Contract> getContracts() {
		return this.contracts;
	}

	public void setContracts(Set<Contract> contracts) {
		this.contracts = contracts;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "generaltypevalue")
	public Set<Prodprogramfilter> getProdprogramfilters() {
		return this.prodprogramfilters;
	}

	public void setProdprogramfilters(Set<Prodprogramfilter> prodprogramfilters) {
		this.prodprogramfilters = prodprogramfilters;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "generaltypevalue")
	public Set<Supplierlink> getSupplierlinks() {
		return this.supplierlinks;
	}

	public void setSupplierlinks(Set<Supplierlink> supplierlinks) {
		this.supplierlinks = supplierlinks;
	}

}
