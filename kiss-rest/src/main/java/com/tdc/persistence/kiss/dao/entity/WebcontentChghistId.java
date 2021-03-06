package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * WebcontentChghistId generated by hbm2java
 */
@Embeddable
public class WebcontentChghistId implements java.io.Serializable {

	private String audId;
	private String id;

	public WebcontentChghistId() {
	}

	public WebcontentChghistId(String audId, String id) {
		this.audId = audId;
		this.id = id;
	}

	@Column(name = "AUD_ID", nullable = false, length = 19)
	public String getAudId() {
		return this.audId;
	}

	public void setAudId(String audId) {
		this.audId = audId;
	}

	@Column(name = "ID", nullable = false, length = 19)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof WebcontentChghistId))
			return false;
		WebcontentChghistId castOther = (WebcontentChghistId) other;

		return ((this.getAudId() == castOther.getAudId()) || (this.getAudId() != null
				&& castOther.getAudId() != null && this.getAudId().equals(
				castOther.getAudId())))
				&& ((this.getId() == castOther.getId()) || (this.getId() != null
						&& castOther.getId() != null && this.getId().equals(
						castOther.getId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAudId() == null ? 0 : this.getAudId().hashCode());
		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		return result;
	}

}
