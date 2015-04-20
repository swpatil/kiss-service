package com.tdc.persistence.ams.dao.implementation;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.tdc.persistence.ams.dao.entity.Amskeycabinet;
import com.tdc.persistence.ams.dao.interfaces.AmsKeyCabinetDao;

@Repository
public class AmsKeyCabinetDaoImpl  extends GenericAmsDaoImpl<Amskeycabinet, Long> implements AmsKeyCabinetDao{
	

	public String findByAmsid(Long amsId) {
		Query query = getEntityManager().createQuery("select amskey.id.casperid from Amskeycabinet amskey where amskey.id.amsid=:amsID");
		query.setParameter("amsID", amsId);
		List<String> results = query.getResultList();
		System.out.println("Casper Result:" +results);
		if (results.isEmpty()) {
		    return null; // handle no-results case
		} else {
		    return results.get(0);
		}
	}
	

}
