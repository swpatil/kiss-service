package com.tdc.persistence.ams.dao.entity;

// Generated 09-04-2015 18:59:20 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Amskeycabinet generated by hbm2java
 */
@Entity
@Table(name = "AMSKEYCABINET", schema = "AMS", uniqueConstraints = @UniqueConstraint(columnNames = {
		"AMSID", "CASPERID" }))
public class Amskeycabinet implements java.io.Serializable {

	private AmskeycabinetId id;

	public Amskeycabinet() {
	}

	public Amskeycabinet(AmskeycabinetId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "amsid", column = @Column(name = "AMSID", nullable = false, precision = 10, scale = 0)),
			@AttributeOverride(name = "casperid", column = @Column(name = "CASPERID", length = 10)),
			@AttributeOverride(name = "kvhx", column = @Column(name = "KVHX", length = 20)),
			@AttributeOverride(name = "createdby", column = @Column(name = "CREATEDBY", length = 20)),
			@AttributeOverride(name = "createddate", column = @Column(name = "CREATEDDATE", length = 7)),
			@AttributeOverride(name = "updatedby", column = @Column(name = "UPDATEDBY", length = 20)),
			@AttributeOverride(name = "updateddate", column = @Column(name = "UPDATEDDATE", length = 7)),
			@AttributeOverride(name = "enddate", column = @Column(name = "ENDDATE", length = 7)) })
	public AmskeycabinetId getId() {
		return this.id;
	}

	public void setId(AmskeycabinetId id) {
		this.id = id;
	}

}
