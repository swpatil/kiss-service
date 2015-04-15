package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ArchivedFiles generated by hbm2java
 */
@Entity
@Table(name = "ARCHIVED_FILES", schema = "PCRM")
public class ArchivedFiles implements java.io.Serializable {

	private BigDecimal id;
	private Sfdcquery sfdcquery;
	private BigDecimal generatedOn;
	private String fileName;
	private Boolean isSuccess;

	public ArchivedFiles() {
	}

	public ArchivedFiles(BigDecimal id) {
		this.id = id;
	}

	public ArchivedFiles(BigDecimal id, Sfdcquery sfdcquery,
			BigDecimal generatedOn, String fileName, Boolean isSuccess) {
		this.id = id;
		this.sfdcquery = sfdcquery;
		this.generatedOn = generatedOn;
		this.fileName = fileName;
		this.isSuccess = isSuccess;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, scale = 0)
	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "QUERY_ID")
	public Sfdcquery getSfdcquery() {
		return this.sfdcquery;
	}

	public void setSfdcquery(Sfdcquery sfdcquery) {
		this.sfdcquery = sfdcquery;
	}

	@Column(name = "GENERATED_ON", scale = 0)
	public BigDecimal getGeneratedOn() {
		return this.generatedOn;
	}

	public void setGeneratedOn(BigDecimal generatedOn) {
		this.generatedOn = generatedOn;
	}

	@Column(name = "FILE_NAME")
	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Column(name = "IS_SUCCESS", precision = 1, scale = 0)
	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

}