package com.tdc.persistence.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MigrationDocIDriveUatId generated by hbm2java
 */
@Embeddable
public class MigrationDocIDriveUatId implements java.io.Serializable {

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
	private String sfDocumentId;

	public MigrationDocIDriveUatId() {
	}

	public MigrationDocIDriveUatId(BigDecimal id, String fileName,
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
			String access, String documentTag, String sfDocumentId) {
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
		this.sfDocumentId = sfDocumentId;
	}

	@Column(name = "ID", precision = 22, scale = 0)
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

	@Column(name = "SF_DOCUMENT_ID", length = 100)
	public String getSfDocumentId() {
		return this.sfDocumentId;
	}

	public void setSfDocumentId(String sfDocumentId) {
		this.sfDocumentId = sfDocumentId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MigrationDocIDriveUatId))
			return false;
		MigrationDocIDriveUatId castOther = (MigrationDocIDriveUatId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getFileName() == castOther.getFileName()) || (this
						.getFileName() != null
						&& castOther.getFileName() != null && this
						.getFileName().equals(castOther.getFileName())))
				&& ((this.getFullname() == castOther.getFullname()) || (this
						.getFullname() != null
						&& castOther.getFullname() != null && this
						.getFullname().equals(castOther.getFullname())))
				&& ((this.getIdrivepath() == castOther.getIdrivepath()) || (this
						.getIdrivepath() != null
						&& castOther.getIdrivepath() != null && this
						.getIdrivepath().equals(castOther.getIdrivepath())))
				&& ((this.getBucketName() == castOther.getBucketName()) || (this
						.getBucketName() != null
						&& castOther.getBucketName() != null && this
						.getBucketName().equals(castOther.getBucketName())))
				&& ((this.getPathprefix() == castOther.getPathprefix()) || (this
						.getPathprefix() != null
						&& castOther.getPathprefix() != null && this
						.getPathprefix().equals(castOther.getPathprefix())))
				&& ((this.getCableunitno() == castOther.getCableunitno()) || (this
						.getCableunitno() != null
						&& castOther.getCableunitno() != null && this
						.getCableunitno().equals(castOther.getCableunitno())))
				&& ((this.getCaseno() == castOther.getCaseno()) || (this
						.getCaseno() != null && castOther.getCaseno() != null && this
						.getCaseno().equals(castOther.getCaseno())))
				&& ((this.getCustomerNumber() == castOther.getCustomerNumber()) || (this
						.getCustomerNumber() != null
						&& castOther.getCustomerNumber() != null && this
						.getCustomerNumber().equals(
								castOther.getCustomerNumber())))
				&& ((this.getConstructionProjectNumber() == castOther
						.getConstructionProjectNumber()) || (this
						.getConstructionProjectNumber() != null
						&& castOther.getConstructionProjectNumber() != null && this
						.getConstructionProjectNumber().equals(
								castOther.getConstructionProjectNumber())))
				&& ((this.getConstrHierarchyNumber() == castOther
						.getConstrHierarchyNumber()) || (this
						.getConstrHierarchyNumber() != null
						&& castOther.getConstrHierarchyNumber() != null && this
						.getConstrHierarchyNumber().equals(
								castOther.getConstrHierarchyNumber())))
				&& ((this.getSfid() == castOther.getSfid()) || (this.getSfid() != null
						&& castOther.getSfid() != null && this.getSfid()
						.equals(castOther.getSfid())))
				&& ((this.getHeadendnumber() == castOther.getHeadendnumber()) || (this
						.getHeadendnumber() != null
						&& castOther.getHeadendnumber() != null && this
						.getHeadendnumber()
						.equals(castOther.getHeadendnumber())))
				&& ((this.getContentSize() == castOther.getContentSize()) || (this
						.getContentSize() != null
						&& castOther.getContentSize() != null && this
						.getContentSize().equals(castOther.getContentSize())))
				&& ((this.getFileSizeMb() == castOther.getFileSizeMb()) || (this
						.getFileSizeMb() != null
						&& castOther.getFileSizeMb() != null && this
						.getFileSizeMb().equals(castOther.getFileSizeMb())))
				&& ((this.getTimestampcol() == castOther.getTimestampcol()) || (this
						.getTimestampcol() != null
						&& castOther.getTimestampcol() != null && this
						.getTimestampcol().equals(castOther.getTimestampcol())))
				&& ((this.getVersion() == castOther.getVersion()) || (this
						.getVersion() != null && castOther.getVersion() != null && this
						.getVersion().equals(castOther.getVersion())))
				&& ((this.getContentType() == castOther.getContentType()) || (this
						.getContentType() != null
						&& castOther.getContentType() != null && this
						.getContentType().equals(castOther.getContentType())))
				&& ((this.getFileLabel() == castOther.getFileLabel()) || (this
						.getFileLabel() != null
						&& castOther.getFileLabel() != null && this
						.getFileLabel().equals(castOther.getFileLabel())))
				&& ((this.getKissDoctype() == castOther.getKissDoctype()) || (this
						.getKissDoctype() != null
						&& castOther.getKissDoctype() != null && this
						.getKissDoctype().equals(castOther.getKissDoctype())))
				&& ((this.getCentaDocCategory() == castOther
						.getCentaDocCategory()) || (this.getCentaDocCategory() != null
						&& castOther.getCentaDocCategory() != null && this
						.getCentaDocCategory().equals(
								castOther.getCentaDocCategory())))
				&& ((this.getCentaDoctype() == castOther.getCentaDoctype()) || (this
						.getCentaDoctype() != null
						&& castOther.getCentaDoctype() != null && this
						.getCentaDoctype().equals(castOther.getCentaDoctype())))
				&& ((this.getDocumentId() == castOther.getDocumentId()) || (this
						.getDocumentId() != null
						&& castOther.getDocumentId() != null && this
						.getDocumentId().equals(castOther.getDocumentId())))
				&& ((this.getExtension() == castOther.getExtension()) || (this
						.getExtension() != null
						&& castOther.getExtension() != null && this
						.getExtension().equals(castOther.getExtension())))
				&& ((this.getOfferid() == castOther.getOfferid()) || (this
						.getOfferid() != null && castOther.getOfferid() != null && this
						.getOfferid().equals(castOther.getOfferid())))
				&& ((this.getSupplierrequestid() == castOther
						.getSupplierrequestid()) || (this
						.getSupplierrequestid() != null
						&& castOther.getSupplierrequestid() != null && this
						.getSupplierrequestid().equals(
								castOther.getSupplierrequestid())))
				&& ((this.getMid() == castOther.getMid()) || (this.getMid() != null
						&& castOther.getMid() != null && this.getMid().equals(
						castOther.getMid())))
				&& ((this.getDepartment() == castOther.getDepartment()) || (this
						.getDepartment() != null
						&& castOther.getDepartment() != null && this
						.getDepartment().equals(castOther.getDepartment())))
				&& ((this.getCreated() == castOther.getCreated()) || (this
						.getCreated() != null && castOther.getCreated() != null && this
						.getCreated().equals(castOther.getCreated())))
				&& ((this.getCrd() == castOther.getCrd()) || (this.getCrd() != null
						&& castOther.getCrd() != null && this.getCrd().equals(
						castOther.getCrd())))
				&& ((this.getLastmodifieddate() == castOther
						.getLastmodifieddate()) || (this.getLastmodifieddate() != null
						&& castOther.getLastmodifieddate() != null && this
						.getLastmodifieddate().equals(
								castOther.getLastmodifieddate())))
				&& ((this.getModd() == castOther.getModd()) || (this.getModd() != null
						&& castOther.getModd() != null && this.getModd()
						.equals(castOther.getModd())))
				&& ((this.getDocremark() == castOther.getDocremark()) || (this
						.getDocremark() != null
						&& castOther.getDocremark() != null && this
						.getDocremark().equals(castOther.getDocremark())))
				&& ((this.getSystemid() == castOther.getSystemid()) || (this
						.getSystemid() != null
						&& castOther.getSystemid() != null && this
						.getSystemid().equals(castOther.getSystemid())))
				&& ((this.getAmazonpath() == castOther.getAmazonpath()) || (this
						.getAmazonpath() != null
						&& castOther.getAmazonpath() != null && this
						.getAmazonpath().equals(castOther.getAmazonpath())))
				&& ((this.getTransferstatus() == castOther.getTransferstatus()) || (this
						.getTransferstatus() != null
						&& castOther.getTransferstatus() != null && this
						.getTransferstatus().equals(
								castOther.getTransferstatus())))
				&& ((this.getDescription() == castOther.getDescription()) || (this
						.getDescription() != null
						&& castOther.getDescription() != null && this
						.getDescription().equals(castOther.getDescription())))
				&& ((this.getIsactive() == castOther.getIsactive()) || (this
						.getIsactive() != null
						&& castOther.getIsactive() != null && this
						.getIsactive().equals(castOther.getIsactive())))
				&& ((this.getAccess() == castOther.getAccess()) || (this
						.getAccess() != null && castOther.getAccess() != null && this
						.getAccess().equals(castOther.getAccess())))
				&& ((this.getDocumentTag() == castOther.getDocumentTag()) || (this
						.getDocumentTag() != null
						&& castOther.getDocumentTag() != null && this
						.getDocumentTag().equals(castOther.getDocumentTag())))
				&& ((this.getSfDocumentId() == castOther.getSfDocumentId()) || (this
						.getSfDocumentId() != null
						&& castOther.getSfDocumentId() != null && this
						.getSfDocumentId().equals(castOther.getSfDocumentId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getFileName() == null ? 0 : this.getFileName().hashCode());
		result = 37 * result
				+ (getFullname() == null ? 0 : this.getFullname().hashCode());
		result = 37
				* result
				+ (getIdrivepath() == null ? 0 : this.getIdrivepath()
						.hashCode());
		result = 37
				* result
				+ (getBucketName() == null ? 0 : this.getBucketName()
						.hashCode());
		result = 37
				* result
				+ (getPathprefix() == null ? 0 : this.getPathprefix()
						.hashCode());
		result = 37
				* result
				+ (getCableunitno() == null ? 0 : this.getCableunitno()
						.hashCode());
		result = 37 * result
				+ (getCaseno() == null ? 0 : this.getCaseno().hashCode());
		result = 37
				* result
				+ (getCustomerNumber() == null ? 0 : this.getCustomerNumber()
						.hashCode());
		result = 37
				* result
				+ (getConstructionProjectNumber() == null ? 0 : this
						.getConstructionProjectNumber().hashCode());
		result = 37
				* result
				+ (getConstrHierarchyNumber() == null ? 0 : this
						.getConstrHierarchyNumber().hashCode());
		result = 37 * result
				+ (getSfid() == null ? 0 : this.getSfid().hashCode());
		result = 37
				* result
				+ (getHeadendnumber() == null ? 0 : this.getHeadendnumber()
						.hashCode());
		result = 37
				* result
				+ (getContentSize() == null ? 0 : this.getContentSize()
						.hashCode());
		result = 37
				* result
				+ (getFileSizeMb() == null ? 0 : this.getFileSizeMb()
						.hashCode());
		result = 37
				* result
				+ (getTimestampcol() == null ? 0 : this.getTimestampcol()
						.hashCode());
		result = 37 * result
				+ (getVersion() == null ? 0 : this.getVersion().hashCode());
		result = 37
				* result
				+ (getContentType() == null ? 0 : this.getContentType()
						.hashCode());
		result = 37 * result
				+ (getFileLabel() == null ? 0 : this.getFileLabel().hashCode());
		result = 37
				* result
				+ (getKissDoctype() == null ? 0 : this.getKissDoctype()
						.hashCode());
		result = 37
				* result
				+ (getCentaDocCategory() == null ? 0 : this
						.getCentaDocCategory().hashCode());
		result = 37
				* result
				+ (getCentaDoctype() == null ? 0 : this.getCentaDoctype()
						.hashCode());
		result = 37
				* result
				+ (getDocumentId() == null ? 0 : this.getDocumentId()
						.hashCode());
		result = 37 * result
				+ (getExtension() == null ? 0 : this.getExtension().hashCode());
		result = 37 * result
				+ (getOfferid() == null ? 0 : this.getOfferid().hashCode());
		result = 37
				* result
				+ (getSupplierrequestid() == null ? 0 : this
						.getSupplierrequestid().hashCode());
		result = 37 * result
				+ (getMid() == null ? 0 : this.getMid().hashCode());
		result = 37
				* result
				+ (getDepartment() == null ? 0 : this.getDepartment()
						.hashCode());
		result = 37 * result
				+ (getCreated() == null ? 0 : this.getCreated().hashCode());
		result = 37 * result
				+ (getCrd() == null ? 0 : this.getCrd().hashCode());
		result = 37
				* result
				+ (getLastmodifieddate() == null ? 0 : this
						.getLastmodifieddate().hashCode());
		result = 37 * result
				+ (getModd() == null ? 0 : this.getModd().hashCode());
		result = 37 * result
				+ (getDocremark() == null ? 0 : this.getDocremark().hashCode());
		result = 37 * result
				+ (getSystemid() == null ? 0 : this.getSystemid().hashCode());
		result = 37
				* result
				+ (getAmazonpath() == null ? 0 : this.getAmazonpath()
						.hashCode());
		result = 37
				* result
				+ (getTransferstatus() == null ? 0 : this.getTransferstatus()
						.hashCode());
		result = 37
				* result
				+ (getDescription() == null ? 0 : this.getDescription()
						.hashCode());
		result = 37 * result
				+ (getIsactive() == null ? 0 : this.getIsactive().hashCode());
		result = 37 * result
				+ (getAccess() == null ? 0 : this.getAccess().hashCode());
		result = 37
				* result
				+ (getDocumentTag() == null ? 0 : this.getDocumentTag()
						.hashCode());
		result = 37
				* result
				+ (getSfDocumentId() == null ? 0 : this.getSfDocumentId()
						.hashCode());
		return result;
	}

}
