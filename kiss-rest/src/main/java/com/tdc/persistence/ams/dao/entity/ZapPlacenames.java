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
 * ZapPlacenames generated by hbm2java
 */
@Entity
@Table(name = "ZAP_PLACENAMES", schema = "AMS")
public class ZapPlacenames implements java.io.Serializable {

	private BigDecimal placeid;
	private BigDecimal munid;
	private String placename;
	private Set<ZapAddressPoints> zapAddressPointses = new HashSet<ZapAddressPoints>(
			0);

	public ZapPlacenames() {
	}

	public ZapPlacenames(BigDecimal placeid, BigDecimal munid, String placename) {
		this.placeid = placeid;
		this.munid = munid;
		this.placename = placename;
	}

	public ZapPlacenames(BigDecimal placeid, BigDecimal munid,
			String placename, Set<ZapAddressPoints> zapAddressPointses) {
		this.placeid = placeid;
		this.munid = munid;
		this.placename = placename;
		this.zapAddressPointses = zapAddressPointses;
	}

	@Id
	@Column(name = "PLACEID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getPlaceid() {
		return this.placeid;
	}

	public void setPlaceid(BigDecimal placeid) {
		this.placeid = placeid;
	}

	@Column(name = "MUNID", nullable = false, precision = 22, scale = 0)
	public BigDecimal getMunid() {
		return this.munid;
	}

	public void setMunid(BigDecimal munid) {
		this.munid = munid;
	}

	@Column(name = "PLACENAME", nullable = false, length = 50)
	public String getPlacename() {
		return this.placename;
	}

	public void setPlacename(String placename) {
		this.placename = placename;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "zapPlacenames")
	public Set<ZapAddressPoints> getZapAddressPointses() {
		return this.zapAddressPointses;
	}

	public void setZapAddressPointses(Set<ZapAddressPoints> zapAddressPointses) {
		this.zapAddressPointses = zapAddressPointses;
	}

}
