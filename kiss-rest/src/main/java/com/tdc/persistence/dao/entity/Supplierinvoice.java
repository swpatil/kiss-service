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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Supplierinvoice generated by hbm2java
 */
@Entity
@Table(name = "SUPPLIERINVOICE", schema = "PCRM")
public class Supplierinvoice implements java.io.Serializable {

	private String id;
	private Constructionproject constructionproject;
	private Supplier supplier;
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
	private String code;
	private String head;
	private String primomktype;
	private String primlevtilb;
	private String fakturanr;
	private BigDecimal loen;
	private BigDecimal materiel;
	private BigDecimal andet;
	private BigDecimal fremydelser;
	private Date fakturadate;
	private Date indtdate;
	private BigDecimal total;
	private Set<Supplierrequestitem> supplierrequestitems = new HashSet<Supplierrequestitem>(
			0);

	public Supplierinvoice() {
	}

	public Supplierinvoice(String id) {
		this.id = id;
	}

	public Supplierinvoice(String id, Constructionproject constructionproject,
			Supplier supplier, Date crd, Date impt, Date expt, Date impd,
			Date expd, Date modt, String cru, Date delt, Date modd,
			String impu, String expu, Date deld, String modu, String delu,
			Date crt, String code, String head, String primomktype,
			String primlevtilb, String fakturanr, BigDecimal loen,
			BigDecimal materiel, BigDecimal andet, BigDecimal fremydelser,
			Date fakturadate, Date indtdate, BigDecimal total,
			Set<Supplierrequestitem> supplierrequestitems) {
		this.id = id;
		this.constructionproject = constructionproject;
		this.supplier = supplier;
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
		this.code = code;
		this.head = head;
		this.primomktype = primomktype;
		this.primlevtilb = primlevtilb;
		this.fakturanr = fakturanr;
		this.loen = loen;
		this.materiel = materiel;
		this.andet = andet;
		this.fremydelser = fremydelser;
		this.fakturadate = fakturadate;
		this.indtdate = indtdate;
		this.total = total;
		this.supplierrequestitems = supplierrequestitems;
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
	@JoinColumn(name = "PRIMANLPROJ")
	public Constructionproject getConstructionproject() {
		return this.constructionproject;
	}

	public void setConstructionproject(Constructionproject constructionproject) {
		this.constructionproject = constructionproject;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRIMLEV")
	public Supplier getSupplier() {
		return this.supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRD", length = 7)
	public Date getCrd() {
		return this.crd;
	}

	public void setCrd(Date crd) {
		this.crd = crd;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "IMPT", length = 7)
	public Date getImpt() {
		return this.impt;
	}

	public void setImpt(Date impt) {
		this.impt = impt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EXPT", length = 7)
	public Date getExpt() {
		return this.expt;
	}

	public void setExpt(Date expt) {
		this.expt = expt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "IMPD", length = 7)
	public Date getImpd() {
		return this.impd;
	}

	public void setImpd(Date impd) {
		this.impd = impd;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EXPD", length = 7)
	public Date getExpd() {
		return this.expd;
	}

	public void setExpd(Date expd) {
		this.expd = expd;
	}

	@Temporal(TemporalType.DATE)
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

	@Temporal(TemporalType.DATE)
	@Column(name = "DELT", length = 7)
	public Date getDelt() {
		return this.delt;
	}

	public void setDelt(Date delt) {
		this.delt = delt;
	}

	@Temporal(TemporalType.DATE)
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

	@Temporal(TemporalType.DATE)
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

	@Temporal(TemporalType.DATE)
	@Column(name = "CRT", length = 7)
	public Date getCrt() {
		return this.crt;
	}

	public void setCrt(Date crt) {
		this.crt = crt;
	}

	@Column(name = "CODE", length = 15)
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

	@Column(name = "PRIMOMKTYPE", length = 19)
	public String getPrimomktype() {
		return this.primomktype;
	}

	public void setPrimomktype(String primomktype) {
		this.primomktype = primomktype;
	}

	@Column(name = "PRIMLEVTILB", length = 19)
	public String getPrimlevtilb() {
		return this.primlevtilb;
	}

	public void setPrimlevtilb(String primlevtilb) {
		this.primlevtilb = primlevtilb;
	}

	@Column(name = "FAKTURANR", length = 50)
	public String getFakturanr() {
		return this.fakturanr;
	}

	public void setFakturanr(String fakturanr) {
		this.fakturanr = fakturanr;
	}

	@Column(name = "LOEN", precision = 12)
	public BigDecimal getLoen() {
		return this.loen;
	}

	public void setLoen(BigDecimal loen) {
		this.loen = loen;
	}

	@Column(name = "MATERIEL", precision = 12)
	public BigDecimal getMateriel() {
		return this.materiel;
	}

	public void setMateriel(BigDecimal materiel) {
		this.materiel = materiel;
	}

	@Column(name = "ANDET", precision = 12)
	public BigDecimal getAndet() {
		return this.andet;
	}

	public void setAndet(BigDecimal andet) {
		this.andet = andet;
	}

	@Column(name = "FREMYDELSER", precision = 12)
	public BigDecimal getFremydelser() {
		return this.fremydelser;
	}

	public void setFremydelser(BigDecimal fremydelser) {
		this.fremydelser = fremydelser;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "FAKTURADATE", length = 7)
	public Date getFakturadate() {
		return this.fakturadate;
	}

	public void setFakturadate(Date fakturadate) {
		this.fakturadate = fakturadate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "INDTDATE", length = 7)
	public Date getIndtdate() {
		return this.indtdate;
	}

	public void setIndtdate(Date indtdate) {
		this.indtdate = indtdate;
	}

	@Column(name = "TOTAL", precision = 12)
	public BigDecimal getTotal() {
		return this.total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "CR_SUPPLREQSUPPLINVOICE", schema = "PCRM", joinColumns = { @JoinColumn(name = "PRIMSUPPLIERINVOICE", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "PRIMSUPPLIERREQUESTITEM", nullable = false, updatable = false) })
	public Set<Supplierrequestitem> getSupplierrequestitems() {
		return this.supplierrequestitems;
	}

	public void setSupplierrequestitems(
			Set<Supplierrequestitem> supplierrequestitems) {
		this.supplierrequestitems = supplierrequestitems;
	}

}
