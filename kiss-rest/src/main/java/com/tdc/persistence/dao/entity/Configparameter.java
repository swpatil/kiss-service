package com.tdc.persistence.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

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
 * Configparameter generated by hbm2java
 */
@Entity
@Table(name = "CONFIGPARAMETER", schema = "PCRM", uniqueConstraints = @UniqueConstraint(columnNames = "ORDER_NUMBER"))
public class Configparameter implements java.io.Serializable {

	private String id;
	private Configparametertype configparametertype;
	private Date crd;
	private String infogruppe;
	private Date impt;
	private Date expt;
	private Date impd;
	private String primarysalgskoncept;
	private Date expd;
	private String infovalgt;
	private Date modt;
	private String cru;
	private Date delt;
	private Date modd;
	private String impu;
	private String expu;
	private Date deld;
	private String modu;
	private String delu;
	private String infokategori;
	private Long sortering;
	private Date crt;
	private String contentkey;
	private Character portalactive;
	private Character noselection;
	private String productparam;
	private String oldcode;
	private Date startDate;
	private Date endDate;
	private String logtrace;
	private Integer orderNumber;
	private String tooltip;
	private Character sgportal;
	private Character servicecenterportal;
	private Set<Sgiconplacement> sgiconplacements = new HashSet<Sgiconplacement>(
			0);
	private Set<Conceptconfig> conceptconfigs = new HashSet<Conceptconfig>(0);
	private Set<CrDocsection2parameter> crDocsection2parameters = new HashSet<CrDocsection2parameter>(
			0);
	private Set<Configparametertype> configparametertypes = new HashSet<Configparametertype>(
			0);

	public Configparameter() {
	}

	public Configparameter(String id) {
		this.id = id;
	}

	public Configparameter(String id, Configparametertype configparametertype,
			Date crd, String infogruppe, Date impt, Date expt, Date impd,
			String primarysalgskoncept, Date expd, String infovalgt, Date modt,
			String cru, Date delt, Date modd, String impu, String expu,
			Date deld, String modu, String delu, String infokategori,
			Long sortering, Date crt, String contentkey,
			Character portalactive, Character noselection, String productparam,
			String oldcode, Date startDate, Date endDate, String logtrace,
			Integer orderNumber, String tooltip, Character sgportal,
			Character servicecenterportal,
			Set<Sgiconplacement> sgiconplacements,
			Set<Conceptconfig> conceptconfigs,
			Set<CrDocsection2parameter> crDocsection2parameters,
			Set<Configparametertype> configparametertypes) {
		this.id = id;
		this.configparametertype = configparametertype;
		this.crd = crd;
		this.infogruppe = infogruppe;
		this.impt = impt;
		this.expt = expt;
		this.impd = impd;
		this.primarysalgskoncept = primarysalgskoncept;
		this.expd = expd;
		this.infovalgt = infovalgt;
		this.modt = modt;
		this.cru = cru;
		this.delt = delt;
		this.modd = modd;
		this.impu = impu;
		this.expu = expu;
		this.deld = deld;
		this.modu = modu;
		this.delu = delu;
		this.infokategori = infokategori;
		this.sortering = sortering;
		this.crt = crt;
		this.contentkey = contentkey;
		this.portalactive = portalactive;
		this.noselection = noselection;
		this.productparam = productparam;
		this.oldcode = oldcode;
		this.startDate = startDate;
		this.endDate = endDate;
		this.logtrace = logtrace;
		this.orderNumber = orderNumber;
		this.tooltip = tooltip;
		this.sgportal = sgportal;
		this.servicecenterportal = servicecenterportal;
		this.sgiconplacements = sgiconplacements;
		this.conceptconfigs = conceptconfigs;
		this.crDocsection2parameters = crDocsection2parameters;
		this.configparametertypes = configparametertypes;
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
	@JoinColumn(name = "PRIMINFOCAT")
	public Configparametertype getConfigparametertype() {
		return this.configparametertype;
	}

	public void setConfigparametertype(Configparametertype configparametertype) {
		this.configparametertype = configparametertype;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRD", length = 7)
	public Date getCrd() {
		return this.crd;
	}

	public void setCrd(Date crd) {
		this.crd = crd;
	}

	@Column(name = "INFOGRUPPE", length = 30)
	public String getInfogruppe() {
		return this.infogruppe;
	}

	public void setInfogruppe(String infogruppe) {
		this.infogruppe = infogruppe;
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

	@Column(name = "PRIMARYSALGSKONCEPT", length = 19)
	public String getPrimarysalgskoncept() {
		return this.primarysalgskoncept;
	}

	public void setPrimarysalgskoncept(String primarysalgskoncept) {
		this.primarysalgskoncept = primarysalgskoncept;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EXPD", length = 7)
	public Date getExpd() {
		return this.expd;
	}

	public void setExpd(Date expd) {
		this.expd = expd;
	}

	@Column(name = "INFOVALGT", length = 40)
	public String getInfovalgt() {
		return this.infovalgt;
	}

	public void setInfovalgt(String infovalgt) {
		this.infovalgt = infovalgt;
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

	@Column(name = "INFOKATEGORI", length = 30)
	public String getInfokategori() {
		return this.infokategori;
	}

	public void setInfokategori(String infokategori) {
		this.infokategori = infokategori;
	}

	@Column(name = "SORTERING", precision = 10, scale = 0)
	public Long getSortering() {
		return this.sortering;
	}

	public void setSortering(Long sortering) {
		this.sortering = sortering;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRT", length = 7)
	public Date getCrt() {
		return this.crt;
	}

	public void setCrt(Date crt) {
		this.crt = crt;
	}

	@Column(name = "CONTENTKEY", length = 64)
	public String getContentkey() {
		return this.contentkey;
	}

	public void setContentkey(String contentkey) {
		this.contentkey = contentkey;
	}

	@Column(name = "PORTALACTIVE", length = 1)
	public Character getPortalactive() {
		return this.portalactive;
	}

	public void setPortalactive(Character portalactive) {
		this.portalactive = portalactive;
	}

	@Column(name = "NOSELECTION", length = 1)
	public Character getNoselection() {
		return this.noselection;
	}

	public void setNoselection(Character noselection) {
		this.noselection = noselection;
	}

	@Column(name = "PRODUCTPARAM", length = 40)
	public String getProductparam() {
		return this.productparam;
	}

	public void setProductparam(String productparam) {
		this.productparam = productparam;
	}

	@Column(name = "OLDCODE", length = 30)
	public String getOldcode() {
		return this.oldcode;
	}

	public void setOldcode(String oldcode) {
		this.oldcode = oldcode;
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

	@Column(name = "LOGTRACE", length = 19)
	public String getLogtrace() {
		return this.logtrace;
	}

	public void setLogtrace(String logtrace) {
		this.logtrace = logtrace;
	}

	@Column(name = "ORDER_NUMBER", unique = true, precision = 5, scale = 0)
	public Integer getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	@Column(name = "TOOLTIP", length = 4000)
	public String getTooltip() {
		return this.tooltip;
	}

	public void setTooltip(String tooltip) {
		this.tooltip = tooltip;
	}

	@Column(name = "SGPORTAL", length = 1)
	public Character getSgportal() {
		return this.sgportal;
	}

	public void setSgportal(Character sgportal) {
		this.sgportal = sgportal;
	}

	@Column(name = "SERVICECENTERPORTAL", length = 1)
	public Character getServicecenterportal() {
		return this.servicecenterportal;
	}

	public void setServicecenterportal(Character servicecenterportal) {
		this.servicecenterportal = servicecenterportal;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "configparameter")
	public Set<Sgiconplacement> getSgiconplacements() {
		return this.sgiconplacements;
	}

	public void setSgiconplacements(Set<Sgiconplacement> sgiconplacements) {
		this.sgiconplacements = sgiconplacements;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "configparameter")
	public Set<Conceptconfig> getConceptconfigs() {
		return this.conceptconfigs;
	}

	public void setConceptconfigs(Set<Conceptconfig> conceptconfigs) {
		this.conceptconfigs = conceptconfigs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "configparameter")
	public Set<CrDocsection2parameter> getCrDocsection2parameters() {
		return this.crDocsection2parameters;
	}

	public void setCrDocsection2parameters(
			Set<CrDocsection2parameter> crDocsection2parameters) {
		this.crDocsection2parameters = crDocsection2parameters;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "configparameter")
	public Set<Configparametertype> getConfigparametertypes() {
		return this.configparametertypes;
	}

	public void setConfigparametertypes(
			Set<Configparametertype> configparametertypes) {
		this.configparametertypes = configparametertypes;
	}

}
