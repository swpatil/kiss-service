package com.tdc.component.bean;

import java.io.Serializable;
import java.util.List;

public class InstallationResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<InstallationSO> installations;

	private int totalPages;

	public List<InstallationSO> getInstallations() {
		return installations;
	}

	public void setInstallations(List<InstallationSO> installations) {
		this.installations = installations;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

}
