package com.tdc.persistence.ams.dao.implementation;

import org.springframework.stereotype.Repository;

import com.tdc.persistence.ams.dao.entity.Addresses;
import com.tdc.persistence.ams.dao.interfaces.AddressDAO;

@Repository
public class AddressDAOImpl extends GenericAmsDaoImpl<Addresses, String>
		implements AddressDAO {
	
	

}
