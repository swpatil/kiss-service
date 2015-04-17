package com.tdc.persistence.kiss.dao.implementation;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.tdc.persistence.ams.dao.entity.Amskeycabinet;
import com.tdc.persistence.kiss.dao.interfaces.AmsKeyCabinetDao;

@Repository
public class AmsKeyCabinetDaoImpl  extends GenericDaoImpl<Amskeycabinet, Long> implements AmsKeyCabinetDao{
	

	public Amskeycabinet findByAmsid(long id) {
		Query query = getEntityManager().createNativeQuery("select amsKEY.id id from AMSKEYCABINET amsKEY where amsKEY.AMSID=?1",Amskeycabinet.class);
		query.setParameter(1, id);
		Amskeycabinet amskeycabinet = (Amskeycabinet) query.getSingleResult();
		System.out.println(amskeycabinet);
		return amskeycabinet;
	}
	

}
