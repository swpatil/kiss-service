package com.tdc.component.service;

import java.util.List;

import com.tdc.component.bean.ErrorDetailSO;
import com.tdc.component.bean.InstallationSO;

public interface InstallationService {
	public List<InstallationSO> getInstallationsByCuNumber(String customerNumber);

	public List<InstallationSO> getInstallationsByCustomerNumber(String customerNumber);
	
	public ErrorDetailSO createCableUnitInstallations(String cableUnitNumber, List<Long> addressIds);
}
