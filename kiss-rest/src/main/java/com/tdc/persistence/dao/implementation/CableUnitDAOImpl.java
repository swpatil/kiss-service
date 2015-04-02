package com.tdc.persistence.dao.implementation;

import org.springframework.stereotype.Repository;

import com.tdc.persistence.dao.entity.Cableunit;
import com.tdc.persistence.dao.interfaces.CableUnitDAO;

@Repository
public class CableUnitDAOImpl extends GenericDaoImpl<Cableunit, String>
		implements CableUnitDAO {

}
