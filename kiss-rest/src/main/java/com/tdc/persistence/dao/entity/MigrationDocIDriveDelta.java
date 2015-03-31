package com.tdc.persistence.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MigrationDocIDriveDelta generated by hbm2java
 */
@Entity
@Table(name = "MIGRATION_DOC_I_DRIVE_DELTA", schema = "PCRM")
public class MigrationDocIDriveDelta implements java.io.Serializable {

	private BigDecimal id;
	private String fileName;
	private String fullname;
	private String idrivepath;
	private String bucketName;
	private String pathprefix;
	private String cableunitno;
	private String caseno;
	private String customerNumber;
	private String constructionProjectNumber;
	private String constrHierarchyNumber;
	private String sfid;
	private String headendnumber;
	private String contentSize;
	private String fileSizeMb;
	private String timestampcol;
	private String version;
	private String contentType;
	private String fileLabel;
	private String kissDoctype;
	private String centaDocCategory;
	private String centaDoctype;
	private String documentId;
	private String extension;
	private String offerid;
	private String supplierrequestid;
	private String mid;
	private String department;
	private String created;
	private Date crd;
	private String lastmodifieddate;
	private Date modd;
	private String docremark;
	private String systemid;
	private String amazonpath;
	private String transferstatus;
	private String description;
	private String isactive;
	private String access;
	private String documentTag;

	public MigrationDocIDriveDelta() {
	}

	public MigrationDocIDriveDelta(BigDecimal id) {
		this.id = id;
	}

	public MigrationDocIDriveDelta(BigDecimal id, String fileName,
			String fullname, String idrivepath, String bucketName,
			String pathprefix, String cableunitno, String caseno,
			String customerNumber, String constructionProjectNumber,
			String constrHierarchyNumber, String sfid, String headendnumber,
			String contentSize, String fileSizeMb, String timestampcol,
			String version, String contentType, String fileLabel,
			String kissDoctype, String centaDocCategory, String centaDoctype,
			String documentId, String extension, String offerid,
			String supplierrequestid, String mid, String department,
			String created, Date crd, String lastmodifieddate, Date modd,
			String docremark, String systemid, String amazonpath,
			String transferstatus, String description, String isactive,
			String access, String documentTag) {
		this.id = id;
		this.fileName = fileName;
		this.fullname = fullname;
		this.idrivepath = idrivepath;
		this.bucketName = bucketName;
		this.pathprefix = pathprefix;
		this.cableunitno = cableunitno;
		this.caseno = caseno;
		this.customerNumber = customerNumber;
		this.constructionProjectNumber = constructionProjectNumber;
		this.constrHierarchyNumber = constrHierarchyNumber;
		this.sfid = sfid;
		this.headendnumber = headendnumber;
		this.contentSize = contentSize;
		this.fileSizeMb = fileSizeMb;
		this.timestampcol = timestampcol;
		this.version = version;
		this.contentType = contentType;
		this.fileLabel = fileLabel;
		this.kissDoctype = kissDoctype;
		this.centaDocCategory = centaDocCategory;
		this.centaDoctype = centaDoctype;
		this.documentId = documentId;
		this.extension = extension;
		this.offerid = offerid;
		this.supplierrequestid = supplierrequestid;
		this.mid = mid;
		this.department = department;
		this.created = created;
		this.crd = crd;
		this.lastmodifieddate = lastmodifieddate;
		this.modd = modd;
		this.docremark = docremark;
		this.systemid = systemid;
		this.amazonpath = amazonpath;
		this.transferstatus = transferstatus;
		this.description = description;
		this.isactive = isactive;
		this.access = access;
		this.documentTag = documentTag;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	@Column(name = "FILE_NAME", length = 3000)
	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Column(name = "FULLNAME", length = 3000)
	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	@Column(name = "IDRIVEPATH", length = 3000)
	public String getIdrivepath() {
		return this.idrivepath;
	}

	public void setIdrivepath(String idrivepath) {
		this.idrivepath = idrivepath;
	}

	@Column(name = "BUCKET_NAME", length = 3000)
	public String getBucketName() {
		return this.bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	@Column(name = "PATHPREFIX", length = 3000)
	public String getPathprefix() {
		return this.pathprefix;
	}

	public void setPathprefix(String pathprefix) {
		this.pathprefix = pathprefix;
	}

	@Column(name = "CABLEUNITNO", length = 3000)
	public String getCableunitno() {
		return this.cableunitno;
	}

	public void setCableunitno(String cableunitno) {
		this.cableunitno = cableunitno;
	}

	@Column(name = "CASENO", length = 3000)
	public String getCaseno() {
		return this.caseno;
	}

	public void setCaseno(String caseno) {
		this.caseno = caseno;
	}

	@Column(name = "CUSTOMER_NUMBER", length = 3000)
	public String getCustomerNumber() {
		return this.customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	@Column(name = "CONSTRUCTION_PROJECT_NUMBER", length = 3000)
	public String getConstructionProjectNumber() {
		return this.constructionProjectNumber;
	}

	public void setConstructionProjectNumber(String constructionProjectNumber) {
		this.constructionProjectNumber = constructionProjectNumber;
	}

	@Column(name = "CONSTR_HIERARCHY_NUMBER", length = 3000)
	public String getConstrHierarchyNumber() {
		return this.constrHierarchyNumber;
	}

	public void setConstrHierarchyNumber(String constrHierarchyNumber) {
		this.constrHierarchyNumber = constrHierarchyNumber;
	}

	@Column(name = "SFID", length = 3000)
	public String getSfid() {
		return this.sfid;
	}

	public void setSfid(String sfid) {
		this.sfid = sfid;
	}

	@Column(name = "HEADENDNUMBER", length = 3000)
	public String getHeadendnumber() {
		return this.headendnumber;
	}

	public void setHeadendnumber(String headendnumber) {
		this.headendnumber = headendnumber;
	}

	@Column(name = "CONTENT_SIZE", length = 3000)
	public String getContentSize() {
		return this.contentSize;
	}

	public void setContentSize(String contentSize) {
		this.contentSize = contentSize;
	}

	@Column(name = "FILE_SIZE_MB", length = 3000)
	public String getFileSizeMb() {
		return this.fileSizeMb;
	}

	public void setFileSizeMb(String fileSizeMb) {
		this.fileSizeMb = fileSizeMb;
	}

	@Column(name = "TIMESTAMPCOL", length = 3000)
	public String getTimestampcol() {
		return this.timestampcol;
	}

	public void setTimestampcol(String timestampcol) {
		this.timestampcol = timestampcol;
	}

	@Column(name = "VERSION", length = 3000)
	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Column(name = "CONTENT_TYPE", length = 3000)
	public String getContentType() {
		return this.contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	@Column(name = "FILE_LABEL", length = 3000)
	public String getFileLabel() {
		return this.fileLabel;
	}

	public void setFileLabel(String fileLabel) {
		this.fileLabel = fileLabel;
	}

	@Column(name = "KISS_DOCTYPE", length = 3000)
	public String getKissDoctype() {
		return this.kissDoctype;
	}

	public void setKissDoctype(String kissDoctype) {
		this.kissDoctype = kissDoctype;
	}

	@Column(name = "CENTA_DOC_CATEGORY", length = 3000)
	public String getCentaDocCategory() {
		return this.centaDocCategory;
	}

	public void setCentaDocCategory(String centaDocCategory) {
		this.centaDocCategory = centaDocCategory;
	}

	@Column(name = "CENTA_DOCTYPE", length = 3000)
	public String getCentaDoctype() {
		return this.centaDoctype;
	}

	public void setCentaDoctype(String centaDoctype) {
		this.centaDoctype = centaDoctype;
	}

	@Column(name = "DOCUMENT_ID", length = 3000)
	public String getDocumentId() {
		return this.documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	@Column(name = "EXTENSION", length = 3000)
	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	@Column(name = "OFFERID", length = 3000)
	public String getOfferid() {
		return this.offerid;
	}

	public void setOfferid(String offerid) {
		this.offerid = offerid;
	}

	@Column(name = "SUPPLIERREQUESTID", length = 3000)
	public String getSupplierrequestid() {
		return this.supplierrequestid;
	}

	public void setSupplierrequestid(String supplierrequestid) {
		this.supplierrequestid = supplierrequestid;
	}

	@Column(name = "MID", length = 3000)
	public String getMid() {
		return this.mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	@Column(name = "DEPARTMENT", length = 3000)
	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Column(name = "CREATED", length = 3000)
	public String getCreated() {
		return this.created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRD", length = 7)
	public Date getCrd() {
		return this.crd;
	}

	public void setCrd(Date crd) {
		this.crd = crd;
	}

	@Column(name = "LASTMODIFIEDDATE", length = 3000)
	public String getLastmodifieddate() {
		return this.lastmodifieddate;
	}

	public void setLastmodifieddate(String lastmodifieddate) {
		this.lastmodifieddate = lastmodifieddate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "MODD", length = 7)
	public Date getModd() {
		return this.modd;
	}

	public void setModd(Date modd) {
		this.modd = modd;
	}

	@Column(name = "DOCREMARK", length = 3000)
	public String getDocremark() {
		return this.docremark;
	}

	public void setDocremark(String docremark) {
		this.docremark = docremark;
	}

	@Column(name = "SYSTEMID", length = 3000)
	public String getSystemid() {
		return this.systemid;
	}

	public void setSystemid(String systemid) {
		this.systemid = systemid;
	}

	@Column(name = "AMAZONPATH", length = 3000)
	public String getAmazonpath() {
		return this.amazonpath;
	}

	public void setAmazonpath(String amazonpath) {
		this.amazonpath = amazonpath;
	}

	@Column(name = "TRANSFERSTATUS", length = 3000)
	public String getTransferstatus() {
		return this.transferstatus;
	}

	public void setTransferstatus(String transferstatus) {
		this.transferstatus = transferstatus;
	}

	@Column(name = "DESCRIPTION", length = 3000)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "ISACTIVE", length = 3000)
	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	@Column(name = "ACCESS", length = 3000)
	public String getAccess() {
		return this.access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

	@Column(name = "DOCUMENT_TAG", length = 100)
	public String getDocumentTag() {
		return this.documentTag;
	}

	public void setDocumentTag(String documentTag) {
		this.documentTag = documentTag;
	}

}
