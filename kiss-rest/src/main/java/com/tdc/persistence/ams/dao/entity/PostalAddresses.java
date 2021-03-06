package com.tdc.persistence.ams.dao.entity;

// Generated 09-04-2015 18:59:20 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PostalAddresses generated by hbm2java
 */
@Entity
@Table(name = "POSTAL_ADDRESSES", schema = "AMS")
public class PostalAddresses implements java.io.Serializable {

	private PostalAddressesId id;
	private String recordtype;
	private String line1;
	private String line2;
	private String postboxno;
	private String nychthemeronPostMark;
	private String nychthemeronPostNumber;
	private String postalcode;
	private String countrycode;
	private boolean accessClass;
	private Boolean userAccessClass;
	private String source;
	private Date enddate;
	private String initials;
	private Long transferredToAddressId;

	public PostalAddresses() {
	}

	public PostalAddresses(PostalAddressesId id, String countrycode,
			boolean accessClass, String source) {
		this.id = id;
		this.countrycode = countrycode;
		this.accessClass = accessClass;
		this.source = source;
	}

	public PostalAddresses(PostalAddressesId id, String recordtype,
			String line1, String line2, String postboxno,
			String nychthemeronPostMark, String nychthemeronPostNumber,
			String postalcode, String countrycode, boolean accessClass,
			Boolean userAccessClass, String source, Date enddate,
			String initials, Long transferredToAddressId) {
		this.id = id;
		this.recordtype = recordtype;
		this.line1 = line1;
		this.line2 = line2;
		this.postboxno = postboxno;
		this.nychthemeronPostMark = nychthemeronPostMark;
		this.nychthemeronPostNumber = nychthemeronPostNumber;
		this.postalcode = postalcode;
		this.countrycode = countrycode;
		this.accessClass = accessClass;
		this.userAccessClass = userAccessClass;
		this.source = source;
		this.enddate = enddate;
		this.initials = initials;
		this.transferredToAddressId = transferredToAddressId;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "addressId", column = @Column(name = "ADDRESS_ID", nullable = false, precision = 10, scale = 0)),
			@AttributeOverride(name = "startdate", column = @Column(name = "STARTDATE", nullable = false, length = 7)) })
	public PostalAddressesId getId() {
		return this.id;
	}

	public void setId(PostalAddressesId id) {
		this.id = id;
	}

	@Column(name = "RECORDTYPE", length = 20)
	public String getRecordtype() {
		return this.recordtype;
	}

	public void setRecordtype(String recordtype) {
		this.recordtype = recordtype;
	}

	@Column(name = "LINE_1", length = 80)
	public String getLine1() {
		return this.line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	@Column(name = "LINE_2", length = 80)
	public String getLine2() {
		return this.line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	@Column(name = "POSTBOXNO", length = 10)
	public String getPostboxno() {
		return this.postboxno;
	}

	public void setPostboxno(String postboxno) {
		this.postboxno = postboxno;
	}

	@Column(name = "NYCHTHEMERON_POST_MARK", length = 10)
	public String getNychthemeronPostMark() {
		return this.nychthemeronPostMark;
	}

	public void setNychthemeronPostMark(String nychthemeronPostMark) {
		this.nychthemeronPostMark = nychthemeronPostMark;
	}

	@Column(name = "NYCHTHEMERON_POST_NUMBER", length = 10)
	public String getNychthemeronPostNumber() {
		return this.nychthemeronPostNumber;
	}

	public void setNychthemeronPostNumber(String nychthemeronPostNumber) {
		this.nychthemeronPostNumber = nychthemeronPostNumber;
	}

	@Column(name = "POSTALCODE", length = 4)
	public String getPostalcode() {
		return this.postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	@Column(name = "COUNTRYCODE", nullable = false, length = 2)
	public String getCountrycode() {
		return this.countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	@Column(name = "ACCESS_CLASS", nullable = false, precision = 1, scale = 0)
	public boolean isAccessClass() {
		return this.accessClass;
	}

	public void setAccessClass(boolean accessClass) {
		this.accessClass = accessClass;
	}

	@Column(name = "USER_ACCESS_CLASS", precision = 1, scale = 0)
	public Boolean getUserAccessClass() {
		return this.userAccessClass;
	}

	public void setUserAccessClass(Boolean userAccessClass) {
		this.userAccessClass = userAccessClass;
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

	@Column(name = "INITIALS", length = 10)
	public String getInitials() {
		return this.initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	@Column(name = "TRANSFERRED_TO_ADDRESS_ID", precision = 10, scale = 0)
	public Long getTransferredToAddressId() {
		return this.transferredToAddressId;
	}

	public void setTransferredToAddressId(Long transferredToAddressId) {
		this.transferredToAddressId = transferredToAddressId;
	}

}
