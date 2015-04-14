package com.tdc.persistence.kiss.dao.implementation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	@Transactional(readOnly =true)
	public Map<Long, List<String>> getAllAddressIdsWithInstallation(String cableUnitNumber) {
		// TODO Auto-generated method stub
		
		Map<Long, List<String>> addressIdsMap = new HashMap<Long, List<String>>();
		
        List<String> addressArray;
		Query query = getEntityManager().createQuery("SELECT distinct inst from Installation inst INNER JOIN inst.generaltypevalue gtv where gtv.id = INSTALLATIONSTATUSID AND gtv.code NOT IN ('8-IS','9-IS') AND inst.cableunitid=:cuNumber");
		query.setParameter("cuNumber", cableUnitNumber);
		List<Installation> list =query.getResultList();
		System.out.println("inst 1query count:"+list.size());
		Long addressId =0l;
        String installationId = "";
		
		if(list.size() > 0){
		for(Installation inst:list){
			
			addressId = inst.getAddressid();
            installationId = inst.getId();
            
			 if(addressIdsMap.containsKey(addressId))
             {

                 addressArray = addressIdsMap.get(addressId);
                 addressArray.add(installationId);
                 addressIdsMap.put(addressId,addressArray);
             }
             else
             {
                addressArray = new ArrayList<String>();
                addressArray.add(installationId);
                addressIdsMap.put(addressId,addressArray);
             }

		}
		}
		
		return addressIdsMap;
	}
	
	
	public List<Installation> getCableUnitInstallationsForInstallationIds(String cableUnitNumber, List <String> installationIds){
		
		
		List<Installation> instList = new ArrayList<Installation>();
		Query query = getEntityManager().createNativeQuery("SELECT CUI.ID id,CUI.MODD modd, ikc.inst_lbnr lbnr FROM INSTALLATION CUI, GENERALTYPEVALUE GTV,installationkeycabinet ikc WHERE 1=1 AND GTV.ID = INSTALLATIONSTATUSID AND ikc.STARTDATO = CUI.STARTDATE AND ikc.INSTALLATIONSEQ = CUI.INSTALLATIONSEQ AND GTV.CODE NOT IN ('8-IS','9-IS') AND CUI.CABLEUNITID=?1 AND CUI.ID=?2",Installation.class);
		query.setParameter(1, cableUnitNumber);
		
		for(String id:installationIds){
			query.setParameter(2, id);
			List<Installation> list =query.getResultList();
			instList.addAll(list);
		}
		
		return instList;
	}

	@Override
	public Collection findByAddressLocation(Long addressId, String location) {
		// TODO Auto-generated method stub
		List<Installation> insts = null;
		if(location==null){
			Query query = getEntityManager().createQuery("SELECT inst from Installation inst INNER JOIN inst.generaltypevalue gtv where gtv.code NOT IN ('8-IS','9-IS') AND inst.addressid=:addressId");
			query.setParameter("addressId", addressId);
			insts = query.getResultList();
		}else{
			Query query = getEntityManager().createQuery("SELECT inst from Installation inst INNER JOIN inst.generaltypevalue gtv where gtv.code NOT IN ('8-IS','9-IS') AND inst.addressid=:addressId AND inst.location=:location");
			query.setParameter("addressId", addressId);
			query.setParameter("location", location);
			insts = query.getResultList();
		}
		return insts;
	}
	

}
