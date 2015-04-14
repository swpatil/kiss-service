package com.tdc.component.bean;

import java.io.Serializable;

public class ErrorDetailSO implements Serializable {
	

    /**
     * A mnemonic name for the icon.
     */
    private String code;

    /**
     * A convenience field for the administrator to hold some notes and
     * explanations about the icon.
     */
    private String description;

    /**
     * default constructor
     */
    public ErrorDetailSO() {
    }

    /**
     * @param code String
     * @param description String
     */
    public ErrorDetailSO(String code, String description) {
        this.code = code;
        this.description = description;
    }

    /**
     * Method to get code for SGIcon.
     *
     * @return String code.
     */
    public String getCode() {
        return code;
    }

    /**
     * Method to set code for SGIcon.
     *
     * @param code String.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Method to get description for SGIcon.
     *
     * @return description String.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Method to set description for SGIcon.
     *
     * @param description String.
     */
    public void setDescription(String description) {
        this.description = description;
    }


}
