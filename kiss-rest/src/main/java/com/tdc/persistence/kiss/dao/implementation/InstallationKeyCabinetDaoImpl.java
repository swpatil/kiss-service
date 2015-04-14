package com.tdc.persistence.kiss.dao.implementation;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.tdc.persistence.kiss.dao.entity.Installationkeycabinet;
import com.tdc.persistence.kiss.dao.interfaces.InstallationKeyCabinetDao;

@Repository
public class InstallationKeyCabinetDaoImpl extends GenericDaoImpl<Installationkeycabinet, String> implements InstallationKeyCabinetDao {

	@Override
	public Integer findMaxlbnr(String casperId, Long addressId) {
		// TODO Auto-generated method stub
		int maxlbnr =0;
		Query query = getEntityManager().createQuery("select Max(ikc.instLbnr) from Installationkeycabinet ikc where ikc.casperaddressid =:casperId and ikc.id.addressid =:addressId");
		query.setParameter("casperId", casperId);
		query.setParameter("addressId",	addressId);
		
		Installationkeycabinet ikc = (Installationkeycabinet) query.getSingleResult();
		
		if(ikc!=null){
		return Integer.valueOf(ikc.getInstLbnr());
		}else{
			return maxlbnr;
		}
	}

}
