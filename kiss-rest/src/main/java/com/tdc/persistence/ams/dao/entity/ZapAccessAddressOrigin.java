package com.tdc.persistence.ams.dao.entity;

// Generated 09-04-2015 18:59:20 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ZapAccessAddressOrigin generated by hbm2java
 */
@Entity
@Table(name = "ZAP_ACCESS_ADDRESS_ORIGIN", schema = "AMS")
public class ZapAccessAddressOrigin implements java.io.Serializable {

	private BigDecimal value;
	private String name;
	private String descript;

	public ZapAccessAddressOrigin() {
	}

	public ZapAccessAddressOrigin(BigDecimal value, String name, String descript) {
		this.value = value;
		this.name = name;
		this.descript = descript;
	}

	@Id
	@Column(name = "VALUE", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getValue() {
		return this.value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	@Column(name = "NAME", nullable = false, length = 30)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "DESCRIPT", nullable = false)
	public String getDescript() {
		return this.descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

}
