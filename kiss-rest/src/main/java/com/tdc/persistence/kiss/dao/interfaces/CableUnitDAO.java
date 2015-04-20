package com.tdc.persistence.kiss.dao.interfaces;

import java.util.List;

import com.tdc.persistence.kiss.dao.entity.Cableunit;

public interface CableUnitDAO extends GenericDAO<Cableunit, String>{
	
	
	public Cableunit findByCUNumber(String id) ;
	public List<String> findCusByNumber(String cuNumber);
	public List<String> findCusByName(String cuname);
}
