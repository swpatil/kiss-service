package com.tdc.component.service;

import java.util.List;

import com.tdc.component.bean.InstallationSO;

public interface InstallationService {

	public List<InstallationSO> getInstallationsByCustomerNumber(String customerNumber);
}
