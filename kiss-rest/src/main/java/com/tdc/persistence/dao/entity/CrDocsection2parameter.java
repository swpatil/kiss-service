package com.tdc.persistence.dao.entity;

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
 * CrDocsection2parameter generated by hbm2java
 */
@Entity
@Table(name = "CR_DOCSECTION2PARAMETER", schema = "PCRM")
public class CrDocsection2parameter implements java.io.Serializable {

	private CrDocsection2parameterId id;
	private Docsection docsection;
	private Configparameter configparameter;

	public CrDocsection2parameter() {
	}

	public CrDocsection2parameter(CrDocsection2parameterId id,
			Docsection docsection, Configparameter configparameter) {
		this.id = id;
		this.docsection = docsection;
		this.configparameter = configparameter;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "primdocsection", column = @Column(name = "PRIMDOCSECTION", nullable = false, length = 19)),
			@AttributeOverride(name = "primparameter", column = @Column(name = "PRIMPARAMETER", nullable = false, length = 19)) })
	public CrDocsection2parameterId getId() {
		return this.id;
	}

	public void setId(CrDocsection2parameterId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRIMDOCSECTION", nullable = false, insertable = false, updatable = false)
	public Docsection getDocsection() {
		return this.docsection;
	}

	public void setDocsection(Docsection docsection) {
		this.docsection = docsection;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRIMPARAMETER", nullable = false, insertable = false, updatable = false)
	public Configparameter getConfigparameter() {
		return this.configparameter;
	}

	public void setConfigparameter(Configparameter configparameter) {
		this.configparameter = configparameter;
	}

}
