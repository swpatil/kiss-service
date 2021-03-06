package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CrDocorigin2generaltypevalueId generated by hbm2java
 */
@Embeddable
public class CrDocorigin2generaltypevalueId implements java.io.Serializable {

	private String primdocorigin;
	private String primgeneraltypevalue;

	public CrDocorigin2generaltypevalueId() {
	}

	public CrDocorigin2generaltypevalueId(String primdocorigin,
			String primgeneraltypevalue) {
		this.primdocorigin = primdocorigin;
		this.primgeneraltypevalue = primgeneraltypevalue;
	}

	@Column(name = "PRIMDOCORIGIN", length = 19)
	public String getPrimdocorigin() {
		return this.primdocorigin;
	}

	public void setPrimdocorigin(String primdocorigin) {
		this.primdocorigin = primdocorigin;
	}

	@Column(name = "PRIMGENERALTYPEVALUE", length = 19)
	public String getPrimgeneraltypevalue() {
		return this.primgeneraltypevalue;
	}

	public void setPrimgeneraltypevalue(String primgeneraltypevalue) {
		this.primgeneraltypevalue = primgeneraltypevalue;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CrDocorigin2generaltypevalueId))
			return false;
		CrDocorigin2generaltypevalueId castOther = (CrDocorigin2generaltypevalueId) other;

		return ((this.getPrimdocorigin() == castOther.getPrimdocorigin()) || (this
				.getPrimdocorigin() != null
				&& castOther.getPrimdocorigin() != null && this
				.getPrimdocorigin().equals(castOther.getPrimdocorigin())))
				&& ((this.getPrimgeneraltypevalue() == castOther
						.getPrimgeneraltypevalue()) || (this
						.getPrimgeneraltypevalue() != null
						&& castOther.getPrimgeneraltypevalue() != null && this
						.getPrimgeneraltypevalue().equals(
								castOther.getPrimgeneraltypevalue())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getPrimdocorigin() == null ? 0 : this.getPrimdocorigin()
						.hashCode());
		result = 37
				* result
				+ (getPrimgeneraltypevalue() == null ? 0 : this
						.getPrimgeneraltypevalue().hashCode());
		return result;
	}

}
