package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * MigrationDocToAmazon generated by hbm2java
 */
@Entity
@Table(name = "MIGRATION_DOC_TO_AMAZON", schema = "PCRM")
public class MigrationDocToAmazon implements java.io.Serializable {

	private MigrationDocToAmazonId id;

	public MigrationDocToAmazon() {
	}

	public MigrationDocToAmazon(MigrationDocToAmazonId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID")),
			@AttributeOverride(name = "fileName", column = @Column(name = "FILE_NAME")),
			@AttributeOverride(name = "fullname", column = @Column(name = "FULLNAME")),
			@AttributeOverride(name = "idrivepath", column = @Column(name = "IDRIVEPATH")),
			@AttributeOverride(name = "bucketName", column = @Column(name = "BUCKET_NAME")),
			@AttributeOverride(name = "pathprefix", column = @Column(name = "PATHPREFIX")),
			@AttributeOverride(name = "cableunitno", column = @Column(name = "CABLEUNITNO")),
			@AttributeOverride(name = "caseno", column = @Column(name = "CASENO")),
			@AttributeOverride(name = "customerNumber", column = @Column(name = "CUSTOMER_NUMBER")),
			@AttributeOverride(name = "constructionProjectNumber", column = @Column(name = "CONSTRUCTION_PROJECT_NUMBER")),
			@AttributeOverride(name = "constrHierarchyNumber", column = @Column(name = "CONSTR_HIERARCHY_NUMBER")),
			@AttributeOverride(name = "sfid", column = @Column(name = "SFID")),
			@AttributeOverride(name = "headendnumber", column = @Column(name = "HEADENDNUMBER")),
			@AttributeOverride(name = "contentSize", column = @Column(name = "CONTENT_SIZE")),
			@AttributeOverride(name = "fileSizeMb", column = @Column(name = "FILE_SIZE_MB")),
			@AttributeOverride(name = "timestampcol", column = @Column(name = "TIMESTAMPCOL")),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION")),
			@AttributeOverride(name = "contentType", column = @Column(name = "CONTENT_TYPE")),
			@AttributeOverride(name = "fileLabel", column = @Column(name = "FILE_LABEL")),
			@AttributeOverride(name = "kissDoctype", column = @Column(name = "KISS_DOCTYPE")),
			@AttributeOverride(name = "centaDocCategory", column = @Column(name = "CENTA_DOC_CATEGORY")),
			@AttributeOverride(name = "centaDoctype", column = @Column(name = "CENTA_DOCTYPE")),
			@AttributeOverride(name = "documentId", column = @Column(name = "DOCUMENT_ID")),
			@AttributeOverride(name = "extension", column = @Column(name = "EXTENSION")),
			@AttributeOverride(name = "offerid", column = @Column(name = "OFFERID")),
			@AttributeOverride(name = "supplierrequestid", column = @Column(name = "SUPPLIERREQUESTID")),
			@AttributeOverride(name = "mid", column = @Column(name = "MID")),
			@AttributeOverride(name = "department", column = @Column(name = "DEPARTMENT")),
			@AttributeOverride(name = "created", column = @Column(name = "CREATED")),
			@AttributeOverride(name = "crd", column = @Column(name = "CRD")),
			@AttributeOverride(name = "lastmodifieddate", column = @Column(name = "LASTMODIFIEDDATE")),
			@AttributeOverride(name = "modd", column = @Column(name = "MODD")),
			@AttributeOverride(name = "docremark", column = @Column(name = "DOCREMARK")),
			@AttributeOverride(name = "systemid", column = @Column(name = "SYSTEMID")),
			@AttributeOverride(name = "amazonpath", column = @Column(name = "AMAZONPATH")),
			@AttributeOverride(name = "transferstatus", column = @Column(name = "TRANSFERSTATUS")),
			@AttributeOverride(name = "description", column = @Column(name = "DESCRIPTION")),
			@AttributeOverride(name = "isactive", column = @Column(name = "ISACTIVE")),
			@AttributeOverride(name = "access", column = @Column(name = "ACCESS")) })
	public MigrationDocToAmazonId getId() {
		return this.id;
	}

	public void setId(MigrationDocToAmazonId id) {
		this.id = id;
	}

}
