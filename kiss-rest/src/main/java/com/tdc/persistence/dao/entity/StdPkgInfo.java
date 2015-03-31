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
import javax.persistence.UniqueConstraint;

/**
 * StdPkgInfo generated by hbm2java
 */
@Entity
@Table(name = "STD_PKG_INFO", schema = "PCRM", uniqueConstraints = @UniqueConstraint(columnNames = "PACKAGE_NUMBER"))
public class StdPkgInfo implements java.io.Serializable {

	private String id;
	private Date crd;
	private String cru;
	private Date modd;
	private String modu;
	private String packageNumber;
	private String shortName;
	private BigDecimal startFrequency;
	private BigDecimal endFrequency;

	public StdPkgInfo() {
	}

	public StdPkgInfo(String id) {
		this.id = id;
	}

	public StdPkgInfo(String id, Date crd, String cru, Date modd, String modu,
			String packageNumber, String shortName, BigDecimal startFrequency,
			BigDecimal endFrequency) {
		this.id = id;
		this.crd = crd;
		this.cru = cru;
		this.modd = modd;
		this.modu = modu;
		this.packageNumber = packageNumber;
		this.shortName = shortName;
		this.startFrequency = startFrequency;
		this.endFrequency = endFrequency;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 19)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRD", length = 7)
	public Date getCrd() {
		return this.crd;
	}

	public void setCrd(Date crd) {
		this.crd = crd;
	}

	@Column(name = "CRU", length = 19)
	public String getCru() {
		return this.cru;
	}

	public void setCru(String cru) {
		this.cru = cru;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "MODD", length = 7)
	public Date getModd() {
		return this.modd;
	}

	public void setModd(Date modd) {
		this.modd = modd;
	}

	@Column(name = "MODU", length = 19)
	public String getModu() {
		return this.modu;
	}

	public void setModu(String modu) {
		this.modu = modu;
	}

	@Column(name = "PACKAGE_NUMBER", unique = true, length = 50)
	public String getPackageNumber() {
		return this.packageNumber;
	}

	public void setPackageNumber(String packageNumber) {
		this.packageNumber = packageNumber;
	}

	@Column(name = "SHORT_NAME")
	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	@Column(name = "START_FREQUENCY", precision = 22, scale = 0)
	public BigDecimal getStartFrequency() {
		return this.startFrequency;
	}

	public void setStartFrequency(BigDecimal startFrequency) {
		this.startFrequency = startFrequency;
	}

	@Column(name = "END_FREQUENCY", precision = 22, scale = 0)
	public BigDecimal getEndFrequency() {
		return this.endFrequency;
	}

	public void setEndFrequency(BigDecimal endFrequency) {
		this.endFrequency = endFrequency;
	}

}
