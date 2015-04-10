package com.tdc.persistence.kiss.dao.interfaces;

import java.util.List;

import com.tdc.persistence.kiss.dao.entity.Casefolder;

public interface CaseFolderDAO extends GenericDAO<Casefolder, String>{
	

	public List<Casefolder> findByCUNumber(String id);
}
