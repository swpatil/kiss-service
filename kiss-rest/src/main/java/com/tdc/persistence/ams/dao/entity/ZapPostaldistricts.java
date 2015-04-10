package com.tdc.persistence.ams.dao.entity;

// Generated 09-04-2015 18:59:20 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ZapPostaldistricts generated by hbm2java
 */
@Entity
@Table(name = "ZAP_POSTALDISTRICTS", schema = "AMS")
public class ZapPostaldistricts implements java.io.Serializable {

	private BigDecimal postalid;
	private String postaldistrict;
	private Set<ZapAddressPoints> zapAddressPointses = new HashSet<ZapAddressPoints>(
			0);

	public ZapPostaldistricts() {
	}

	public ZapPostaldistricts(BigDecimal postalid, String postaldistrict) {
		this.postalid = postalid;
		this.postaldistrict = postaldistrict;
	}

	public ZapPostaldistricts(BigDecimal postalid, String postaldistrict,
			Set<ZapAddressPoints> zapAddressPointses) {
		this.postalid = postalid;
		this.postaldistrict = postaldistrict;
		this.zapAddressPointses = zapAddressPointses;
	}

	@Id
	@Column(name = "POSTALID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getPostalid() {
		return this.postalid;
	}

	public void setPostalid(BigDecimal postalid) {
		this.postalid = postalid;
	}

	@Column(name = "POSTALDISTRICT", nullable = false, length = 50)
	public String getPostaldistrict() {
		return this.postaldistrict;
	}

	public void setPostaldistrict(String postaldistrict) {
		this.postaldistrict = postaldistrict;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "zapPostaldistricts")
	public Set<ZapAddressPoints> getZapAddressPointses() {
		return this.zapAddressPointses;
	}

	public void setZapAddressPointses(Set<ZapAddressPoints> zapAddressPointses) {
		this.zapAddressPointses = zapAddressPointses;
	}

}
