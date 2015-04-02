package com.tdc.persistence.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CasefolderChghist generated by hbm2java
 */
@Entity
@Table(name = "CASEFOLDER_CHGHIST", schema = "PCRM")
public class CasefolderChghist implements java.io.Serializable {

	private String audId;
	private String audAction;
	private Serializable audTimestamp;
	private String audOsuser;
	private String audDbuser;
	private String audUserterminal;
	private String id;
	private String primuser;
	private String primcont;
	private String primprod;
	private Date impt;
	private Date deld;
	private Character done;
	private Long units;
	private Date crd;
	private Date startdate;
	private String expu;
	private Date crt;
	private String primcomp;
	private String docext;
	private String modu;
	private String cru;
	private Date impd;
	private String primproj;
	private String delu;
	private Date expt;
	private Date modd;
	private String primcamp;
	private Long total;
	private BigDecimal price;
	private Date modt;
	private String head;
	private String primgrou;
	private Long deadchan;
	private String impu;
	private String primpro;
	private Date expd;
	private Date delt;
	private String primarysagstype;
	private String primcableunit;
	private Date activateddate;
	private Date estimatedend;
	private Date calculatedend;
	private Long sagsnummer;
	private String primaryrevuser;
	private Date revisiondate;
	private String primarykontrakt;
	private String primarytypeopslag;
	private Date estorderdate;
	private String primarykonsulent1;
	private String primarykonsulent2;
	private String primarykonsulent3;
	private String primhfinfo;
	private String sagsnr;
	private Integer hfnummer;
	private String tidlanlnr;
	private Date idriftdato;
	private Date faktlevdato;
	private String primsalgstype;
	private Long vurdsandsynlighed;
	private String primnyskons;
	private String primgenskons;
	private String primarykam;
	private String primprodansv;
	private String primaryafdeling;
	private String primteam;
	private String signalforskilde;
	private String primkommune;
	private Character fdamedlem;
	private Long byginnr;
	private String primaryadmkunde;
	private Long pottilsl;
	private Long akttilsl;
	private String primtilbkontr;
	private String primarysagskontakt;
	private String primkundeadm;
	private String primaryku;
	private String primaryre;
	private String primaryrl;
	private Date orderdate;
	private String primaryfase;
	private Long probability;
	private String extlifecycle;
	private String newlifecycle;
	private String primsagsstatus;
	private Date expdate;
	private String projektlobenr;
	private Character reaktionssalg;
	private Character aendretadr;
	private Character aendretanl;
	private Character aendretsag;
	private String primarysalgsansvarlig;
	private String cdmPrisgruppe;
	private Date forvIdriftdato;
	private Character glquicksag;
	private Character QAnnull;
	private Character egenmast;
	private Short vurdtilfredshed;
	private String primarysandsynlighed;
	private String primarytilfredshed;
	private Date oenskedato;
	private String primaryteknsagskontakt;
	private BigDecimal syssagstype;
	private String primtilbudonscreen;
	private Date enddate;
	private Character cleanupcase;
	private BigDecimal processinstanceid;
	private Integer timeLeft;
	private String processtemplatename;
	private String logtrace;
	private Character rerun;
	private Date kundensXnskedeIdriftsdato;

	public CasefolderChghist() {
	}

	public CasefolderChghist(String audId) {
		this.audId = audId;
	}

	public CasefolderChghist(String audId, String audAction,
			Serializable audTimestamp, String audOsuser, String audDbuser,
			String audUserterminal, String id, String primuser,
			String primcont, String primprod, Date impt, Date deld,
			Character done, Long units, Date crd, Date startdate, String expu,
			Date crt, String primcomp, String docext, String modu, String cru,
			Date impd, String primproj, String delu, Date expt, Date modd,
			String primcamp, Long total, BigDecimal price, Date modt,
			String head, String primgrou, Long deadchan, String impu,
			String primpro, Date expd, Date delt, String primarysagstype,
			String primcableunit, Date activateddate, Date estimatedend,
			Date calculatedend, Long sagsnummer, String primaryrevuser,
			Date revisiondate, String primarykontrakt,
			String primarytypeopslag, Date estorderdate,
			String primarykonsulent1, String primarykonsulent2,
			String primarykonsulent3, String primhfinfo, String sagsnr,
			Integer hfnummer, String tidlanlnr, Date idriftdato,
			Date faktlevdato, String primsalgstype, Long vurdsandsynlighed,
			String primnyskons, String primgenskons, String primarykam,
			String primprodansv, String primaryafdeling, String primteam,
			String signalforskilde, String primkommune, Character fdamedlem,
			Long byginnr, String primaryadmkunde, Long pottilsl, Long akttilsl,
			String primtilbkontr, String primarysagskontakt,
			String primkundeadm, String primaryku, String primaryre,
			String primaryrl, Date orderdate, String primaryfase,
			Long probability, String extlifecycle, String newlifecycle,
			String primsagsstatus, Date expdate, String projektlobenr,
			Character reaktionssalg, Character aendretadr,
			Character aendretanl, Character aendretsag,
			String primarysalgsansvarlig, String cdmPrisgruppe,
			Date forvIdriftdato, Character glquicksag, Character QAnnull,
			Character egenmast, Short vurdtilfredshed,
			String primarysandsynlighed, String primarytilfredshed,
			Date oenskedato, String primaryteknsagskontakt,
			BigDecimal syssagstype, String primtilbudonscreen, Date enddate,
			Character cleanupcase, BigDecimal processinstanceid,
			Integer timeLeft, String processtemplatename, String logtrace,
			Character rerun, Date kundensXnskedeIdriftsdato) {
		this.audId = audId;
		this.audAction = audAction;
		this.audTimestamp = audTimestamp;
		this.audOsuser = audOsuser;
		this.audDbuser = audDbuser;
		this.audUserterminal = audUserterminal;
		this.id = id;
		this.primuser = primuser;
		this.primcont = primcont;
		this.primprod = primprod;
		this.impt = impt;
		this.deld = deld;
		this.done = done;
		this.units = units;
		this.crd = crd;
		this.startdate = startdate;
		this.expu = expu;
		this.crt = crt;
		this.primcomp = primcomp;
		this.docext = docext;
		this.modu = modu;
		this.cru = cru;
		this.impd = impd;
		this.primproj = primproj;
		this.delu = delu;
		this.expt = expt;
		this.modd = modd;
		this.primcamp = primcamp;
		this.total = total;
		this.price = price;
		this.modt = modt;
		this.head = head;
		this.primgrou = primgrou;
		this.deadchan = deadchan;
		this.impu = impu;
		this.primpro = primpro;
		this.expd = expd;
		this.delt = delt;
		this.primarysagstype = primarysagstype;
		this.primcableunit = primcableunit;
		this.activateddate = activateddate;
		this.estimatedend = estimatedend;
		this.calculatedend = calculatedend;
		this.sagsnummer = sagsnummer;
		this.primaryrevuser = primaryrevuser;
		this.revisiondate = revisiondate;
		this.primarykontrakt = primarykontrakt;
		this.primarytypeopslag = primarytypeopslag;
		this.estorderdate = estorderdate;
		this.primarykonsulent1 = primarykonsulent1;
		this.primarykonsulent2 = primarykonsulent2;
		this.primarykonsulent3 = primarykonsulent3;
		this.primhfinfo = primhfinfo;
		this.sagsnr = sagsnr;
		this.hfnummer = hfnummer;
		this.tidlanlnr = tidlanlnr;
		this.idriftdato = idriftdato;
		this.faktlevdato = faktlevdato;
		this.primsalgstype = primsalgstype;
		this.vurdsandsynlighed = vurdsandsynlighed;
		this.primnyskons = primnyskons;
		this.primgenskons = primgenskons;
		this.primarykam = primarykam;
		this.primprodansv = primprodansv;
		this.primaryafdeling = primaryafdeling;
		this.primteam = primteam;
		this.signalforskilde = signalforskilde;
		this.primkommune = primkommune;
		this.fdamedlem = fdamedlem;
		this.byginnr = byginnr;
		this.primaryadmkunde = primaryadmkunde;
		this.pottilsl = pottilsl;
		this.akttilsl = akttilsl;
		this.primtilbkontr = primtilbkontr;
		this.primarysagskontakt = primarysagskontakt;
		this.primkundeadm = primkundeadm;
		this.primaryku = primaryku;
		this.primaryre = primaryre;
		this.primaryrl = primaryrl;
		this.orderdate = orderdate;
		this.primaryfase = primaryfase;
		this.probability = probability;
		this.extlifecycle = extlifecycle;
		this.newlifecycle = newlifecycle;
		this.primsagsstatus = primsagsstatus;
		this.expdate = expdate;
		this.projektlobenr = projektlobenr;
		this.reaktionssalg = reaktionssalg;
		this.aendretadr = aendretadr;
		this.aendretanl = aendretanl;
		this.aendretsag = aendretsag;
		this.primarysalgsansvarlig = primarysalgsansvarlig;
		this.cdmPrisgruppe = cdmPrisgruppe;
		this.forvIdriftdato = forvIdriftdato;
		this.glquicksag = glquicksag;
		this.QAnnull = QAnnull;
		this.egenmast = egenmast;
		this.vurdtilfredshed = vurdtilfredshed;
		this.primarysandsynlighed = primarysandsynlighed;
		this.primarytilfredshed = primarytilfredshed;
		this.oenskedato = oenskedato;
		this.primaryteknsagskontakt = primaryteknsagskontakt;
		this.syssagstype = syssagstype;
		this.primtilbudonscreen = primtilbudonscreen;
		this.enddate = enddate;
		this.cleanupcase = cleanupcase;
		this.processinstanceid = processinstanceid;
		this.timeLeft = timeLeft;
		this.processtemplatename = processtemplatename;
		this.logtrace = logtrace;
		this.rerun = rerun;
		this.kundensXnskedeIdriftsdato = kundensXnskedeIdriftsdato;
	}

	@Id
	@Column(name = "AUD_ID", unique = true, nullable = false, length = 19)
	public String getAudId() {
		return this.audId;
	}

	public void setAudId(String audId) {
		this.audId = audId;
	}

	@Column(name = "AUD_ACTION", length = 50)
	public String getAudAction() {
		return this.audAction;
	}

	public void setAudAction(String audAction) {
		this.audAction = audAction;
	}

	@Column(name = "AUD_TIMESTAMP")
	public Serializable getAudTimestamp() {
		return this.audTimestamp;
	}

	public void setAudTimestamp(Serializable audTimestamp) {
		this.audTimestamp = audTimestamp;
	}

	@Column(name = "AUD_OSUSER", length = 50)
	public String getAudOsuser() {
		return this.audOsuser;
	}

	public void setAudOsuser(String audOsuser) {
		this.audOsuser = audOsuser;
	}

	@Column(name = "AUD_DBUSER", length = 50)
	public String getAudDbuser() {
		return this.audDbuser;
	}

	public void setAudDbuser(String audDbuser) {
		this.audDbuser = audDbuser;
	}

	@Column(name = "AUD_USERTERMINAL", length = 50)
	public String getAudUserterminal() {
		return this.audUserterminal;
	}

	public void setAudUserterminal(String audUserterminal) {
		this.audUserterminal = audUserterminal;
	}

	@Column(name = "ID", length = 19)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "PRIMUSER", length = 19)
	public String getPrimuser() {
		return this.primuser;
	}

	public void setPrimuser(String primuser) {
		this.primuser = primuser;
	}

	@Column(name = "PRIMCONT", length = 19)
	public String getPrimcont() {
		return this.primcont;
	}

	public void setPrimcont(String primcont) {
		this.primcont = primcont;
	}

	@Column(name = "PRIMPROD", length = 19)
	public String getPrimprod() {
		return this.primprod;
	}

	public void setPrimprod(String primprod) {
		this.primprod = primprod;
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
	@Column(name = "DELD", length = 7)
	public Date getDeld() {
		return this.deld;
	}

	public void setDeld(Date deld) {
		this.deld = deld;
	}

	@Column(name = "DONE", length = 1)
	public Character getDone() {
		return this.done;
	}

	public void setDone(Character done) {
		this.done = done;
	}

	@Column(name = "UNITS", precision = 10, scale = 0)
	public Long getUnits() {
		return this.units;
	}

	public void setUnits(Long units) {
		this.units = units;
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
	@Column(name = "STARTDATE", length = 7)
	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	@Column(name = "EXPU", length = 19)
	public String getExpu() {
		return this.expu;
	}

	public void setExpu(String expu) {
		this.expu = expu;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRT", length = 7)
	public Date getCrt() {
		return this.crt;
	}

	public void setCrt(Date crt) {
		this.crt = crt;
	}

	@Column(name = "PRIMCOMP", length = 19)
	public String getPrimcomp() {
		return this.primcomp;
	}

	public void setPrimcomp(String primcomp) {
		this.primcomp = primcomp;
	}

	@Column(name = "DOCEXT", length = 12)
	public String getDocext() {
		return this.docext;
	}

	public void setDocext(String docext) {
		this.docext = docext;
	}

	@Column(name = "MODU", length = 19)
	public String getModu() {
		return this.modu;
	}

	public void setModu(String modu) {
		this.modu = modu;
	}

	@Column(name = "CRU", length = 19)
	public String getCru() {
		return this.cru;
	}

	public void setCru(String cru) {
		this.cru = cru;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "IMPD", length = 7)
	public Date getImpd() {
		return this.impd;
	}

	public void setImpd(Date impd) {
		this.impd = impd;
	}

	@Column(name = "PRIMPROJ", length = 19)
	public String getPrimproj() {
		return this.primproj;
	}

	public void setPrimproj(String primproj) {
		this.primproj = primproj;
	}

	@Column(name = "DELU", length = 19)
	public String getDelu() {
		return this.delu;
	}

	public void setDelu(String delu) {
		this.delu = delu;
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
	@Column(name = "MODD", length = 7)
	public Date getModd() {
		return this.modd;
	}

	public void setModd(Date modd) {
		this.modd = modd;
	}

	@Column(name = "PRIMCAMP", length = 19)
	public String getPrimcamp() {
		return this.primcamp;
	}

	public void setPrimcamp(String primcamp) {
		this.primcamp = primcamp;
	}

	@Column(name = "TOTAL", precision = 10, scale = 0)
	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	@Column(name = "PRICE", precision = 12)
	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "MODT", length = 7)
	public Date getModt() {
		return this.modt;
	}

	public void setModt(Date modt) {
		this.modt = modt;
	}

	@Column(name = "HEAD")
	public String getHead() {
		return this.head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	@Column(name = "PRIMGROU", length = 19)
	public String getPrimgrou() {
		return this.primgrou;
	}

	public void setPrimgrou(String primgrou) {
		this.primgrou = primgrou;
	}

	@Column(name = "DEADCHAN", precision = 10, scale = 0)
	public Long getDeadchan() {
		return this.deadchan;
	}

	public void setDeadchan(Long deadchan) {
		this.deadchan = deadchan;
	}

	@Column(name = "IMPU", length = 19)
	public String getImpu() {
		return this.impu;
	}

	public void setImpu(String impu) {
		this.impu = impu;
	}

	@Column(name = "PRIMPRO", length = 19)
	public String getPrimpro() {
		return this.primpro;
	}

	public void setPrimpro(String primpro) {
		this.primpro = primpro;
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
	@Column(name = "DELT", length = 7)
	public Date getDelt() {
		return this.delt;
	}

	public void setDelt(Date delt) {
		this.delt = delt;
	}

	@Column(name = "PRIMARYSAGSTYPE", length = 19)
	public String getPrimarysagstype() {
		return this.primarysagstype;
	}

	public void setPrimarysagstype(String primarysagstype) {
		this.primarysagstype = primarysagstype;
	}

	@Column(name = "PRIMCABLEUNIT", length = 10)
	public String getPrimcableunit() {
		return this.primcableunit;
	}

	public void setPrimcableunit(String primcableunit) {
		this.primcableunit = primcableunit;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ACTIVATEDDATE", length = 7)
	public Date getActivateddate() {
		return this.activateddate;
	}

	public void setActivateddate(Date activateddate) {
		this.activateddate = activateddate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ESTIMATEDEND", length = 7)
	public Date getEstimatedend() {
		return this.estimatedend;
	}

	public void setEstimatedend(Date estimatedend) {
		this.estimatedend = estimatedend;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CALCULATEDEND", length = 7)
	public Date getCalculatedend() {
		return this.calculatedend;
	}

	public void setCalculatedend(Date calculatedend) {
		this.calculatedend = calculatedend;
	}

	@Column(name = "SAGSNUMMER", precision = 10, scale = 0)
	public Long getSagsnummer() {
		return this.sagsnummer;
	}

	public void setSagsnummer(Long sagsnummer) {
		this.sagsnummer = sagsnummer;
	}

	@Column(name = "PRIMARYREVUSER", length = 19)
	public String getPrimaryrevuser() {
		return this.primaryrevuser;
	}

	public void setPrimaryrevuser(String primaryrevuser) {
		this.primaryrevuser = primaryrevuser;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "REVISIONDATE", length = 7)
	public Date getRevisiondate() {
		return this.revisiondate;
	}

	public void setRevisiondate(Date revisiondate) {
		this.revisiondate = revisiondate;
	}

	@Column(name = "PRIMARYKONTRAKT", length = 19)
	public String getPrimarykontrakt() {
		return this.primarykontrakt;
	}

	public void setPrimarykontrakt(String primarykontrakt) {
		this.primarykontrakt = primarykontrakt;
	}

	@Column(name = "PRIMARYTYPEOPSLAG", length = 19)
	public String getPrimarytypeopslag() {
		return this.primarytypeopslag;
	}

	public void setPrimarytypeopslag(String primarytypeopslag) {
		this.primarytypeopslag = primarytypeopslag;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ESTORDERDATE", length = 7)
	public Date getEstorderdate() {
		return this.estorderdate;
	}

	public void setEstorderdate(Date estorderdate) {
		this.estorderdate = estorderdate;
	}

	@Column(name = "PRIMARYKONSULENT1", length = 19)
	public String getPrimarykonsulent1() {
		return this.primarykonsulent1;
	}

	public void setPrimarykonsulent1(String primarykonsulent1) {
		this.primarykonsulent1 = primarykonsulent1;
	}

	@Column(name = "PRIMARYKONSULENT2", length = 19)
	public String getPrimarykonsulent2() {
		return this.primarykonsulent2;
	}

	public void setPrimarykonsulent2(String primarykonsulent2) {
		this.primarykonsulent2 = primarykonsulent2;
	}

	@Column(name = "PRIMARYKONSULENT3", length = 19)
	public String getPrimarykonsulent3() {
		return this.primarykonsulent3;
	}

	public void setPrimarykonsulent3(String primarykonsulent3) {
		this.primarykonsulent3 = primarykonsulent3;
	}

	@Column(name = "PRIMHFINFO", length = 19)
	public String getPrimhfinfo() {
		return this.primhfinfo;
	}

	public void setPrimhfinfo(String primhfinfo) {
		this.primhfinfo = primhfinfo;
	}

	@Column(name = "SAGSNR", length = 30)
	public String getSagsnr() {
		return this.sagsnr;
	}

	public void setSagsnr(String sagsnr) {
		this.sagsnr = sagsnr;
	}

	@Column(name = "HFNUMMER", precision = 9, scale = 0)
	public Integer getHfnummer() {
		return this.hfnummer;
	}

	public void setHfnummer(Integer hfnummer) {
		this.hfnummer = hfnummer;
	}

	@Column(name = "TIDLANLNR", length = 10)
	public String getTidlanlnr() {
		return this.tidlanlnr;
	}

	public void setTidlanlnr(String tidlanlnr) {
		this.tidlanlnr = tidlanlnr;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "IDRIFTDATO", length = 7)
	public Date getIdriftdato() {
		return this.idriftdato;
	}

	public void setIdriftdato(Date idriftdato) {
		this.idriftdato = idriftdato;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "FAKTLEVDATO", length = 7)
	public Date getFaktlevdato() {
		return this.faktlevdato;
	}

	public void setFaktlevdato(Date faktlevdato) {
		this.faktlevdato = faktlevdato;
	}

	@Column(name = "PRIMSALGSTYPE", length = 19)
	public String getPrimsalgstype() {
		return this.primsalgstype;
	}

	public void setPrimsalgstype(String primsalgstype) {
		this.primsalgstype = primsalgstype;
	}

	@Column(name = "VURDSANDSYNLIGHED", precision = 10, scale = 0)
	public Long getVurdsandsynlighed() {
		return this.vurdsandsynlighed;
	}

	public void setVurdsandsynlighed(Long vurdsandsynlighed) {
		this.vurdsandsynlighed = vurdsandsynlighed;
	}

	@Column(name = "PRIMNYSKONS", length = 19)
	public String getPrimnyskons() {
		return this.primnyskons;
	}

	public void setPrimnyskons(String primnyskons) {
		this.primnyskons = primnyskons;
	}

	@Column(name = "PRIMGENSKONS", length = 19)
	public String getPrimgenskons() {
		return this.primgenskons;
	}

	public void setPrimgenskons(String primgenskons) {
		this.primgenskons = primgenskons;
	}

	@Column(name = "PRIMARYKAM", length = 19)
	public String getPrimarykam() {
		return this.primarykam;
	}

	public void setPrimarykam(String primarykam) {
		this.primarykam = primarykam;
	}

	@Column(name = "PRIMPRODANSV", length = 19)
	public String getPrimprodansv() {
		return this.primprodansv;
	}

	public void setPrimprodansv(String primprodansv) {
		this.primprodansv = primprodansv;
	}

	@Column(name = "PRIMARYAFDELING", length = 19)
	public String getPrimaryafdeling() {
		return this.primaryafdeling;
	}

	public void setPrimaryafdeling(String primaryafdeling) {
		this.primaryafdeling = primaryafdeling;
	}

	@Column(name = "PRIMTEAM", length = 19)
	public String getPrimteam() {
		return this.primteam;
	}

	public void setPrimteam(String primteam) {
		this.primteam = primteam;
	}

	@Column(name = "SIGNALFORSKILDE")
	public String getSignalforskilde() {
		return this.signalforskilde;
	}

	public void setSignalforskilde(String signalforskilde) {
		this.signalforskilde = signalforskilde;
	}

	@Column(name = "PRIMKOMMUNE", length = 19)
	public String getPrimkommune() {
		return this.primkommune;
	}

	public void setPrimkommune(String primkommune) {
		this.primkommune = primkommune;
	}

	@Column(name = "FDAMEDLEM", length = 1)
	public Character getFdamedlem() {
		return this.fdamedlem;
	}

	public void setFdamedlem(Character fdamedlem) {
		this.fdamedlem = fdamedlem;
	}

	@Column(name = "BYGINNR", precision = 10, scale = 0)
	public Long getByginnr() {
		return this.byginnr;
	}

	public void setByginnr(Long byginnr) {
		this.byginnr = byginnr;
	}

	@Column(name = "PRIMARYADMKUNDE", length = 19)
	public String getPrimaryadmkunde() {
		return this.primaryadmkunde;
	}

	public void setPrimaryadmkunde(String primaryadmkunde) {
		this.primaryadmkunde = primaryadmkunde;
	}

	@Column(name = "POTTILSL", precision = 10, scale = 0)
	public Long getPottilsl() {
		return this.pottilsl;
	}

	public void setPottilsl(Long pottilsl) {
		this.pottilsl = pottilsl;
	}

	@Column(name = "AKTTILSL", precision = 10, scale = 0)
	public Long getAkttilsl() {
		return this.akttilsl;
	}

	public void setAkttilsl(Long akttilsl) {
		this.akttilsl = akttilsl;
	}

	@Column(name = "PRIMTILBKONTR", length = 19)
	public String getPrimtilbkontr() {
		return this.primtilbkontr;
	}

	public void setPrimtilbkontr(String primtilbkontr) {
		this.primtilbkontr = primtilbkontr;
	}

	@Column(name = "PRIMARYSAGSKONTAKT", length = 19)
	public String getPrimarysagskontakt() {
		return this.primarysagskontakt;
	}

	public void setPrimarysagskontakt(String primarysagskontakt) {
		this.primarysagskontakt = primarysagskontakt;
	}

	@Column(name = "PRIMKUNDEADM", length = 19)
	public String getPrimkundeadm() {
		return this.primkundeadm;
	}

	public void setPrimkundeadm(String primkundeadm) {
		this.primkundeadm = primkundeadm;
	}

	@Column(name = "PRIMARYKU", length = 19)
	public String getPrimaryku() {
		return this.primaryku;
	}

	public void setPrimaryku(String primaryku) {
		this.primaryku = primaryku;
	}

	@Column(name = "PRIMARYRE", length = 19)
	public String getPrimaryre() {
		return this.primaryre;
	}

	public void setPrimaryre(String primaryre) {
		this.primaryre = primaryre;
	}

	@Column(name = "PRIMARYRL", length = 19)
	public String getPrimaryrl() {
		return this.primaryrl;
	}

	public void setPrimaryrl(String primaryrl) {
		this.primaryrl = primaryrl;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ORDERDATE", length = 7)
	public Date getOrderdate() {
		return this.orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	@Column(name = "PRIMARYFASE", length = 19)
	public String getPrimaryfase() {
		return this.primaryfase;
	}

	public void setPrimaryfase(String primaryfase) {
		this.primaryfase = primaryfase;
	}

	@Column(name = "PROBABILITY", precision = 10, scale = 0)
	public Long getProbability() {
		return this.probability;
	}

	public void setProbability(Long probability) {
		this.probability = probability;
	}

	@Column(name = "EXTLIFECYCLE", length = 19)
	public String getExtlifecycle() {
		return this.extlifecycle;
	}

	public void setExtlifecycle(String extlifecycle) {
		this.extlifecycle = extlifecycle;
	}

	@Column(name = "NEWLIFECYCLE", length = 19)
	public String getNewlifecycle() {
		return this.newlifecycle;
	}

	public void setNewlifecycle(String newlifecycle) {
		this.newlifecycle = newlifecycle;
	}

	@Column(name = "PRIMSAGSSTATUS", length = 19)
	public String getPrimsagsstatus() {
		return this.primsagsstatus;
	}

	public void setPrimsagsstatus(String primsagsstatus) {
		this.primsagsstatus = primsagsstatus;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EXPDATE", length = 7)
	public Date getExpdate() {
		return this.expdate;
	}

	public void setExpdate(Date expdate) {
		this.expdate = expdate;
	}

	@Column(name = "PROJEKTLOBENR", length = 10)
	public String getProjektlobenr() {
		return this.projektlobenr;
	}

	public void setProjektlobenr(String projektlobenr) {
		this.projektlobenr = projektlobenr;
	}

	@Column(name = "REAKTIONSSALG", length = 1)
	public Character getReaktionssalg() {
		return this.reaktionssalg;
	}

	public void setReaktionssalg(Character reaktionssalg) {
		this.reaktionssalg = reaktionssalg;
	}

	@Column(name = "AENDRETADR", length = 1)
	public Character getAendretadr() {
		return this.aendretadr;
	}

	public void setAendretadr(Character aendretadr) {
		this.aendretadr = aendretadr;
	}

	@Column(name = "AENDRETANL", length = 1)
	public Character getAendretanl() {
		return this.aendretanl;
	}

	public void setAendretanl(Character aendretanl) {
		this.aendretanl = aendretanl;
	}

	@Column(name = "AENDRETSAG", length = 1)
	public Character getAendretsag() {
		return this.aendretsag;
	}

	public void setAendretsag(Character aendretsag) {
		this.aendretsag = aendretsag;
	}

	@Column(name = "PRIMARYSALGSANSVARLIG", length = 19)
	public String getPrimarysalgsansvarlig() {
		return this.primarysalgsansvarlig;
	}

	public void setPrimarysalgsansvarlig(String primarysalgsansvarlig) {
		this.primarysalgsansvarlig = primarysalgsansvarlig;
	}

	@Column(name = "CDM_PRISGRUPPE", length = 50)
	public String getCdmPrisgruppe() {
		return this.cdmPrisgruppe;
	}

	public void setCdmPrisgruppe(String cdmPrisgruppe) {
		this.cdmPrisgruppe = cdmPrisgruppe;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "FORV_IDRIFTDATO", length = 7)
	public Date getForvIdriftdato() {
		return this.forvIdriftdato;
	}

	public void setForvIdriftdato(Date forvIdriftdato) {
		this.forvIdriftdato = forvIdriftdato;
	}

	@Column(name = "GLQUICKSAG", length = 1)
	public Character getGlquicksag() {
		return this.glquicksag;
	}

	public void setGlquicksag(Character glquicksag) {
		this.glquicksag = glquicksag;
	}

	@Column(name = "Q_ANNULL", length = 1)
	public Character getQAnnull() {
		return this.QAnnull;
	}

	public void setQAnnull(Character QAnnull) {
		this.QAnnull = QAnnull;
	}

	@Column(name = "EGENMAST", length = 1)
	public Character getEgenmast() {
		return this.egenmast;
	}

	public void setEgenmast(Character egenmast) {
		this.egenmast = egenmast;
	}

	@Column(name = "VURDTILFREDSHED", precision = 3, scale = 0)
	public Short getVurdtilfredshed() {
		return this.vurdtilfredshed;
	}

	public void setVurdtilfredshed(Short vurdtilfredshed) {
		this.vurdtilfredshed = vurdtilfredshed;
	}

	@Column(name = "PRIMARYSANDSYNLIGHED", length = 19)
	public String getPrimarysandsynlighed() {
		return this.primarysandsynlighed;
	}

	public void setPrimarysandsynlighed(String primarysandsynlighed) {
		this.primarysandsynlighed = primarysandsynlighed;
	}

	@Column(name = "PRIMARYTILFREDSHED", length = 19)
	public String getPrimarytilfredshed() {
		return this.primarytilfredshed;
	}

	public void setPrimarytilfredshed(String primarytilfredshed) {
		this.primarytilfredshed = primarytilfredshed;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "OENSKEDATO", length = 7)
	public Date getOenskedato() {
		return this.oenskedato;
	}

	public void setOenskedato(Date oenskedato) {
		this.oenskedato = oenskedato;
	}

	@Column(name = "PRIMARYTEKNSAGSKONTAKT", length = 19)
	public String getPrimaryteknsagskontakt() {
		return this.primaryteknsagskontakt;
	}

	public void setPrimaryteknsagskontakt(String primaryteknsagskontakt) {
		this.primaryteknsagskontakt = primaryteknsagskontakt;
	}

	@Column(name = "SYSSAGSTYPE", precision = 22, scale = 0)
	public BigDecimal getSyssagstype() {
		return this.syssagstype;
	}

	public void setSyssagstype(BigDecimal syssagstype) {
		this.syssagstype = syssagstype;
	}

	@Column(name = "PRIMTILBUDONSCREEN", length = 19)
	public String getPrimtilbudonscreen() {
		return this.primtilbudonscreen;
	}

	public void setPrimtilbudonscreen(String primtilbudonscreen) {
		this.primtilbudonscreen = primtilbudonscreen;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ENDDATE", length = 7)
	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	@Column(name = "CLEANUPCASE", length = 1)
	public Character getCleanupcase() {
		return this.cleanupcase;
	}

	public void setCleanupcase(Character cleanupcase) {
		this.cleanupcase = cleanupcase;
	}

	@Column(name = "PROCESSINSTANCEID", precision = 22, scale = 0)
	public BigDecimal getProcessinstanceid() {
		return this.processinstanceid;
	}

	public void setProcessinstanceid(BigDecimal processinstanceid) {
		this.processinstanceid = processinstanceid;
	}

	@Column(name = "TIME_LEFT", precision = 6, scale = 0)
	public Integer getTimeLeft() {
		return this.timeLeft;
	}

	public void setTimeLeft(Integer timeLeft) {
		this.timeLeft = timeLeft;
	}

	@Column(name = "PROCESSTEMPLATENAME")
	public String getProcesstemplatename() {
		return this.processtemplatename;
	}

	public void setProcesstemplatename(String processtemplatename) {
		this.processtemplatename = processtemplatename;
	}

	@Column(name = "LOGTRACE", length = 19)
	public String getLogtrace() {
		return this.logtrace;
	}

	public void setLogtrace(String logtrace) {
		this.logtrace = logtrace;
	}

	@Column(name = "RERUN", length = 1)
	public Character getRerun() {
		return this.rerun;
	}

	public void setRerun(Character rerun) {
		this.rerun = rerun;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "KUNDENS_XNSKEDE_IDRIFTSDATO", length = 7)
	public Date getKundensXnskedeIdriftsdato() {
		return this.kundensXnskedeIdriftsdato;
	}

	public void setKundensXnskedeIdriftsdato(Date kundensXnskedeIdriftsdato) {
		this.kundensXnskedeIdriftsdato = kundensXnskedeIdriftsdato;
	}

}