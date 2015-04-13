package com.tdc.persistence.ams.dao.entity;

// Generated 09-04-2015 18:59:20 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Addresses generated by hbm2java
 */
@Entity
@Table(name = "ADDRESSES", schema = "AMS")
public class Addresses implements java.io.Serializable {

	private AddressesId id;
	private Streets streets;
	private AccessClasses accessClassesByAccessClass;
	private AccessOrigin accessOrigin;
	private UnitOrigin unitOrigin;
	private AccessClasses accessClassesByUserAccessClass;
	private String houseno;
	private String floor;
	private String door;
	private String placename;
	private String postalcode;
	private Long propertyidBbr;
	private Long propertyidEsr;
	private String zapKvhX;
	private Integer bbrUse;
	private Integer coordQ;
	private Long coordX;
	private Long coordY;
	private BigDecimal latitude;
	private BigDecimal longitude;
	private String source;
	private Boolean zapFictive;
	private Date enddate;
	private String initials;
	private Long transferredToAddressId;
	private Date createddate;

	public Addresses() {
	}

	public Addresses(AddressesId id, Streets streets,
			AccessClasses accessClassesByAccessClass, String source,
			String initials, Date createddate) {
		this.id = id;
		this.streets = streets;
		this.accessClassesByAccessClass = accessClassesByAccessClass;
		this.source = source;
		this.initials = initials;
		this.createddate = createddate;
	}

	public Addresses(AddressesId id, Streets streets,
			AccessClasses accessClassesByAccessClass,
			AccessOrigin accessOrigin, UnitOrigin unitOrigin,
			AccessClasses accessClassesByUserAccessClass, String houseno,
			String floor, String door, String placename, String postalcode,
			Long propertyidBbr, Long propertyidEsr, String zapKvhX,
			Integer bbrUse, Integer coordQ, Long coordX, Long coordY,
			BigDecimal latitude, BigDecimal longitude, String source,
			Boolean zapFictive, Date enddate, String initials,
			Long transferredToAddressId, Date createddate) {
		this.id = id;
		this.streets = streets;
		this.accessClassesByAccessClass = accessClassesByAccessClass;
		this.accessOrigin = accessOrigin;
		this.unitOrigin = unitOrigin;
		this.accessClassesByUserAccessClass = accessClassesByUserAccessClass;
		this.houseno = houseno;
		this.floor = floor;
		this.door = door;
		this.placename = placename;
		this.postalcode = postalcode;
		this.propertyidBbr = propertyidBbr;
		this.propertyidEsr = propertyidEsr;
		this.zapKvhX = zapKvhX;
		this.bbrUse = bbrUse;
		this.coordQ = coordQ;
		this.coordX = coordX;
		this.coordY = coordY;
		this.latitude = latitude;
		this.longitude = longitude;
		this.source = source;
		this.zapFictive = zapFictive;
		this.enddate = enddate;
		this.initials = initials;
		this.transferredToAddressId = transferredToAddressId;
		this.createddate = createddate;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "addressId", column = @Column(name = "ADDRESS_ID", nullable = false, precision = 10, scale = 0)),
			@AttributeOverride(name = "startdate", column = @Column(name = "STARTDATE", nullable = false, length = 7)) })
	public AddressesId getId() {
		return this.id;
	}

	public void setId(AddressesId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "STREET_ID", referencedColumnName = "STREET_ID", nullable = false),
			@JoinColumn(name = "STREETS_STARTDATE", referencedColumnName = "STARTDATE", nullable = false) })
	public Streets getStreets() {
		return this.streets;
	}

	public void setStreets(Streets streets) {
		this.streets = streets;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ACCESS_CLASS", nullable = false)
	public AccessClasses getAccessClassesByAccessClass() {
		return this.accessClassesByAccessClass;
	}

	public void setAccessClassesByAccessClass(
			AccessClasses accessClassesByAccessClass) {
		this.accessClassesByAccessClass = accessClassesByAccessClass;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ACCESS_ORIGIN_CODE")
	public AccessOrigin getAccessOrigin() {
		return this.accessOrigin;
	}

	public void setAccessOrigin(AccessOrigin accessOrigin) {
		this.accessOrigin = accessOrigin;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UNIT_ORIGIN_CODE")
	public UnitOrigin getUnitOrigin() {
		return this.unitOrigin;
	}

	public void setUnitOrigin(UnitOrigin unitOrigin) {
		this.unitOrigin = unitOrigin;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_ACCESS_CLASS")
	public AccessClasses getAccessClassesByUserAccessClass() {
		return this.accessClassesByUserAccessClass;
	}

	public void setAccessClassesByUserAccessClass(
			AccessClasses accessClassesByUserAccessClass) {
		this.accessClassesByUserAccessClass = accessClassesByUserAccessClass;
	}

	@Column(name = "HOUSENO", length = 5)
	public String getHouseno() {
		return this.houseno;
	}

	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}

	@Column(name = "FLOOR", length = 2)
	public String getFloor() {
		return this.floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	@Column(name = "DOOR", length = 6)
	public String getDoor() {
		return this.door;
	}

	public void setDoor(String door) {
		this.door = door;
	}

	@Column(name = "PLACENAME", length = 34)
	public String getPlacename() {
		return this.placename;
	}

	public void setPlacename(String placename) {
		this.placename = placename;
	}

	@Column(name = "POSTALCODE", length = 4)
	public String getPostalcode() {
		return this.postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	@Column(name = "PROPERTYID_BBR", precision = 10, scale = 0)
	public Long getPropertyidBbr() {
		return this.propertyidBbr;
	}

	public void setPropertyidBbr(Long propertyidBbr) {
		this.propertyidBbr = propertyidBbr;
	}

	@Column(name = "PROPERTYID_ESR", precision = 10, scale = 0)
	public Long getPropertyidEsr() {
		return this.propertyidEsr;
	}

	public void setPropertyidEsr(Long propertyidEsr) {
		this.propertyidEsr = propertyidEsr;
	}

	@Column(name = "ZAP_KVH_X", length = 17)
	public String getZapKvhX() {
		return this.zapKvhX;
	}

	public void setZapKvhX(String zapKvhX) {
		this.zapKvhX = zapKvhX;
	}

	@Column(name = "BBR_USE", precision = 5, scale = 0)
	public Integer getBbrUse() {
		return this.bbrUse;
	}

	public void setBbrUse(Integer bbrUse) {
		this.bbrUse = bbrUse;
	}

	@Column(name = "COORD_Q", precision = 5, scale = 0)
	public Integer getCoordQ() {
		return this.coordQ;
	}

	public void setCoordQ(Integer coordQ) {
		this.coordQ = coordQ;
	}

	@Column(name = "COORD_X", precision = 10, scale = 0)
	public Long getCoordX() {
		return this.coordX;
	}

	public void setCoordX(Long coordX) {
		this.coordX = coordX;
	}

	@Column(name = "COORD_Y", precision = 10, scale = 0)
	public Long getCoordY() {
		return this.coordY;
	}

	public void setCoordY(Long coordY) {
		this.coordY = coordY;
	}

	@Column(name = "LATITUDE", precision = 21, scale = 18)
	public BigDecimal getLatitude() {
		return this.latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	@Column(name = "LONGITUDE", precision = 21, scale = 18)
	public BigDecimal getLongitude() {
		return this.longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	@Column(name = "SOURCE", nullable = false, length = 6)
	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Column(name = "ZAP_FICTIVE", precision = 1, scale = 0)
	public Boolean getZapFictive() {
		return this.zapFictive;
	}

	public void setZapFictive(Boolean zapFictive) {
		this.zapFictive = zapFictive;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ENDDATE", length = 7)
	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	@Column(name = "INITIALS", nullable = false, length = 10)
	public String getInitials() {
		return this.initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	@Column(name = "TRANSFERRED_TO_ADDRESS_ID", precision = 10, scale = 0)
	public Long getTransferredToAddressId() {
		return this.transferredToAddressId;
	}

	public void setTransferredToAddressId(Long transferredToAddressId) {
		this.transferredToAddressId = transferredToAddressId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATEDDATE", nullable = false, length = 7)
	public Date getCreateddate() {
		return this.createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

}
