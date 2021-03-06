package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MigrationDocIDriveId generated by hbm2java
 */
@Embeddable
public class MigrationDocIDriveId implements java.io.Serializable {

	private String centaDocumentNameC;
	private String cloudFileAccessC;
	private String cloudFileAllCategoriesC;
	private String cloudFileAllDocTypesC;
	private String cloudFileBucketNameC;
	private String cloudFileCaseNoC;
	private String cloudFileCentaDocTypeC;
	private String cloudFileContentTypeC;
	private String constructionProjectNumber;
	private String cloudFileCreatedDateC;
	private String cloudFileCustomerNumbersC;
	private String cableunitno;
	private String cloudFileDepartmentC;
	private String cloudFileDescriptionC;
	private String cloudFileDoctitleC;
	private String cloudFileDocumentRemarkC;
	private String cloudFileDocumentTagC;
	private String cloudFileDocRemarkC;
	private String amazonpath;
	private String cloudFileHierCustNoC;
	private String cloudFileKissDocTypeC;
	private String cloudFileMidC;
	private String cloudFileOfferIdC;
	private String cloudFilePathPrefixC;
	private String cloudFileRelatedToIdC;
	private String cloudFileStatusC;
	private String cloudFileSupplierC;
	private String cloudFileTitleC;
	private String cloudFileUploadedByC;
	private String createdbyid;
	private String createddate;
	private String sfDocumentId;
	private String isactiveC;
	private String isdeleted;
	private String lastmodifiedbyid;
	private String lastmodifieddate;
	private String lastreferenceddate;
	private String lastvieweddate;
	private String name;
	private String ownerid;
	private String systemmodstamp;

	public MigrationDocIDriveId() {
	}

	public MigrationDocIDriveId(String centaDocumentNameC,
			String cloudFileAccessC, String cloudFileAllCategoriesC,
			String cloudFileAllDocTypesC, String cloudFileBucketNameC,
			String cloudFileCaseNoC, String cloudFileCentaDocTypeC,
			String cloudFileContentTypeC, String constructionProjectNumber,
			String cloudFileCreatedDateC, String cloudFileCustomerNumbersC,
			String cableunitno, String cloudFileDepartmentC,
			String cloudFileDescriptionC, String cloudFileDoctitleC,
			String cloudFileDocumentRemarkC, String cloudFileDocumentTagC,
			String cloudFileDocRemarkC, String amazonpath,
			String cloudFileHierCustNoC, String cloudFileKissDocTypeC,
			String cloudFileMidC, String cloudFileOfferIdC,
			String cloudFilePathPrefixC, String cloudFileRelatedToIdC,
			String cloudFileStatusC, String cloudFileSupplierC,
			String cloudFileTitleC, String cloudFileUploadedByC,
			String createdbyid, String createddate, String sfDocumentId,
			String isactiveC, String isdeleted, String lastmodifiedbyid,
			String lastmodifieddate, String lastreferenceddate,
			String lastvieweddate, String name, String ownerid,
			String systemmodstamp) {
		this.centaDocumentNameC = centaDocumentNameC;
		this.cloudFileAccessC = cloudFileAccessC;
		this.cloudFileAllCategoriesC = cloudFileAllCategoriesC;
		this.cloudFileAllDocTypesC = cloudFileAllDocTypesC;
		this.cloudFileBucketNameC = cloudFileBucketNameC;
		this.cloudFileCaseNoC = cloudFileCaseNoC;
		this.cloudFileCentaDocTypeC = cloudFileCentaDocTypeC;
		this.cloudFileContentTypeC = cloudFileContentTypeC;
		this.constructionProjectNumber = constructionProjectNumber;
		this.cloudFileCreatedDateC = cloudFileCreatedDateC;
		this.cloudFileCustomerNumbersC = cloudFileCustomerNumbersC;
		this.cableunitno = cableunitno;
		this.cloudFileDepartmentC = cloudFileDepartmentC;
		this.cloudFileDescriptionC = cloudFileDescriptionC;
		this.cloudFileDoctitleC = cloudFileDoctitleC;
		this.cloudFileDocumentRemarkC = cloudFileDocumentRemarkC;
		this.cloudFileDocumentTagC = cloudFileDocumentTagC;
		this.cloudFileDocRemarkC = cloudFileDocRemarkC;
		this.amazonpath = amazonpath;
		this.cloudFileHierCustNoC = cloudFileHierCustNoC;
		this.cloudFileKissDocTypeC = cloudFileKissDocTypeC;
		this.cloudFileMidC = cloudFileMidC;
		this.cloudFileOfferIdC = cloudFileOfferIdC;
		this.cloudFilePathPrefixC = cloudFilePathPrefixC;
		this.cloudFileRelatedToIdC = cloudFileRelatedToIdC;
		this.cloudFileStatusC = cloudFileStatusC;
		this.cloudFileSupplierC = cloudFileSupplierC;
		this.cloudFileTitleC = cloudFileTitleC;
		this.cloudFileUploadedByC = cloudFileUploadedByC;
		this.createdbyid = createdbyid;
		this.createddate = createddate;
		this.sfDocumentId = sfDocumentId;
		this.isactiveC = isactiveC;
		this.isdeleted = isdeleted;
		this.lastmodifiedbyid = lastmodifiedbyid;
		this.lastmodifieddate = lastmodifieddate;
		this.lastreferenceddate = lastreferenceddate;
		this.lastvieweddate = lastvieweddate;
		this.name = name;
		this.ownerid = ownerid;
		this.systemmodstamp = systemmodstamp;
	}

	@Column(name = "CENTA_DOCUMENT_NAME__C", length = 100)
	public String getCentaDocumentNameC() {
		return this.centaDocumentNameC;
	}

	public void setCentaDocumentNameC(String centaDocumentNameC) {
		this.centaDocumentNameC = centaDocumentNameC;
	}

	@Column(name = "CLOUD_FILE_ACCESS__C", length = 100)
	public String getCloudFileAccessC() {
		return this.cloudFileAccessC;
	}

	public void setCloudFileAccessC(String cloudFileAccessC) {
		this.cloudFileAccessC = cloudFileAccessC;
	}

	@Column(name = "CLOUD_FILE_ALL_CATEGORIES__C", length = 100)
	public String getCloudFileAllCategoriesC() {
		return this.cloudFileAllCategoriesC;
	}

	public void setCloudFileAllCategoriesC(String cloudFileAllCategoriesC) {
		this.cloudFileAllCategoriesC = cloudFileAllCategoriesC;
	}

	@Column(name = "CLOUD_FILE_ALL_DOC_TYPES__C", length = 100)
	public String getCloudFileAllDocTypesC() {
		return this.cloudFileAllDocTypesC;
	}

	public void setCloudFileAllDocTypesC(String cloudFileAllDocTypesC) {
		this.cloudFileAllDocTypesC = cloudFileAllDocTypesC;
	}

	@Column(name = "CLOUD_FILE_BUCKET_NAME__C", length = 100)
	public String getCloudFileBucketNameC() {
		return this.cloudFileBucketNameC;
	}

	public void setCloudFileBucketNameC(String cloudFileBucketNameC) {
		this.cloudFileBucketNameC = cloudFileBucketNameC;
	}

	@Column(name = "CLOUD_FILE_CASE_NO__C", length = 100)
	public String getCloudFileCaseNoC() {
		return this.cloudFileCaseNoC;
	}

	public void setCloudFileCaseNoC(String cloudFileCaseNoC) {
		this.cloudFileCaseNoC = cloudFileCaseNoC;
	}

	@Column(name = "CLOUD_FILE_CENTA_DOC_TYPE__C", length = 100)
	public String getCloudFileCentaDocTypeC() {
		return this.cloudFileCentaDocTypeC;
	}

	public void setCloudFileCentaDocTypeC(String cloudFileCentaDocTypeC) {
		this.cloudFileCentaDocTypeC = cloudFileCentaDocTypeC;
	}

	@Column(name = "CLOUD_FILE_CONTENT_TYPE__C", length = 100)
	public String getCloudFileContentTypeC() {
		return this.cloudFileContentTypeC;
	}

	public void setCloudFileContentTypeC(String cloudFileContentTypeC) {
		this.cloudFileContentTypeC = cloudFileContentTypeC;
	}

	@Column(name = "CONSTRUCTION_PROJECT_NUMBER", length = 100)
	public String getConstructionProjectNumber() {
		return this.constructionProjectNumber;
	}

	public void setConstructionProjectNumber(String constructionProjectNumber) {
		this.constructionProjectNumber = constructionProjectNumber;
	}

	@Column(name = "CLOUD_FILE_CREATED_DATE__C", length = 100)
	public String getCloudFileCreatedDateC() {
		return this.cloudFileCreatedDateC;
	}

	public void setCloudFileCreatedDateC(String cloudFileCreatedDateC) {
		this.cloudFileCreatedDateC = cloudFileCreatedDateC;
	}

	@Column(name = "CLOUD_FILE_CUSTOMER_NUMBERS__C", length = 100)
	public String getCloudFileCustomerNumbersC() {
		return this.cloudFileCustomerNumbersC;
	}

	public void setCloudFileCustomerNumbersC(String cloudFileCustomerNumbersC) {
		this.cloudFileCustomerNumbersC = cloudFileCustomerNumbersC;
	}

	@Column(name = "CABLEUNITNO", length = 100)
	public String getCableunitno() {
		return this.cableunitno;
	}

	public void setCableunitno(String cableunitno) {
		this.cableunitno = cableunitno;
	}

	@Column(name = "CLOUD_FILE_DEPARTMENT__C", length = 100)
	public String getCloudFileDepartmentC() {
		return this.cloudFileDepartmentC;
	}

	public void setCloudFileDepartmentC(String cloudFileDepartmentC) {
		this.cloudFileDepartmentC = cloudFileDepartmentC;
	}

	@Column(name = "CLOUD_FILE_DESCRIPTION__C", length = 100)
	public String getCloudFileDescriptionC() {
		return this.cloudFileDescriptionC;
	}

	public void setCloudFileDescriptionC(String cloudFileDescriptionC) {
		this.cloudFileDescriptionC = cloudFileDescriptionC;
	}

	@Column(name = "CLOUD_FILE_DOCTITLE__C", length = 1000)
	public String getCloudFileDoctitleC() {
		return this.cloudFileDoctitleC;
	}

	public void setCloudFileDoctitleC(String cloudFileDoctitleC) {
		this.cloudFileDoctitleC = cloudFileDoctitleC;
	}

	@Column(name = "CLOUD_FILE_DOCUMENT_REMARK__C", length = 100)
	public String getCloudFileDocumentRemarkC() {
		return this.cloudFileDocumentRemarkC;
	}

	public void setCloudFileDocumentRemarkC(String cloudFileDocumentRemarkC) {
		this.cloudFileDocumentRemarkC = cloudFileDocumentRemarkC;
	}

	@Column(name = "CLOUD_FILE_DOCUMENT_TAG__C", length = 100)
	public String getCloudFileDocumentTagC() {
		return this.cloudFileDocumentTagC;
	}

	public void setCloudFileDocumentTagC(String cloudFileDocumentTagC) {
		this.cloudFileDocumentTagC = cloudFileDocumentTagC;
	}

	@Column(name = "CLOUD_FILE_DOC_REMARK__C", length = 100)
	public String getCloudFileDocRemarkC() {
		return this.cloudFileDocRemarkC;
	}

	public void setCloudFileDocRemarkC(String cloudFileDocRemarkC) {
		this.cloudFileDocRemarkC = cloudFileDocRemarkC;
	}

	@Column(name = "AMAZONPATH", length = 100)
	public String getAmazonpath() {
		return this.amazonpath;
	}

	public void setAmazonpath(String amazonpath) {
		this.amazonpath = amazonpath;
	}

	@Column(name = "CLOUD_FILE_HIER_CUST_NO__C", length = 100)
	public String getCloudFileHierCustNoC() {
		return this.cloudFileHierCustNoC;
	}

	public void setCloudFileHierCustNoC(String cloudFileHierCustNoC) {
		this.cloudFileHierCustNoC = cloudFileHierCustNoC;
	}

	@Column(name = "CLOUD_FILE_KISS_DOC_TYPE__C", length = 100)
	public String getCloudFileKissDocTypeC() {
		return this.cloudFileKissDocTypeC;
	}

	public void setCloudFileKissDocTypeC(String cloudFileKissDocTypeC) {
		this.cloudFileKissDocTypeC = cloudFileKissDocTypeC;
	}

	@Column(name = "CLOUD_FILE_MID__C", length = 100)
	public String getCloudFileMidC() {
		return this.cloudFileMidC;
	}

	public void setCloudFileMidC(String cloudFileMidC) {
		this.cloudFileMidC = cloudFileMidC;
	}

	@Column(name = "CLOUD_FILE_OFFER_ID__C", length = 100)
	public String getCloudFileOfferIdC() {
		return this.cloudFileOfferIdC;
	}

	public void setCloudFileOfferIdC(String cloudFileOfferIdC) {
		this.cloudFileOfferIdC = cloudFileOfferIdC;
	}

	@Column(name = "CLOUD_FILE_PATH_PREFIX__C", length = 100)
	public String getCloudFilePathPrefixC() {
		return this.cloudFilePathPrefixC;
	}

	public void setCloudFilePathPrefixC(String cloudFilePathPrefixC) {
		this.cloudFilePathPrefixC = cloudFilePathPrefixC;
	}

	@Column(name = "CLOUD_FILE_RELATED_TO_ID__C", length = 100)
	public String getCloudFileRelatedToIdC() {
		return this.cloudFileRelatedToIdC;
	}

	public void setCloudFileRelatedToIdC(String cloudFileRelatedToIdC) {
		this.cloudFileRelatedToIdC = cloudFileRelatedToIdC;
	}

	@Column(name = "CLOUD_FILE_STATUS__C", length = 100)
	public String getCloudFileStatusC() {
		return this.cloudFileStatusC;
	}

	public void setCloudFileStatusC(String cloudFileStatusC) {
		this.cloudFileStatusC = cloudFileStatusC;
	}

	@Column(name = "CLOUD_FILE_SUPPLIER__C", length = 100)
	public String getCloudFileSupplierC() {
		return this.cloudFileSupplierC;
	}

	public void setCloudFileSupplierC(String cloudFileSupplierC) {
		this.cloudFileSupplierC = cloudFileSupplierC;
	}

	@Column(name = "CLOUD_FILE_TITLE__C", length = 100)
	public String getCloudFileTitleC() {
		return this.cloudFileTitleC;
	}

	public void setCloudFileTitleC(String cloudFileTitleC) {
		this.cloudFileTitleC = cloudFileTitleC;
	}

	@Column(name = "CLOUD_FILE_UPLOADED_BY__C", length = 100)
	public String getCloudFileUploadedByC() {
		return this.cloudFileUploadedByC;
	}

	public void setCloudFileUploadedByC(String cloudFileUploadedByC) {
		this.cloudFileUploadedByC = cloudFileUploadedByC;
	}

	@Column(name = "CREATEDBYID", length = 100)
	public String getCreatedbyid() {
		return this.createdbyid;
	}

	public void setCreatedbyid(String createdbyid) {
		this.createdbyid = createdbyid;
	}

	@Column(name = "CREATEDDATE", length = 100)
	public String getCreateddate() {
		return this.createddate;
	}

	public void setCreateddate(String createddate) {
		this.createddate = createddate;
	}

	@Column(name = "SF_DOCUMENT_ID", length = 100)
	public String getSfDocumentId() {
		return this.sfDocumentId;
	}

	public void setSfDocumentId(String sfDocumentId) {
		this.sfDocumentId = sfDocumentId;
	}

	@Column(name = "ISACTIVE__C", length = 100)
	public String getIsactiveC() {
		return this.isactiveC;
	}

	public void setIsactiveC(String isactiveC) {
		this.isactiveC = isactiveC;
	}

	@Column(name = "ISDELETED", length = 100)
	public String getIsdeleted() {
		return this.isdeleted;
	}

	public void setIsdeleted(String isdeleted) {
		this.isdeleted = isdeleted;
	}

	@Column(name = "LASTMODIFIEDBYID", length = 100)
	public String getLastmodifiedbyid() {
		return this.lastmodifiedbyid;
	}

	public void setLastmodifiedbyid(String lastmodifiedbyid) {
		this.lastmodifiedbyid = lastmodifiedbyid;
	}

	@Column(name = "LASTMODIFIEDDATE", length = 100)
	public String getLastmodifieddate() {
		return this.lastmodifieddate;
	}

	public void setLastmodifieddate(String lastmodifieddate) {
		this.lastmodifieddate = lastmodifieddate;
	}

	@Column(name = "LASTREFERENCEDDATE", length = 100)
	public String getLastreferenceddate() {
		return this.lastreferenceddate;
	}

	public void setLastreferenceddate(String lastreferenceddate) {
		this.lastreferenceddate = lastreferenceddate;
	}

	@Column(name = "LASTVIEWEDDATE", length = 100)
	public String getLastvieweddate() {
		return this.lastvieweddate;
	}

	public void setLastvieweddate(String lastvieweddate) {
		this.lastvieweddate = lastvieweddate;
	}

	@Column(name = "NAME", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "OWNERID", length = 100)
	public String getOwnerid() {
		return this.ownerid;
	}

	public void setOwnerid(String ownerid) {
		this.ownerid = ownerid;
	}

	@Column(name = "SYSTEMMODSTAMP", length = 100)
	public String getSystemmodstamp() {
		return this.systemmodstamp;
	}

	public void setSystemmodstamp(String systemmodstamp) {
		this.systemmodstamp = systemmodstamp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MigrationDocIDriveId))
			return false;
		MigrationDocIDriveId castOther = (MigrationDocIDriveId) other;

		return ((this.getCentaDocumentNameC() == castOther
				.getCentaDocumentNameC()) || (this.getCentaDocumentNameC() != null
				&& castOther.getCentaDocumentNameC() != null && this
				.getCentaDocumentNameC().equals(
						castOther.getCentaDocumentNameC())))
				&& ((this.getCloudFileAccessC() == castOther
						.getCloudFileAccessC()) || (this.getCloudFileAccessC() != null
						&& castOther.getCloudFileAccessC() != null && this
						.getCloudFileAccessC().equals(
								castOther.getCloudFileAccessC())))
				&& ((this.getCloudFileAllCategoriesC() == castOther
						.getCloudFileAllCategoriesC()) || (this
						.getCloudFileAllCategoriesC() != null
						&& castOther.getCloudFileAllCategoriesC() != null && this
						.getCloudFileAllCategoriesC().equals(
								castOther.getCloudFileAllCategoriesC())))
				&& ((this.getCloudFileAllDocTypesC() == castOther
						.getCloudFileAllDocTypesC()) || (this
						.getCloudFileAllDocTypesC() != null
						&& castOther.getCloudFileAllDocTypesC() != null && this
						.getCloudFileAllDocTypesC().equals(
								castOther.getCloudFileAllDocTypesC())))
				&& ((this.getCloudFileBucketNameC() == castOther
						.getCloudFileBucketNameC()) || (this
						.getCloudFileBucketNameC() != null
						&& castOther.getCloudFileBucketNameC() != null && this
						.getCloudFileBucketNameC().equals(
								castOther.getCloudFileBucketNameC())))
				&& ((this.getCloudFileCaseNoC() == castOther
						.getCloudFileCaseNoC()) || (this.getCloudFileCaseNoC() != null
						&& castOther.getCloudFileCaseNoC() != null && this
						.getCloudFileCaseNoC().equals(
								castOther.getCloudFileCaseNoC())))
				&& ((this.getCloudFileCentaDocTypeC() == castOther
						.getCloudFileCentaDocTypeC()) || (this
						.getCloudFileCentaDocTypeC() != null
						&& castOther.getCloudFileCentaDocTypeC() != null && this
						.getCloudFileCentaDocTypeC().equals(
								castOther.getCloudFileCentaDocTypeC())))
				&& ((this.getCloudFileContentTypeC() == castOther
						.getCloudFileContentTypeC()) || (this
						.getCloudFileContentTypeC() != null
						&& castOther.getCloudFileContentTypeC() != null && this
						.getCloudFileContentTypeC().equals(
								castOther.getCloudFileContentTypeC())))
				&& ((this.getConstructionProjectNumber() == castOther
						.getConstructionProjectNumber()) || (this
						.getConstructionProjectNumber() != null
						&& castOther.getConstructionProjectNumber() != null && this
						.getConstructionProjectNumber().equals(
								castOther.getConstructionProjectNumber())))
				&& ((this.getCloudFileCreatedDateC() == castOther
						.getCloudFileCreatedDateC()) || (this
						.getCloudFileCreatedDateC() != null
						&& castOther.getCloudFileCreatedDateC() != null && this
						.getCloudFileCreatedDateC().equals(
								castOther.getCloudFileCreatedDateC())))
				&& ((this.getCloudFileCustomerNumbersC() == castOther
						.getCloudFileCustomerNumbersC()) || (this
						.getCloudFileCustomerNumbersC() != null
						&& castOther.getCloudFileCustomerNumbersC() != null && this
						.getCloudFileCustomerNumbersC().equals(
								castOther.getCloudFileCustomerNumbersC())))
				&& ((this.getCableunitno() == castOther.getCableunitno()) || (this
						.getCableunitno() != null
						&& castOther.getCableunitno() != null && this
						.getCableunitno().equals(castOther.getCableunitno())))
				&& ((this.getCloudFileDepartmentC() == castOther
						.getCloudFileDepartmentC()) || (this
						.getCloudFileDepartmentC() != null
						&& castOther.getCloudFileDepartmentC() != null && this
						.getCloudFileDepartmentC().equals(
								castOther.getCloudFileDepartmentC())))
				&& ((this.getCloudFileDescriptionC() == castOther
						.getCloudFileDescriptionC()) || (this
						.getCloudFileDescriptionC() != null
						&& castOther.getCloudFileDescriptionC() != null && this
						.getCloudFileDescriptionC().equals(
								castOther.getCloudFileDescriptionC())))
				&& ((this.getCloudFileDoctitleC() == castOther
						.getCloudFileDoctitleC()) || (this
						.getCloudFileDoctitleC() != null
						&& castOther.getCloudFileDoctitleC() != null && this
						.getCloudFileDoctitleC().equals(
								castOther.getCloudFileDoctitleC())))
				&& ((this.getCloudFileDocumentRemarkC() == castOther
						.getCloudFileDocumentRemarkC()) || (this
						.getCloudFileDocumentRemarkC() != null
						&& castOther.getCloudFileDocumentRemarkC() != null && this
						.getCloudFileDocumentRemarkC().equals(
								castOther.getCloudFileDocumentRemarkC())))
				&& ((this.getCloudFileDocumentTagC() == castOther
						.getCloudFileDocumentTagC()) || (this
						.getCloudFileDocumentTagC() != null
						&& castOther.getCloudFileDocumentTagC() != null && this
						.getCloudFileDocumentTagC().equals(
								castOther.getCloudFileDocumentTagC())))
				&& ((this.getCloudFileDocRemarkC() == castOther
						.getCloudFileDocRemarkC()) || (this
						.getCloudFileDocRemarkC() != null
						&& castOther.getCloudFileDocRemarkC() != null && this
						.getCloudFileDocRemarkC().equals(
								castOther.getCloudFileDocRemarkC())))
				&& ((this.getAmazonpath() == castOther.getAmazonpath()) || (this
						.getAmazonpath() != null
						&& castOther.getAmazonpath() != null && this
						.getAmazonpath().equals(castOther.getAmazonpath())))
				&& ((this.getCloudFileHierCustNoC() == castOther
						.getCloudFileHierCustNoC()) || (this
						.getCloudFileHierCustNoC() != null
						&& castOther.getCloudFileHierCustNoC() != null && this
						.getCloudFileHierCustNoC().equals(
								castOther.getCloudFileHierCustNoC())))
				&& ((this.getCloudFileKissDocTypeC() == castOther
						.getCloudFileKissDocTypeC()) || (this
						.getCloudFileKissDocTypeC() != null
						&& castOther.getCloudFileKissDocTypeC() != null && this
						.getCloudFileKissDocTypeC().equals(
								castOther.getCloudFileKissDocTypeC())))
				&& ((this.getCloudFileMidC() == castOther.getCloudFileMidC()) || (this
						.getCloudFileMidC() != null
						&& castOther.getCloudFileMidC() != null && this
						.getCloudFileMidC()
						.equals(castOther.getCloudFileMidC())))
				&& ((this.getCloudFileOfferIdC() == castOther
						.getCloudFileOfferIdC()) || (this
						.getCloudFileOfferIdC() != null
						&& castOther.getCloudFileOfferIdC() != null && this
						.getCloudFileOfferIdC().equals(
								castOther.getCloudFileOfferIdC())))
				&& ((this.getCloudFilePathPrefixC() == castOther
						.getCloudFilePathPrefixC()) || (this
						.getCloudFilePathPrefixC() != null
						&& castOther.getCloudFilePathPrefixC() != null && this
						.getCloudFilePathPrefixC().equals(
								castOther.getCloudFilePathPrefixC())))
				&& ((this.getCloudFileRelatedToIdC() == castOther
						.getCloudFileRelatedToIdC()) || (this
						.getCloudFileRelatedToIdC() != null
						&& castOther.getCloudFileRelatedToIdC() != null && this
						.getCloudFileRelatedToIdC().equals(
								castOther.getCloudFileRelatedToIdC())))
				&& ((this.getCloudFileStatusC() == castOther
						.getCloudFileStatusC()) || (this.getCloudFileStatusC() != null
						&& castOther.getCloudFileStatusC() != null && this
						.getCloudFileStatusC().equals(
								castOther.getCloudFileStatusC())))
				&& ((this.getCloudFileSupplierC() == castOther
						.getCloudFileSupplierC()) || (this
						.getCloudFileSupplierC() != null
						&& castOther.getCloudFileSupplierC() != null && this
						.getCloudFileSupplierC().equals(
								castOther.getCloudFileSupplierC())))
				&& ((this.getCloudFileTitleC() == castOther
						.getCloudFileTitleC()) || (this.getCloudFileTitleC() != null
						&& castOther.getCloudFileTitleC() != null && this
						.getCloudFileTitleC().equals(
								castOther.getCloudFileTitleC())))
				&& ((this.getCloudFileUploadedByC() == castOther
						.getCloudFileUploadedByC()) || (this
						.getCloudFileUploadedByC() != null
						&& castOther.getCloudFileUploadedByC() != null && this
						.getCloudFileUploadedByC().equals(
								castOther.getCloudFileUploadedByC())))
				&& ((this.getCreatedbyid() == castOther.getCreatedbyid()) || (this
						.getCreatedbyid() != null
						&& castOther.getCreatedbyid() != null && this
						.getCreatedbyid().equals(castOther.getCreatedbyid())))
				&& ((this.getCreateddate() == castOther.getCreateddate()) || (this
						.getCreateddate() != null
						&& castOther.getCreateddate() != null && this
						.getCreateddate().equals(castOther.getCreateddate())))
				&& ((this.getSfDocumentId() == castOther.getSfDocumentId()) || (this
						.getSfDocumentId() != null
						&& castOther.getSfDocumentId() != null && this
						.getSfDocumentId().equals(castOther.getSfDocumentId())))
				&& ((this.getIsactiveC() == castOther.getIsactiveC()) || (this
						.getIsactiveC() != null
						&& castOther.getIsactiveC() != null && this
						.getIsactiveC().equals(castOther.getIsactiveC())))
				&& ((this.getIsdeleted() == castOther.getIsdeleted()) || (this
						.getIsdeleted() != null
						&& castOther.getIsdeleted() != null && this
						.getIsdeleted().equals(castOther.getIsdeleted())))
				&& ((this.getLastmodifiedbyid() == castOther
						.getLastmodifiedbyid()) || (this.getLastmodifiedbyid() != null
						&& castOther.getLastmodifiedbyid() != null && this
						.getLastmodifiedbyid().equals(
								castOther.getLastmodifiedbyid())))
				&& ((this.getLastmodifieddate() == castOther
						.getLastmodifieddate()) || (this.getLastmodifieddate() != null
						&& castOther.getLastmodifieddate() != null && this
						.getLastmodifieddate().equals(
								castOther.getLastmodifieddate())))
				&& ((this.getLastreferenceddate() == castOther
						.getLastreferenceddate()) || (this
						.getLastreferenceddate() != null
						&& castOther.getLastreferenceddate() != null && this
						.getLastreferenceddate().equals(
								castOther.getLastreferenceddate())))
				&& ((this.getLastvieweddate() == castOther.getLastvieweddate()) || (this
						.getLastvieweddate() != null
						&& castOther.getLastvieweddate() != null && this
						.getLastvieweddate().equals(
								castOther.getLastvieweddate())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& ((this.getOwnerid() == castOther.getOwnerid()) || (this
						.getOwnerid() != null && castOther.getOwnerid() != null && this
						.getOwnerid().equals(castOther.getOwnerid())))
				&& ((this.getSystemmodstamp() == castOther.getSystemmodstamp()) || (this
						.getSystemmodstamp() != null
						&& castOther.getSystemmodstamp() != null && this
						.getSystemmodstamp().equals(
								castOther.getSystemmodstamp())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCentaDocumentNameC() == null ? 0 : this
						.getCentaDocumentNameC().hashCode());
		result = 37
				* result
				+ (getCloudFileAccessC() == null ? 0 : this
						.getCloudFileAccessC().hashCode());
		result = 37
				* result
				+ (getCloudFileAllCategoriesC() == null ? 0 : this
						.getCloudFileAllCategoriesC().hashCode());
		result = 37
				* result
				+ (getCloudFileAllDocTypesC() == null ? 0 : this
						.getCloudFileAllDocTypesC().hashCode());
		result = 37
				* result
				+ (getCloudFileBucketNameC() == null ? 0 : this
						.getCloudFileBucketNameC().hashCode());
		result = 37
				* result
				+ (getCloudFileCaseNoC() == null ? 0 : this
						.getCloudFileCaseNoC().hashCode());
		result = 37
				* result
				+ (getCloudFileCentaDocTypeC() == null ? 0 : this
						.getCloudFileCentaDocTypeC().hashCode());
		result = 37
				* result
				+ (getCloudFileContentTypeC() == null ? 0 : this
						.getCloudFileContentTypeC().hashCode());
		result = 37
				* result
				+ (getConstructionProjectNumber() == null ? 0 : this
						.getConstructionProjectNumber().hashCode());
		result = 37
				* result
				+ (getCloudFileCreatedDateC() == null ? 0 : this
						.getCloudFileCreatedDateC().hashCode());
		result = 37
				* result
				+ (getCloudFileCustomerNumbersC() == null ? 0 : this
						.getCloudFileCustomerNumbersC().hashCode());
		result = 37
				* result
				+ (getCableunitno() == null ? 0 : this.getCableunitno()
						.hashCode());
		result = 37
				* result
				+ (getCloudFileDepartmentC() == null ? 0 : this
						.getCloudFileDepartmentC().hashCode());
		result = 37
				* result
				+ (getCloudFileDescriptionC() == null ? 0 : this
						.getCloudFileDescriptionC().hashCode());
		result = 37
				* result
				+ (getCloudFileDoctitleC() == null ? 0 : this
						.getCloudFileDoctitleC().hashCode());
		result = 37
				* result
				+ (getCloudFileDocumentRemarkC() == null ? 0 : this
						.getCloudFileDocumentRemarkC().hashCode());
		result = 37
				* result
				+ (getCloudFileDocumentTagC() == null ? 0 : this
						.getCloudFileDocumentTagC().hashCode());
		result = 37
				* result
				+ (getCloudFileDocRemarkC() == null ? 0 : this
						.getCloudFileDocRemarkC().hashCode());
		result = 37
				* result
				+ (getAmazonpath() == null ? 0 : this.getAmazonpath()
						.hashCode());
		result = 37
				* result
				+ (getCloudFileHierCustNoC() == null ? 0 : this
						.getCloudFileHierCustNoC().hashCode());
		result = 37
				* result
				+ (getCloudFileKissDocTypeC() == null ? 0 : this
						.getCloudFileKissDocTypeC().hashCode());
		result = 37
				* result
				+ (getCloudFileMidC() == null ? 0 : this.getCloudFileMidC()
						.hashCode());
		result = 37
				* result
				+ (getCloudFileOfferIdC() == null ? 0 : this
						.getCloudFileOfferIdC().hashCode());
		result = 37
				* result
				+ (getCloudFilePathPrefixC() == null ? 0 : this
						.getCloudFilePathPrefixC().hashCode());
		result = 37
				* result
				+ (getCloudFileRelatedToIdC() == null ? 0 : this
						.getCloudFileRelatedToIdC().hashCode());
		result = 37
				* result
				+ (getCloudFileStatusC() == null ? 0 : this
						.getCloudFileStatusC().hashCode());
		result = 37
				* result
				+ (getCloudFileSupplierC() == null ? 0 : this
						.getCloudFileSupplierC().hashCode());
		result = 37
				* result
				+ (getCloudFileTitleC() == null ? 0 : this.getCloudFileTitleC()
						.hashCode());
		result = 37
				* result
				+ (getCloudFileUploadedByC() == null ? 0 : this
						.getCloudFileUploadedByC().hashCode());
		result = 37
				* result
				+ (getCreatedbyid() == null ? 0 : this.getCreatedbyid()
						.hashCode());
		result = 37
				* result
				+ (getCreateddate() == null ? 0 : this.getCreateddate()
						.hashCode());
		result = 37
				* result
				+ (getSfDocumentId() == null ? 0 : this.getSfDocumentId()
						.hashCode());
		result = 37 * result
				+ (getIsactiveC() == null ? 0 : this.getIsactiveC().hashCode());
		result = 37 * result
				+ (getIsdeleted() == null ? 0 : this.getIsdeleted().hashCode());
		result = 37
				* result
				+ (getLastmodifiedbyid() == null ? 0 : this
						.getLastmodifiedbyid().hashCode());
		result = 37
				* result
				+ (getLastmodifieddate() == null ? 0 : this
						.getLastmodifieddate().hashCode());
		result = 37
				* result
				+ (getLastreferenceddate() == null ? 0 : this
						.getLastreferenceddate().hashCode());
		result = 37
				* result
				+ (getLastvieweddate() == null ? 0 : this.getLastvieweddate()
						.hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result
				+ (getOwnerid() == null ? 0 : this.getOwnerid().hashCode());
		result = 37
				* result
				+ (getSystemmodstamp() == null ? 0 : this.getSystemmodstamp()
						.hashCode());
		return result;
	}

}
