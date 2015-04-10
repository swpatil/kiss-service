package com.tdc.persistence.ams.dao.entity;

// Generated 09-04-2015 18:59:20 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AddressesNotusedId generated by hbm2java
 */
@Embeddable
public class AddressesNotusedId implements java.io.Serializable {

	private long addressId;
	private Date startdate;
	private long streetId;
	private Date streetsStartdate;
	private String houseno;
	private String floor;
	private String door;
	private String placename;
	private String postalcode;
	private boolean accessClass;
	private Boolean userAccessClass;
	private Long propertyidBbr;
	private Long propertyidEsr;
	private String zapKvhX;
	private Long accessOriginCode;
	private Long unitOriginCode;
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

	public AddressesNotusedId() {
	}

	public AddressesNotusedId(long addressId, Date startdate, long streetId,
			Date streetsStartdate, boolean accessClass, String source,
			String initials, Date createddate) {
		this.addressId = addressId;
		this.startdate = startdate;
		this.streetId = streetId;
		this.streetsStartdate = streetsStartdate;
		this.accessClass = accessClass;
		this.source = source;
		this.initials = initials;
		this.createddate = createddate;
	}

	public AddressesNotusedId(long addressId, Date startdate, long streetId,
			Date streetsStartdate, String houseno, String floor, String door,
			String placename, String postalcode, boolean accessClass,
			Boolean userAccessClass, Long propertyidBbr, Long propertyidEsr,
			String zapKvhX, Long accessOriginCode, Long unitOriginCode,
			Integer bbrUse, Integer coordQ, Long coordX, Long coordY,
			BigDecimal latitude, BigDecimal longitude, String source,
			Boolean zapFictive, Date enddate, String initials,
			Long transferredToAddressId, Date createddate) {
		this.addressId = addressId;
		this.startdate = startdate;
		this.streetId = streetId;
		this.streetsStartdate = streetsStartdate;
		this.houseno = houseno;
		this.floor = floor;
		this.door = door;
		this.placename = placename;
		this.postalcode = postalcode;
		this.accessClass = accessClass;
		this.userAccessClass = userAccessClass;
		this.propertyidBbr = propertyidBbr;
		this.propertyidEsr = propertyidEsr;
		this.zapKvhX = zapKvhX;
		this.accessOriginCode = accessOriginCode;
		this.unitOriginCode = unitOriginCode;
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

	@Column(name = "ADDRESS_ID", nullable = false, precision = 10, scale = 0)
	public long getAddressId() {
		return this.addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	@Column(name = "STARTDATE", nullable = false, length = 7)
	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	@Column(name = "STREET_ID", nullable = false, precision = 10, scale = 0)
	public long getStreetId() {
		return this.streetId;
	}

	public void setStreetId(long streetId) {
		this.streetId = streetId;
	}

	@Column(name = "STREETS_STARTDATE", nullable = false, length = 7)
	public Date getStreetsStartdate() {
		return this.streetsStartdate;
	}

	public void setStreetsStartdate(Date streetsStartdate) {
		this.streetsStartdate = streetsStartdate;
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

	@Column(name = "ACCESS_CLASS", nullable = false, precision = 1, scale = 0)
	public boolean isAccessClass() {
		return this.accessClass;
	}

	public void setAccessClass(boolean accessClass) {
		this.accessClass = accessClass;
	}

	@Column(name = "USER_ACCESS_CLASS", precision = 1, scale = 0)
	public Boolean getUserAccessClass() {
		return this.userAccessClass;
	}

	public void setUserAccessClass(Boolean userAccessClass) {
		this.userAccessClass = userAccessClass;
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

	@Column(name = "ACCESS_ORIGIN_CODE", precision = 10, scale = 0)
	public Long getAccessOriginCode() {
		return this.accessOriginCode;
	}

	public void setAccessOriginCode(Long accessOriginCode) {
		this.accessOriginCode = accessOriginCode;
	}

	@Column(name = "UNIT_ORIGIN_CODE", precision = 10, scale = 0)
	public Long getUnitOriginCode() {
		return this.unitOriginCode;
	}

	public void setUnitOriginCode(Long unitOriginCode) {
		this.unitOriginCode = unitOriginCode;
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

	@Column(name = "CREATEDDATE", nullable = false, length = 7)
	public Date getCreateddate() {
		return this.createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AddressesNotusedId))
			return false;
		AddressesNotusedId castOther = (AddressesNotusedId) other;

		return (this.getAddressId() == castOther.getAddressId())
				&& ((this.getStartdate() == castOther.getStartdate()) || (this
						.getStartdate() != null
						&& castOther.getStartdate() != null && this
						.getStartdate().equals(castOther.getStartdate())))
				&& (this.getStreetId() == castOther.getStreetId())
				&& ((this.getStreetsStartdate() == castOther
						.getStreetsStartdate()) || (this.getStreetsStartdate() != null
						&& castOther.getStreetsStartdate() != null && this
						.getStreetsStartdate().equals(
								castOther.getStreetsStartdate())))
				&& ((this.getHouseno() == castOther.getHouseno()) || (this
						.getHouseno() != null && castOther.getHouseno() != null && this
						.getHouseno().equals(castOther.getHouseno())))
				&& ((this.getFloor() == castOther.getFloor()) || (this
						.getFloor() != null && castOther.getFloor() != null && this
						.getFloor().equals(castOther.getFloor())))
				&& ((this.getDoor() == castOther.getDoor()) || (this.getDoor() != null
						&& castOther.getDoor() != null && this.getDoor()
						.equals(castOther.getDoor())))
				&& ((this.getPlacename() == castOther.getPlacename()) || (this
						.getPlacename() != null
						&& castOther.getPlacename() != null && this
						.getPlacename().equals(castOther.getPlacename())))
				&& ((this.getPostalcode() == castOther.getPostalcode()) || (this
						.getPostalcode() != null
						&& castOther.getPostalcode() != null && this
						.getPostalcode().equals(castOther.getPostalcode())))
				&& (this.isAccessClass() == castOther.isAccessClass())
				&& ((this.getUserAccessClass() == castOther
						.getUserAccessClass()) || (this.getUserAccessClass() != null
						&& castOther.getUserAccessClass() != null && this
						.getUserAccessClass().equals(
								castOther.getUserAccessClass())))
				&& ((this.getPropertyidBbr() == castOther.getPropertyidBbr()) || (this
						.getPropertyidBbr() != null
						&& castOther.getPropertyidBbr() != null && this
						.getPropertyidBbr()
						.equals(castOther.getPropertyidBbr())))
				&& ((this.getPropertyidEsr() == castOther.getPropertyidEsr()) || (this
						.getPropertyidEsr() != null
						&& castOther.getPropertyidEsr() != null && this
						.getPropertyidEsr()
						.equals(castOther.getPropertyidEsr())))
				&& ((this.getZapKvhX() == castOther.getZapKvhX()) || (this
						.getZapKvhX() != null && castOther.getZapKvhX() != null && this
						.getZapKvhX().equals(castOther.getZapKvhX())))
				&& ((this.getAccessOriginCode() == castOther
						.getAccessOriginCode()) || (this.getAccessOriginCode() != null
						&& castOther.getAccessOriginCode() != null && this
						.getAccessOriginCode().equals(
								castOther.getAccessOriginCode())))
				&& ((this.getUnitOriginCode() == castOther.getUnitOriginCode()) || (this
						.getUnitOriginCode() != null
						&& castOther.getUnitOriginCode() != null && this
						.getUnitOriginCode().equals(
								castOther.getUnitOriginCode())))
				&& ((this.getBbrUse() == castOther.getBbrUse()) || (this
						.getBbrUse() != null && castOther.getBbrUse() != null && this
						.getBbrUse().equals(castOther.getBbrUse())))
				&& ((this.getCoordQ() == castOther.getCoordQ()) || (this
						.getCoordQ() != null && castOther.getCoordQ() != null && this
						.getCoordQ().equals(castOther.getCoordQ())))
				&& ((this.getCoordX() == castOther.getCoordX()) || (this
						.getCoordX() != null && castOther.getCoordX() != null && this
						.getCoordX().equals(castOther.getCoordX())))
				&& ((this.getCoordY() == castOther.getCoordY()) || (this
						.getCoordY() != null && castOther.getCoordY() != null && this
						.getCoordY().equals(castOther.getCoordY())))
				&& ((this.getLatitude() == castOther.getLatitude()) || (this
						.getLatitude() != null
						&& castOther.getLatitude() != null && this
						.getLatitude().equals(castOther.getLatitude())))
				&& ((this.getLongitude() == castOther.getLongitude()) || (this
						.getLongitude() != null
						&& castOther.getLongitude() != null && this
						.getLongitude().equals(castOther.getLongitude())))
				&& ((this.getSource() == castOther.getSource()) || (this
						.getSource() != null && castOther.getSource() != null && this
						.getSource().equals(castOther.getSource())))
				&& ((this.getZapFictive() == castOther.getZapFictive()) || (this
						.getZapFictive() != null
						&& castOther.getZapFictive() != null && this
						.getZapFictive().equals(castOther.getZapFictive())))
				&& ((this.getEnddate() == castOther.getEnddate()) || (this
						.getEnddate() != null && castOther.getEnddate() != null && this
						.getEnddate().equals(castOther.getEnddate())))
				&& ((this.getInitials() == castOther.getInitials()) || (this
						.getInitials() != null
						&& castOther.getInitials() != null && this
						.getInitials().equals(castOther.getInitials())))
				&& ((this.getTransferredToAddressId() == castOther
						.getTransferredToAddressId()) || (this
						.getTransferredToAddressId() != null
						&& castOther.getTransferredToAddressId() != null && this
						.getTransferredToAddressId().equals(
								castOther.getTransferredToAddressId())))
				&& ((this.getCreateddate() == castOther.getCreateddate()) || (this
						.getCreateddate() != null
						&& castOther.getCreateddate() != null && this
						.getCreateddate().equals(castOther.getCreateddate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getAddressId();
		result = 37 * result
				+ (getStartdate() == null ? 0 : this.getStartdate().hashCode());
		result = 37 * result + (int) this.getStreetId();
		result = 37
				* result
				+ (getStreetsStartdate() == null ? 0 : this
						.getStreetsStartdate().hashCode());
		result = 37 * result
				+ (getHouseno() == null ? 0 : this.getHouseno().hashCode());
		result = 37 * result
				+ (getFloor() == null ? 0 : this.getFloor().hashCode());
		result = 37 * result
				+ (getDoor() == null ? 0 : this.getDoor().hashCode());
		result = 37 * result
				+ (getPlacename() == null ? 0 : this.getPlacename().hashCode());
		result = 37
				* result
				+ (getPostalcode() == null ? 0 : this.getPostalcode()
						.hashCode());
		result = 37 * result + (this.isAccessClass() ? 1 : 0);
		result = 37
				* result
				+ (getUserAccessClass() == null ? 0 : this.getUserAccessClass()
						.hashCode());
		result = 37
				* result
				+ (getPropertyidBbr() == null ? 0 : this.getPropertyidBbr()
						.hashCode());
		result = 37
				* result
				+ (getPropertyidEsr() == null ? 0 : this.getPropertyidEsr()
						.hashCode());
		result = 37 * result
				+ (getZapKvhX() == null ? 0 : this.getZapKvhX().hashCode());
		result = 37
				* result
				+ (getAccessOriginCode() == null ? 0 : this
						.getAccessOriginCode().hashCode());
		result = 37
				* result
				+ (getUnitOriginCode() == null ? 0 : this.getUnitOriginCode()
						.hashCode());
		result = 37 * result
				+ (getBbrUse() == null ? 0 : this.getBbrUse().hashCode());
		result = 37 * result
				+ (getCoordQ() == null ? 0 : this.getCoordQ().hashCode());
		result = 37 * result
				+ (getCoordX() == null ? 0 : this.getCoordX().hashCode());
		result = 37 * result
				+ (getCoordY() == null ? 0 : this.getCoordY().hashCode());
		result = 37 * result
				+ (getLatitude() == null ? 0 : this.getLatitude().hashCode());
		result = 37 * result
				+ (getLongitude() == null ? 0 : this.getLongitude().hashCode());
		result = 37 * result
				+ (getSource() == null ? 0 : this.getSource().hashCode());
		result = 37
				* result
				+ (getZapFictive() == null ? 0 : this.getZapFictive()
						.hashCode());
		result = 37 * result
				+ (getEnddate() == null ? 0 : this.getEnddate().hashCode());
		result = 37 * result
				+ (getInitials() == null ? 0 : this.getInitials().hashCode());
		result = 37
				* result
				+ (getTransferredToAddressId() == null ? 0 : this
						.getTransferredToAddressId().hashCode());
		result = 37
				* result
				+ (getCreateddate() == null ? 0 : this.getCreateddate()
						.hashCode());
		return result;
	}

}
