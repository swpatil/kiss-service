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
 * CrDocsection2origin generated by hbm2java
 */
@Entity
@Table(name = "CR_DOCSECTION2ORIGIN", schema = "PCRM")
public class CrDocsection2origin implements java.io.Serializable {

	private CrDocsection2originId id;
	private Docsectionhead docsectionhead;
	private Docorigin docorigin;
	private Docsection docsection;

	public CrDocsection2origin() {
	}

	public CrDocsection2origin(CrDocsection2originId id, Docorigin docorigin,
			Docsection docsection) {
		this.id = id;
		this.docorigin = docorigin;
		this.docsection = docsection;
	}

	public CrDocsection2origin(CrDocsection2originId id,
			Docsectionhead docsectionhead, Docorigin docorigin,
			Docsection docsection) {
		this.id = id;
		this.docsectionhead = docsectionhead;
		this.docorigin = docorigin;
		this.docsection = docsection;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "primdocsectionhead", column = @Column(name = "PRIMDOCSECTIONHEAD", length = 19)),
			@AttributeOverride(name = "primdocorigin", column = @Column(name = "PRIMDOCORIGIN", nullable = false, length = 19)),
			@AttributeOverride(name = "primdocsection", column = @Column(name = "PRIMDOCSECTION", nullable = false, length = 19)) })
	public CrDocsection2originId getId() {
		return this.id;
	}

	public void setId(CrDocsection2originId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRIMDOCSECTIONHEAD", insertable = false, updatable = false)
	public Docsectionhead getDocsectionhead() {
		return this.docsectionhead;
	}

	public void setDocsectionhead(Docsectionhead docsectionhead) {
		this.docsectionhead = docsectionhead;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRIMDOCORIGIN", nullable = false, insertable = false, updatable = false)
	public Docorigin getDocorigin() {
		return this.docorigin;
	}

	public void setDocorigin(Docorigin docorigin) {
		this.docorigin = docorigin;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRIMDOCSECTION", nullable = false, insertable = false, updatable = false)
	public Docsection getDocsection() {
		return this.docsection;
	}

	public void setDocsection(Docsection docsection) {
		this.docsection = docsection;
	}

}