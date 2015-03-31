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

/**
 * Constructionproject generated by hbm2java
 */
@Entity
@Table(name = "CONSTRUCTIONPROJECT", schema = "PCRM")
public class Constructionproject implements java.io.Serializable {

	private String id;
	private Generaltypevalue generaltypevalue;
	private Constructionprojecttype constructionprojecttype;
	private Staff staff;
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
	private BigDecimal belexmoms;
	private Character locked;
	private Character manual;
	private Character autom;
	private String projectno;
	private Date aflevfor;
	private Date stoejmaal;
	private Date stoejmaalgodk;
	private Date afsluttet;
	private Date opdat;
	private Date dokmodt;
	private Date prisoplyst;
	private Date godkendt;
	private Date ordre;
	private Date idrift;
	private Date annul;
	private String anlprojstatus;
	private Date lovetdato;
	private String pstyrAnlaegsnr;
	private Date startdate;
	private Date stdlevdate;
	private Date faktidriftdate;
	private Date prisreturdate;
	private Date prisretur;
	private Date prisgyldig;
	private String primpssupplm;
	private String primsalgansv;
	private String primleverand;
	private String projektlobenr;
	private Character afsluttetbool;
	private Date afvist;
	private Date lovetidriftdato;
	private Date nylovetidriftdato;
	private Date ktaacceptdato;
	private Date godkordremodt;
	private Date godkforespmodt;
	private Character afhaengig;
	private BigDecimal timeLeft;
	private Character gravning;
	private Date calcstdlevdate;
	private Date calcprisretur;
	private String logtrace;
	private BigDecimal costtotal;
	private Set<Supplierrequestitem> supplierrequestitems = new HashSet<Supplierrequestitem>(
			0);
	private Set<Supplierinvoice> supplierinvoices = new HashSet<Supplierinvoice>(
			0);
	private Set<Constructionrequest> constructionrequests = new HashSet<Constructionrequest>(
			0);

	public Constructionproject() {
	}

	public Constructionproject(String id) {
		this.id = id;
	}

	public Constructionproject(String id, Generaltypevalue generaltypevalue,
			Constructionprojecttype constructionprojecttype, Staff staff,
			Date crd, Date impt, Date expt, Date impd, Date expd, Date modt,
			String cru, Date delt, Date modd, String impu, String expu,
			Date deld, String modu, String delu, Date crt, String code,
			String head, BigDecimal belexmoms, Character locked,
			Character manual, Character autom, String projectno, Date aflevfor,
			Date stoejmaal, Date stoejmaalgodk, Date afsluttet, Date opdat,
			Date dokmodt, Date prisoplyst, Date godkendt, Date ordre,
			Date idrift, Date annul, String anlprojstatus, Date lovetdato,
			String pstyrAnlaegsnr, Date startdate, Date stdlevdate,
			Date faktidriftdate, Date prisreturdate, Date prisretur,
			Date prisgyldig, String primpssupplm, String primsalgansv,
			String primleverand, String projektlobenr, Character afsluttetbool,
			Date afvist, Date lovetidriftdato, Date nylovetidriftdato,
			Date ktaacceptdato, Date godkordremodt, Date godkforespmodt,
			Character afhaengig, BigDecimal timeLeft, Character gravning,
			Date calcstdlevdate, Date calcprisretur, String logtrace,
			BigDecimal costtotal,
			Set<Supplierrequestitem> supplierrequestitems,
			Set<Supplierinvoice> supplierinvoices,
			Set<Constructionrequest> constructionrequests) {
		this.id = id;
		this.generaltypevalue = generaltypevalue;
		this.constructionprojecttype = constructionprojecttype;
		this.staff = staff;
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
		this.belexmoms = belexmoms;
		this.locked = locked;
		this.manual = manual;
		this.autom = autom;
		this.projectno = projectno;
		this.aflevfor = aflevfor;
		this.stoejmaal = stoejmaal;
		this.stoejmaalgodk = stoejmaalgodk;
		this.afsluttet = afsluttet;
		this.opdat = opdat;
		this.dokmodt = dokmodt;
		this.prisoplyst = prisoplyst;
		this.godkendt = godkendt;
		this.ordre = ordre;
		this.idrift = idrift;
		this.annul = annul;
		this.anlprojstatus = anlprojstatus;
		this.lovetdato = lovetdato;
		this.pstyrAnlaegsnr = pstyrAnlaegsnr;
		this.startdate = startdate;
		this.stdlevdate = stdlevdate;
		this.faktidriftdate = faktidriftdate;
		this.prisreturdate = prisreturdate;
		this.prisretur = prisretur;
		this.prisgyldig = prisgyldig;
		this.primpssupplm = primpssupplm;
		this.primsalgansv = primsalgansv;
		this.primleverand = primleverand;
		this.projektlobenr = projektlobenr;
		this.afsluttetbool = afsluttetbool;
		this.afvist = afvist;
		this.lovetidriftdato = lovetidriftdato;
		this.nylovetidriftdato = nylovetidriftdato;
		this.ktaacceptdato = ktaacceptdato;
		this.godkordremodt = godkordremodt;
		this.godkforespmodt = godkforespmodt;
		this.afhaengig = afhaengig;
		this.timeLeft = timeLeft;
		this.gravning = gravning;
		this.calcstdlevdate = calcstdlevdate;
		this.calcprisretur = calcprisretur;
		this.logtrace = logtrace;
		this.costtotal = costtotal;
		this.supplierrequestitems = supplierrequestitems;
		this.supplierinvoices = supplierinvoices;
		this.constructionrequests = constructionrequests;
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
	@JoinColumn(name = "PRIMGENERALTYPEVALUE")
	public Generaltypevalue getGeneraltypevalue() {
		return this.generaltypevalue;
	}

	public void setGeneraltypevalue(Generaltypevalue generaltypevalue) {
		this.generaltypevalue = generaltypevalue;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRIMARYPROJEKTTYPE")
	public Constructionprojecttype getConstructionprojecttype() {
		return this.constructionprojecttype;
	}

	public void setConstructionprojecttype(
			Constructionprojecttype constructionprojecttype) {
		this.constructionprojecttype = constructionprojecttype;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRIMARYUSER")
	public Staff getStaff() {
		return this.staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
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

	@Column(name = "BELEXMOMS", precision = 12)
	public BigDecimal getBelexmoms() {
		return this.belexmoms;
	}

	public void setBelexmoms(BigDecimal belexmoms) {
		this.belexmoms = belexmoms;
	}

	@Column(name = "LOCKED", length = 1)
	public Character getLocked() {
		return this.locked;
	}

	public void setLocked(Character locked) {
		this.locked = locked;
	}

	@Column(name = "MANUAL", length = 1)
	public Character getManual() {
		return this.manual;
	}

	public void setManual(Character manual) {
		this.manual = manual;
	}

	@Column(name = "AUTOM", length = 1)
	public Character getAutom() {
		return this.autom;
	}

	public void setAutom(Character autom) {
		this.autom = autom;
	}

	@Column(name = "PROJECTNO", length = 20)
	public String getProjectno() {
		return this.projectno;
	}

	public void setProjectno(String projectno) {
		this.projectno = projectno;
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
	@Column(name = "STOEJMAAL", length = 7)
	public Date getStoejmaal() {
		return this.stoejmaal;
	}

	public void setStoejmaal(Date stoejmaal) {
		this.stoejmaal = stoejmaal;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "STOEJMAALGODK", length = 7)
	public Date getStoejmaalgodk() {
		return this.stoejmaalgodk;
	}

	public void setStoejmaalgodk(Date stoejmaalgodk) {
		this.stoejmaalgodk = stoejmaalgodk;
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
	@Column(name = "OPDAT", length = 7)
	public Date getOpdat() {
		return this.opdat;
	}

	public void setOpdat(Date opdat) {
		this.opdat = opdat;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DOKMODT", length = 7)
	public Date getDokmodt() {
		return this.dokmodt;
	}

	public void setDokmodt(Date dokmodt) {
		this.dokmodt = dokmodt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "PRISOPLYST", length = 7)
	public Date getPrisoplyst() {
		return this.prisoplyst;
	}

	public void setPrisoplyst(Date prisoplyst) {
		this.prisoplyst = prisoplyst;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "GODKENDT", length = 7)
	public Date getGodkendt() {
		return this.godkendt;
	}

	public void setGodkendt(Date godkendt) {
		this.godkendt = godkendt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ORDRE", length = 7)
	public Date getOrdre() {
		return this.ordre;
	}

	public void setOrdre(Date ordre) {
		this.ordre = ordre;
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
	@Column(name = "ANNUL", length = 7)
	public Date getAnnul() {
		return this.annul;
	}

	public void setAnnul(Date annul) {
		this.annul = annul;
	}

	@Column(name = "ANLPROJSTATUS", length = 50)
	public String getAnlprojstatus() {
		return this.anlprojstatus;
	}

	public void setAnlprojstatus(String anlprojstatus) {
		this.anlprojstatus = anlprojstatus;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LOVETDATO", length = 7)
	public Date getLovetdato() {
		return this.lovetdato;
	}

	public void setLovetdato(Date lovetdato) {
		this.lovetdato = lovetdato;
	}

	@Column(name = "PSTYR_ANLAEGSNR", length = 10)
	public String getPstyrAnlaegsnr() {
		return this.pstyrAnlaegsnr;
	}

	public void setPstyrAnlaegsnr(String pstyrAnlaegsnr) {
		this.pstyrAnlaegsnr = pstyrAnlaegsnr;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "STARTDATE", length = 7)
	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "STDLEVDATE", length = 7)
	public Date getStdlevdate() {
		return this.stdlevdate;
	}

	public void setStdlevdate(Date stdlevdate) {
		this.stdlevdate = stdlevdate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "FAKTIDRIFTDATE", length = 7)
	public Date getFaktidriftdate() {
		return this.faktidriftdate;
	}

	public void setFaktidriftdate(Date faktidriftdate) {
		this.faktidriftdate = faktidriftdate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "PRISRETURDATE", length = 7)
	public Date getPrisreturdate() {
		return this.prisreturdate;
	}

	public void setPrisreturdate(Date prisreturdate) {
		this.prisreturdate = prisreturdate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "PRISRETUR", length = 7)
	public Date getPrisretur() {
		return this.prisretur;
	}

	public void setPrisretur(Date prisretur) {
		this.prisretur = prisretur;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "PRISGYLDIG", length = 7)
	public Date getPrisgyldig() {
		return this.prisgyldig;
	}

	public void setPrisgyldig(Date prisgyldig) {
		this.prisgyldig = prisgyldig;
	}

	@Column(name = "PRIMPSSUPPLM", length = 19)
	public String getPrimpssupplm() {
		return this.primpssupplm;
	}

	public void setPrimpssupplm(String primpssupplm) {
		this.primpssupplm = primpssupplm;
	}

	@Column(name = "PRIMSALGANSV", length = 19)
	public String getPrimsalgansv() {
		return this.primsalgansv;
	}

	public void setPrimsalgansv(String primsalgansv) {
		this.primsalgansv = primsalgansv;
	}

	@Column(name = "PRIMLEVERAND", length = 19)
	public String getPrimleverand() {
		return this.primleverand;
	}

	public void setPrimleverand(String primleverand) {
		this.primleverand = primleverand;
	}

	@Column(name = "PROJEKTLOBENR", length = 20)
	public String getProjektlobenr() {
		return this.projektlobenr;
	}

	public void setProjektlobenr(String projektlobenr) {
		this.projektlobenr = projektlobenr;
	}

	@Column(name = "AFSLUTTETBOOL", length = 1)
	public Character getAfsluttetbool() {
		return this.afsluttetbool;
	}

	public void setAfsluttetbool(Character afsluttetbool) {
		this.afsluttetbool = afsluttetbool;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "AFVIST", length = 7)
	public Date getAfvist() {
		return this.afvist;
	}

	public void setAfvist(Date afvist) {
		this.afvist = afvist;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LOVETIDRIFTDATO", length = 7)
	public Date getLovetidriftdato() {
		return this.lovetidriftdato;
	}

	public void setLovetidriftdato(Date lovetidriftdato) {
		this.lovetidriftdato = lovetidriftdato;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "NYLOVETIDRIFTDATO", length = 7)
	public Date getNylovetidriftdato() {
		return this.nylovetidriftdato;
	}

	public void setNylovetidriftdato(Date nylovetidriftdato) {
		this.nylovetidriftdato = nylovetidriftdato;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "KTAACCEPTDATO", length = 7)
	public Date getKtaacceptdato() {
		return this.ktaacceptdato;
	}

	public void setKtaacceptdato(Date ktaacceptdato) {
		this.ktaacceptdato = ktaacceptdato;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "GODKORDREMODT", length = 7)
	public Date getGodkordremodt() {
		return this.godkordremodt;
	}

	public void setGodkordremodt(Date godkordremodt) {
		this.godkordremodt = godkordremodt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "GODKFORESPMODT", length = 7)
	public Date getGodkforespmodt() {
		return this.godkforespmodt;
	}

	public void setGodkforespmodt(Date godkforespmodt) {
		this.godkforespmodt = godkforespmodt;
	}

	@Column(name = "AFHAENGIG", length = 1)
	public Character getAfhaengig() {
		return this.afhaengig;
	}

	public void setAfhaengig(Character afhaengig) {
		this.afhaengig = afhaengig;
	}

	@Column(name = "TIME_LEFT", precision = 22, scale = 0)
	public BigDecimal getTimeLeft() {
		return this.timeLeft;
	}

	public void setTimeLeft(BigDecimal timeLeft) {
		this.timeLeft = timeLeft;
	}

	@Column(name = "GRAVNING", length = 1)
	public Character getGravning() {
		return this.gravning;
	}

	public void setGravning(Character gravning) {
		this.gravning = gravning;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CALCSTDLEVDATE", length = 7)
	public Date getCalcstdlevdate() {
		return this.calcstdlevdate;
	}

	public void setCalcstdlevdate(Date calcstdlevdate) {
		this.calcstdlevdate = calcstdlevdate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CALCPRISRETUR", length = 7)
	public Date getCalcprisretur() {
		return this.calcprisretur;
	}

	public void setCalcprisretur(Date calcprisretur) {
		this.calcprisretur = calcprisretur;
	}

	@Column(name = "LOGTRACE", length = 19)
	public String getLogtrace() {
		return this.logtrace;
	}

	public void setLogtrace(String logtrace) {
		this.logtrace = logtrace;
	}

	@Column(name = "COSTTOTAL", precision = 12)
	public BigDecimal getCosttotal() {
		return this.costtotal;
	}

	public void setCosttotal(BigDecimal costtotal) {
		this.costtotal = costtotal;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "constructionproject")
	public Set<Supplierrequestitem> getSupplierrequestitems() {
		return this.supplierrequestitems;
	}

	public void setSupplierrequestitems(
			Set<Supplierrequestitem> supplierrequestitems) {
		this.supplierrequestitems = supplierrequestitems;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "constructionproject")
	public Set<Supplierinvoice> getSupplierinvoices() {
		return this.supplierinvoices;
	}

	public void setSupplierinvoices(Set<Supplierinvoice> supplierinvoices) {
		this.supplierinvoices = supplierinvoices;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "constructionproject")
	public Set<Constructionrequest> getConstructionrequests() {
		return this.constructionrequests;
	}

	public void setConstructionrequests(
			Set<Constructionrequest> constructionrequests) {
		this.constructionrequests = constructionrequests;
	}

}
