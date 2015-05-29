package com.tdc.component.bean;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;
import java.util.Calendar;

/**
 * Created by IntelliJ IDEA.
 * User: m38929
 * Date: 04-09-2012
 * Time: 09:17:16
 * To change this template use File | Settings | File Templates.
 */

@XmlRootElement
@JsonSerialize(include= JsonSerialize.Inclusion.NON_DEFAULT)
public class AuthorizationResultSO implements Serializable {

    private static final long serialVersionUID = 0L;
    /** Attribute for holding editableFields list from drools */
    private String editableFields;
    private String mandatoryFields;
    private String historyFields;
    private String adminEdit;
    private Calendar bindingPeriodDate;
    
    @XmlElement
    public Calendar getBindingPeriodDate() {
        return bindingPeriodDate;
    }

    public void setBindingPeriodDate(Calendar bindingPeriodDate) {
        this.bindingPeriodDate = bindingPeriodDate;
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
}