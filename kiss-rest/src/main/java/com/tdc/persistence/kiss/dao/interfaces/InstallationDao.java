package com.tdc.persistence.kiss.dao.interfaces;

import java.util.List;

import com.tdc.persistence.kiss.dao.entity.Installation;

public interface InstallationDao extends GenericDAO<Installation, String> {

	public List<Installation> findByCustomer(String customerNumber);
}
