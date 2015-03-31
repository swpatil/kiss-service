package com.tdc.persistence.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TabOfferFilteringDateId generated by hbm2java
 */
@Embeddable
public class TabOfferFilteringDateId implements java.io.Serializable {

	private String id;
	private String offerid;
	private Date filterDate;
	private Date crd;
	private Date modd;
	private String cru;
	private String modu;

	public TabOfferFilteringDateId() {
	}

	public TabOfferFilteringDateId(String id, String offerid, Date filterDate,
			Date crd, Date modd, String cru, String modu) {
		this.id = id;
		this.offerid = offerid;
		this.filterDate = filterDate;
		this.crd = crd;
		this.modd = modd;
		this.cru = cru;
		this.modu = modu;
	}

	@Column(name = "ID", length = 19)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "OFFERID", length = 19)
	public String getOfferid() {
		return this.offerid;
	}

	public void setOfferid(String offerid) {
		this.offerid = offerid;
	}

	@Column(name = "FILTER_DATE", length = 7)
	public Date getFilterDate() {
		return this.filterDate;
	}

	public void setFilterDate(Date filterDate) {
		this.filterDate = filterDate;
	}

	@Column(name = "CRD", length = 7)
	public Date getCrd() {
		return this.crd;
	}

	public void setCrd(Date crd) {
		this.crd = crd;
	}

	@Column(name = "MODD", length = 7)
	public Date getModd() {
		return this.modd;
	}

	public void setModd(Date modd) {
		this.modd = modd;
	}

	@Column(name = "CRU", length = 19)
	public String getCru() {
		return this.cru;
	}

	public void setCru(String cru) {
		this.cru = cru;
	}

	@Column(name = "MODU", length = 19)
	public String getModu() {
		return this.modu;
	}

	public void setModu(String modu) {
		this.modu = modu;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TabOfferFilteringDateId))
			return false;
		TabOfferFilteringDateId castOther = (TabOfferFilteringDateId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getOfferid() == castOther.getOfferid()) || (this
						.getOfferid() != null && castOther.getOfferid() != null && this
						.getOfferid().equals(castOther.getOfferid())))
				&& ((this.getFilterDate() == castOther.getFilterDate()) || (this
						.getFilterDate() != null
						&& castOther.getFilterDate() != null && this
						.getFilterDate().equals(castOther.getFilterDate())))
				&& ((this.getCrd() == castOther.getCrd()) || (this.getCrd() != null
						&& castOther.getCrd() != null && this.getCrd().equals(
						castOther.getCrd())))
				&& ((this.getModd() == castOther.getModd()) || (this.getModd() != null
						&& castOther.getModd() != null && this.getModd()
						.equals(castOther.getModd())))
				&& ((this.getCru() == castOther.getCru()) || (this.getCru() != null
						&& castOther.getCru() != null && this.getCru().equals(
						castOther.getCru())))
				&& ((this.getModu() == castOther.getModu()) || (this.getModu() != null
						&& castOther.getModu() != null && this.getModu()
						.equals(castOther.getModu())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getOfferid() == null ? 0 : this.getOfferid().hashCode());
		result = 37
				* result
				+ (getFilterDate() == null ? 0 : this.getFilterDate()
						.hashCode());
		result = 37 * result
				+ (getCrd() == null ? 0 : this.getCrd().hashCode());
		result = 37 * result
				+ (getModd() == null ? 0 : this.getModd().hashCode());
		result = 37 * result
				+ (getCru() == null ? 0 : this.getCru().hashCode());
		result = 37 * result
				+ (getModu() == null ? 0 : this.getModu().hashCode());
		return result;
	}

}
