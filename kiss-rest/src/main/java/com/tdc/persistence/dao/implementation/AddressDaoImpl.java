package com.tdc.persistence.dao.implementation;

import org.springframework.stereotype.Repository;

import com.tdc.persistence.dao.entity.Address;
import com.tdc.persistence.dao.interfaces.AddressDao;

@Repository
public class AddressDaoImpl extends GenericDaoImpl<Address, Long> implements AddressDao {

}
