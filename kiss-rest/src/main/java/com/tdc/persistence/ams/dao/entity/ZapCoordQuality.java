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
 * ZapCoordQuality generated by hbm2java
 */
@Entity
@Table(name = "ZAP_COORD_QUALITY", schema = "AMS")
public class ZapCoordQuality implements java.io.Serializable {

	private BigDecimal qid;
	private String descript;
	private Set<ZapAddressPoints> zapAddressPointses = new HashSet<ZapAddressPoints>(
			0);

	public ZapCoordQuality() {
	}

	public ZapCoordQuality(BigDecimal qid, String descript) {
		this.qid = qid;
		this.descript = descript;
	}

	public ZapCoordQuality(BigDecimal qid, String descript,
			Set<ZapAddressPoints> zapAddressPointses) {
		this.qid = qid;
		this.descript = descript;
		this.zapAddressPointses = zapAddressPointses;
	}

	@Id
	@Column(name = "QID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getQid() {
		return this.qid;
	}

	public void setQid(BigDecimal qid) {
		this.qid = qid;
	}

	@Column(name = "DESCRIPT", nullable = false)
	public String getDescript() {
		return this.descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "zapCoordQuality")
	public Set<ZapAddressPoints> getZapAddressPointses() {
		return this.zapAddressPointses;
	}

	public void setZapAddressPointses(Set<ZapAddressPoints> zapAddressPointses) {
		this.zapAddressPointses = zapAddressPointses;
	}

}
