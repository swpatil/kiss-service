package com.tdc.persistence.ams.dao.implementation;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.tdc.persistence.ams.dao.entity.Amskeycabinet;
import com.tdc.persistence.ams.dao.interfaces.AmsKeyCabinetDao;

@Repository
public class AmsKeyCabinetDaoImpl  extends GenericAmsDaoImpl<Amskeycabinet, Long> implements AmsKeyCabinetDao{
	

	public Amskeycabinet findByAmsid(long id) {
		Query query = getEntityManager().createQuery("select amskey from Amskeycabinet amskey where amskey.id.amsid=:amsID");
		query.setParameter("amsID", id);
		List<Amskeycabinet> results = query.getResultList();
		if (results.isEmpty()) {
		    return null; // handle no-results case
		} else {
		    return results.get(0);
		}
	}
	

}
