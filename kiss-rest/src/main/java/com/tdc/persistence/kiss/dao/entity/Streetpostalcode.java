package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Streetpostalcode generated by hbm2java
 */
@Entity
@Table(name = "STREETPOSTALCODE", schema = "PCRM")
public class Streetpostalcode implements java.io.Serializable {

	private StreetpostalcodeId id;
	private Municipalitystreet municipalitystreet;

	public Streetpostalcode() {
	}

	public Streetpostalcode(StreetpostalcodeId id,
			Municipalitystreet municipalitystreet) {
		this.id = id;
		this.municipalitystreet = municipalitystreet;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "primmunicipalitystreet", column = @Column(name = "PRIMMUNICIPALITYSTREET", nullable = false, length = 19)),
			@AttributeOverride(name = "primpostalcode", column = @Column(name = "PRIMPOSTALCODE", nullable = false, length = 4)) })
	public StreetpostalcodeId getId() {
		return this.id;
	}

	public void setId(StreetpostalcodeId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRIMMUNICIPALITYSTREET", nullable = false, insertable = false, updatable = false)
	public Municipalitystreet getMunicipalitystreet() {
		return this.municipalitystreet;
	}

	public void setMunicipalitystreet(Municipalitystreet municipalitystreet) {
		this.municipalitystreet = municipalitystreet;
	}

}
