package com.tdc.persistence.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Businesssphere generated by hbm2java
 */
@Entity
@Table(name = "BUSINESSSPHERE", schema = "PCRM", uniqueConstraints = @UniqueConstraint(columnNames = "ORDER_NUMBER"))
public class Businesssphere implements java.io.Serializable {

	private String id;
	private Date crd;
	private String cru;
	private Date modd;
	private String modu;
	private Date impd;
	private String impu;
	private Date expd;
	private String expu;
	private String code;
	private String head;
	private Date invalidated;
	private Date startDate;
	private Date endDate;
	private String logtrace;
	private Short placementX;
	private Short placementY;
	private Byte width;
	private Integer orderNumber;
	private String assetReference;
	private String urlReference;
	private Character portalActive;
	private String tooltip;
	private Character sgportal;

	public Businesssphere() {
	}

	public Businesssphere(String id) {
		this.id = id;
	}

	public Businesssphere(String id, Date crd, String cru, Date modd,
			String modu, Date impd, String impu, Date expd, String expu,
			String code, String head, Date invalidated, Date startDate,
			Date endDate, String logtrace, Short placementX, Short placementY,
			Byte width, Integer orderNumber, String assetReference,
			String urlReference, Character portalActive, String tooltip,
			Character sgportal) {
		this.id = id;
		this.crd = crd;
		this.cru = cru;
		this.modd = modd;
		this.modu = modu;
		this.impd = impd;
		this.impu = impu;
		this.expd = expd;
		this.expu = expu;
		this.code = code;
		this.head = head;
		this.invalidated = invalidated;
		this.startDate = startDate;
		this.endDate = endDate;
		this.logtrace = logtrace;
		this.placementX = placementX;
		this.placementY = placementY;
		this.width = width;
		this.orderNumber = orderNumber;
		this.assetReference = assetReference;
		this.urlReference = urlReference;
		this.portalActive = portalActive;
		this.tooltip = tooltip;
		this.sgportal = sgportal;
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

	@Temporal(TemporalType.DATE)
	@Column(name = "INVALIDATED", length = 7)
	public Date getInvalidated() {
		return this.invalidated;
	}

	public void setInvalidated(Date invalidated) {
		this.invalidated = invalidated;
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

	@Column(name = "PLACEMENT_X", precision = 3, scale = 0)
	public Short getPlacementX() {
		return this.placementX;
	}

	public void setPlacementX(Short placementX) {
		this.placementX = placementX;
	}

	@Column(name = "PLACEMENT_Y", precision = 3, scale = 0)
	public Short getPlacementY() {
		return this.placementY;
	}

	public void setPlacementY(Short placementY) {
		this.placementY = placementY;
	}

	@Column(name = "WIDTH", precision = 2, scale = 0)
	public Byte getWidth() {
		return this.width;
	}

	public void setWidth(Byte width) {
		this.width = width;
	}

	@Column(name = "ORDER_NUMBER", unique = true, precision = 5, scale = 0)
	public Integer getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	@Column(name = "ASSET_REFERENCE")
	public String getAssetReference() {
		return this.assetReference;
	}

	public void setAssetReference(String assetReference) {
		this.assetReference = assetReference;
	}

	@Column(name = "URL_REFERENCE")
	public String getUrlReference() {
		return this.urlReference;
	}

	public void setUrlReference(String urlReference) {
		this.urlReference = urlReference;
	}

	@Column(name = "PORTAL_ACTIVE", length = 1)
	public Character getPortalActive() {
		return this.portalActive;
	}

	public void setPortalActive(Character portalActive) {
		this.portalActive = portalActive;
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

}
