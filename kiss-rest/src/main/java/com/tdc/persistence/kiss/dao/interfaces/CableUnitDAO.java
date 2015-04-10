package com.tdc.persistence.kiss.dao.interfaces;

import com.tdc.persistence.kiss.dao.entity.Cableunit;

public interface CableUnitDAO extends GenericDAO<Cableunit, String>{
	
	
	public Cableunit findByCUNumber(String id) ;

}
