package com.tdc.persistence.ams.dao.entity;

// Generated 09-04-2015 18:59:20 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * TmpAmsAddressIdReferences generated by hbm2java
 */
@Entity
@Table(name = "TMP_AMS_ADDRESS_ID_REFERENCES", schema = "AMS")
public class TmpAmsAddressIdReferences implements java.io.Serializable {

	private TmpAmsAddressIdReferencesId id;
	private BigDecimal vejpostType;
	private BigDecimal vejpostbyType;
	private BigDecimal husType;

	public TmpAmsAddressIdReferences() {
	}

	public TmpAmsAddressIdReferences(TmpAmsAddressIdReferencesId id) {
		this.id = id;
	}

	public TmpAmsAddressIdReferences(TmpAmsAddressIdReferencesId id,
			BigDecimal vejpostType, BigDecimal vejpostbyType, BigDecimal husType) {
		this.id = id;
		this.vejpostType = vejpostType;
		this.vejpostbyType = vejpostbyType;
		this.husType = husType;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "addressId", column = @Column(name = "ADDRESS_ID", nullable = false, precision = 22, scale = 0)),
			@AttributeOverride(name = "system", column = @Column(name = "SYSTEM", nullable = false, precision = 22, scale = 0)),
			@AttributeOverride(name = "systemKey", column = @Column(name = "SYSTEM_KEY", nullable = false, length = 100)) })
	public TmpAmsAddressIdReferencesId getId() {
		return this.id;
	}

	public void setId(TmpAmsAddressIdReferencesId id) {
		this.id = id;
	}

	@Column(name = "VEJPOST_TYPE", precision = 22, scale = 0)
	public BigDecimal getVejpostType() {
		return this.vejpostType;
	}

	public void setVejpostType(BigDecimal vejpostType) {
		this.vejpostType = vejpostType;
	}

	@Column(name = "VEJPOSTBY_TYPE", precision = 22, scale = 0)
	public BigDecimal getVejpostbyType() {
		return this.vejpostbyType;
	}

	public void setVejpostbyType(BigDecimal vejpostbyType) {
		this.vejpostbyType = vejpostbyType;
	}

	@Column(name = "HUS_TYPE", precision = 22, scale = 0)
	public BigDecimal getHusType() {
		return this.husType;
	}

	public void setHusType(BigDecimal husType) {
		this.husType = husType;
	}

}
