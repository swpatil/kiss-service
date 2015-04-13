package com.tdc.persistence.kiss.dao.implementation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tdc.persistence.kiss.dao.entity.Cableunit;
import com.tdc.persistence.kiss.dao.interfaces.CableUnitDAO;

@Repository
public class CableUnitDAOImpl extends GenericDaoImpl<Cableunit, String>
		implements CableUnitDAO {
	
	@Transactional(readOnly = true)
	public Cableunit findByCUNumber(String id) {
	    //Scalar function
	    Query query = getEntityManager().createQuery("select CU from Cableunit CU where CU.anlAnlaegsnr=:anlAnlaegsnr");
	    query.setParameter("anlAnlaegsnr", id);
	    List<Cableunit> cableunit=query.getResultList();

		return cableunit.get(0);
	
	}

	@Transactional(readOnly = true)
	public List<String> findCusByNumber(String cuNumber) {
		// TODO Auto-generated method stub
		Query query = getEntityManager().createQuery("select CU.anlAnlaegsnr from Cableunit CU where CU.anlAnlaegsnr LIKE :anlAnlaegsnr");
	    query.setParameter("anlAnlaegsnr", "%"+cuNumber+"%");
		query.setMaxResults(10);
		
		List<String> list = query.getResultList();
		return list;
	}

}
