package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Cdmchosconc generated by hbm2java
 */
@Entity
@Table(name = "CDMCHOSCONC", schema = "PCRM")
public class Cdmchosconc implements java.io.Serializable {

	private CdmchosconcId id;

	public Cdmchosconc() {
	}

	public Cdmchosconc(CdmchosconcId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", length = 19)),
			@AttributeOverride(name = "crd", column = @Column(name = "CRD", length = 7)),
			@AttributeOverride(name = "impt", column = @Column(name = "IMPT", length = 7)),
			@AttributeOverride(name = "expt", column = @Column(name = "EXPT", length = 7)),
			@AttributeOverride(name = "impd", column = @Column(name = "IMPD", length = 7)),
			@AttributeOverride(name = "expd", column = @Column(name = "EXPD", length = 7)),
			@AttributeOverride(name = "modt", column = @Column(name = "MODT", length = 7)),
			@AttributeOverride(name = "cru", column = @Column(name = "CRU", length = 19)),
			@AttributeOverride(name = "delt", column = @Column(name = "DELT", length = 7)),
			@AttributeOverride(name = "modd", column = @Column(name = "MODD", length = 7)),
			@AttributeOverride(name = "impu", column = @Column(name = "IMPU", length = 19)),
			@AttributeOverride(name = "expu", column = @Column(name = "EXPU", length = 19)),
			@AttributeOverride(name = "deld", column = @Column(name = "DELD", length = 7)),
			@AttributeOverride(name = "modu", column = @Column(name = "MODU", length = 19)),
			@AttributeOverride(name = "delu", column = @Column(name = "DELU", length = 19)),
			@AttributeOverride(name = "crt", column = @Column(name = "CRT", length = 7)),
			@AttributeOverride(name = "primarysag", column = @Column(name = "PRIMARYSAG", length = 19)),
			@AttributeOverride(name = "primsalgskonc", column = @Column(name = "PRIMSALGSKONC", length = 19)),
			@AttributeOverride(name = "primtilbkontr", column = @Column(name = "PRIMTILBKONTR", length = 19)),
			@AttributeOverride(name = "code", column = @Column(name = "CODE", length = 15)),
			@AttributeOverride(name = "head", column = @Column(name = "HEAD")),
			@AttributeOverride(name = "primtopgrp", column = @Column(name = "PRIMTOPGRP", length = 19)),
			@AttributeOverride(name = "projektlobenr", column = @Column(name = "PROJEKTLOBENR", length = 10)),
			@AttributeOverride(name = "lifecycle", column = @Column(name = "LIFECYCLE", length = 10)),
			@AttributeOverride(name = "primtillkontrtype", column = @Column(name = "PRIMTILLKONTRTYPE", length = 19)),
			@AttributeOverride(name = "key2rule", column = @Column(name = "KEY2RULE")) })
	public CdmchosconcId getId() {
		return this.id;
	}

	public void setId(CdmchosconcId id) {
		this.id = id;
	}

}