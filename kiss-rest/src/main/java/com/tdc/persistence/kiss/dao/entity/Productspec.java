package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Productspec generated by hbm2java
 */
@Entity
@Table(name = "PRODUCTSPEC", schema = "PCRM")
public class Productspec implements java.io.Serializable {

	private String id;
	private String sourcesystem;
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
	private String groupCode;
	private String groupHead;
	private String sourcesystemId;
	private Date sourcesystemCrd;
	private Date sourcesystemModd;
	private String productcode;
	private String productname;
	private String productabbreviation;
	private String basicproductcode;
	private String deliverycontract;
	private Date salesstart;
	private Date salesexpiry;
	private String businessspherecode;
	private String productlinecode;
	private String productline;
	private String productgroupcode;
	private String productgroup;
	private String producttypecode;
	private String incomeclasscode;
	private String incomeclass;
	private BigDecimal markedspris;
	private BigDecimal minimumSalesprice;
	private BigDecimal customerPrice;
	private String primbusinesssphere;
	private String logtrace;

	public Productspec() {
	}

	public Productspec(String id) {
		this.id = id;
	}

	public Productspec(String id, String sourcesystem, Date crd, String cru,
			Date modd, String modu, Date deld, String delu, Date impd,
			String impu, Date expd, String expu, String code, String head,
			String groupCode, String groupHead, String sourcesystemId,
			Date sourcesystemCrd, Date sourcesystemModd, String productcode,
			String productname, String productabbreviation,
			String basicproductcode, String deliverycontract, Date salesstart,
			Date salesexpiry, String businessspherecode,
			String productlinecode, String productline,
			String productgroupcode, String productgroup,
			String producttypecode, String incomeclasscode, String incomeclass,
			BigDecimal markedspris, BigDecimal minimumSalesprice,
			BigDecimal customerPrice, String primbusinesssphere, String logtrace) {
		this.id = id;
		this.sourcesystem = sourcesystem;
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
		this.groupCode = groupCode;
		this.groupHead = groupHead;
		this.sourcesystemId = sourcesystemId;
		this.sourcesystemCrd = sourcesystemCrd;
		this.sourcesystemModd = sourcesystemModd;
		this.productcode = productcode;
		this.productname = productname;
		this.productabbreviation = productabbreviation;
		this.basicproductcode = basicproductcode;
		this.deliverycontract = deliverycontract;
		this.salesstart = salesstart;
		this.salesexpiry = salesexpiry;
		this.businessspherecode = businessspherecode;
		this.productlinecode = productlinecode;
		this.productline = productline;
		this.productgroupcode = productgroupcode;
		this.productgroup = productgroup;
		this.producttypecode = producttypecode;
		this.incomeclasscode = incomeclasscode;
		this.incomeclass = incomeclass;
		this.markedspris = markedspris;
		this.minimumSalesprice = minimumSalesprice;
		this.customerPrice = customerPrice;
		this.primbusinesssphere = primbusinesssphere;
		this.logtrace = logtrace;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 19)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "SOURCESYSTEM", length = 15)
	public String getSourcesystem() {
		return this.sourcesystem;
	}

	public void setSourcesystem(String sourcesystem) {
		this.sourcesystem = sourcesystem;
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

	@Column(name = "GROUP_CODE", length = 50)
	public String getGroupCode() {
		return this.groupCode;
	}

	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	@Column(name = "GROUP_HEAD")
	public String getGroupHead() {
		return this.groupHead;
	}

	public void setGroupHead(String groupHead) {
		this.groupHead = groupHead;
	}

	@Column(name = "SOURCESYSTEM_ID", length = 19)
	public String getSourcesystemId() {
		return this.sourcesystemId;
	}

	public void setSourcesystemId(String sourcesystemId) {
		this.sourcesystemId = sourcesystemId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SOURCESYSTEM_CRD", length = 7)
	public Date getSourcesystemCrd() {
		return this.sourcesystemCrd;
	}

	public void setSourcesystemCrd(Date sourcesystemCrd) {
		this.sourcesystemCrd = sourcesystemCrd;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SOURCESYSTEM_MODD", length = 7)
	public Date getSourcesystemModd() {
		return this.sourcesystemModd;
	}

	public void setSourcesystemModd(Date sourcesystemModd) {
		this.sourcesystemModd = sourcesystemModd;
	}

	@Column(name = "PRODUCTCODE", length = 50)
	public String getProductcode() {
		return this.productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	@Column(name = "PRODUCTNAME")
	public String getProductname() {
		return this.productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	@Column(name = "PRODUCTABBREVIATION", length = 50)
	public String getProductabbreviation() {
		return this.productabbreviation;
	}

	public void setProductabbreviation(String productabbreviation) {
		this.productabbreviation = productabbreviation;
	}

	@Column(name = "BASICPRODUCTCODE", length = 50)
	public String getBasicproductcode() {
		return this.basicproductcode;
	}

	public void setBasicproductcode(String basicproductcode) {
		this.basicproductcode = basicproductcode;
	}

	@Column(name = "DELIVERYCONTRACT", length = 5)
	public String getDeliverycontract() {
		return this.deliverycontract;
	}

	public void setDeliverycontract(String deliverycontract) {
		this.deliverycontract = deliverycontract;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SALESSTART", length = 7)
	public Date getSalesstart() {
		return this.salesstart;
	}

	public void setSalesstart(Date salesstart) {
		this.salesstart = salesstart;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SALESEXPIRY", length = 7)
	public Date getSalesexpiry() {
		return this.salesexpiry;
	}

	public void setSalesexpiry(Date salesexpiry) {
		this.salesexpiry = salesexpiry;
	}

	@Column(name = "BUSINESSSPHERECODE", length = 15)
	public String getBusinessspherecode() {
		return this.businessspherecode;
	}

	public void setBusinessspherecode(String businessspherecode) {
		this.businessspherecode = businessspherecode;
	}

	@Column(name = "PRODUCTLINECODE", length = 15)
	public String getProductlinecode() {
		return this.productlinecode;
	}

	public void setProductlinecode(String productlinecode) {
		this.productlinecode = productlinecode;
	}

	@Column(name = "PRODUCTLINE")
	public String getProductline() {
		return this.productline;
	}

	public void setProductline(String productline) {
		this.productline = productline;
	}

	@Column(name = "PRODUCTGROUPCODE", length = 15)
	public String getProductgroupcode() {
		return this.productgroupcode;
	}

	public void setProductgroupcode(String productgroupcode) {
		this.productgroupcode = productgroupcode;
	}

	@Column(name = "PRODUCTGROUP")
	public String getProductgroup() {
		return this.productgroup;
	}

	public void setProductgroup(String productgroup) {
		this.productgroup = productgroup;
	}

	@Column(name = "PRODUCTTYPECODE", length = 15)
	public String getProducttypecode() {
		return this.producttypecode;
	}

	public void setProducttypecode(String producttypecode) {
		this.producttypecode = producttypecode;
	}

	@Column(name = "INCOMECLASSCODE", length = 15)
	public String getIncomeclasscode() {
		return this.incomeclasscode;
	}

	public void setIncomeclasscode(String incomeclasscode) {
		this.incomeclasscode = incomeclasscode;
	}

	@Column(name = "INCOMECLASS")
	public String getIncomeclass() {
		return this.incomeclass;
	}

	public void setIncomeclass(String incomeclass) {
		this.incomeclass = incomeclass;
	}

	@Column(name = "MARKEDSPRIS", precision = 10)
	public BigDecimal getMarkedspris() {
		return this.markedspris;
	}

	public void setMarkedspris(BigDecimal markedspris) {
		this.markedspris = markedspris;
	}

	@Column(name = "MINIMUM_SALESPRICE", precision = 10)
	public BigDecimal getMinimumSalesprice() {
		return this.minimumSalesprice;
	}

	public void setMinimumSalesprice(BigDecimal minimumSalesprice) {
		this.minimumSalesprice = minimumSalesprice;
	}

	@Column(name = "CUSTOMER_PRICE", precision = 10)
	public BigDecimal getCustomerPrice() {
		return this.customerPrice;
	}

	public void setCustomerPrice(BigDecimal customerPrice) {
		this.customerPrice = customerPrice;
	}

	@Column(name = "PRIMBUSINESSSPHERE", length = 15)
	public String getPrimbusinesssphere() {
		return this.primbusinesssphere;
	}

	public void setPrimbusinesssphere(String primbusinesssphere) {
		this.primbusinesssphere = primbusinesssphere;
	}

	@Column(name = "LOGTRACE", length = 19)
	public String getLogtrace() {
		return this.logtrace;
	}

	public void setLogtrace(String logtrace) {
		this.logtrace = logtrace;
	}

}
