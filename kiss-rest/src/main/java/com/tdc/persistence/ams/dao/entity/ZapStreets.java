package com.tdc.persistence.ams.dao.entity;

// Generated 09-04-2015 18:59:20 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ZapStreets generated by hbm2java
 */
@Entity
@Table(name = "ZAP_STREETS", schema = "AMS")
public class ZapStreets implements java.io.Serializable {

	private ZapStreetsId id;
	private String streetname;
	private String streetnameA;
	private Set<ZapAddressPoints> zapAddressPointses = new HashSet<ZapAddressPoints>(
			0);

	public ZapStreets() {
	}

	public ZapStreets(ZapStreetsId id, String streetname) {
		this.id = id;
		this.streetname = streetname;
	}

	public ZapStreets(ZapStreetsId id, String streetname, String streetnameA,
			Set<ZapAddressPoints> zapAddressPointses) {
		this.id = id;
		this.streetname = streetname;
		this.streetnameA = streetnameA;
		this.zapAddressPointses = zapAddressPointses;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "munid", column = @Column(name = "MUNID", nullable = false, precision = 22, scale = 0)),
			@AttributeOverride(name = "streetid", column = @Column(name = "STREETID", nullable = false, precision = 22, scale = 0)) })
	public ZapStreetsId getId() {
		return this.id;
	}

	public void setId(ZapStreetsId id) {
		this.id = id;
	}

	@Column(name = "STREETNAME", nullable = false, length = 100)
	public String getStreetname() {
		return this.streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	@Column(name = "STREETNAME_A", length = 100)
	public String getStreetnameA() {
		return this.streetnameA;
	}

	public void setStreetnameA(String streetnameA) {
		this.streetnameA = streetnameA;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "zapStreets")
	public Set<ZapAddressPoints> getZapAddressPointses() {
		return this.zapAddressPointses;
	}

	public void setZapAddressPointses(Set<ZapAddressPoints> zapAddressPointses) {
		this.zapAddressPointses = zapAddressPointses;
	}

}
