package com.tdc.persistence.ams.dao.entity;

// Generated 09-04-2015 18:59:20 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Temp generated by hbm2java
 */
@Entity
@Table(name = "TEMP", schema = "AMS")
public class Temp implements java.io.Serializable {

	private TempId id;

	public Temp() {
	}

	public Temp(TempId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "taeller", column = @Column(name = "TAELLER", precision = 10, scale = 0)),
			@AttributeOverride(name = "tekst", column = @Column(name = "TEKST", length = 2000)) })
	public TempId getId() {
		return this.id;
	}

	public void setId(TempId id) {
		this.id = id;
	}

}
