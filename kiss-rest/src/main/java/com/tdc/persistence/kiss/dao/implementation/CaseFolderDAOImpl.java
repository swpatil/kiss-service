package com.tdc.persistence.kiss.dao.implementation;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tdc.persistence.kiss.dao.entity.Casefolder;
import com.tdc.persistence.kiss.dao.interfaces.CaseFolderDAO;
@Repository
public class CaseFolderDAOImpl  extends GenericDaoImpl<Casefolder, String> implements CaseFolderDAO{
	
	
	@Transactional(readOnly = true)
	public List<Casefolder> findByCUNumber(String id) {
	    Query query = getEntityManager().createQuery("select CF from Casefolder CF where CF.primcableunit=:primcableunit");
	    query.setParameter("primcableunit", id);
	    
	    List<Casefolder> casefolder=query.getResultList();
	
	   
		return casefolder;
	}
	

}
