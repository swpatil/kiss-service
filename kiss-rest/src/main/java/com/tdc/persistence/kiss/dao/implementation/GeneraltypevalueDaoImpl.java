package com.tdc.persistence.kiss.dao.implementation;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.tdc.persistence.kiss.dao.entity.Generaltypevalue;
import com.tdc.persistence.kiss.dao.interfaces.GeneraltypevalueDao;

@Repository
public class GeneraltypevalueDaoImpl extends GenericDaoImpl<Generaltypevalue, String> implements GeneraltypevalueDao {

	@Override
	public Generaltypevalue findByValuCode(String gtvCode) {
		// TODO Auto-generated method stub
		Query query = getEntityManager().createQuery("SELECT gtv from Generaltypevalue gtv where gtv.code =:gtvCode");
		query.setParameter("gtvCode", gtvCode);
		
		Generaltypevalue gtv = (Generaltypevalue) query.getSingleResult();
		
		return gtv;
	}

}
