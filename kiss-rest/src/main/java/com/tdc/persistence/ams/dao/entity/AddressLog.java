package com.tdc.persistence.ams.dao.entity;

// Generated 09-04-2015 18:59:20 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AddressLog generated by hbm2java
 */
@Entity
@Table(name = "ADDRESS_LOG", schema = "AMS")
public class AddressLog implements java.io.Serializable {

	private long addressId;
	private Date logtime;
	private String recordtype;
	private String text;
	private String initials;
	private String calledby;

	public AddressLog() {
	}

	public AddressLog(long addressId) {
		this.addressId = addressId;
	}

	public AddressLog(long addressId, Date logtime, String recordtype,
			String text, String initials, String calledby) {
		this.addressId = addressId;
		this.logtime = logtime;
		this.recordtype = recordtype;
		this.text = text;
		this.initials = initials;
		this.calledby = calledby;
	}

	@Id
	@Column(name = "ADDRESS_ID", unique = true, nullable = false, precision = 10, scale = 0)
	public long getAddressId() {
		return this.addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LOGTIME", length = 7)
	public Date getLogtime() {
		return this.logtime;
	}

	public void setLogtime(Date logtime) {
		this.logtime = logtime;
	}

	@Column(name = "RECORDTYPE", length = 20)
	public String getRecordtype() {
		return this.recordtype;
	}

	public void setRecordtype(String recordtype) {
		this.recordtype = recordtype;
	}

	@Column(name = "TEXT", length = 400)
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Column(name = "INITIALS", length = 10)
	public String getInitials() {
		return this.initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	@Column(name = "CALLEDBY", length = 10)
	public String getCalledby() {
		return this.calledby;
	}

	public void setCalledby(String calledby) {
		this.calledby = calledby;
	}

}
