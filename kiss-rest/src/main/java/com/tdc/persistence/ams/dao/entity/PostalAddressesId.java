package com.tdc.persistence.ams.dao.entity;

// Generated 09-04-2015 18:59:20 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PostalAddressesId generated by hbm2java
 */
@Embeddable
public class PostalAddressesId implements java.io.Serializable {

	private long addressId;
	private Date startdate;

	public PostalAddressesId() {
	}

	public PostalAddressesId(long addressId, Date startdate) {
		this.addressId = addressId;
		this.startdate = startdate;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PostalAddressesId))
			return false;
		PostalAddressesId castOther = (PostalAddressesId) other;

		return (this.getAddressId() == castOther.getAddressId())
				&& ((this.getStartdate() == castOther.getStartdate()) || (this
						.getStartdate() != null
						&& castOther.getStartdate() != null && this
						.getStartdate().equals(castOther.getStartdate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getAddressId();
		result = 37 * result
				+ (getStartdate() == null ? 0 : this.getStartdate().hashCode());
		return result;
	}

}
