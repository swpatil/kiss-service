package com.tdc.persistence.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CrProdcollId generated by hbm2java
 */
@Embeddable
public class CrProdcollId implements java.io.Serializable {

	private String primproductcollection;
	private String primproductspec;

	public CrProdcollId() {
	}

	public CrProdcollId(String primproductcollection, String primproductspec) {
		this.primproductcollection = primproductcollection;
		this.primproductspec = primproductspec;
	}

	@Column(name = "PRIMPRODUCTCOLLECTION", nullable = false, length = 19)
	public String getPrimproductcollection() {
		return this.primproductcollection;
	}

	public void setPrimproductcollection(String primproductcollection) {
		this.primproductcollection = primproductcollection;
	}

	@Column(name = "PRIMPRODUCTSPEC", nullable = false, length = 50)
	public String getPrimproductspec() {
		return this.primproductspec;
	}

	public void setPrimproductspec(String primproductspec) {
		this.primproductspec = primproductspec;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CrProdcollId))
			return false;
		CrProdcollId castOther = (CrProdcollId) other;

		return ((this.getPrimproductcollection() == castOther
				.getPrimproductcollection()) || (this
				.getPrimproductcollection() != null
				&& castOther.getPrimproductcollection() != null && this
				.getPrimproductcollection().equals(
						castOther.getPrimproductcollection())))
				&& ((this.getPrimproductspec() == castOther
						.getPrimproductspec()) || (this.getPrimproductspec() != null
						&& castOther.getPrimproductspec() != null && this
						.getPrimproductspec().equals(
								castOther.getPrimproductspec())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getPrimproductcollection() == null ? 0 : this
						.getPrimproductcollection().hashCode());
		result = 37
				* result
				+ (getPrimproductspec() == null ? 0 : this.getPrimproductspec()
						.hashCode());
		return result;
	}

}
