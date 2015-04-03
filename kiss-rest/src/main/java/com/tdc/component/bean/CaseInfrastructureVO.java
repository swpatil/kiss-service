package com.tdc.component.bean;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.tdc.persistence.dao.entity.Casefoldervaluelink;
import com.tdc.persistence.dao.entity.Casestate;
import com.tdc.persistence.dao.entity.Casetype;
import com.tdc.persistence.dao.entity.CustomerDrop;
import com.tdc.persistence.dao.entity.Document;
import com.tdc.persistence.dao.entity.Offer;
import com.tdc.persistence.dao.entity.Requestbasis;
import com.tdc.persistence.dao.entity.Salestype;
import com.tdc.persistence.dao.entity.Staff;

public class CaseInfrastructureVO {

	private String id;
	private Casetype casetype;
	private Offer offer;
	private Staff staffByPrimaryrevuser;
	private Staff staffByPrimarysalgsansvarlig;
	private Salestype salestype;
	private CustomerDrop customerDrop;
	private Casestate casestate;
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
	private String primcableunit;
	private Date activateddate;
	private Date estimatedend;
	private Date calculatedend;
	private Long sagsnummer;
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
	private Date expdate;
	private String projektlobenr;
	private Character reaktionssalg;
	private Character aendretadr;
	private Character aendretanl;
	private Character aendretsag;
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
	private Set<Document> documents = new HashSet<Document>(0);
	private Set<Requestbasis> requestbasises = new HashSet<Requestbasis>(0);
	private Set<Offer> offers = new HashSet<Offer>(0);
	private Set<Casefoldervaluelink> casefoldervaluelinks = new HashSet<Casefoldervaluelink>(
			0);
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Casetype getCasetype() {
		return casetype;
	}
	public void setCasetype(Casetype casetype) {
		this.casetype = casetype;
	}
	public Offer getOffer() {
		return offer;
	}
	public void setOffer(Offer offer) {
		this.offer = offer;
	}
	public Staff getStaffByPrimaryrevuser() {
		return staffByPrimaryrevuser;
	}
	public void setStaffByPrimaryrevuser(Staff staffByPrimaryrevuser) {
		this.staffByPrimaryrevuser = staffByPrimaryrevuser;
	}
	public Staff getStaffByPrimarysalgsansvarlig() {
		return staffByPrimarysalgsansvarlig;
	}
	public void setStaffByPrimarysalgsansvarlig(Staff staffByPrimarysalgsansvarlig) {
		this.staffByPrimarysalgsansvarlig = staffByPrimarysalgsansvarlig;
	}
	public Salestype getSalestype() {
		return salestype;
	}
	public void setSalestype(Salestype salestype) {
		this.salestype = salestype;
	}
	public CustomerDrop getCustomerDrop() {
		return customerDrop;
	}
	public void setCustomerDrop(CustomerDrop customerDrop) {
		this.customerDrop = customerDrop;
	}
	public Casestate getCasestate() {
		return casestate;
	}
	public void setCasestate(Casestate casestate) {
		this.casestate = casestate;
	}
	public String getPrimuser() {
		return primuser;
	}
	public void setPrimuser(String primuser) {
		this.primuser = primuser;
	}
	public String getPrimcont() {
		return primcont;
	}
	public void setPrimcont(String primcont) {
		this.primcont = primcont;
	}
	public String getPrimprod() {
		return primprod;
	}
	public void setPrimprod(String primprod) {
		this.primprod = primprod;
	}
	public Date getImpt() {
		return impt;
	}
	public void setImpt(Date impt) {
		this.impt = impt;
	}
	public Date getDeld() {
		return deld;
	}
	public void setDeld(Date deld) {
		this.deld = deld;
	}
	public Character getDone() {
		return done;
	}
	public void setDone(Character done) {
		this.done = done;
	}
	public Long getUnits() {
		return units;
	}
	public void setUnits(Long units) {
		this.units = units;
	}
	public Date getCrd() {
		return crd;
	}
	public void setCrd(Date crd) {
		this.crd = crd;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public String getExpu() {
		return expu;
	}
	public void setExpu(String expu) {
		this.expu = expu;
	}
	public Date getCrt() {
		return crt;
	}
	public void setCrt(Date crt) {
		this.crt = crt;
	}
	public String getDocext() {
		return docext;
	}
	public void setDocext(String docext) {
		this.docext = docext;
	}
	public String getModu() {
		return modu;
	}
	public void setModu(String modu) {
		this.modu = modu;
	}
	public String getCru() {
		return cru;
	}
	public void setCru(String cru) {
		this.cru = cru;
	}
	public Date getImpd() {
		return impd;
	}
	public void setImpd(Date impd) {
		this.impd = impd;
	}
	public String getPrimproj() {
		return primproj;
	}
	public void setPrimproj(String primproj) {
		this.primproj = primproj;
	}
	public String getDelu() {
		return delu;
	}
	public void setDelu(String delu) {
		this.delu = delu;
	}
	public Date getExpt() {
		return expt;
	}
	public void setExpt(Date expt) {
		this.expt = expt;
	}
	public Date getModd() {
		return modd;
	}
	public void setModd(Date modd) {
		this.modd = modd;
	}
	public String getPrimcamp() {
		return primcamp;
	}
	public void setPrimcamp(String primcamp) {
		this.primcamp = primcamp;
	}
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Date getModt() {
		return modt;
	}
	public void setModt(Date modt) {
		this.modt = modt;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public String getPrimgrou() {
		return primgrou;
	}
	public void setPrimgrou(String primgrou) {
		this.primgrou = primgrou;
	}
	public Long getDeadchan() {
		return deadchan;
	}
	public void setDeadchan(Long deadchan) {
		this.deadchan = deadchan;
	}
	public String getImpu() {
		return impu;
	}
	public void setImpu(String impu) {
		this.impu = impu;
	}
	public String getPrimpro() {
		return primpro;
	}
	public void setPrimpro(String primpro) {
		this.primpro = primpro;
	}
	public Date getExpd() {
		return expd;
	}
	public void setExpd(Date expd) {
		this.expd = expd;
	}
	public Date getDelt() {
		return delt;
	}
	public void setDelt(Date delt) {
		this.delt = delt;
	}
	public String getPrimcableunit() {
		return primcableunit;
	}
	public void setPrimcableunit(String primcableunit) {
		this.primcableunit = primcableunit;
	}
	public Date getActivateddate() {
		return activateddate;
	}
	public void setActivateddate(Date activateddate) {
		this.activateddate = activateddate;
	}
	public Date getEstimatedend() {
		return estimatedend;
	}
	public void setEstimatedend(Date estimatedend) {
		this.estimatedend = estimatedend;
	}
	public Date getCalculatedend() {
		return calculatedend;
	}
	public void setCalculatedend(Date calculatedend) {
		this.calculatedend = calculatedend;
	}
	public Long getSagsnummer() {
		return sagsnummer;
	}
	public void setSagsnummer(Long sagsnummer) {
		this.sagsnummer = sagsnummer;
	}
	public Date getRevisiondate() {
		return revisiondate;
	}
	public void setRevisiondate(Date revisiondate) {
		this.revisiondate = revisiondate;
	}
	public String getPrimarykontrakt() {
		return primarykontrakt;
	}
	public void setPrimarykontrakt(String primarykontrakt) {
		this.primarykontrakt = primarykontrakt;
	}
	public String getPrimarytypeopslag() {
		return primarytypeopslag;
	}
	public void setPrimarytypeopslag(String primarytypeopslag) {
		this.primarytypeopslag = primarytypeopslag;
	}
	public Date getEstorderdate() {
		return estorderdate;
	}
	public void setEstorderdate(Date estorderdate) {
		this.estorderdate = estorderdate;
	}
	public String getPrimarykonsulent1() {
		return primarykonsulent1;
	}
	public void setPrimarykonsulent1(String primarykonsulent1) {
		this.primarykonsulent1 = primarykonsulent1;
	}
	public String getPrimarykonsulent2() {
		return primarykonsulent2;
	}
	public void setPrimarykonsulent2(String primarykonsulent2) {
		this.primarykonsulent2 = primarykonsulent2;
	}
	public String getPrimarykonsulent3() {
		return primarykonsulent3;
	}
	public void setPrimarykonsulent3(String primarykonsulent3) {
		this.primarykonsulent3 = primarykonsulent3;
	}
	public String getPrimhfinfo() {
		return primhfinfo;
	}
	public void setPrimhfinfo(String primhfinfo) {
		this.primhfinfo = primhfinfo;
	}
	public String getSagsnr() {
		return sagsnr;
	}
	public void setSagsnr(String sagsnr) {
		this.sagsnr = sagsnr;
	}
	public Integer getHfnummer() {
		return hfnummer;
	}
	public void setHfnummer(Integer hfnummer) {
		this.hfnummer = hfnummer;
	}
	public String getTidlanlnr() {
		return tidlanlnr;
	}
	public void setTidlanlnr(String tidlanlnr) {
		this.tidlanlnr = tidlanlnr;
	}
	public Date getIdriftdato() {
		return idriftdato;
	}
	public void setIdriftdato(Date idriftdato) {
		this.idriftdato = idriftdato;
	}
	public Date getFaktlevdato() {
		return faktlevdato;
	}
	public void setFaktlevdato(Date faktlevdato) {
		this.faktlevdato = faktlevdato;
	}
	public Long getVurdsandsynlighed() {
		return vurdsandsynlighed;
	}
	public void setVurdsandsynlighed(Long vurdsandsynlighed) {
		this.vurdsandsynlighed = vurdsandsynlighed;
	}
	public String getPrimnyskons() {
		return primnyskons;
	}
	public void setPrimnyskons(String primnyskons) {
		this.primnyskons = primnyskons;
	}
	public String getPrimgenskons() {
		return primgenskons;
	}
	public void setPrimgenskons(String primgenskons) {
		this.primgenskons = primgenskons;
	}
	public String getPrimarykam() {
		return primarykam;
	}
	public void setPrimarykam(String primarykam) {
		this.primarykam = primarykam;
	}
	public String getPrimprodansv() {
		return primprodansv;
	}
	public void setPrimprodansv(String primprodansv) {
		this.primprodansv = primprodansv;
	}
	public String getPrimaryafdeling() {
		return primaryafdeling;
	}
	public void setPrimaryafdeling(String primaryafdeling) {
		this.primaryafdeling = primaryafdeling;
	}
	public String getPrimteam() {
		return primteam;
	}
	public void setPrimteam(String primteam) {
		this.primteam = primteam;
	}
	public String getSignalforskilde() {
		return signalforskilde;
	}
	public void setSignalforskilde(String signalforskilde) {
		this.signalforskilde = signalforskilde;
	}
	public String getPrimkommune() {
		return primkommune;
	}
	public void setPrimkommune(String primkommune) {
		this.primkommune = primkommune;
	}
	public Character getFdamedlem() {
		return fdamedlem;
	}
	public void setFdamedlem(Character fdamedlem) {
		this.fdamedlem = fdamedlem;
	}
	public Long getByginnr() {
		return byginnr;
	}
	public void setByginnr(Long byginnr) {
		this.byginnr = byginnr;
	}
	public String getPrimaryadmkunde() {
		return primaryadmkunde;
	}
	public void setPrimaryadmkunde(String primaryadmkunde) {
		this.primaryadmkunde = primaryadmkunde;
	}
	public Long getPottilsl() {
		return pottilsl;
	}
	public void setPottilsl(Long pottilsl) {
		this.pottilsl = pottilsl;
	}
	public Long getAkttilsl() {
		return akttilsl;
	}
	public void setAkttilsl(Long akttilsl) {
		this.akttilsl = akttilsl;
	}
	public String getPrimarysagskontakt() {
		return primarysagskontakt;
	}
	public void setPrimarysagskontakt(String primarysagskontakt) {
		this.primarysagskontakt = primarysagskontakt;
	}
	public String getPrimkundeadm() {
		return primkundeadm;
	}
	public void setPrimkundeadm(String primkundeadm) {
		this.primkundeadm = primkundeadm;
	}
	public String getPrimaryku() {
		return primaryku;
	}
	public void setPrimaryku(String primaryku) {
		this.primaryku = primaryku;
	}
	public String getPrimaryre() {
		return primaryre;
	}
	public void setPrimaryre(String primaryre) {
		this.primaryre = primaryre;
	}
	public String getPrimaryrl() {
		return primaryrl;
	}
	public void setPrimaryrl(String primaryrl) {
		this.primaryrl = primaryrl;
	}
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	public String getPrimaryfase() {
		return primaryfase;
	}
	public void setPrimaryfase(String primaryfase) {
		this.primaryfase = primaryfase;
	}
	public Long getProbability() {
		return probability;
	}
	public void setProbability(Long probability) {
		this.probability = probability;
	}
	public String getExtlifecycle() {
		return extlifecycle;
	}
	public void setExtlifecycle(String extlifecycle) {
		this.extlifecycle = extlifecycle;
	}
	public String getNewlifecycle() {
		return newlifecycle;
	}
	public void setNewlifecycle(String newlifecycle) {
		this.newlifecycle = newlifecycle;
	}
	public Date getExpdate() {
		return expdate;
	}
	public void setExpdate(Date expdate) {
		this.expdate = expdate;
	}
	public String getProjektlobenr() {
		return projektlobenr;
	}
	public void setProjektlobenr(String projektlobenr) {
		this.projektlobenr = projektlobenr;
	}
	public Character getReaktionssalg() {
		return reaktionssalg;
	}
	public void setReaktionssalg(Character reaktionssalg) {
		this.reaktionssalg = reaktionssalg;
	}
	public Character getAendretadr() {
		return aendretadr;
	}
	public void setAendretadr(Character aendretadr) {
		this.aendretadr = aendretadr;
	}
	public Character getAendretanl() {
		return aendretanl;
	}
	public void setAendretanl(Character aendretanl) {
		this.aendretanl = aendretanl;
	}
	public Character getAendretsag() {
		return aendretsag;
	}
	public void setAendretsag(Character aendretsag) {
		this.aendretsag = aendretsag;
	}
	public String getCdmPrisgruppe() {
		return cdmPrisgruppe;
	}
	public void setCdmPrisgruppe(String cdmPrisgruppe) {
		this.cdmPrisgruppe = cdmPrisgruppe;
	}
	public Date getForvIdriftdato() {
		return forvIdriftdato;
	}
	public void setForvIdriftdato(Date forvIdriftdato) {
		this.forvIdriftdato = forvIdriftdato;
	}
	public Character getGlquicksag() {
		return glquicksag;
	}
	public void setGlquicksag(Character glquicksag) {
		this.glquicksag = glquicksag;
	}
	public Character getQAnnull() {
		return QAnnull;
	}
	public void setQAnnull(Character qAnnull) {
		QAnnull = qAnnull;
	}
	public Character getEgenmast() {
		return egenmast;
	}
	public void setEgenmast(Character egenmast) {
		this.egenmast = egenmast;
	}
	public Short getVurdtilfredshed() {
		return vurdtilfredshed;
	}
	public void setVurdtilfredshed(Short vurdtilfredshed) {
		this.vurdtilfredshed = vurdtilfredshed;
	}
	public String getPrimarysandsynlighed() {
		return primarysandsynlighed;
	}
	public void setPrimarysandsynlighed(String primarysandsynlighed) {
		this.primarysandsynlighed = primarysandsynlighed;
	}
	public String getPrimarytilfredshed() {
		return primarytilfredshed;
	}
	public void setPrimarytilfredshed(String primarytilfredshed) {
		this.primarytilfredshed = primarytilfredshed;
	}
	public Date getOenskedato() {
		return oenskedato;
	}
	public void setOenskedato(Date oenskedato) {
		this.oenskedato = oenskedato;
	}
	public String getPrimaryteknsagskontakt() {
		return primaryteknsagskontakt;
	}
	public void setPrimaryteknsagskontakt(String primaryteknsagskontakt) {
		this.primaryteknsagskontakt = primaryteknsagskontakt;
	}
	public BigDecimal getSyssagstype() {
		return syssagstype;
	}
	public void setSyssagstype(BigDecimal syssagstype) {
		this.syssagstype = syssagstype;
	}
	public String getPrimtilbudonscreen() {
		return primtilbudonscreen;
	}
	public void setPrimtilbudonscreen(String primtilbudonscreen) {
		this.primtilbudonscreen = primtilbudonscreen;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public Character getCleanupcase() {
		return cleanupcase;
	}
	public void setCleanupcase(Character cleanupcase) {
		this.cleanupcase = cleanupcase;
	}
	public BigDecimal getProcessinstanceid() {
		return processinstanceid;
	}
	public void setProcessinstanceid(BigDecimal processinstanceid) {
		this.processinstanceid = processinstanceid;
	}
	public Integer getTimeLeft() {
		return timeLeft;
	}
	public void setTimeLeft(Integer timeLeft) {
		this.timeLeft = timeLeft;
	}
	public String getProcesstemplatename() {
		return processtemplatename;
	}
	public void setProcesstemplatename(String processtemplatename) {
		this.processtemplatename = processtemplatename;
	}
	public String getLogtrace() {
		return logtrace;
	}
	public void setLogtrace(String logtrace) {
		this.logtrace = logtrace;
	}
	public Character getRerun() {
		return rerun;
	}
	public void setRerun(Character rerun) {
		this.rerun = rerun;
	}
	public Date getKundensXnskedeIdriftsdato() {
		return kundensXnskedeIdriftsdato;
	}
	public void setKundensXnskedeIdriftsdato(Date kundensXnskedeIdriftsdato) {
		this.kundensXnskedeIdriftsdato = kundensXnskedeIdriftsdato;
	}
	public Set<Document> getDocuments() {
		return documents;
	}
	public void setDocuments(Set<Document> documents) {
		this.documents = documents;
	}
	public Set<Requestbasis> getRequestbasises() {
		return requestbasises;
	}
	public void setRequestbasises(Set<Requestbasis> requestbasises) {
		this.requestbasises = requestbasises;
	}
	public Set<Offer> getOffers() {
		return offers;
	}
	public void setOffers(Set<Offer> offers) {
		this.offers = offers;
	}
	public Set<Casefoldervaluelink> getCasefoldervaluelinks() {
		return casefoldervaluelinks;
	}
	public void setCasefoldervaluelinks(
			Set<Casefoldervaluelink> casefoldervaluelinks) {
		this.casefoldervaluelinks = casefoldervaluelinks;
	}
	
	
}
