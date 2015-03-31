package com.tdc.persistence.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * CableunitDocumentsLog generated by hbm2java
 */
@Entity
@Table(name = "CABLEUNIT_DOCUMENTS_LOG", schema = "PCRM")
public class CableunitDocumentsLog implements java.io.Serializable {

	private CableunitDocumentsLogId id;

	public CableunitDocumentsLog() {
	}

	public CableunitDocumentsLog(CableunitDocumentsLogId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "docOrgNodeid", column = @Column(name = "DOC_ORG_NODEID", length = 3000)),
			@AttributeOverride(name = "nodOrgNodeid", column = @Column(name = "NOD_ORG_NODEID", length = 3000)),
			@AttributeOverride(name = "nodeid", column = @Column(name = "NODEID", length = 3000)),
			@AttributeOverride(name = "fileextension", column = @Column(name = "FILEEXTENSION", length = 3000)),
			@AttributeOverride(name = "active", column = @Column(name = "ACTIVE", length = 3000)),
			@AttributeOverride(name = "title", column = @Column(name = "TITLE", length = 3000)),
			@AttributeOverride(name = "oprettet", column = @Column(name = "OPRETTET", length = 3000)),
			@AttributeOverride(name = "endret", column = @Column(name = "ENDRET", length = 3000)),
			@AttributeOverride(name = "cableunitno", column = @Column(name = "CABLEUNITNO", length = 3000)),
			@AttributeOverride(name = "nodeTitle", column = @Column(name = "NODE_TITLE", length = 3000)),
			@AttributeOverride(name = "cuNodeid", column = @Column(name = "CU_NODEID", length = 3000)),
			@AttributeOverride(name = "creatordepartment", column = @Column(name = "CREATORDEPARTMENT", length = 3000)),
			@AttributeOverride(name = "documenttitle", column = @Column(name = "DOCUMENTTITLE", length = 3000)),
			@AttributeOverride(name = "documenttype", column = @Column(name = "DOCUMENTTYPE", length = 3000)),
			@AttributeOverride(name = "labelNum", column = @Column(name = "LABEL_NUM", precision = 22, scale = 0)),
			@AttributeOverride(name = "label", column = @Column(name = "LABEL", length = 200)),
			@AttributeOverride(name = "newDept", column = @Column(name = "NEW_DEPT", length = 3000)),
			@AttributeOverride(name = "amazonPath", column = @Column(name = "AMAZON_PATH", length = 3000)),
			@AttributeOverride(name = "sfid", column = @Column(name = "SFID", length = 300)),
			@AttributeOverride(name = "contentType", column = @Column(name = "CONTENT_TYPE", length = 1000)),
			@AttributeOverride(name = "contentSize", column = @Column(name = "CONTENT_SIZE", length = 1000)),
			@AttributeOverride(name = "mid", column = @Column(name = "MID", length = 3000)),
			@AttributeOverride(name = "timestampcol", column = @Column(name = "TIMESTAMPCOL", length = 3000)),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", precision = 22, scale = 0)) })
	public CableunitDocumentsLogId getId() {
		return this.id;
	}

	public void setId(CableunitDocumentsLogId id) {
		this.id = id;
	}

}
