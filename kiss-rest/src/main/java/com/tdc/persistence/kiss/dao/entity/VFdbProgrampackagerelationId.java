package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VFdbProgrampackagerelationId generated by hbm2java
 */
@Embeddable
public class VFdbProgrampackagerelationId implements java.io.Serializable {

	private Integer productId;
	private String shortName;
	private BigDecimal productGroup;
	private Integer packagerelation;
	private String packagerelationname;
	private String overlap;

	public VFdbProgrampackagerelationId() {
	}

	public VFdbProgrampackagerelationId(Integer productId, String shortName,
			BigDecimal productGroup, Integer packagerelation,
			String packagerelationname, String overlap) {
		this.productId = productId;
		this.shortName = shortName;
		this.productGroup = productGroup;
		this.packagerelation = packagerelation;
		this.packagerelationname = packagerelationname;
		this.overlap = overlap;
	}

	@Column(name = "PRODUCT_ID", precision = 7, scale = 0)
	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	@Column(name = "SHORT_NAME")
	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	@Column(name = "PRODUCT_GROUP", precision = 22, scale = 0)
	public BigDecimal getProductGroup() {
		return this.productGroup;
	}

	public void setProductGroup(BigDecimal productGroup) {
		this.productGroup = productGroup;
	}

	@Column(name = "PACKAGERELATION", precision = 7, scale = 0)
	public Integer getPackagerelation() {
		return this.packagerelation;
	}

	public void setPackagerelation(Integer packagerelation) {
		this.packagerelation = packagerelation;
	}

	@Column(name = "PACKAGERELATIONNAME")
	public String getPackagerelationname() {
		return this.packagerelationname;
	}

	public void setPackagerelationname(String packagerelationname) {
		this.packagerelationname = packagerelationname;
	}

	@Column(name = "OVERLAP", length = 3)
	public String getOverlap() {
		return this.overlap;
	}

	public void setOverlap(String overlap) {
		this.overlap = overlap;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VFdbProgrampackagerelationId))
			return false;
		VFdbProgrampackagerelationId castOther = (VFdbProgrampackagerelationId) other;

		return ((this.getProductId() == castOther.getProductId()) || (this
				.getProductId() != null && castOther.getProductId() != null && this
				.getProductId().equals(castOther.getProductId())))
				&& ((this.getShortName() == castOther.getShortName()) || (this
						.getShortName() != null
						&& castOther.getShortName() != null && this
						.getShortName().equals(castOther.getShortName())))
				&& ((this.getProductGroup() == castOther.getProductGroup()) || (this
						.getProductGroup() != null
						&& castOther.getProductGroup() != null && this
						.getProductGroup().equals(castOther.getProductGroup())))
				&& ((this.getPackagerelation() == castOther
						.getPackagerelation()) || (this.getPackagerelation() != null
						&& castOther.getPackagerelation() != null && this
						.getPackagerelation().equals(
								castOther.getPackagerelation())))
				&& ((this.getPackagerelationname() == castOther
						.getPackagerelationname()) || (this
						.getPackagerelationname() != null
						&& castOther.getPackagerelationname() != null && this
						.getPackagerelationname().equals(
								castOther.getPackagerelationname())))
				&& ((this.getOverlap() == castOther.getOverlap()) || (this
						.getOverlap() != null && castOther.getOverlap() != null && this
						.getOverlap().equals(castOther.getOverlap())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getProductId() == null ? 0 : this.getProductId().hashCode());
		result = 37 * result
				+ (getShortName() == null ? 0 : this.getShortName().hashCode());
		result = 37
				* result
				+ (getProductGroup() == null ? 0 : this.getProductGroup()
						.hashCode());
		result = 37
				* result
				+ (getPackagerelation() == null ? 0 : this.getPackagerelation()
						.hashCode());
		result = 37
				* result
				+ (getPackagerelationname() == null ? 0 : this
						.getPackagerelationname().hashCode());
		result = 37 * result
				+ (getOverlap() == null ? 0 : this.getOverlap().hashCode());
		return result;
	}

}