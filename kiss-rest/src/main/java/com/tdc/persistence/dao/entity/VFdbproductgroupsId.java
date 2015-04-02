package com.tdc.persistence.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VFdbproductgroupsId generated by hbm2java
 */
@Embeddable
public class VFdbproductgroupsId implements java.io.Serializable {

	private BigDecimal productGroup;
	private String groupName;
	private String code;
	private String type;

	public VFdbproductgroupsId() {
	}

	public VFdbproductgroupsId(BigDecimal productGroup, String groupName,
			String code, String type) {
		this.productGroup = productGroup;
		this.groupName = groupName;
		this.code = code;
		this.type = type;
	}

	@Column(name = "PRODUCT_GROUP", precision = 22, scale = 0)
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

	@Column(name = "CODE", length = 50)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "TYPE", length = 50)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VFdbproductgroupsId))
			return false;
		VFdbproductgroupsId castOther = (VFdbproductgroupsId) other;

		return ((this.getProductGroup() == castOther.getProductGroup()) || (this
				.getProductGroup() != null
				&& castOther.getProductGroup() != null && this
				.getProductGroup().equals(castOther.getProductGroup())))
				&& ((this.getGroupName() == castOther.getGroupName()) || (this
						.getGroupName() != null
						&& castOther.getGroupName() != null && this
						.getGroupName().equals(castOther.getGroupName())))
				&& ((this.getCode() == castOther.getCode()) || (this.getCode() != null
						&& castOther.getCode() != null && this.getCode()
						.equals(castOther.getCode())))
				&& ((this.getType() == castOther.getType()) || (this.getType() != null
						&& castOther.getType() != null && this.getType()
						.equals(castOther.getType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getProductGroup() == null ? 0 : this.getProductGroup()
						.hashCode());
		result = 37 * result
				+ (getGroupName() == null ? 0 : this.getGroupName().hashCode());
		result = 37 * result
				+ (getCode() == null ? 0 : this.getCode().hashCode());
		result = 37 * result
				+ (getType() == null ? 0 : this.getType().hashCode());
		return result;
	}

}