package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DistributionNodesChghist generated by hbm2java
 */
@Entity
@Table(name = "DISTRIBUTION_NODES_CHGHIST", schema = "PCRM")
public class DistributionNodesChghist implements java.io.Serializable {

	private String audId;
	private String audAction;
	private Serializable audTimestamp;
	private String audOsuser;
	private String audDbuser;
	private String audUserterminal;
	private Integer nodeId;
	private String createdByUser;
	private Date createdDateTime;
	private String changeByUser;
	private Date changeDateTime;
	private String name;
	private String owner;
	private String nodeType;
	private Integer parentNodeId;
	private String deliveryPoint;
	private String centralName;
	private String centralAddress;
	private Integer zipCode;
	private BigDecimal geoCode;
	private String status;
	private String subnetId;
	private String primregion;
	private String primcableunit;

	public DistributionNodesChghist() {
	}

	public DistributionNodesChghist(String audId) {
		this.audId = audId;
	}

	public DistributionNodesChghist(String audId, String audAction,
			Serializable audTimestamp, String audOsuser, String audDbuser,
			String audUserterminal, Integer nodeId, String createdByUser,
			Date createdDateTime, String changeByUser, Date changeDateTime,
			String name, String owner, String nodeType, Integer parentNodeId,
			String deliveryPoint, String centralName, String centralAddress,
			Integer zipCode, BigDecimal geoCode, String status,
			String subnetId, String primregion, String primcableunit) {
		this.audId = audId;
		this.audAction = audAction;
		this.audTimestamp = audTimestamp;
		this.audOsuser = audOsuser;
		this.audDbuser = audDbuser;
		this.audUserterminal = audUserterminal;
		this.nodeId = nodeId;
		this.createdByUser = createdByUser;
		this.createdDateTime = createdDateTime;
		this.changeByUser = changeByUser;
		this.changeDateTime = changeDateTime;
		this.name = name;
		this.owner = owner;
		this.nodeType = nodeType;
		this.parentNodeId = parentNodeId;
		this.deliveryPoint = deliveryPoint;
		this.centralName = centralName;
		this.centralAddress = centralAddress;
		this.zipCode = zipCode;
		this.geoCode = geoCode;
		this.status = status;
		this.subnetId = subnetId;
		this.primregion = primregion;
		this.primcableunit = primcableunit;
	}

	@Id
	@Column(name = "AUD_ID", unique = true, nullable = false, length = 19)
	public String getAudId() {
		return this.audId;
	}

	public void setAudId(String audId) {
		this.audId = audId;
	}

	@Column(name = "AUD_ACTION", length = 50)
	public String getAudAction() {
		return this.audAction;
	}

	public void setAudAction(String audAction) {
		this.audAction = audAction;
	}

	@Column(name = "AUD_TIMESTAMP")
	public Serializable getAudTimestamp() {
		return this.audTimestamp;
	}

	public void setAudTimestamp(Serializable audTimestamp) {
		this.audTimestamp = audTimestamp;
	}

	@Column(name = "AUD_OSUSER", length = 50)
	public String getAudOsuser() {
		return this.audOsuser;
	}

	public void setAudOsuser(String audOsuser) {
		this.audOsuser = audOsuser;
	}

	@Column(name = "AUD_DBUSER", length = 50)
	public String getAudDbuser() {
		return this.audDbuser;
	}

	public void setAudDbuser(String audDbuser) {
		this.audDbuser = audDbuser;
	}

	@Column(name = "AUD_USERTERMINAL", length = 50)
	public String getAudUserterminal() {
		return this.audUserterminal;
	}

	public void setAudUserterminal(String audUserterminal) {
		this.audUserterminal = audUserterminal;
	}

	@Column(name = "NODE_ID", precision = 9, scale = 0)
	public Integer getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(Integer nodeId) {
		this.nodeId = nodeId;
	}

	@Column(name = "CREATED_BY_USER", length = 20)
	public String getCreatedByUser() {
		return this.createdByUser;
	}

	public void setCreatedByUser(String createdByUser) {
		this.createdByUser = createdByUser;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_DATE_TIME", length = 7)
	public Date getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	@Column(name = "CHANGE_BY_USER", length = 20)
	public String getChangeByUser() {
		return this.changeByUser;
	}

	public void setChangeByUser(String changeByUser) {
		this.changeByUser = changeByUser;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CHANGE_DATE_TIME", length = 7)
	public Date getChangeDateTime() {
		return this.changeDateTime;
	}

	public void setChangeDateTime(Date changeDateTime) {
		this.changeDateTime = changeDateTime;
	}

	@Column(name = "NAME", length = 40)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "OWNER", length = 20)
	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Column(name = "NODE_TYPE", length = 8)
	public String getNodeType() {
		return this.nodeType;
	}

	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}

	@Column(name = "PARENT_NODE_ID", precision = 9, scale = 0)
	public Integer getParentNodeId() {
		return this.parentNodeId;
	}

	public void setParentNodeId(Integer parentNodeId) {
		this.parentNodeId = parentNodeId;
	}

	@Column(name = "DELIVERY_POINT", length = 80)
	public String getDeliveryPoint() {
		return this.deliveryPoint;
	}

	public void setDeliveryPoint(String deliveryPoint) {
		this.deliveryPoint = deliveryPoint;
	}

	@Column(name = "CENTRAL_NAME", length = 40)
	public String getCentralName() {
		return this.centralName;
	}

	public void setCentralName(String centralName) {
		this.centralName = centralName;
	}

	@Column(name = "CENTRAL_ADDRESS", length = 15)
	public String getCentralAddress() {
		return this.centralAddress;
	}

	public void setCentralAddress(String centralAddress) {
		this.centralAddress = centralAddress;
	}

	@Column(name = "ZIP_CODE", precision = 9, scale = 0)
	public Integer getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	@Column(name = "GEO_CODE", precision = 22, scale = 0)
	public BigDecimal getGeoCode() {
		return this.geoCode;
	}

	public void setGeoCode(BigDecimal geoCode) {
		this.geoCode = geoCode;
	}

	@Column(name = "STATUS", length = 20)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "SUBNET_ID", length = 15)
	public String getSubnetId() {
		return this.subnetId;
	}

	public void setSubnetId(String subnetId) {
		this.subnetId = subnetId;
	}

	@Column(name = "PRIMREGION", length = 19)
	public String getPrimregion() {
		return this.primregion;
	}

	public void setPrimregion(String primregion) {
		this.primregion = primregion;
	}

	@Column(name = "PRIMCABLEUNIT", length = 10)
	public String getPrimcableunit() {
		return this.primcableunit;
	}

	public void setPrimcableunit(String primcableunit) {
		this.primcableunit = primcableunit;
	}

}
