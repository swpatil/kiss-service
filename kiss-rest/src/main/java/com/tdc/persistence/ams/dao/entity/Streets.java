package com.tdc.persistence.ams.dao.entity;

// Generated 09-04-2015 18:59:20 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.search.annotations.Analyze;
import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.FieldBridge;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.IndexedEmbedded;
import org.hibernate.search.annotations.Store;

import com.tdc.util.StreetBridge;

/**
 * Streets generated by hbm2java
 */
@Entity
@Table(name = "STREETS", schema = "AMS")
@Indexed
public class Streets implements java.io.Serializable {

	private StreetsId id;
	private Municipalities municipalities;
	private AccessClasses accessClassesByAccessClass;
	private AccessClasses accessClassesByUserAccessClass;
	private Short streetcode;
	private String streetname;
	private String streetnameAbbreviated;
	private String source;
	private Date enddate;
	private String initials;
	private Date createddate;
	private Set<Addresses> addresseses = new HashSet<Addresses>(0);

	public Streets() {
	}

	public Streets(StreetsId id, Municipalities municipalities,
			AccessClasses accessClassesByAccessClass, String streetname,
			String source, String initials) {
		this.id = id;
		this.municipalities = municipalities;
		this.accessClassesByAccessClass = accessClassesByAccessClass;
		this.streetname = streetname;
		this.source = source;
		this.initials = initials;
	}

	public Streets(StreetsId id, Municipalities municipalities,
			AccessClasses accessClassesByAccessClass,
			AccessClasses accessClassesByUserAccessClass, Short streetcode,
			String streetname, String streetnameAbbreviated, String source,
			Date enddate, String initials, Date createddate,
			Set<Addresses> addresseses) {
		this.id = id;
		this.municipalities = municipalities;
		this.accessClassesByAccessClass = accessClassesByAccessClass;
		this.accessClassesByUserAccessClass = accessClassesByUserAccessClass;
		this.streetcode = streetcode;
		this.streetname = streetname;
		this.streetnameAbbreviated = streetnameAbbreviated;
		this.source = source;
		this.enddate = enddate;
		this.initials = initials;
		this.createddate = createddate;
		this.addresseses = addresseses;
	}

	@EmbeddedId
	@DocumentId
	@FieldBridge(impl=StreetBridge.class)
	@IndexedEmbedded
	@AttributeOverrides({
			@AttributeOverride(name = "streetId", column = @Column(name = "STREET_ID", nullable = false, precision = 10, scale = 0)),
			@AttributeOverride(name = "startdate", column = @Column(name = "STARTDATE", nullable = false, length = 7)) })
	public StreetsId getId() {
		return this.id;
	}

	public void setId(StreetsId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MUNICIPALITYCODE", nullable = false)
	public Municipalities getMunicipalities() {
		return this.municipalities;
	}

	public void setMunicipalities(Municipalities municipalities) {
		this.municipalities = municipalities;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ACCESS_CLASS", nullable = false)
	public AccessClasses getAccessClassesByAccessClass() {
		return this.accessClassesByAccessClass;
	}

	public void setAccessClassesByAccessClass(
			AccessClasses accessClassesByAccessClass) {
		this.accessClassesByAccessClass = accessClassesByAccessClass;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_ACCESS_CLASS")
	public AccessClasses getAccessClassesByUserAccessClass() {
		return this.accessClassesByUserAccessClass;
	}

	public void setAccessClassesByUserAccessClass(
			AccessClasses accessClassesByUserAccessClass) {
		this.accessClassesByUserAccessClass = accessClassesByUserAccessClass;
	}

	@Column(name = "STREETCODE", precision = 4, scale = 0)
	@Field(index=Index.YES, analyze=Analyze.YES, store=Store.NO)
	public Short getStreetcode() {
		return this.streetcode;
	}

	public void setStreetcode(Short streetcode) {
		this.streetcode = streetcode;
	}

	@Column(name = "STREETNAME", nullable = false, length = 40)
	@Field(index=Index.YES, analyze=Analyze.YES, store=Store.NO)
	public String getStreetname() {
		return this.streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	@Column(name = "STREETNAME_ABBREVIATED", length = 20)
	public String getStreetnameAbbreviated() {
		return this.streetnameAbbreviated;
	}

	public void setStreetnameAbbreviated(String streetnameAbbreviated) {
		this.streetnameAbbreviated = streetnameAbbreviated;
	}

	@Column(name = "SOURCE", nullable = false, length = 6)
	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ENDDATE", length = 7)
	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	@Column(name = "INITIALS", nullable = false, length = 10)
	public String getInitials() {
		return this.initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATEDDATE", length = 7)
	public Date getCreateddate() {
		return this.createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "streets")
	public Set<Addresses> getAddresseses() {
		return this.addresseses;
	}

	public void setAddresseses(Set<Addresses> addresseses) {
		this.addresseses = addresseses;
	}

}
