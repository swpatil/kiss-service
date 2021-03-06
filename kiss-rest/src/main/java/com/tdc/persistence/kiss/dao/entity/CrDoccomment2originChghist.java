package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CrDoccomment2originChghist generated by hbm2java
 */
@Entity
@Table(name = "CR_DOCCOMMENT2ORIGIN_CHGHIST", schema = "PCRM")
public class CrDoccomment2originChghist implements java.io.Serializable {

	private String audId;
	private String audAction;
	private Serializable audTimestamp;
	private String audOsuser;
	private String audDbuser;
	private String audUserterminal;
	private String primdoccomment;
	private String primdocorigin;
	private String logtrace;

	public CrDoccomment2originChghist() {
	}

	public CrDoccomment2originChghist(String audId) {
		this.audId = audId;
	}

	public CrDoccomment2originChghist(String audId, String audAction,
			Serializable audTimestamp, String audOsuser, String audDbuser,
			String audUserterminal, String primdoccomment,
			String primdocorigin, String logtrace) {
		this.audId = audId;
		this.audAction = audAction;
		this.audTimestamp = audTimestamp;
		this.audOsuser = audOsuser;
		this.audDbuser = audDbuser;
		this.audUserterminal = audUserterminal;
		this.primdoccomment = primdoccomment;
		this.primdocorigin = primdocorigin;
		this.logtrace = logtrace;
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

	@Column(name = "PRIMDOCCOMMENT", length = 19)
	public String getPrimdoccomment() {
		return this.primdoccomment;
	}

	public void setPrimdoccomment(String primdoccomment) {
		this.primdoccomment = primdoccomment;
	}

	@Column(name = "PRIMDOCORIGIN", length = 19)
	public String getPrimdocorigin() {
		return this.primdocorigin;
	}

	public void setPrimdocorigin(String primdocorigin) {
		this.primdocorigin = primdocorigin;
	}

	@Column(name = "LOGTRACE", length = 19)
	public String getLogtrace() {
		return this.logtrace;
	}

	public void setLogtrace(String logtrace) {
		this.logtrace = logtrace;
	}

}
