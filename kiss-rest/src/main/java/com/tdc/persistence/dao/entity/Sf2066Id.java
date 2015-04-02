package com.tdc.persistence.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Sf2066Id generated by hbm2java
 */
@Embeddable
public class Sf2066Id implements java.io.Serializable {

	private String projectno;
	private BigDecimal cnt;

	public Sf2066Id() {
	}

	public Sf2066Id(String projectno, BigDecimal cnt) {
		this.projectno = projectno;
		this.cnt = cnt;
	}

	@Column(name = "PROJECTNO", length = 20)
	public String getProjectno() {
		return this.projectno;
	}

	public void setProjectno(String projectno) {
		this.projectno = projectno;
	}

	@Column(name = "CNT", precision = 22, scale = 0)
	public BigDecimal getCnt() {
		return this.cnt;
	}

	public void setCnt(BigDecimal cnt) {
		this.cnt = cnt;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Sf2066Id))
			return false;
		Sf2066Id castOther = (Sf2066Id) other;

		return ((this.getProjectno() == castOther.getProjectno()) || (this
				.getProjectno() != null && castOther.getProjectno() != null && this
				.getProjectno().equals(castOther.getProjectno())))
				&& ((this.getCnt() == castOther.getCnt()) || (this.getCnt() != null
						&& castOther.getCnt() != null && this.getCnt().equals(
						castOther.getCnt())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getProjectno() == null ? 0 : this.getProjectno().hashCode());
		result = 37 * result
				+ (getCnt() == null ? 0 : this.getCnt().hashCode());
		return result;
	}

}