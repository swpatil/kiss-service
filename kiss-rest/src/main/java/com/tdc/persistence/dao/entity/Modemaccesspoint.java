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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Modemaccesspoint generated by hbm2java
 */
@Entity
@Table(name = "MODEMACCESSPOINT", schema = "PCRM")
public class Modemaccesspoint implements java.io.Serializable {

	private String id;
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
	private String primanlxg;
	private String primpct;
	private String primfaptype;
	private String primextaccount;
	private BigDecimal abnLxbenummer;
	private String abnModtager;
	private String abnVarenummer;
	private Short abnAktiv;
	private String abnModemid;
	private Date abnDatooprettet;
	private Date abnDatoopsagt;
	private Date abnFaktureringStart;
	private Date abnFaktureringSlut;
	private BigDecimal abnTypegruppe;
	private BigDecimal abnAbontype;
	private BigDecimal abnAntal;
	private String code;
	private String head;
	private String faplocation;
	private Date onlinedate;
	private String fapStr01;
	private String fapStr02;
	private String fapStr03;
	private BigDecimal fapNum01;
	private BigDecimal fapNum02;
	private BigDecimal fapNum03;
	private Character fapBool01;
	private Character fapBool02;
	private Character fapBool03;
	private Date fapTs01;
	private Date fapTs02;
	private Date fapTs03;
	private Set<Addressitem> addressitems = new HashSet<Addressitem>(0);

	public Modemaccesspoint() {
	}

	public Modemaccesspoint(String id) {
		this.id = id;
	}

	public Modemaccesspoint(String id, Date crd, Date crt, String cru,
			Date modd, Date modt, String modu, Date deld, Date delt,
			String delu, Date impd, Date impt, String impu, Date expd,
			Date expt, String expu, String primanlxg, String primpct,
			String primfaptype, String primextaccount,
			BigDecimal abnLxbenummer, String abnModtager, String abnVarenummer,
			Short abnAktiv, String abnModemid, Date abnDatooprettet,
			Date abnDatoopsagt, Date abnFaktureringStart,
			Date abnFaktureringSlut, BigDecimal abnTypegruppe,
			BigDecimal abnAbontype, BigDecimal abnAntal, String code,
			String head, String faplocation, Date onlinedate, String fapStr01,
			String fapStr02, String fapStr03, BigDecimal fapNum01,
			BigDecimal fapNum02, BigDecimal fapNum03, Character fapBool01,
			Character fapBool02, Character fapBool03, Date fapTs01,
			Date fapTs02, Date fapTs03, Set<Addressitem> addressitems) {
		this.id = id;
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
		this.primanlxg = primanlxg;
		this.primpct = primpct;
		this.primfaptype = primfaptype;
		this.primextaccount = primextaccount;
		this.abnLxbenummer = abnLxbenummer;
		this.abnModtager = abnModtager;
		this.abnVarenummer = abnVarenummer;
		this.abnAktiv = abnAktiv;
		this.abnModemid = abnModemid;
		this.abnDatooprettet = abnDatooprettet;
		this.abnDatoopsagt = abnDatoopsagt;
		this.abnFaktureringStart = abnFaktureringStart;
		this.abnFaktureringSlut = abnFaktureringSlut;
		this.abnTypegruppe = abnTypegruppe;
		this.abnAbontype = abnAbontype;
		this.abnAntal = abnAntal;
		this.code = code;
		this.head = head;
		this.faplocation = faplocation;
		this.onlinedate = onlinedate;
		this.fapStr01 = fapStr01;
		this.fapStr02 = fapStr02;
		this.fapStr03 = fapStr03;
		this.fapNum01 = fapNum01;
		this.fapNum02 = fapNum02;
		this.fapNum03 = fapNum03;
		this.fapBool01 = fapBool01;
		this.fapBool02 = fapBool02;
		this.fapBool03 = fapBool03;
		this.fapTs01 = fapTs01;
		this.fapTs02 = fapTs02;
		this.fapTs03 = fapTs03;
		this.addressitems = addressitems;
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

	@Column(name = "PRIMANLXG", length = 19)
	public String getPrimanlxg() {
		return this.primanlxg;
	}

	public void setPrimanlxg(String primanlxg) {
		this.primanlxg = primanlxg;
	}

	@Column(name = "PRIMPCT", length = 19)
	public String getPrimpct() {
		return this.primpct;
	}

	public void setPrimpct(String primpct) {
		this.primpct = primpct;
	}

	@Column(name = "PRIMFAPTYPE", length = 19)
	public String getPrimfaptype() {
		return this.primfaptype;
	}

	public void setPrimfaptype(String primfaptype) {
		this.primfaptype = primfaptype;
	}

	@Column(name = "PRIMEXTACCOUNT", length = 19)
	public String getPrimextaccount() {
		return this.primextaccount;
	}

	public void setPrimextaccount(String primextaccount) {
		this.primextaccount = primextaccount;
	}

	@Column(name = "ABN_LXBENUMMER", precision = 22, scale = 0)
	public BigDecimal getAbnLxbenummer() {
		return this.abnLxbenummer;
	}

	public void setAbnLxbenummer(BigDecimal abnLxbenummer) {
		this.abnLxbenummer = abnLxbenummer;
	}

	@Column(name = "ABN_MODTAGER", length = 10)
	public String getAbnModtager() {
		return this.abnModtager;
	}

	public void setAbnModtager(String abnModtager) {
		this.abnModtager = abnModtager;
	}

	@Column(name = "ABN_VARENUMMER", length = 20)
	public String getAbnVarenummer() {
		return this.abnVarenummer;
	}

	public void setAbnVarenummer(String abnVarenummer) {
		this.abnVarenummer = abnVarenummer;
	}

	@Column(name = "ABN_AKTIV", precision = 3, scale = 0)
	public Short getAbnAktiv() {
		return this.abnAktiv;
	}

	public void setAbnAktiv(Short abnAktiv) {
		this.abnAktiv = abnAktiv;
	}

	@Column(name = "ABN_MODEMID", length = 10)
	public String getAbnModemid() {
		return this.abnModemid;
	}

	public void setAbnModemid(String abnModemid) {
		this.abnModemid = abnModemid;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ABN_DATOOPRETTET", length = 7)
	public Date getAbnDatooprettet() {
		return this.abnDatooprettet;
	}

	public void setAbnDatooprettet(Date abnDatooprettet) {
		this.abnDatooprettet = abnDatooprettet;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ABN_DATOOPSAGT", length = 7)
	public Date getAbnDatoopsagt() {
		return this.abnDatoopsagt;
	}

	public void setAbnDatoopsagt(Date abnDatoopsagt) {
		this.abnDatoopsagt = abnDatoopsagt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ABN_FAKTURERING_START", length = 7)
	public Date getAbnFaktureringStart() {
		return this.abnFaktureringStart;
	}

	public void setAbnFaktureringStart(Date abnFaktureringStart) {
		this.abnFaktureringStart = abnFaktureringStart;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ABN_FAKTURERING_SLUT", length = 7)
	public Date getAbnFaktureringSlut() {
		return this.abnFaktureringSlut;
	}

	public void setAbnFaktureringSlut(Date abnFaktureringSlut) {
		this.abnFaktureringSlut = abnFaktureringSlut;
	}

	@Column(name = "ABN_TYPEGRUPPE", precision = 22, scale = 0)
	public BigDecimal getAbnTypegruppe() {
		return this.abnTypegruppe;
	}

	public void setAbnTypegruppe(BigDecimal abnTypegruppe) {
		this.abnTypegruppe = abnTypegruppe;
	}

	@Column(name = "ABN_ABONTYPE", precision = 22, scale = 0)
	public BigDecimal getAbnAbontype() {
		return this.abnAbontype;
	}

	public void setAbnAbontype(BigDecimal abnAbontype) {
		this.abnAbontype = abnAbontype;
	}

	@Column(name = "ABN_ANTAL", precision = 22, scale = 0)
	public BigDecimal getAbnAntal() {
		return this.abnAntal;
	}

	public void setAbnAntal(BigDecimal abnAntal) {
		this.abnAntal = abnAntal;
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

	@Column(name = "FAPLOCATION")
	public String getFaplocation() {
		return this.faplocation;
	}

	public void setFaplocation(String faplocation) {
		this.faplocation = faplocation;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ONLINEDATE", length = 7)
	public Date getOnlinedate() {
		return this.onlinedate;
	}

	public void setOnlinedate(Date onlinedate) {
		this.onlinedate = onlinedate;
	}

	@Column(name = "FAP_STR01")
	public String getFapStr01() {
		return this.fapStr01;
	}

	public void setFapStr01(String fapStr01) {
		this.fapStr01 = fapStr01;
	}

	@Column(name = "FAP_STR02")
	public String getFapStr02() {
		return this.fapStr02;
	}

	public void setFapStr02(String fapStr02) {
		this.fapStr02 = fapStr02;
	}

	@Column(name = "FAP_STR03")
	public String getFapStr03() {
		return this.fapStr03;
	}

	public void setFapStr03(String fapStr03) {
		this.fapStr03 = fapStr03;
	}

	@Column(name = "FAP_NUM01", precision = 12)
	public BigDecimal getFapNum01() {
		return this.fapNum01;
	}

	public void setFapNum01(BigDecimal fapNum01) {
		this.fapNum01 = fapNum01;
	}

	@Column(name = "FAP_NUM02", precision = 12)
	public BigDecimal getFapNum02() {
		return this.fapNum02;
	}

	public void setFapNum02(BigDecimal fapNum02) {
		this.fapNum02 = fapNum02;
	}

	@Column(name = "FAP_NUM03", precision = 12)
	public BigDecimal getFapNum03() {
		return this.fapNum03;
	}

	public void setFapNum03(BigDecimal fapNum03) {
		this.fapNum03 = fapNum03;
	}

	@Column(name = "FAP_BOOL01", length = 1)
	public Character getFapBool01() {
		return this.fapBool01;
	}

	public void setFapBool01(Character fapBool01) {
		this.fapBool01 = fapBool01;
	}

	@Column(name = "FAP_BOOL02", length = 1)
	public Character getFapBool02() {
		return this.fapBool02;
	}

	public void setFapBool02(Character fapBool02) {
		this.fapBool02 = fapBool02;
	}

	@Column(name = "FAP_BOOL03", length = 1)
	public Character getFapBool03() {
		return this.fapBool03;
	}

	public void setFapBool03(Character fapBool03) {
		this.fapBool03 = fapBool03;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "FAP_TS01", length = 7)
	public Date getFapTs01() {
		return this.fapTs01;
	}

	public void setFapTs01(Date fapTs01) {
		this.fapTs01 = fapTs01;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "FAP_TS02", length = 7)
	public Date getFapTs02() {
		return this.fapTs02;
	}

	public void setFapTs02(Date fapTs02) {
		this.fapTs02 = fapTs02;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "FAP_TS03", length = 7)
	public Date getFapTs03() {
		return this.fapTs03;
	}

	public void setFapTs03(Date fapTs03) {
		this.fapTs03 = fapTs03;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "modemaccesspoint")
	public Set<Addressitem> getAddressitems() {
		return this.addressitems;
	}

	public void setAddressitems(Set<Addressitem> addressitems) {
		this.addressitems = addressitems;
	}

}
