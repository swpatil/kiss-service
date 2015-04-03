package com.tdc.persistence.dao.interfaces;

import java.util.List;

import com.tdc.persistence.dao.entity.Casefolder;

public interface CaseFolderDAO extends GenericDAO<Casefolder, String>{
	

	public List<Casefolder> findByCUNumber(String id);
}
