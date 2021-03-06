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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Supplierrequestitem generated by hbm2java
 */
@Entity
@Table(name = "SUPPLIERREQUESTITEM", schema = "PCRM")
public class Supplierrequestitem implements java.io.Serializable {

	private String id;
	private Constructionproject constructionproject;
	private Generaltypevalue generaltypevalue;
	private Supplierproductspec supplierproductspec;
	private Date crd;
	private String code;
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
	private String head;
	private String delu;
	private Date crt;
	private String primtilbkontr;
	private Character am;
	private BigDecimal belexmoms;
	private BigDecimal belfaktureret;
	private Date bestiltdato;
	private Date lovetdato;
	private Date modtagetdato;
	private Date nyfristdato;
	private Date ordredato;
	private String anlaegsnr;
	private String lifecycle;
	private String colli;
	private BigDecimal antal;
	private BigDecimal prisprcolli;
	private String primomktype;
	private Character active;
	private Character inorder;
	private Date idrift;
	private Date aflevfor;
	private Date afsluttet;
	private Date dokmodt;
	private String lbnr;
	private String levreference;
	private Long installationer;
	private Date leveringsdato;
	private Long levtilbnr;
	private Date tilbudreturdato;
	private Date stdleveringsfrist;
	private String status;
	private Character afsluttetbool;
	private BigDecimal timeLeft;
	private Character samlet;
	private String primexpense;
	private String logtrace;
	private String finProjectno;
	private Set<Supplierinvoice> supplierinvoices = new HashSet<Supplierinvoice>(
			0);
	private Set<Expense> expenses = new HashSet<Expense>(0);

	public Supplierrequestitem() {
	}

	public Supplierrequestitem(String id) {
		this.id = id;
	}

	public Supplierrequestitem(String id,
			Constructionproject constructionproject,
			Generaltypevalue generaltypevalue,
			Supplierproductspec supplierproductspec, Date crd, String code,
			Date impt, Date expt, Date impd, Date expd, Date modt, String cru,
			Date delt, Date modd, String impu, String expu, Date deld,
			String modu, String head, String delu, Date crt,
			String primtilbkontr, Character am, BigDecimal belexmoms,
			BigDecimal belfaktureret, Date bestiltdato, Date lovetdato,
			Date modtagetdato, Date nyfristdato, Date ordredato,
			String anlaegsnr, String lifecycle, String colli, BigDecimal antal,
			BigDecimal prisprcolli, String primomktype, Character active,
			Character inorder, Date idrift, Date aflevfor, Date afsluttet,
			Date dokmodt, String lbnr, String levreference,
			Long installationer, Date leveringsdato, Long levtilbnr,
			Date tilbudreturdato, Date stdleveringsfrist, String status,
			Character afsluttetbool, BigDecimal timeLeft, Character samlet,
			String primexpense, String logtrace, String finProjectno,
			Set<Supplierinvoice> supplierinvoices, Set<Expense> expenses) {
		this.id = id;
		this.constructionproject = constructionproject;
		this.generaltypevalue = generaltypevalue;
		this.supplierproductspec = supplierproductspec;
		this.crd = crd;
		this.code = code;
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
		this.head = head;
		this.delu = delu;
		this.crt = crt;
		this.primtilbkontr = primtilbkontr;
		this.am = am;
		this.belexmoms = belexmoms;
		this.belfaktureret = belfaktureret;
		this.bestiltdato = bestiltdato;
		this.lovetdato = lovetdato;
		this.modtagetdato = modtagetdato;
		this.nyfristdato = nyfristdato;
		this.ordredato = ordredato;
		this.anlaegsnr = anlaegsnr;
		this.lifecycle = lifecycle;
		this.colli = colli;
		this.antal = antal;
		this.prisprcolli = prisprcolli;
		this.primomktype = primomktype;
		this.active = active;
		this.inorder = inorder;
		this.idrift = idrift;
		this.aflevfor = aflevfor;
		this.afsluttet = afsluttet;
		this.dokmodt = dokmodt;
		this.lbnr = lbnr;
		this.levreference = levreference;
		this.installationer = installationer;
		this.leveringsdato = leveringsdato;
		this.levtilbnr = levtilbnr;
		this.tilbudreturdato = tilbudreturdato;
		this.stdleveringsfrist = stdleveringsfrist;
		this.status = status;
		this.afsluttetbool = afsluttetbool;
		this.timeLeft = timeLeft;
		this.samlet = samlet;
		this.primexpense = primexpense;
		this.logtrace = logtrace;
		this.finProjectno = finProjectno;
		this.supplierinvoices = supplierinvoices;
		this.expenses = expenses;
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
	@JoinColumn(name = "PRIMGENERALTYPEVALUE")
	public Generaltypevalue getGeneraltypevalue() {
		return this.generaltypevalue;
	}

	public void setGeneraltypevalue(Generaltypevalue generaltypevalue) {
		this.generaltypevalue = generaltypevalue;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRIMLEVVAR")
	public Supplierproductspec getSupplierproductspec() {
		return this.supplierproductspec;
	}

	public void setSupplierproductspec(Supplierproductspec supplierproductspec) {
		this.supplierproductspec = supplierproductspec;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRD", length = 7)
	public Date getCrd() {
		return this.crd;
	}

	public void setCrd(Date crd) {
		this.crd = crd;
	}

	@Column(name = "CODE", length = 15)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	@Column(name = "HEAD")
	public String getHead() {
		return this.head;
	}

	public void setHead(String head) {
		this.head = head;
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

	@Column(name = "PRIMTILBKONTR", length = 19)
	public String getPrimtilbkontr() {
		return this.primtilbkontr;
	}

	public void setPrimtilbkontr(String primtilbkontr) {
		this.primtilbkontr = primtilbkontr;
	}

	@Column(name = "AM", length = 1)
	public Character getAm() {
		return this.am;
	}

	public void setAm(Character am) {
		this.am = am;
	}

	@Column(name = "BELEXMOMS", precision = 12)
	public BigDecimal getBelexmoms() {
		return this.belexmoms;
	}

	public void setBelexmoms(BigDecimal belexmoms) {
		this.belexmoms = belexmoms;
	}

	@Column(name = "BELFAKTURERET", precision = 12)
	public BigDecimal getBelfaktureret() {
		return this.belfaktureret;
	}

	public void setBelfaktureret(BigDecimal belfaktureret) {
		this.belfaktureret = belfaktureret;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "BESTILTDATO", length = 7)
	public Date getBestiltdato() {
		return this.bestiltdato;
	}

	public void setBestiltdato(Date bestiltdato) {
		this.bestiltdato = bestiltdato;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LOVETDATO", length = 7)
	public Date getLovetdato() {
		return this.lovetdato;
	}

	public void setLovetdato(Date lovetdato) {
		this.lovetdato = lovetdato;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "MODTAGETDATO", length = 7)
	public Date getModtagetdato() {
		return this.modtagetdato;
	}

	public void setModtagetdato(Date modtagetdato) {
		this.modtagetdato = modtagetdato;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "NYFRISTDATO", length = 7)
	public Date getNyfristdato() {
		return this.nyfristdato;
	}

	public void setNyfristdato(Date nyfristdato) {
		this.nyfristdato = nyfristdato;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ORDREDATO", length = 7)
	public Date getOrdredato() {
		return this.ordredato;
	}

	public void setOrdredato(Date ordredato) {
		this.ordredato = ordredato;
	}

	@Column(name = "ANLAEGSNR", length = 19)
	public String getAnlaegsnr() {
		return this.anlaegsnr;
	}

	public void setAnlaegsnr(String anlaegsnr) {
		this.anlaegsnr = anlaegsnr;
	}

	@Column(name = "LIFECYCLE", length = 19)
	public String getLifecycle() {
		return this.lifecycle;
	}

	public void setLifecycle(String lifecycle) {
		this.lifecycle = lifecycle;
	}

	@Column(name = "COLLI")
	public String getColli() {
		return this.colli;
	}

	public void setColli(String colli) {
		this.colli = colli;
	}

	@Column(name = "ANTAL", precision = 22, scale = 0)
	public BigDecimal getAntal() {
		return this.antal;
	}

	public void setAntal(BigDecimal antal) {
		this.antal = antal;
	}

	@Column(name = "PRISPRCOLLI", precision = 22, scale = 0)
	public BigDecimal getPrisprcolli() {
		return this.prisprcolli;
	}

	public void setPrisprcolli(BigDecimal prisprcolli) {
		this.prisprcolli = prisprcolli;
	}

	@Column(name = "PRIMOMKTYPE", length = 19)
	public String getPrimomktype() {
		return this.primomktype;
	}

	public void setPrimomktype(String primomktype) {
		this.primomktype = primomktype;
	}

	@Column(name = "ACTIVE", length = 1)
	public Character getActive() {
		return this.active;
	}

	public void setActive(Character active) {
		this.active = active;
	}

	@Column(name = "INORDER", length = 1)
	public Character getInorder() {
		return this.inorder;
	}

	public void setInorder(Character inorder) {
		this.inorder = inorder;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "IDRIFT", length = 7)
	public Date getIdrift() {
		return this.idrift;
	}

	public void setIdrift(Date idrift) {
		this.idrift = idrift;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "AFLEVFOR", length = 7)
	public Date getAflevfor() {
		return this.aflevfor;
	}

	public void setAflevfor(Date aflevfor) {
		this.aflevfor = aflevfor;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "AFSLUTTET", length = 7)
	public Date getAfsluttet() {
		return this.afsluttet;
	}

	public void setAfsluttet(Date afsluttet) {
		this.afsluttet = afsluttet;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DOKMODT", length = 7)
	public Date getDokmodt() {
		return this.dokmodt;
	}

	public void setDokmodt(Date dokmodt) {
		this.dokmodt = dokmodt;
	}

	@Column(name = "LBNR", length = 50)
	public String getLbnr() {
		return this.lbnr;
	}

	public void setLbnr(String lbnr) {
		this.lbnr = lbnr;
	}

	@Column(name = "LEVREFERENCE")
	public String getLevreference() {
		return this.levreference;
	}

	public void setLevreference(String levreference) {
		this.levreference = levreference;
	}

	@Column(name = "INSTALLATIONER", precision = 10, scale = 0)
	public Long getInstallationer() {
		return this.installationer;
	}

	public void setInstallationer(Long installationer) {
		this.installationer = installationer;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LEVERINGSDATO", length = 7)
	public Date getLeveringsdato() {
		return this.leveringsdato;
	}

	public void setLeveringsdato(Date leveringsdato) {
		this.leveringsdato = leveringsdato;
	}

	@Column(name = "LEVTILBNR", precision = 10, scale = 0)
	public Long getLevtilbnr() {
		return this.levtilbnr;
	}

	public void setLevtilbnr(Long levtilbnr) {
		this.levtilbnr = levtilbnr;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "TILBUDRETURDATO", length = 7)
	public Date getTilbudreturdato() {
		return this.tilbudreturdato;
	}

	public void setTilbudreturdato(Date tilbudreturdato) {
		this.tilbudreturdato = tilbudreturdato;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "STDLEVERINGSFRIST", length = 7)
	public Date getStdleveringsfrist() {
		return this.stdleveringsfrist;
	}

	public void setStdleveringsfrist(Date stdleveringsfrist) {
		this.stdleveringsfrist = stdleveringsfrist;
	}

	@Column(name = "STATUS")
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "AFSLUTTETBOOL", length = 1)
	public Character getAfsluttetbool() {
		return this.afsluttetbool;
	}

	public void setAfsluttetbool(Character afsluttetbool) {
		this.afsluttetbool = afsluttetbool;
	}

	@Column(name = "TIME_LEFT", precision = 22, scale = 0)
	public BigDecimal getTimeLeft() {
		return this.timeLeft;
	}

	public void setTimeLeft(BigDecimal timeLeft) {
		this.timeLeft = timeLeft;
	}

	@Column(name = "SAMLET", length = 1)
	public Character getSamlet() {
		return this.samlet;
	}

	public void setSamlet(Character samlet) {
		this.samlet = samlet;
	}

	@Column(name = "PRIMEXPENSE", length = 19)
	public String getPrimexpense() {
		return this.primexpense;
	}

	public void setPrimexpense(String primexpense) {
		this.primexpense = primexpense;
	}

	@Column(name = "LOGTRACE", length = 19)
	public String getLogtrace() {
		return this.logtrace;
	}

	public void setLogtrace(String logtrace) {
		this.logtrace = logtrace;
	}

	@Column(name = "FIN_PROJECTNO", length = 5)
	public String getFinProjectno() {
		return this.finProjectno;
	}

	public void setFinProjectno(String finProjectno) {
		this.finProjectno = finProjectno;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "CR_SUPPLREQSUPPLINVOICE", schema = "PCRM", joinColumns = { @JoinColumn(name = "PRIMSUPPLIERREQUESTITEM", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "PRIMSUPPLIERINVOICE", nullable = false, updatable = false) })
	public Set<Supplierinvoice> getSupplierinvoices() {
		return this.supplierinvoices;
	}

	public void setSupplierinvoices(Set<Supplierinvoice> supplierinvoices) {
		this.supplierinvoices = supplierinvoices;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "supplierrequestitem")
	public Set<Expense> getExpenses() {
		return this.expenses;
	}

	public void setExpenses(Set<Expense> expenses) {
		this.expenses = expenses;
	}

}
