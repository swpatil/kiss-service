package com.tdc.persistence.ams.dao.entity;

// Generated 09-04-2015 18:59:20 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * TmpStreetsSearch generated by hbm2java
 */
@Entity
@Table(name = "TMP_STREETS_SEARCH", schema = "AMS")
public class TmpStreetsSearch implements java.io.Serializable {

	private TmpStreetsSearchId id;

	public TmpStreetsSearch() {
	}

	public TmpStreetsSearch(TmpStreetsSearchId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "streetId", column = @Column(name = "STREET_ID", nullable = false, precision = 10, scale = 0)),
			@AttributeOverride(name = "municipalitycode", column = @Column(name = "MUNICIPALITYCODE", precision = 3, scale = 0)),
			@AttributeOverride(name = "streetcode", column = @Column(name = "STREETCODE", precision = 4, scale = 0)),
			@AttributeOverride(name = "postalcode", column = @Column(name = "POSTALCODE", length = 4)),
			@AttributeOverride(name = "streetname", column = @Column(name = "STREETNAME", length = 40)),
			@AttributeOverride(name = "streetnameSearch", column = @Column(name = "STREETNAME_SEARCH", length = 40)),
			@AttributeOverride(name = "placename", column = @Column(name = "PLACENAME", length = 40)),
			@AttributeOverride(name = "accessClass", column = @Column(name = "ACCESS_CLASS", nullable = false, precision = 1, scale = 0)),
			@AttributeOverride(name = "matchStreetname", column = @Column(name = "MATCH_STREETNAME", length = 40)) })
	public TmpStreetsSearchId getId() {
		return this.id;
	}

	public void setId(TmpStreetsSearchId id) {
		this.id = id;
	}

}
