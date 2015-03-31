package com.tdc.persistence.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VFdbproductsId generated by hbm2java
 */
@Embeddable
public class VFdbproductsId implements java.io.Serializable {

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
	private String productId;
	private String shortName;
	private String overlap;
	private BigDecimal productGroup;
	private String groupName;

	public VFdbproductsId() {
	}

	public VFdbproductsId(String id, BigDecimal productGroup) {
		this.id = id;
		this.productGroup = productGroup;
	}

	public VFdbproductsId(String id, String sourcesystem, Date crd, String cru,
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
			BigDecimal customerPrice, String primbusinesssphere,
			String logtrace, String productId, String shortName,
			String overlap, BigDecimal productGroup, String groupName) {
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
		this.productId = productId;
		this.shortName = shortName;
		this.overlap = overlap;
		this.productGroup = productGroup;
		this.groupName = groupName;
	}

	@Column(name = "ID", nullable = false, length = 19)
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

	@Column(name = "SOURCESYSTEM_CRD", length = 7)
	public Date getSourcesystemCrd() {
		return this.sourcesystemCrd;
	}

	public void setSourcesystemCrd(Date sourcesystemCrd) {
		this.sourcesystemCrd = sourcesystemCrd;
	}

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

	@Column(name = "SALESSTART", length = 7)
	public Date getSalesstart() {
		return this.salesstart;
	}

	public void setSalesstart(Date salesstart) {
		this.salesstart = salesstart;
	}

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

	@Column(name = "PRODUCT_ID", length = 40)
	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	@Column(name = "SHORT_NAME", length = 32)
	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	@Column(name = "OVERLAP", length = 3)
	public String getOverlap() {
		return this.overlap;
	}

	public void setOverlap(String overlap) {
		this.overlap = overlap;
	}

	@Column(name = "PRODUCT_GROUP", nullable = false, precision = 22, scale = 0)
	public BigDecimal getProductGroup() {
		return this.productGroup;
	}

	public void setProductGroup(BigDecimal productGroup) {
		this.productGroup = productGroup;
	}

	@Column(name = "GROUP_NAME", length = 50)
	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VFdbproductsId))
			return false;
		VFdbproductsId castOther = (VFdbproductsId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getSourcesystem() == castOther.getSourcesystem()) || (this
						.getSourcesystem() != null
						&& castOther.getSourcesystem() != null && this
						.getSourcesystem().equals(castOther.getSourcesystem())))
				&& ((this.getCrd() == castOther.getCrd()) || (this.getCrd() != null
						&& castOther.getCrd() != null && this.getCrd().equals(
						castOther.getCrd())))
				&& ((this.getCru() == castOther.getCru()) || (this.getCru() != null
						&& castOther.getCru() != null && this.getCru().equals(
						castOther.getCru())))
				&& ((this.getModd() == castOther.getModd()) || (this.getModd() != null
						&& castOther.getModd() != null && this.getModd()
						.equals(castOther.getModd())))
				&& ((this.getModu() == castOther.getModu()) || (this.getModu() != null
						&& castOther.getModu() != null && this.getModu()
						.equals(castOther.getModu())))
				&& ((this.getDeld() == castOther.getDeld()) || (this.getDeld() != null
						&& castOther.getDeld() != null && this.getDeld()
						.equals(castOther.getDeld())))
				&& ((this.getDelu() == castOther.getDelu()) || (this.getDelu() != null
						&& castOther.getDelu() != null && this.getDelu()
						.equals(castOther.getDelu())))
				&& ((this.getImpd() == castOther.getImpd()) || (this.getImpd() != null
						&& castOther.getImpd() != null && this.getImpd()
						.equals(castOther.getImpd())))
				&& ((this.getImpu() == castOther.getImpu()) || (this.getImpu() != null
						&& castOther.getImpu() != null && this.getImpu()
						.equals(castOther.getImpu())))
				&& ((this.getExpd() == castOther.getExpd()) || (this.getExpd() != null
						&& castOther.getExpd() != null && this.getExpd()
						.equals(castOther.getExpd())))
				&& ((this.getExpu() == castOther.getExpu()) || (this.getExpu() != null
						&& castOther.getExpu() != null && this.getExpu()
						.equals(castOther.getExpu())))
				&& ((this.getCode() == castOther.getCode()) || (this.getCode() != null
						&& castOther.getCode() != null && this.getCode()
						.equals(castOther.getCode())))
				&& ((this.getHead() == castOther.getHead()) || (this.getHead() != null
						&& castOther.getHead() != null && this.getHead()
						.equals(castOther.getHead())))
				&& ((this.getGroupCode() == castOther.getGroupCode()) || (this
						.getGroupCode() != null
						&& castOther.getGroupCode() != null && this
						.getGroupCode().equals(castOther.getGroupCode())))
				&& ((this.getGroupHead() == castOther.getGroupHead()) || (this
						.getGroupHead() != null
						&& castOther.getGroupHead() != null && this
						.getGroupHead().equals(castOther.getGroupHead())))
				&& ((this.getSourcesystemId() == castOther.getSourcesystemId()) || (this
						.getSourcesystemId() != null
						&& castOther.getSourcesystemId() != null && this
						.getSourcesystemId().equals(
								castOther.getSourcesystemId())))
				&& ((this.getSourcesystemCrd() == castOther
						.getSourcesystemCrd()) || (this.getSourcesystemCrd() != null
						&& castOther.getSourcesystemCrd() != null && this
						.getSourcesystemCrd().equals(
								castOther.getSourcesystemCrd())))
				&& ((this.getSourcesystemModd() == castOther
						.getSourcesystemModd()) || (this.getSourcesystemModd() != null
						&& castOther.getSourcesystemModd() != null && this
						.getSourcesystemModd().equals(
								castOther.getSourcesystemModd())))
				&& ((this.getProductcode() == castOther.getProductcode()) || (this
						.getProductcode() != null
						&& castOther.getProductcode() != null && this
						.getProductcode().equals(castOther.getProductcode())))
				&& ((this.getProductname() == castOther.getProductname()) || (this
						.getProductname() != null
						&& castOther.getProductname() != null && this
						.getProductname().equals(castOther.getProductname())))
				&& ((this.getProductabbreviation() == castOther
						.getProductabbreviation()) || (this
						.getProductabbreviation() != null
						&& castOther.getProductabbreviation() != null && this
						.getProductabbreviation().equals(
								castOther.getProductabbreviation())))
				&& ((this.getBasicproductcode() == castOther
						.getBasicproductcode()) || (this.getBasicproductcode() != null
						&& castOther.getBasicproductcode() != null && this
						.getBasicproductcode().equals(
								castOther.getBasicproductcode())))
				&& ((this.getDeliverycontract() == castOther
						.getDeliverycontract()) || (this.getDeliverycontract() != null
						&& castOther.getDeliverycontract() != null && this
						.getDeliverycontract().equals(
								castOther.getDeliverycontract())))
				&& ((this.getSalesstart() == castOther.getSalesstart()) || (this
						.getSalesstart() != null
						&& castOther.getSalesstart() != null && this
						.getSalesstart().equals(castOther.getSalesstart())))
				&& ((this.getSalesexpiry() == castOther.getSalesexpiry()) || (this
						.getSalesexpiry() != null
						&& castOther.getSalesexpiry() != null && this
						.getSalesexpiry().equals(castOther.getSalesexpiry())))
				&& ((this.getBusinessspherecode() == castOther
						.getBusinessspherecode()) || (this
						.getBusinessspherecode() != null
						&& castOther.getBusinessspherecode() != null && this
						.getBusinessspherecode().equals(
								castOther.getBusinessspherecode())))
				&& ((this.getProductlinecode() == castOther
						.getProductlinecode()) || (this.getProductlinecode() != null
						&& castOther.getProductlinecode() != null && this
						.getProductlinecode().equals(
								castOther.getProductlinecode())))
				&& ((this.getProductline() == castOther.getProductline()) || (this
						.getProductline() != null
						&& castOther.getProductline() != null && this
						.getProductline().equals(castOther.getProductline())))
				&& ((this.getProductgroupcode() == castOther
						.getProductgroupcode()) || (this.getProductgroupcode() != null
						&& castOther.getProductgroupcode() != null && this
						.getProductgroupcode().equals(
								castOther.getProductgroupcode())))
				&& ((this.getProductgroup() == castOther.getProductgroup()) || (this
						.getProductgroup() != null
						&& castOther.getProductgroup() != null && this
						.getProductgroup().equals(castOther.getProductgroup())))
				&& ((this.getProducttypecode() == castOther
						.getProducttypecode()) || (this.getProducttypecode() != null
						&& castOther.getProducttypecode() != null && this
						.getProducttypecode().equals(
								castOther.getProducttypecode())))
				&& ((this.getIncomeclasscode() == castOther
						.getIncomeclasscode()) || (this.getIncomeclasscode() != null
						&& castOther.getIncomeclasscode() != null && this
						.getIncomeclasscode().equals(
								castOther.getIncomeclasscode())))
				&& ((this.getIncomeclass() == castOther.getIncomeclass()) || (this
						.getIncomeclass() != null
						&& castOther.getIncomeclass() != null && this
						.getIncomeclass().equals(castOther.getIncomeclass())))
				&& ((this.getMarkedspris() == castOther.getMarkedspris()) || (this
						.getMarkedspris() != null
						&& castOther.getMarkedspris() != null && this
						.getMarkedspris().equals(castOther.getMarkedspris())))
				&& ((this.getMinimumSalesprice() == castOther
						.getMinimumSalesprice()) || (this
						.getMinimumSalesprice() != null
						&& castOther.getMinimumSalesprice() != null && this
						.getMinimumSalesprice().equals(
								castOther.getMinimumSalesprice())))
				&& ((this.getCustomerPrice() == castOther.getCustomerPrice()) || (this
						.getCustomerPrice() != null
						&& castOther.getCustomerPrice() != null && this
						.getCustomerPrice()
						.equals(castOther.getCustomerPrice())))
				&& ((this.getPrimbusinesssphere() == castOther
						.getPrimbusinesssphere()) || (this
						.getPrimbusinesssphere() != null
						&& castOther.getPrimbusinesssphere() != null && this
						.getPrimbusinesssphere().equals(
								castOther.getPrimbusinesssphere())))
				&& ((this.getLogtrace() == castOther.getLogtrace()) || (this
						.getLogtrace() != null
						&& castOther.getLogtrace() != null && this
						.getLogtrace().equals(castOther.getLogtrace())))
				&& ((this.getProductId() == castOther.getProductId()) || (this
						.getProductId() != null
						&& castOther.getProductId() != null && this
						.getProductId().equals(castOther.getProductId())))
				&& ((this.getShortName() == castOther.getShortName()) || (this
						.getShortName() != null
						&& castOther.getShortName() != null && this
						.getShortName().equals(castOther.getShortName())))
				&& ((this.getOverlap() == castOther.getOverlap()) || (this
						.getOverlap() != null && castOther.getOverlap() != null && this
						.getOverlap().equals(castOther.getOverlap())))
				&& ((this.getProductGroup() == castOther.getProductGroup()) || (this
						.getProductGroup() != null
						&& castOther.getProductGroup() != null && this
						.getProductGroup().equals(castOther.getProductGroup())))
				&& ((this.getGroupName() == castOther.getGroupName()) || (this
						.getGroupName() != null
						&& castOther.getGroupName() != null && this
						.getGroupName().equals(castOther.getGroupName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37
				* result
				+ (getSourcesystem() == null ? 0 : this.getSourcesystem()
						.hashCode());
		result = 37 * result
				+ (getCrd() == null ? 0 : this.getCrd().hashCode());
		result = 37 * result
				+ (getCru() == null ? 0 : this.getCru().hashCode());
		result = 37 * result
				+ (getModd() == null ? 0 : this.getModd().hashCode());
		result = 37 * result
				+ (getModu() == null ? 0 : this.getModu().hashCode());
		result = 37 * result
				+ (getDeld() == null ? 0 : this.getDeld().hashCode());
		result = 37 * result
				+ (getDelu() == null ? 0 : this.getDelu().hashCode());
		result = 37 * result
				+ (getImpd() == null ? 0 : this.getImpd().hashCode());
		result = 37 * result
				+ (getImpu() == null ? 0 : this.getImpu().hashCode());
		result = 37 * result
				+ (getExpd() == null ? 0 : this.getExpd().hashCode());
		result = 37 * result
				+ (getExpu() == null ? 0 : this.getExpu().hashCode());
		result = 37 * result
				+ (getCode() == null ? 0 : this.getCode().hashCode());
		result = 37 * result
				+ (getHead() == null ? 0 : this.getHead().hashCode());
		result = 37 * result
				+ (getGroupCode() == null ? 0 : this.getGroupCode().hashCode());
		result = 37 * result
				+ (getGroupHead() == null ? 0 : this.getGroupHead().hashCode());
		result = 37
				* result
				+ (getSourcesystemId() == null ? 0 : this.getSourcesystemId()
						.hashCode());
		result = 37
				* result
				+ (getSourcesystemCrd() == null ? 0 : this.getSourcesystemCrd()
						.hashCode());
		result = 37
				* result
				+ (getSourcesystemModd() == null ? 0 : this
						.getSourcesystemModd().hashCode());
		result = 37
				* result
				+ (getProductcode() == null ? 0 : this.getProductcode()
						.hashCode());
		result = 37
				* result
				+ (getProductname() == null ? 0 : this.getProductname()
						.hashCode());
		result = 37
				* result
				+ (getProductabbreviation() == null ? 0 : this
						.getProductabbreviation().hashCode());
		result = 37
				* result
				+ (getBasicproductcode() == null ? 0 : this
						.getBasicproductcode().hashCode());
		result = 37
				* result
				+ (getDeliverycontract() == null ? 0 : this
						.getDeliverycontract().hashCode());
		result = 37
				* result
				+ (getSalesstart() == null ? 0 : this.getSalesstart()
						.hashCode());
		result = 37
				* result
				+ (getSalesexpiry() == null ? 0 : this.getSalesexpiry()
						.hashCode());
		result = 37
				* result
				+ (getBusinessspherecode() == null ? 0 : this
						.getBusinessspherecode().hashCode());
		result = 37
				* result
				+ (getProductlinecode() == null ? 0 : this.getProductlinecode()
						.hashCode());
		result = 37
				* result
				+ (getProductline() == null ? 0 : this.getProductline()
						.hashCode());
		result = 37
				* result
				+ (getProductgroupcode() == null ? 0 : this
						.getProductgroupcode().hashCode());
		result = 37
				* result
				+ (getProductgroup() == null ? 0 : this.getProductgroup()
						.hashCode());
		result = 37
				* result
				+ (getProducttypecode() == null ? 0 : this.getProducttypecode()
						.hashCode());
		result = 37
				* result
				+ (getIncomeclasscode() == null ? 0 : this.getIncomeclasscode()
						.hashCode());
		result = 37
				* result
				+ (getIncomeclass() == null ? 0 : this.getIncomeclass()
						.hashCode());
		result = 37
				* result
				+ (getMarkedspris() == null ? 0 : this.getMarkedspris()
						.hashCode());
		result = 37
				* result
				+ (getMinimumSalesprice() == null ? 0 : this
						.getMinimumSalesprice().hashCode());
		result = 37
				* result
				+ (getCustomerPrice() == null ? 0 : this.getCustomerPrice()
						.hashCode());
		result = 37
				* result
				+ (getPrimbusinesssphere() == null ? 0 : this
						.getPrimbusinesssphere().hashCode());
		result = 37 * result
				+ (getLogtrace() == null ? 0 : this.getLogtrace().hashCode());
		result = 37 * result
				+ (getProductId() == null ? 0 : this.getProductId().hashCode());
		result = 37 * result
				+ (getShortName() == null ? 0 : this.getShortName().hashCode());
		result = 37 * result
				+ (getOverlap() == null ? 0 : this.getOverlap().hashCode());
		result = 37
				* result
				+ (getProductGroup() == null ? 0 : this.getProductGroup()
						.hashCode());
		result = 37 * result
				+ (getGroupName() == null ? 0 : this.getGroupName().hashCode());
		return result;
	}

}
