package com.tdc.persistence.dao.interfaces;

import java.util.List;

import com.tdc.persistence.dao.entity.Installation;

public interface InstallationDao extends GenericDAO<Installation, String> {

	public List<Installation> findByCustomer(String customerNumber);
}
