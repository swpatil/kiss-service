package com.tdc.persistence.kiss.dao.interfaces;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.tdc.persistence.kiss.dao.entity.Installation;

public interface InstallationDao extends GenericDAO<Installation, String> {

	public List<Installation> findByCustomer(String customerNumber);
	public Collection findByAddressLocation(Long addressId, String location);
	
	public List<Installation> getCableUnitInstallationsForInstallationIds(String cableUnitNumber, List <String> installationIds,int firstResults,int maxResults);
	public Map<Long, List<String>> getAllAddressIdsWithInstallation(String cableUnitNumber);
	
	 public Long countInstallations();

}
