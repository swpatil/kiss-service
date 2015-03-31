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
 * OfferChghist generated by hbm2java
 */
@Entity
@Table(name = "OFFER_CHGHIST", schema = "PCRM")
public class OfferChghist implements java.io.Serializable {

	private String audId;
	private String audAction;
	private Serializable audTimestamp;
	private String audOsuser;
	private String audDbuser;
	private String audUserterminal;
	private String id;
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
	private String primkontrver;
	private String primarysag;
	private String primarysalgskonceptvalgt;
	private Long tilbudsnummer;
	private Long faktuelletilsl;
	private Long potentielletilsl;
	private Date mergedate;
	private String lbtid;
	private Date kontraktudl;
	private Long opsvarsel;
	private Date idriftdato;
	private Long bindperiode;
	private Date opsdato;
	private Date kontrsendt;
	private Date kontracc;
	private Long sagstilbnr;
	private String primarykontrakttype;
	private String primprisber;
	private String anlaegsnr;
	private String lifecycle;
	private String projektlobenr;
	private String primanltbo;
	private Date itakstfra;
	private Date ikraftfra;
	private String primaryitakstfra;
	private Long installationer;
	private Character noatbo;
	private String primaryklumaxhast;
	private String primaryklulntype;
	private String primaryklulnejer;
	private String primarykluintype;
	private String primarykluaftkap;
	private String primcontract;
	private BigDecimal noKapcmodem;
	private Character flereOmktyper;
	private String primtilbudkontrakt;
	private Long antaladresser;
	private Long antalfjernede;
	private Long antaltilfoejede;
	private String enkeltDebitor;
	private Character enkeltOpkraevet;
	private Long tilbudforlaenget;
	private String primpakketilbud;
	private BigDecimal prisoverslag;
	private Date contractyear;
	private Date levtidspunkt;
	private String nettoindex;
	private String primsalesconcept;
	private Date returnconreq;
	private Date bindperioddate;
	private Date flyttedato;

	public OfferChghist() {
	}

	public OfferChghist(String audId) {
		this.audId = audId;
	}

	public OfferChghist(String audId, String audAction,
			Serializable audTimestamp, String audOsuser, String audDbuser,
			String audUserterminal, String id, Date crd, String code,
			Date impt, Date expt, Date impd, Date expd, Date modt, String cru,
			Date delt, Date modd, String impu, String expu, Date deld,
			String modu, String head, String delu, Date crt,
			String primkontrver, String primarysag,
			String primarysalgskonceptvalgt, Long tilbudsnummer,
			Long faktuelletilsl, Long potentielletilsl, Date mergedate,
			String lbtid, Date kontraktudl, Long opsvarsel, Date idriftdato,
			Long bindperiode, Date opsdato, Date kontrsendt, Date kontracc,
			Long sagstilbnr, String primarykontrakttype, String primprisber,
			String anlaegsnr, String lifecycle, String projektlobenr,
			String primanltbo, Date itakstfra, Date ikraftfra,
			String primaryitakstfra, Long installationer, Character noatbo,
			String primaryklumaxhast, String primaryklulntype,
			String primaryklulnejer, String primarykluintype,
			String primarykluaftkap, String primcontract,
			BigDecimal noKapcmodem, Character flereOmktyper,
			String primtilbudkontrakt, Long antaladresser, Long antalfjernede,
			Long antaltilfoejede, String enkeltDebitor,
			Character enkeltOpkraevet, Long tilbudforlaenget,
			String primpakketilbud, BigDecimal prisoverslag, Date contractyear,
			Date levtidspunkt, String nettoindex, String primsalesconcept,
			Date returnconreq, Date bindperioddate, Date flyttedato) {
		this.audId = audId;
		this.audAction = audAction;
		this.audTimestamp = audTimestamp;
		this.audOsuser = audOsuser;
		this.audDbuser = audDbuser;
		this.audUserterminal = audUserterminal;
		this.id = id;
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
		this.primkontrver = primkontrver;
		this.primarysag = primarysag;
		this.primarysalgskonceptvalgt = primarysalgskonceptvalgt;
		this.tilbudsnummer = tilbudsnummer;
		this.faktuelletilsl = faktuelletilsl;
		this.potentielletilsl = potentielletilsl;
		this.mergedate = mergedate;
		this.lbtid = lbtid;
		this.kontraktudl = kontraktudl;
		this.opsvarsel = opsvarsel;
		this.idriftdato = idriftdato;
		this.bindperiode = bindperiode;
		this.opsdato = opsdato;
		this.kontrsendt = kontrsendt;
		this.kontracc = kontracc;
		this.sagstilbnr = sagstilbnr;
		this.primarykontrakttype = primarykontrakttype;
		this.primprisber = primprisber;
		this.anlaegsnr = anlaegsnr;
		this.lifecycle = lifecycle;
		this.projektlobenr = projektlobenr;
		this.primanltbo = primanltbo;
		this.itakstfra = itakstfra;
		this.ikraftfra = ikraftfra;
		this.primaryitakstfra = primaryitakstfra;
		this.installationer = installationer;
		this.noatbo = noatbo;
		this.primaryklumaxhast = primaryklumaxhast;
		this.primaryklulntype = primaryklulntype;
		this.primaryklulnejer = primaryklulnejer;
		this.primarykluintype = primarykluintype;
		this.primarykluaftkap = primarykluaftkap;
		this.primcontract = primcontract;
		this.noKapcmodem = noKapcmodem;
		this.flereOmktyper = flereOmktyper;
		this.primtilbudkontrakt = primtilbudkontrakt;
		this.antaladresser = antaladresser;
		this.antalfjernede = antalfjernede;
		this.antaltilfoejede = antaltilfoejede;
		this.enkeltDebitor = enkeltDebitor;
		this.enkeltOpkraevet = enkeltOpkraevet;
		this.tilbudforlaenget = tilbudforlaenget;
		this.primpakketilbud = primpakketilbud;
		this.prisoverslag = prisoverslag;
		this.contractyear = contractyear;
		this.levtidspunkt = levtidspunkt;
		this.nettoindex = nettoindex;
		this.primsalesconcept = primsalesconcept;
		this.returnconreq = returnconreq;
		this.bindperioddate = bindperioddate;
		this.flyttedato = flyttedato;
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

	@Column(name = "PRIMKONTRVER", length = 19)
	public String getPrimkontrver() {
		return this.primkontrver;
	}

	public void setPrimkontrver(String primkontrver) {
		this.primkontrver = primkontrver;
	}

	@Column(name = "PRIMARYSAG", length = 19)
	public String getPrimarysag() {
		return this.primarysag;
	}

	public void setPrimarysag(String primarysag) {
		this.primarysag = primarysag;
	}

	@Column(name = "PRIMARYSALGSKONCEPTVALGT", length = 19)
	public String getPrimarysalgskonceptvalgt() {
		return this.primarysalgskonceptvalgt;
	}

	public void setPrimarysalgskonceptvalgt(String primarysalgskonceptvalgt) {
		this.primarysalgskonceptvalgt = primarysalgskonceptvalgt;
	}

	@Column(name = "TILBUDSNUMMER", precision = 10, scale = 0)
	public Long getTilbudsnummer() {
		return this.tilbudsnummer;
	}

	public void setTilbudsnummer(Long tilbudsnummer) {
		this.tilbudsnummer = tilbudsnummer;
	}

	@Column(name = "FAKTUELLETILSL", precision = 10, scale = 0)
	public Long getFaktuelletilsl() {
		return this.faktuelletilsl;
	}

	public void setFaktuelletilsl(Long faktuelletilsl) {
		this.faktuelletilsl = faktuelletilsl;
	}

	@Column(name = "POTENTIELLETILSL", precision = 10, scale = 0)
	public Long getPotentielletilsl() {
		return this.potentielletilsl;
	}

	public void setPotentielletilsl(Long potentielletilsl) {
		this.potentielletilsl = potentielletilsl;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "MERGEDATE", length = 7)
	public Date getMergedate() {
		return this.mergedate;
	}

	public void setMergedate(Date mergedate) {
		this.mergedate = mergedate;
	}

	@Column(name = "LBTID")
	public String getLbtid() {
		return this.lbtid;
	}

	public void setLbtid(String lbtid) {
		this.lbtid = lbtid;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "KONTRAKTUDL", length = 7)
	public Date getKontraktudl() {
		return this.kontraktudl;
	}

	public void setKontraktudl(Date kontraktudl) {
		this.kontraktudl = kontraktudl;
	}

	@Column(name = "OPSVARSEL", precision = 10, scale = 0)
	public Long getOpsvarsel() {
		return this.opsvarsel;
	}

	public void setOpsvarsel(Long opsvarsel) {
		this.opsvarsel = opsvarsel;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "IDRIFTDATO", length = 7)
	public Date getIdriftdato() {
		return this.idriftdato;
	}

	public void setIdriftdato(Date idriftdato) {
		this.idriftdato = idriftdato;
	}

	@Column(name = "BINDPERIODE", precision = 10, scale = 0)
	public Long getBindperiode() {
		return this.bindperiode;
	}

	public void setBindperiode(Long bindperiode) {
		this.bindperiode = bindperiode;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "OPSDATO", length = 7)
	public Date getOpsdato() {
		return this.opsdato;
	}

	public void setOpsdato(Date opsdato) {
		this.opsdato = opsdato;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "KONTRSENDT", length = 7)
	public Date getKontrsendt() {
		return this.kontrsendt;
	}

	public void setKontrsendt(Date kontrsendt) {
		this.kontrsendt = kontrsendt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "KONTRACC", length = 7)
	public Date getKontracc() {
		return this.kontracc;
	}

	public void setKontracc(Date kontracc) {
		this.kontracc = kontracc;
	}

	@Column(name = "SAGSTILBNR", precision = 10, scale = 0)
	public Long getSagstilbnr() {
		return this.sagstilbnr;
	}

	public void setSagstilbnr(Long sagstilbnr) {
		this.sagstilbnr = sagstilbnr;
	}

	@Column(name = "PRIMARYKONTRAKTTYPE", length = 19)
	public String getPrimarykontrakttype() {
		return this.primarykontrakttype;
	}

	public void setPrimarykontrakttype(String primarykontrakttype) {
		this.primarykontrakttype = primarykontrakttype;
	}

	@Column(name = "PRIMPRISBER", length = 19)
	public String getPrimprisber() {
		return this.primprisber;
	}

	public void setPrimprisber(String primprisber) {
		this.primprisber = primprisber;
	}

	@Column(name = "ANLAEGSNR", length = 10)
	public String getAnlaegsnr() {
		return this.anlaegsnr;
	}

	public void setAnlaegsnr(String anlaegsnr) {
		this.anlaegsnr = anlaegsnr;
	}

	@Column(name = "LIFECYCLE", length = 10)
	public String getLifecycle() {
		return this.lifecycle;
	}

	public void setLifecycle(String lifecycle) {
		this.lifecycle = lifecycle;
	}

	@Column(name = "PROJEKTLOBENR", length = 10)
	public String getProjektlobenr() {
		return this.projektlobenr;
	}

	public void setProjektlobenr(String projektlobenr) {
		this.projektlobenr = projektlobenr;
	}

	@Column(name = "PRIMANLTBO", length = 19)
	public String getPrimanltbo() {
		return this.primanltbo;
	}

	public void setPrimanltbo(String primanltbo) {
		this.primanltbo = primanltbo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ITAKSTFRA", length = 7)
	public Date getItakstfra() {
		return this.itakstfra;
	}

	public void setItakstfra(Date itakstfra) {
		this.itakstfra = itakstfra;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "IKRAFTFRA", length = 7)
	public Date getIkraftfra() {
		return this.ikraftfra;
	}

	public void setIkraftfra(Date ikraftfra) {
		this.ikraftfra = ikraftfra;
	}

	@Column(name = "PRIMARYITAKSTFRA", length = 19)
	public String getPrimaryitakstfra() {
		return this.primaryitakstfra;
	}

	public void setPrimaryitakstfra(String primaryitakstfra) {
		this.primaryitakstfra = primaryitakstfra;
	}

	@Column(name = "INSTALLATIONER", precision = 10, scale = 0)
	public Long getInstallationer() {
		return this.installationer;
	}

	public void setInstallationer(Long installationer) {
		this.installationer = installationer;
	}

	@Column(name = "NOATBO", length = 1)
	public Character getNoatbo() {
		return this.noatbo;
	}

	public void setNoatbo(Character noatbo) {
		this.noatbo = noatbo;
	}

	@Column(name = "PRIMARYKLUMAXHAST", length = 19)
	public String getPrimaryklumaxhast() {
		return this.primaryklumaxhast;
	}

	public void setPrimaryklumaxhast(String primaryklumaxhast) {
		this.primaryklumaxhast = primaryklumaxhast;
	}

	@Column(name = "PRIMARYKLULNTYPE", length = 19)
	public String getPrimaryklulntype() {
		return this.primaryklulntype;
	}

	public void setPrimaryklulntype(String primaryklulntype) {
		this.primaryklulntype = primaryklulntype;
	}

	@Column(name = "PRIMARYKLULNEJER", length = 19)
	public String getPrimaryklulnejer() {
		return this.primaryklulnejer;
	}

	public void setPrimaryklulnejer(String primaryklulnejer) {
		this.primaryklulnejer = primaryklulnejer;
	}

	@Column(name = "PRIMARYKLUINTYPE", length = 19)
	public String getPrimarykluintype() {
		return this.primarykluintype;
	}

	public void setPrimarykluintype(String primarykluintype) {
		this.primarykluintype = primarykluintype;
	}

	@Column(name = "PRIMARYKLUAFTKAP", length = 19)
	public String getPrimarykluaftkap() {
		return this.primarykluaftkap;
	}

	public void setPrimarykluaftkap(String primarykluaftkap) {
		this.primarykluaftkap = primarykluaftkap;
	}

	@Column(name = "PRIMCONTRACT", length = 19)
	public String getPrimcontract() {
		return this.primcontract;
	}

	public void setPrimcontract(String primcontract) {
		this.primcontract = primcontract;
	}

	@Column(name = "NO_KAPCMODEM", precision = 12)
	public BigDecimal getNoKapcmodem() {
		return this.noKapcmodem;
	}

	public void setNoKapcmodem(BigDecimal noKapcmodem) {
		this.noKapcmodem = noKapcmodem;
	}

	@Column(name = "FLERE_OMKTYPER", length = 1)
	public Character getFlereOmktyper() {
		return this.flereOmktyper;
	}

	public void setFlereOmktyper(Character flereOmktyper) {
		this.flereOmktyper = flereOmktyper;
	}

	@Column(name = "PRIMTILBUDKONTRAKT", length = 19)
	public String getPrimtilbudkontrakt() {
		return this.primtilbudkontrakt;
	}

	public void setPrimtilbudkontrakt(String primtilbudkontrakt) {
		this.primtilbudkontrakt = primtilbudkontrakt;
	}

	@Column(name = "ANTALADRESSER", precision = 10, scale = 0)
	public Long getAntaladresser() {
		return this.antaladresser;
	}

	public void setAntaladresser(Long antaladresser) {
		this.antaladresser = antaladresser;
	}

	@Column(name = "ANTALFJERNEDE", precision = 10, scale = 0)
	public Long getAntalfjernede() {
		return this.antalfjernede;
	}

	public void setAntalfjernede(Long antalfjernede) {
		this.antalfjernede = antalfjernede;
	}

	@Column(name = "ANTALTILFOEJEDE", precision = 10, scale = 0)
	public Long getAntaltilfoejede() {
		return this.antaltilfoejede;
	}

	public void setAntaltilfoejede(Long antaltilfoejede) {
		this.antaltilfoejede = antaltilfoejede;
	}

	@Column(name = "ENKELT_DEBITOR", length = 10)
	public String getEnkeltDebitor() {
		return this.enkeltDebitor;
	}

	public void setEnkeltDebitor(String enkeltDebitor) {
		this.enkeltDebitor = enkeltDebitor;
	}

	@Column(name = "ENKELT_OPKRAEVET", length = 1)
	public Character getEnkeltOpkraevet() {
		return this.enkeltOpkraevet;
	}

	public void setEnkeltOpkraevet(Character enkeltOpkraevet) {
		this.enkeltOpkraevet = enkeltOpkraevet;
	}

	@Column(name = "TILBUDFORLAENGET", precision = 10, scale = 0)
	public Long getTilbudforlaenget() {
		return this.tilbudforlaenget;
	}

	public void setTilbudforlaenget(Long tilbudforlaenget) {
		this.tilbudforlaenget = tilbudforlaenget;
	}

	@Column(name = "PRIMPAKKETILBUD", length = 19)
	public String getPrimpakketilbud() {
		return this.primpakketilbud;
	}

	public void setPrimpakketilbud(String primpakketilbud) {
		this.primpakketilbud = primpakketilbud;
	}

	@Column(name = "PRISOVERSLAG", precision = 12)
	public BigDecimal getPrisoverslag() {
		return this.prisoverslag;
	}

	public void setPrisoverslag(BigDecimal prisoverslag) {
		this.prisoverslag = prisoverslag;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CONTRACTYEAR", length = 7)
	public Date getContractyear() {
		return this.contractyear;
	}

	public void setContractyear(Date contractyear) {
		this.contractyear = contractyear;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LEVTIDSPUNKT", length = 7)
	public Date getLevtidspunkt() {
		return this.levtidspunkt;
	}

	public void setLevtidspunkt(Date levtidspunkt) {
		this.levtidspunkt = levtidspunkt;
	}

	@Column(name = "NETTOINDEX", length = 25)
	public String getNettoindex() {
		return this.nettoindex;
	}

	public void setNettoindex(String nettoindex) {
		this.nettoindex = nettoindex;
	}

	@Column(name = "PRIMSALESCONCEPT", length = 19)
	public String getPrimsalesconcept() {
		return this.primsalesconcept;
	}

	public void setPrimsalesconcept(String primsalesconcept) {
		this.primsalesconcept = primsalesconcept;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "RETURNCONREQ", length = 7)
	public Date getReturnconreq() {
		return this.returnconreq;
	}

	public void setReturnconreq(Date returnconreq) {
		this.returnconreq = returnconreq;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "BINDPERIODDATE", length = 7)
	public Date getBindperioddate() {
		return this.bindperioddate;
	}

	public void setBindperioddate(Date bindperioddate) {
		this.bindperioddate = bindperioddate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "FLYTTEDATO", length = 7)
	public Date getFlyttedato() {
		return this.flyttedato;
	}

	public void setFlyttedato(Date flyttedato) {
		this.flyttedato = flyttedato;
	}

}
