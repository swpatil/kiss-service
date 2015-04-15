package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VProjectsUnderDnId generated by hbm2java
 */
@Embeddable
public class VProjectsUnderDnId implements java.io.Serializable {

	private BigDecimal projectId;
	private Integer nodeId;
	private String name;
	private Date startDate;
	private String salesConcept;
	private Character loopMark;
	private Date createdDateTime;
	private String createdByUser;
	private String changeByUser;
	private Date changeDateTime;

	public VProjectsUnderDnId() {
	}

	public VProjectsUnderDnId(BigDecimal projectId, Integer nodeId,
			String name, Date startDate, String salesConcept,
			Character loopMark, Date createdDateTime, String createdByUser,
			String changeByUser, Date changeDateTime) {
		this.projectId = projectId;
		this.nodeId = nodeId;
		this.name = name;
		this.startDate = startDate;
		this.salesConcept = salesConcept;
		this.loopMark = loopMark;
		this.createdDateTime = createdDateTime;
		this.createdByUser = createdByUser;
		this.changeByUser = changeByUser;
		this.changeDateTime = changeDateTime;
	}

	@Column(name = "PROJECT_ID", precision = 22, scale = 0)
	public BigDecimal getProjectId() {
		return this.projectId;
	}

	public void setProjectId(BigDecimal projectId) {
		this.projectId = projectId;
	}

	@Column(name = "NODE_ID", precision = 9, scale = 0)
	public Integer getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(Integer nodeId) {
		this.nodeId = nodeId;
	}

	@Column(name = "NAME", length = 40)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "START_DATE", length = 7)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Column(name = "SALES_CONCEPT", length = 20)
	public String getSalesConcept() {
		return this.salesConcept;
	}

	public void setSalesConcept(String salesConcept) {
		this.salesConcept = salesConcept;
	}

	@Column(name = "LOOP_MARK", length = 1)
	public Character getLoopMark() {
		return this.loopMark;
	}

	public void setLoopMark(Character loopMark) {
		this.loopMark = loopMark;
	}

	@Column(name = "CREATED_DATE_TIME", length = 7)
	public Date getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	@Column(name = "CREATED_BY_USER", length = 19)
	public String getCreatedByUser() {
		return this.createdByUser;
	}

	public void setCreatedByUser(String createdByUser) {
		this.createdByUser = createdByUser;
	}

	@Column(name = "CHANGE_BY_USER", length = 19)
	public String getChangeByUser() {
		return this.changeByUser;
	}

	public void setChangeByUser(String changeByUser) {
		this.changeByUser = changeByUser;
	}

	@Column(name = "CHANGE_DATE_TIME", length = 7)
	public Date getChangeDateTime() {
		return this.changeDateTime;
	}

	public void setChangeDateTime(Date changeDateTime) {
		this.changeDateTime = changeDateTime;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VProjectsUnderDnId))
			return false;
		VProjectsUnderDnId castOther = (VProjectsUnderDnId) other;

		return ((this.getProjectId() == castOther.getProjectId()) || (this
				.getProjectId() != null && castOther.getProjectId() != null && this
				.getProjectId().equals(castOther.getProjectId())))
				&& ((this.getNodeId() == castOther.getNodeId()) || (this
						.getNodeId() != null && castOther.getNodeId() != null && this
						.getNodeId().equals(castOther.getNodeId())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& ((this.getStartDate() == castOther.getStartDate()) || (this
						.getStartDate() != null
						&& castOther.getStartDate() != null && this
						.getStartDate().equals(castOther.getStartDate())))
				&& ((this.getSalesConcept() == castOther.getSalesConcept()) || (this
						.getSalesConcept() != null
						&& castOther.getSalesConcept() != null && this
						.getSalesConcept().equals(castOther.getSalesConcept())))
				&& ((this.getLoopMark() == castOther.getLoopMark()) || (this
						.getLoopMark() != null
						&& castOther.getLoopMark() != null && this
						.getLoopMark().equals(castOther.getLoopMark())))
				&& ((this.getCreatedDateTime() == castOther
						.getCreatedDateTime()) || (this.getCreatedDateTime() != null
						&& castOther.getCreatedDateTime() != null && this
						.getCreatedDateTime().equals(
								castOther.getCreatedDateTime())))
				&& ((this.getCreatedByUser() == castOther.getCreatedByUser()) || (this
						.getCreatedByUser() != null
						&& castOther.getCreatedByUser() != null && this
						.getCreatedByUser()
						.equals(castOther.getCreatedByUser())))
				&& ((this.getChangeByUser() == castOther.getChangeByUser()) || (this
						.getChangeByUser() != null
						&& castOther.getChangeByUser() != null && this
						.getChangeByUser().equals(castOther.getChangeByUser())))
				&& ((this.getChangeDateTime() == castOther.getChangeDateTime()) || (this
						.getChangeDateTime() != null
						&& castOther.getChangeDateTime() != null && this
						.getChangeDateTime().equals(
								castOther.getChangeDateTime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getProjectId() == null ? 0 : this.getProjectId().hashCode());
		result = 37 * result
				+ (getNodeId() == null ? 0 : this.getNodeId().hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result
				+ (getStartDate() == null ? 0 : this.getStartDate().hashCode());
		result = 37
				* result
				+ (getSalesConcept() == null ? 0 : this.getSalesConcept()
						.hashCode());
		result = 37 * result
				+ (getLoopMark() == null ? 0 : this.getLoopMark().hashCode());
		result = 37
				* result
				+ (getCreatedDateTime() == null ? 0 : this.getCreatedDateTime()
						.hashCode());
		result = 37
				* result
				+ (getCreatedByUser() == null ? 0 : this.getCreatedByUser()
						.hashCode());
		result = 37
				* result
				+ (getChangeByUser() == null ? 0 : this.getChangeByUser()
						.hashCode());
		result = 37
				* result
				+ (getChangeDateTime() == null ? 0 : this.getChangeDateTime()
						.hashCode());
		return result;
	}

}