package com.tdc.component.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * Created by IntelliJ IDEA. User: m38929 Date: 04-09-2012 Time: 09:17:16 To
 * change this template use File | Settings | File Templates.
 */

@XmlRootElement
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
public class ResultSO implements Serializable {

	private static final long serialVersionUID = 0L;
	/**
	 * Attribute for holding editableFields list from drools
	 */
	private String editableFields;
	private String mandatoryFields;
	private String historyFields;
	private String adminEdit;

	private AuthorizationResultSO authorizationResultSO;

	// used in udbud
	private String tokenNames;

	// used in bermuda
	private String fromCaseType;

	private String toCaseType;

	private String fromPhaseActivity;

	private String toPhaseActivity;

	private String fromMeasurePoint;

	private String toMeasurePoint;

	private String fromPhase;

	private String toPhase;

	private String supplierRequestNo;

	private String approvalGrps;

	private String brugerNo;

	private String kissTeams;

	private String kissDept;

	private String caseTypes;

	private String brugerGrp;

	private String alleMedlemmer;

	private Map<Integer, List<String>> pgValues;

	private int rowCount;

	private boolean unLimited;

	private int possibleRoles;

	private int mandatoryRoleCnt;

	private boolean reviewAllowed;

	@XmlElement
	public String getAlleMedlemmer() {
		return alleMedlemmer;
	}

	public void setAlleMedlemmer(String alleMedlemmer) {
		this.alleMedlemmer = alleMedlemmer;
	}

	@XmlElement
	public String getEditableFields() {
		return editableFields;
	}

	public void setEditableFields(String editableFields) {
		this.editableFields = editableFields;
	}

	@XmlElement
	public String getMandatoryFields() {
		return mandatoryFields;
	}

	public void setMandatoryFields(String mandatoryFields) {
		this.mandatoryFields = mandatoryFields;
	}

	@XmlElement
	public String getHistoryFields() {
		return historyFields;
	}

	public void setHistoryFields(String historyFields) {
		this.historyFields = historyFields;
	}

	@XmlElement
	public String getAdminEdit() {
		return adminEdit;
	}

	public void setAdminEdit(String adminEdit) {
		this.adminEdit = adminEdit;
	}

	@XmlElement
	public String getTokenNames() {
		return tokenNames;
	}

	public void setTokenNames(String tokenNames) {
		this.tokenNames = tokenNames;
	}

	@XmlElement
	public String getFromCaseType() {
		return fromCaseType;
	}

	public void setFromCaseType(String fromCaseType) {
		this.fromCaseType = fromCaseType;
	}

	@XmlElement
	public String getToCaseType() {
		return toCaseType;
	}

	public void setToCaseType(String toCaseType) {
		this.toCaseType = toCaseType;
	}

	@XmlElement
	public String getFromPhaseActivity() {
		return fromPhaseActivity;
	}

	public void setFromPhaseActivity(String fromPhaseActivity) {
		this.fromPhaseActivity = fromPhaseActivity;
	}

	@XmlElement
	public String getToPhaseActivity() {
		return toPhaseActivity;
	}

	public void setToPhaseActivity(String toPhaseActivity) {
		this.toPhaseActivity = toPhaseActivity;
	}

	@XmlElement
	public String getFromMeasurePoint() {
		return fromMeasurePoint;
	}

	public void setFromMeasurePoint(String fromMeasurePoint) {
		this.fromMeasurePoint = fromMeasurePoint;
	}

	@XmlElement
	public String getToMeasurePoint() {
		return toMeasurePoint;
	}

	public void setToMeasurePoint(String toMeasurePoint) {
		this.toMeasurePoint = toMeasurePoint;
	}

	@XmlElement
	public String getFromPhase() {
		return fromPhase;
	}

	public void setFromPhase(String fromPhase) {
		this.fromPhase = fromPhase;
	}

	@XmlElement
	public String getToPhase() {
		return toPhase;
	}

	public void setToPhase(String toPhase) {
		this.toPhase = toPhase;
	}

	@XmlElement
	public String getSupplierRequestNo() {
		return supplierRequestNo;
	}

	public void setSupplierRequestNo(String supplierRequestNo) {
		this.supplierRequestNo = supplierRequestNo;
	}

	@XmlElement
	public String getApprovalGrps() {
		return approvalGrps;
	}

	public void setApprovalGrps(String approvalGrps) {
		this.approvalGrps = approvalGrps;
	}

	@XmlElement
	public String getBrugerNo() {
		return brugerNo;
	}

	public void setBrugerNo(String brugerNo) {
		this.brugerNo = brugerNo;
	}

	@XmlElement
	public String getKissTeams() {
		return kissTeams;
	}

	public void setKissTeams(String kissTeams) {
		this.kissTeams = kissTeams;
	}

	@XmlElement
	public String getCaseTypes() {
		return caseTypes;
	}

	public void setCaseTypes(String caseTypes) {
		this.caseTypes = caseTypes;
	}

	@XmlElement
	public String getBrugerGrp() {
		return brugerGrp;
	}

	public void setBrugerGrp(String brugerGrp) {
		this.brugerGrp = brugerGrp;
	}

	@XmlElement
	public String getKissDept() {
		return kissDept;
	}

	public void setKissDept(String kissDept) {
		this.kissDept = kissDept;
	}

	@XmlElement
	public Map<Integer, List<String>> getPgValues() {
		return pgValues;
	}

	public void setPgValues(Map<Integer, List<String>> pgValues) {
		this.pgValues = pgValues;
	}

	@XmlElement
	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	@XmlElement
	public boolean isUnLimited() {
		return unLimited;
	}

	public void setUnLimited(boolean unLimited) {
		this.unLimited = unLimited;
	}

	@XmlElement
	public int getPossibleRoles() {
		return possibleRoles;
	}

	public void setPossibleRoles(int possibleRoles) {
		this.possibleRoles = possibleRoles;
	}

	@XmlElement
	public int getMandatoryRoleCnt() {
		return mandatoryRoleCnt;
	}

	public void setMandatoryRoleCnt(int mandatoryRoleCnt) {
		this.mandatoryRoleCnt = mandatoryRoleCnt;
	}

	@XmlElement
	public boolean isReviewAllowed() {
		return reviewAllowed;
	}

	public void setReviewAllowed(boolean reviewAllowed) {
		this.reviewAllowed = reviewAllowed;
	}

}
