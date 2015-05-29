package com.tdc.component.bean;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.springframework.stereotype.Component;

/**
 * <p>Title:NyssStaffSO</p>
 * <p/>
 * <p>Description:This class handels the data coming from corresponding VO </p>
 * <p/>
 * <p>Copyright: Copyright (c) 2006</p>
 * <p/>
 * <p>Company : TDC Kabel TV </p>
 *
 * @author m03332
 * @version 1.1 $
 */
@Component
@XmlRootElement
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
public class NyssStaffSO implements Serializable {
    private static final long serialVersionUID = 0L;

    /**
     * Attribute for holding id  from Staff.id ;
     */
    private String id;

    /**
     * Attribute for holding winLoginName  from Staff.winLoginName ;
     */
    private String winLoginName;

    /**
     * Attribute for holding firstName  from Staff.firstName ;
     */
    private String firstName;

    /**
     * Attribute for holding lastName  from Staff.lastName ;
     */
    private String lastName;

    /**
     * Attribute for holding userInitials  from Staff.userInitials ;
     */
    private String userInitials;

    /**
     * Attribute for holding fullName from Staff.userInitials ;
     */
    private String fullName;

    /**
     * Attribute for holding email  from Staff.email ;
     */
    private String email;

    private String title;

    /**
     * Attribute for holding mobilePhone  from Staff.mobilePhone ;
     */
    private String mobilePhone;

    /**
     * Attribute for holding workPhone  from Staff.workPhone ;
     */
    private String workPhone;

    private String street;
    private String city;
    private String zip;

    private String department;

    private String primaryTeam;

    private String[] teams;
    private boolean memberOfKissRead;
    private boolean memberOfKissUser;
    private boolean memberOfKissAdministrator;
    private boolean memberOfKissSuperBruger;
    private String user;

    /**
     * Default Constructor
     */
    public NyssStaffSO() {
    }

    @XmlElement
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlElement
    public String getWinLoginName() {
        return winLoginName;
    }

    public void setWinLoginName(String winLoginName) {
        this.winLoginName = winLoginName;
    }

    @XmlElement
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @XmlElement
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @XmlElement
    public String getUserInitials() {
        return userInitials;
    }

    public void setUserInitials(String userInitials) {
        this.userInitials = userInitials;
    }

    @XmlElement
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @XmlElement
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlElement
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
		if(department!=null) {
			this.department=department.trim();
		}
    }

    @XmlElement
    public String[] getTeams() {
        return teams;
    }

    public void setTeams(String[] teams) {
        this.teams = teams;
    }

    @XmlElement
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @XmlElement
    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    @XmlElement
    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    @XmlElement
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @XmlElement
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @XmlElement
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @XmlElement
    public boolean isMemberOfKissRead() {
        return memberOfKissRead;
    }


    public void setMemberOfKissRead(boolean memberOfKissRead) {
        this.memberOfKissRead = memberOfKissRead;
    }

    @XmlElement
    public boolean isMemberOfKissUser() {
        return memberOfKissUser;
    }


    public void setMemberOfKissUser(boolean memberOfKissUser) {
        this.memberOfKissUser = memberOfKissUser;
    }

    @XmlElement
    public boolean isMemberOfKissAdministrator() {
        return memberOfKissAdministrator;
    }


    public void setMemberOfKissAdministrator(boolean memberOfKissAdministrator) {
        this.memberOfKissAdministrator = memberOfKissAdministrator;
    }

    @XmlElement
    public String getPrimaryTeam() {
        return primaryTeam;
    }

    public void setPrimaryTeam(String primaryTeam) {
        this.primaryTeam = primaryTeam;
    }

    @XmlElement
    public boolean isMemberOfKissSuperBruger() {
        return memberOfKissSuperBruger;
    }

    public void setMemberOfKissSuperBruger(boolean memberOfKissSuperBruger) {
        this.memberOfKissSuperBruger = memberOfKissSuperBruger;
    }

     @XmlElement
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}