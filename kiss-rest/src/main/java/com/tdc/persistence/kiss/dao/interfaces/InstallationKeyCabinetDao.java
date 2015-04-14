package com.tdc.persistence.kiss.dao.interfaces;

import com.tdc.persistence.kiss.dao.entity.Installationkeycabinet;

public interface InstallationKeyCabinetDao extends GenericDAO<Installationkeycabinet, String> {
	
	public Integer findMaxlbnr(String casperId,Long addressId);

}
