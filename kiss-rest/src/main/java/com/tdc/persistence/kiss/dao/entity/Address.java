package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.search.annotations.Analyze;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.Store;

/**
 * Address generated by hbm2java
 */
@Entity
@Table(name = "ADDRESS", schema = "PCRM", uniqueConstraints = @UniqueConstraint(columnNames = {
		"ID", "DW_ADRID", "POSTNR", "PRIMMUNICIPALITYSTREET" }))
@Indexed
public class Address implements java.io.Serializable {

	private String id;
	private Municipalitystreet municipalitystreet;
	private Date crd;
	private Date crt;
	private String cru;
	private Date modd;
	private Date modt;
	private String modu;
	private Date deld;
	private Date delt;
	private String delu;
	private Date impd;
	private Date impt;
	private String impu;
	private Date expd;
	private Date expt;
	private String expu;
	private String dwAdrid;
	private String newDwAdrid;
	private String komkod;
	private String vejkod;
	private String vejnvn;
	private String dwVejnvn;
	private String dwHusnr;
	private String dwHusnrbogstav;
	private String dwHusFritekst;
	private String etage;
	private String dwEtage;
	private String sidedoer;
	private String dwSidedoer;
	private String dwDoerFritekst;
	private String postnr;
	private String postdisttxt;
	private String dwPostdisttxt;
	private Character dwLigeUlige;
	private String sourceSystem;
	private BigDecimal commRating;
	private String dwAnlaegsnr;
	private String husnr;
	private String dwKabeltv;
	private String dwReturvej;
	private String compstr;
	private String opslagspostnr;
	private Character mailjatak;
	private Character mailnejtak;
	private Date mailjatakts;
	private Date mailnejtakts;
	private Integer returAntal;
	private Date returDato;
	private Character inrobinsonlist;
	private Character accforca;
	private Character ktasVejkode;
	private String primconzoomtype;
	private String dwStednavn;

	public Address() {
	}

	public Address(String id) {
		this.id = id;
	}

	public Address(String id, Municipalitystreet municipalitystreet, Date crd,
			Date crt, String cru, Date modd, Date modt, String modu, Date deld,
			Date delt, String delu, Date impd, Date impt, String impu,
			Date expd, Date expt, String expu, String dwAdrid,
			String newDwAdrid, String komkod, String vejkod, String vejnvn,
			String dwVejnvn, String dwHusnr, String dwHusnrbogstav,
			String dwHusFritekst, String etage, String dwEtage,
			String sidedoer, String dwSidedoer, String dwDoerFritekst,
			String postnr, String postdisttxt, String dwPostdisttxt,
			Character dwLigeUlige, String sourceSystem, BigDecimal commRating,
			String dwAnlaegsnr, String husnr, String dwKabeltv,
			String dwReturvej, String compstr, String opslagspostnr,
			Character mailjatak, Character mailnejtak, Date mailjatakts,
			Date mailnejtakts, Integer returAntal, Date returDato,
			Character inrobinsonlist, Character accforca,
			Character ktasVejkode, String primconzoomtype, String dwStednavn) {
		this.id = id;
		this.municipalitystreet = municipalitystreet;
		this.crd = crd;
		this.crt = crt;
		this.cru = cru;
		this.modd = modd;
		this.modt = modt;
		this.modu = modu;
		this.deld = deld;
		this.delt = delt;
		this.delu = delu;
		this.impd = impd;
		this.impt = impt;
		this.impu = impu;
		this.expd = expd;
		this.expt = expt;
		this.expu = expu;
		this.dwAdrid = dwAdrid;
		this.newDwAdrid = newDwAdrid;
		this.komkod = komkod;
		this.vejkod = vejkod;
		this.vejnvn = vejnvn;
		this.dwVejnvn = dwVejnvn;
		this.dwHusnr = dwHusnr;
		this.dwHusnrbogstav = dwHusnrbogstav;
		this.dwHusFritekst = dwHusFritekst;
		this.etage = etage;
		this.dwEtage = dwEtage;
		this.sidedoer = sidedoer;
		this.dwSidedoer = dwSidedoer;
		this.dwDoerFritekst = dwDoerFritekst;
		this.postnr = postnr;
		this.postdisttxt = postdisttxt;
		this.dwPostdisttxt = dwPostdisttxt;
		this.dwLigeUlige = dwLigeUlige;
		this.sourceSystem = sourceSystem;
		this.commRating = commRating;
		this.dwAnlaegsnr = dwAnlaegsnr;
		this.husnr = husnr;
		this.dwKabeltv = dwKabeltv;
		this.dwReturvej = dwReturvej;
		this.compstr = compstr;
		this.opslagspostnr = opslagspostnr;
		this.mailjatak = mailjatak;
		this.mailnejtak = mailnejtak;
		this.mailjatakts = mailjatakts;
		this.mailnejtakts = mailnejtakts;
		this.returAntal = returAntal;
		this.returDato = returDato;
		this.inrobinsonlist = inrobinsonlist;
		this.accforca = accforca;
		this.ktasVejkode = ktasVejkode;
		this.primconzoomtype = primconzoomtype;
		this.dwStednavn = dwStednavn;
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
	@JoinColumn(name = "PRIMMUNICIPALITYSTREET")
	public Municipalitystreet getMunicipalitystreet() {
		return this.municipalitystreet;
	}

	public void setMunicipalitystreet(Municipalitystreet municipalitystreet) {
		this.municipalitystreet = municipalitystreet;
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
	@Column(name = "CRT", length = 7)
	public Date getCrt() {
		return this.crt;
	}

	public void setCrt(Date crt) {
		this.crt = crt;
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

	@Temporal(TemporalType.DATE)
	@Column(name = "MODT", length = 7)
	public Date getModt() {
		return this.modt;
	}

	public void setModt(Date modt) {
		this.modt = modt;
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

	@Temporal(TemporalType.DATE)
	@Column(name = "DELT", length = 7)
	public Date getDelt() {
		return this.delt;
	}

	public void setDelt(Date delt) {
		this.delt = delt;
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

	@Temporal(TemporalType.DATE)
	@Column(name = "IMPT", length = 7)
	public Date getImpt() {
		return this.impt;
	}

	public void setImpt(Date impt) {
		this.impt = impt;
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

	@Temporal(TemporalType.DATE)
	@Column(name = "EXPT", length = 7)
	public Date getExpt() {
		return this.expt;
	}

	public void setExpt(Date expt) {
		this.expt = expt;
	}

	@Column(name = "EXPU", length = 19)
	public String getExpu() {
		return this.expu;
	}

	public void setExpu(String expu) {
		this.expu = expu;
	}

	@Column(name = "DW_ADRID", length = 22)
	public String getDwAdrid() {
		return this.dwAdrid;
	}

	public void setDwAdrid(String dwAdrid) {
		this.dwAdrid = dwAdrid;
	}

	@Column(name = "NEW_DW_ADRID", length = 32)
	public String getNewDwAdrid() {
		return this.newDwAdrid;
	}

	public void setNewDwAdrid(String newDwAdrid) {
		this.newDwAdrid = newDwAdrid;
	}

	@Column(name = "KOMKOD", length = 4)
	public String getKomkod() {
		return this.komkod;
	}

	public void setKomkod(String komkod) {
		this.komkod = komkod;
	}

	@Column(name = "VEJKOD", length = 4)
	public String getVejkod() {
		return this.vejkod;
	}

	public void setVejkod(String vejkod) {
		this.vejkod = vejkod;
	}

	@Column(name = "VEJNVN", length = 40)
	public String getVejnvn() {
		return this.vejnvn;
	}

	public void setVejnvn(String vejnvn) {
		this.vejnvn = vejnvn;
	}

	@Column(name = "DW_VEJNVN", length = 40)
	public String getDwVejnvn() {
		return this.dwVejnvn;
	}

	public void setDwVejnvn(String dwVejnvn) {
		this.dwVejnvn = dwVejnvn;
	}

	@Column(name = "DW_HUSNR", length = 3)
	public String getDwHusnr() {
		return this.dwHusnr;
	}

	public void setDwHusnr(String dwHusnr) {
		this.dwHusnr = dwHusnr;
	}

	@Column(name = "DW_HUSNRBOGSTAV", length = 1)
	public String getDwHusnrbogstav() {
		return this.dwHusnrbogstav;
	}

	public void setDwHusnrbogstav(String dwHusnrbogstav) {
		this.dwHusnrbogstav = dwHusnrbogstav;
	}

	@Column(name = "DW_HUS_FRITEKST", length = 40)
	public String getDwHusFritekst() {
		return this.dwHusFritekst;
	}

	public void setDwHusFritekst(String dwHusFritekst) {
		this.dwHusFritekst = dwHusFritekst;
	}

	@Column(name = "ETAGE", length = 2)
	public String getEtage() {
		return this.etage;
	}

	public void setEtage(String etage) {
		this.etage = etage;
	}

	@Column(name = "DW_ETAGE", length = 2)
	public String getDwEtage() {
		return this.dwEtage;
	}

	public void setDwEtage(String dwEtage) {
		this.dwEtage = dwEtage;
	}

	@Column(name = "SIDEDOER", length = 10)
	public String getSidedoer() {
		return this.sidedoer;
	}

	public void setSidedoer(String sidedoer) {
		this.sidedoer = sidedoer;
	}

	@Column(name = "DW_SIDEDOER", length = 10)
	public String getDwSidedoer() {
		return this.dwSidedoer;
	}

	public void setDwSidedoer(String dwSidedoer) {
		this.dwSidedoer = dwSidedoer;
	}

	@Column(name = "DW_DOER_FRITEKST", length = 40)
	public String getDwDoerFritekst() {
		return this.dwDoerFritekst;
	}

	public void setDwDoerFritekst(String dwDoerFritekst) {
		this.dwDoerFritekst = dwDoerFritekst;
	}

	@Column(name = "POSTNR", length = 4)
	@Field(index=Index.YES, analyze=Analyze.YES, store=Store.NO)
	public String getPostnr() {
		return this.postnr;
	}

	public void setPostnr(String postnr) {
		this.postnr = postnr;
	}

	@Column(name = "POSTDISTTXT", length = 30)
	public String getPostdisttxt() {
		return this.postdisttxt;
	}

	public void setPostdisttxt(String postdisttxt) {
		this.postdisttxt = postdisttxt;
	}

	@Column(name = "DW_POSTDISTTXT", length = 30)
	public String getDwPostdisttxt() {
		return this.dwPostdisttxt;
	}

	public void setDwPostdisttxt(String dwPostdisttxt) {
		this.dwPostdisttxt = dwPostdisttxt;
	}

	@Column(name = "DW_LIGE_ULIGE", length = 1)
	public Character getDwLigeUlige() {
		return this.dwLigeUlige;
	}

	public void setDwLigeUlige(Character dwLigeUlige) {
		this.dwLigeUlige = dwLigeUlige;
	}

	@Column(name = "SOURCE_SYSTEM", length = 5)
	public String getSourceSystem() {
		return this.sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	@Column(name = "COMM_RATING", precision = 22, scale = 0)
	public BigDecimal getCommRating() {
		return this.commRating;
	}

	public void setCommRating(BigDecimal commRating) {
		this.commRating = commRating;
	}

	@Column(name = "DW_ANLAEGSNR", length = 10)
	public String getDwAnlaegsnr() {
		return this.dwAnlaegsnr;
	}

	public void setDwAnlaegsnr(String dwAnlaegsnr) {
		this.dwAnlaegsnr = dwAnlaegsnr;
	}

	@Column(name = "HUSNR", length = 4)
	public String getHusnr() {
		return this.husnr;
	}

	public void setHusnr(String husnr) {
		this.husnr = husnr;
	}

	@Column(name = "DW_KABELTV", length = 1)
	public String getDwKabeltv() {
		return this.dwKabeltv;
	}

	public void setDwKabeltv(String dwKabeltv) {
		this.dwKabeltv = dwKabeltv;
	}

	@Column(name = "DW_RETURVEJ", length = 1)
	public String getDwReturvej() {
		return this.dwReturvej;
	}

	public void setDwReturvej(String dwReturvej) {
		this.dwReturvej = dwReturvej;
	}

	@Column(name = "COMPSTR", length = 18)
	public String getCompstr() {
		return this.compstr;
	}

	public void setCompstr(String compstr) {
		this.compstr = compstr;
	}

	@Column(name = "OPSLAGSPOSTNR", length = 4)
	public String getOpslagspostnr() {
		return this.opslagspostnr;
	}

	public void setOpslagspostnr(String opslagspostnr) {
		this.opslagspostnr = opslagspostnr;
	}

	@Column(name = "MAILJATAK", length = 1)
	public Character getMailjatak() {
		return this.mailjatak;
	}

	public void setMailjatak(Character mailjatak) {
		this.mailjatak = mailjatak;
	}

	@Column(name = "MAILNEJTAK", length = 1)
	public Character getMailnejtak() {
		return this.mailnejtak;
	}

	public void setMailnejtak(Character mailnejtak) {
		this.mailnejtak = mailnejtak;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "MAILJATAKTS", length = 7)
	public Date getMailjatakts() {
		return this.mailjatakts;
	}

	public void setMailjatakts(Date mailjatakts) {
		this.mailjatakts = mailjatakts;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "MAILNEJTAKTS", length = 7)
	public Date getMailnejtakts() {
		return this.mailnejtakts;
	}

	public void setMailnejtakts(Date mailnejtakts) {
		this.mailnejtakts = mailnejtakts;
	}

	@Column(name = "RETUR_ANTAL", precision = 5, scale = 0)
	public Integer getReturAntal() {
		return this.returAntal;
	}

	public void setReturAntal(Integer returAntal) {
		this.returAntal = returAntal;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "RETUR_DATO", length = 7)
	public Date getReturDato() {
		return this.returDato;
	}

	public void setReturDato(Date returDato) {
		this.returDato = returDato;
	}

	@Column(name = "INROBINSONLIST", length = 1)
	public Character getInrobinsonlist() {
		return this.inrobinsonlist;
	}

	public void setInrobinsonlist(Character inrobinsonlist) {
		this.inrobinsonlist = inrobinsonlist;
	}

	@Column(name = "ACCFORCA", length = 1)
	public Character getAccforca() {
		return this.accforca;
	}

	public void setAccforca(Character accforca) {
		this.accforca = accforca;
	}

	@Column(name = "KTAS_VEJKODE", length = 1)
	public Character getKtasVejkode() {
		return this.ktasVejkode;
	}

	public void setKtasVejkode(Character ktasVejkode) {
		this.ktasVejkode = ktasVejkode;
	}

	@Column(name = "PRIMCONZOOMTYPE", length = 19)
	public String getPrimconzoomtype() {
		return this.primconzoomtype;
	}

	public void setPrimconzoomtype(String primconzoomtype) {
		this.primconzoomtype = primconzoomtype;
	}

	@Column(name = "DW_STEDNAVN", length = 50)
	public String getDwStednavn() {
		return this.dwStednavn;
	}

	public void setDwStednavn(String dwStednavn) {
		this.dwStednavn = dwStednavn;
	}

}
