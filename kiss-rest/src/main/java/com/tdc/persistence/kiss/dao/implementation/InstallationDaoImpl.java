package com.tdc.persistence.kiss.dao.implementation;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tdc.persistence.kiss.dao.entity.Installation;
import com.tdc.persistence.kiss.dao.interfaces.InstallationDao;

@Repository
public class InstallationDaoImpl extends GenericDaoImpl<Installation, String> implements InstallationDao {

	@Transactional(readOnly=true)
	public List<Installation> findByCustomer(String customerNumber) {
		 Query query = getEntityManager().createQuery("select inst from Installation inst where inst.cableunitid=:cableunit");
		    query.setParameter("cableunit", customerNumber);
		    
		    List<Installation> installations=query.getResultList();
		
		   
			return installations;
	}

}
