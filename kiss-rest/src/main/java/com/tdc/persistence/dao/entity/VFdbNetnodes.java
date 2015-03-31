package com.tdc.persistence.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * VFdbNetnodes generated by hbm2java
 */
@Entity
@Table(name = "V_FDB_NETNODES", schema = "PCRM")
public class VFdbNetnodes implements java.io.Serializable {

	private VFdbNetnodesId id;

	public VFdbNetnodes() {
	}

	public VFdbNetnodes(VFdbNetnodesId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "anlAnlaegsnr", column = @Column(name = "ANL_ANLAEGSNR", length = 10)),
			@AttributeOverride(name = "projectId", column = @Column(name = "PROJECT_ID", precision = 10, scale = 0)),
			@AttributeOverride(name = "custnode", column = @Column(name = "CUSTNODE", precision = 9, scale = 0)),
			@AttributeOverride(name = "regnode", column = @Column(name = "REGNODE", precision = 22, scale = 0)) })
	public VFdbNetnodesId getId() {
		return this.id;
	}

	public void setId(VFdbNetnodesId id) {
		this.id = id;
	}

}
