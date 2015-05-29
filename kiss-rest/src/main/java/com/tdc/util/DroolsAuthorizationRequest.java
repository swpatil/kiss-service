
package com.tdc.util;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.springframework.stereotype.Component;

import com.tdc.component.bean.NyssStaffSO;

/**
 * Created by IntelliJ IDEA. User: m38929 Date: 03-09-2012 Time: 10:03:42 To
 * change this template use File | Settings | File Templates.
 */
@Component
@XmlRootElement
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
public class DroolsAuthorizationRequest implements Serializable {
	private static final long serialVersionUID = 0L;

	private String screenId;

	private boolean winLoginId = true;

	private String ruleProjectName;

	private String ruleSetName;

	

	private boolean godKendelseYSFlag;

	private boolean yoInternFlag;

	private boolean nysalgFlag;

	private boolean tillaegsaftaleFlag;

	private boolean idriftDatoFlag;

	private boolean nyIdriftDatoFlag;

	private boolean sagenFlag;
	
	private boolean tilbudLastFLag;
	
	private boolean potentialFlag;

	private boolean mainCaseFlag;
	
	private boolean caseType;
	
	private boolean mpCompleted;
	
	private boolean pcaMpCompleted;
	
	private boolean mpToken;
	
	private boolean mpPCAToken;
	
	private NyssStaffSO nyssStaffSO;

	public DroolsAuthorizationRequest() {
	}

	@XmlElement
	public boolean isIdriftDatoFlag() {
		return idriftDatoFlag;
	}

	public void setIdriftDatoFlag(boolean idriftDatoFlag) {
		this.idriftDatoFlag = idriftDatoFlag;
	}

	public boolean isNyIdriftDatoFlag() {
		return nyIdriftDatoFlag;
	}

	public void setNyIdriftDatoFlag(boolean nyIdriftDatoFlag) {
		this.nyIdriftDatoFlag = nyIdriftDatoFlag;
	}

	@XmlElement
	public String getScreenId() {
		return screenId;
	}

	public void setScreenId(String screenId) {
		this.screenId = screenId;
	}

	@XmlElement
	public String getRuleProjectName() {
		return ruleProjectName;
	}

	public void setRuleProjectName(String ruleProjectName) {
		this.ruleProjectName = ruleProjectName;
	}

	@XmlElement
	public String getRuleSetName() {
		return ruleSetName;
	}

	public void setRuleSetName(String ruleSetName) {
		this.ruleSetName = ruleSetName;
	}



	@XmlElement
	public boolean isGodKendelseYSFlag() {
		return godKendelseYSFlag;
	}

	public void setGodKendelseYSFlag(boolean godKendelseYSFlag) {
		this.godKendelseYSFlag = godKendelseYSFlag;
	}

	@XmlElement
	public boolean isWinLoginId() {
		return winLoginId;
	}

	public void setWinLoginId(boolean winLoginId) {
		this.winLoginId = winLoginId;
	}

	@XmlElement
	public boolean isYoInternFlag() {
		return yoInternFlag;
	}

	public void setYoInternFlag(boolean yoInternFlag) {
		this.yoInternFlag = yoInternFlag;
	}

	@XmlElement
	public boolean isNysalgFlag() {
		return nysalgFlag;
	}

	public void setNysalgFlag(boolean nysalgFlag) {
		this.nysalgFlag = nysalgFlag;
	}

	@XmlElement
	public boolean isTillaegsaftaleFlag() {
		return tillaegsaftaleFlag;
	}

	public void setTillaegsaftaleFlag(boolean tillaegsaftaleFlag) {
		this.tillaegsaftaleFlag = tillaegsaftaleFlag;
	}

	@XmlElement
	public boolean isSagenFlag() {
		return sagenFlag;
	}

	public void setSagenFlag(boolean sagenFlag) {
		this.sagenFlag = sagenFlag;
	}

	@XmlElement
	public boolean isTilbudLastFLag() {
		return tilbudLastFLag;
	}

	public void setTilbudLastFLag(boolean tilbudLastFLag) {
		this.tilbudLastFLag = tilbudLastFLag;
	}

	@XmlElement
	public boolean isPotentialFlag() {
		return potentialFlag;
	}

	public void setPotentialFlag(boolean potentialFlag) {
		this.potentialFlag = potentialFlag;
	}

	@XmlElement
	public boolean isCaseType() {
		return caseType;
	}

	public void setCaseType(boolean caseType) {
		this.caseType = caseType;
	}

	@XmlElement
	public boolean isMpCompleted() {
		return mpCompleted;
	}

	public void setMpCompleted(boolean mpCompleted) {
		this.mpCompleted = mpCompleted;
	}

	@XmlElement
	public boolean isPcaMpCompleted() {
		return pcaMpCompleted;
	}

	public void setPcaMpCompleted(boolean pcaMpCompleted) {
		this.pcaMpCompleted = pcaMpCompleted;
	}

	@XmlElement
	public boolean isMainCaseFlag() {
		return mainCaseFlag;
	}

	public void setMainCaseFlag(boolean mainCaseFlag) {
		this.mainCaseFlag = mainCaseFlag;
	}

	@XmlElement
	public boolean isMpToken() {
		return mpToken;
	}

	public void setMpToken(boolean mpToken) {
		this.mpToken = mpToken;
	}

	@XmlElement
	public boolean isMpPCAToken() {
		return mpPCAToken;
	}

	public void setMpPCAToken(boolean mpPCAToken) {
		this.mpPCAToken = mpPCAToken;
	}
	@XmlElement
	public NyssStaffSO getNyssStaffSO() {
		return nyssStaffSO;
	}

	public void setNyssStaffSO(NyssStaffSO nyssStaffSO) {
		this.nyssStaffSO = nyssStaffSO;
	}

	
}
