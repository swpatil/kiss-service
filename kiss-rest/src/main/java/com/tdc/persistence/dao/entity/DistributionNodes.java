package com.tdc.persistence.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DistributionNodes generated by hbm2java
 */
@Entity
@Table(name = "DISTRIBUTION_NODES", schema = "PCRM")
public class DistributionNodes implements java.io.Serializable {

	private int nodeId;
	private NodeTypes nodeTypes;
	private String createdByUser;
	private Date createdDateTime;
	private String changeByUser;
	private Date changeDateTime;
	private String name;
	private String owner;
	private Integer parentNodeId;
	private String deliveryPoint;
	private String centralName;
	private String centralAddress;
	private Integer zipCode;
	private BigDecimal geoCode;
	private String status;
	private String subnetId;
	private Short primregion;
	private String primcableunit;
	private Set<ChNodeKeys> chNodeKeyses = new HashSet<ChNodeKeys>(0);
	private Set<Cableunit> cableunits = new HashSet<Cableunit>(0);

	public DistributionNodes() {
	}

	public DistributionNodes(int nodeId) {
		this.nodeId = nodeId;
	}

	public DistributionNodes(int nodeId, NodeTypes nodeTypes,
			String createdByUser, Date createdDateTime, String changeByUser,
			Date changeDateTime, String name, String owner,
			Integer parentNodeId, String deliveryPoint, String centralName,
			String centralAddress, Integer zipCode, BigDecimal geoCode,
			String status, String subnetId, Short primregion,
			String primcableunit, Set<ChNodeKeys> chNodeKeyses,
			Set<Cableunit> cableunits) {
		this.nodeId = nodeId;
		this.nodeTypes = nodeTypes;
		this.createdByUser = createdByUser;
		this.createdDateTime = createdDateTime;
		this.changeByUser = changeByUser;
		this.changeDateTime = changeDateTime;
		this.name = name;
		this.owner = owner;
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
		this.chNodeKeyses = chNodeKeyses;
		this.cableunits = cableunits;
	}

	@Id
	@Column(name = "NODE_ID", unique = true, nullable = false, precision = 9, scale = 0)
	public int getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NODE_TYPE")
	public NodeTypes getNodeTypes() {
		return this.nodeTypes;
	}

	public void setNodeTypes(NodeTypes nodeTypes) {
		this.nodeTypes = nodeTypes;
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

	@Column(name = "PRIMREGION", precision = 4, scale = 0)
	public Short getPrimregion() {
		return this.primregion;
	}

	public void setPrimregion(Short primregion) {
		this.primregion = primregion;
	}

	@Column(name = "PRIMCABLEUNIT", length = 10)
	public String getPrimcableunit() {
		return this.primcableunit;
	}

	public void setPrimcableunit(String primcableunit) {
		this.primcableunit = primcableunit;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "distributionNodes")
	public Set<ChNodeKeys> getChNodeKeyses() {
		return this.chNodeKeyses;
	}

	public void setChNodeKeyses(Set<ChNodeKeys> chNodeKeyses) {
		this.chNodeKeyses = chNodeKeyses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "distributionNodes")
	public Set<Cableunit> getCableunits() {
		return this.cableunits;
	}

	public void setCableunits(Set<Cableunit> cableunits) {
		this.cableunits = cableunits;
	}

}
