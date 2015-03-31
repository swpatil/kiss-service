package com.tdc.persistence.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * MigDocIProd1 generated by hbm2java
 */
@Entity
@Table(name = "MIG_DOC_I_PROD_1", schema = "PCRM")
public class MigDocIProd1 implements java.io.Serializable {

	private MigDocIProd1Id id;

	public MigDocIProd1() {
	}

	public MigDocIProd1(MigDocIProd1Id id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", precision = 22, scale = 0)),
			@AttributeOverride(name = "fileName", column = @Column(name = "FILE_NAME", length = 3000)),
			@AttributeOverride(name = "fullname", column = @Column(name = "FULLNAME", length = 3000)),
			@AttributeOverride(name = "idrivepath", column = @Column(name = "IDRIVEPATH", length = 3000)),
			@AttributeOverride(name = "bucketName", column = @Column(name = "BUCKET_NAME", length = 3000)),
			@AttributeOverride(name = "pathprefix", column = @Column(name = "PATHPREFIX", length = 3000)),
			@AttributeOverride(name = "cableunitno", column = @Column(name = "CABLEUNITNO", length = 3000)),
			@AttributeOverride(name = "caseno", column = @Column(name = "CASENO", length = 3000)),
			@AttributeOverride(name = "customerNumber", column = @Column(name = "CUSTOMER_NUMBER", length = 3000)),
			@AttributeOverride(name = "constructionProjectNumber", column = @Column(name = "CONSTRUCTION_PROJECT_NUMBER", length = 3000)),
			@AttributeOverride(name = "constrHierarchyNumber", column = @Column(name = "CONSTR_HIERARCHY_NUMBER", length = 3000)),
			@AttributeOverride(name = "sfid", column = @Column(name = "SFID", length = 3000)),
			@AttributeOverride(name = "headendnumber", column = @Column(name = "HEADENDNUMBER", length = 3000)),
			@AttributeOverride(name = "contentSize", column = @Column(name = "CONTENT_SIZE", length = 3000)),
			@AttributeOverride(name = "fileSizeMb", column = @Column(name = "FILE_SIZE_MB", length = 3000)),
			@AttributeOverride(name = "timestampcol", column = @Column(name = "TIMESTAMPCOL", length = 3000)),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", length = 3000)),
			@AttributeOverride(name = "contentType", column = @Column(name = "CONTENT_TYPE", length = 3000)),
			@AttributeOverride(name = "fileLabel", column = @Column(name = "FILE_LABEL", length = 3000)),
			@AttributeOverride(name = "kissDoctype", column = @Column(name = "KISS_DOCTYPE", length = 3000)),
			@AttributeOverride(name = "centaDocCategory", column = @Column(name = "CENTA_DOC_CATEGORY", length = 3000)),
			@AttributeOverride(name = "centaDoctype", column = @Column(name = "CENTA_DOCTYPE", length = 3000)),
			@AttributeOverride(name = "documentId", column = @Column(name = "DOCUMENT_ID", length = 3000)),
			@AttributeOverride(name = "extension", column = @Column(name = "EXTENSION", length = 3000)),
			@AttributeOverride(name = "offerid", column = @Column(name = "OFFERID", length = 3000)),
			@AttributeOverride(name = "supplierrequestid", column = @Column(name = "SUPPLIERREQUESTID", length = 3000)),
			@AttributeOverride(name = "mid", column = @Column(name = "MID", length = 3000)),
			@AttributeOverride(name = "department", column = @Column(name = "DEPARTMENT", length = 3000)),
			@AttributeOverride(name = "created", column = @Column(name = "CREATED", length = 3000)),
			@AttributeOverride(name = "crd", column = @Column(name = "CRD", length = 7)),
			@AttributeOverride(name = "lastmodifieddate", column = @Column(name = "LASTMODIFIEDDATE", length = 3000)),
			@AttributeOverride(name = "modd", column = @Column(name = "MODD", length = 7)),
			@AttributeOverride(name = "docremark", column = @Column(name = "DOCREMARK", length = 3000)),
			@AttributeOverride(name = "systemid", column = @Column(name = "SYSTEMID", length = 3000)),
			@AttributeOverride(name = "amazonpath", column = @Column(name = "AMAZONPATH", length = 3000)),
			@AttributeOverride(name = "transferstatus", column = @Column(name = "TRANSFERSTATUS", length = 3000)),
			@AttributeOverride(name = "description", column = @Column(name = "DESCRIPTION", length = 3000)),
			@AttributeOverride(name = "isactive", column = @Column(name = "ISACTIVE", length = 3000)),
			@AttributeOverride(name = "access", column = @Column(name = "ACCESS", length = 3000)),
			@AttributeOverride(name = "documentTag", column = @Column(name = "DOCUMENT_TAG", length = 100)),
			@AttributeOverride(name = "sfDocumentId", column = @Column(name = "SF_DOCUMENT_ID", length = 100)) })
	public MigDocIProd1Id getId() {
		return this.id;
	}

	public void setId(MigDocIProd1Id id) {
		this.id = id;
	}

}
