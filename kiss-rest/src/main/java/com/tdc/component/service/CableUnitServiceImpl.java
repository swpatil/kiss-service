package com.tdc.component.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tdc.component.bean.CableUnitTreeBean;
import com.tdc.persistence.dao.entity.Cableunit;
import com.tdc.persistence.dao.interfaces.CableUnitDAO;


@Service
public class CableUnitServiceImpl implements CableUnitService {

@Autowired	
private CableUnitDAO cableUnitDAO;


@Transactional
public CableUnitTreeBean getCuTreeBeanDetail(String id) {
		// TODO Auto-generated method stub
		CableUnitTreeBean bean= new CableUnitTreeBean();
		Cableunit cableunit=cableUnitDAO.find(id);
		bean.setAnlAdmKode(cableunit.getAnlAdmKode());
		bean.setAnlAnlaegsform(cableunit.getAnlAnlaegsform());
		bean.setAnlAnlaegsnavn(cableunit.getAnlAnlaegsnavn());
		bean.setAnlAnlaegsnr(cableunit.getAnlAnlaegsnr());
		bean.setAnlEjerkode(cableunit.getAnlEjerkode());
		bean.setAnlKommunenr(cableunit.getAnlKommunenr());
		bean.setSignalforskilde(cableunit.getSignalforskilde());
		
		return bean;
	}
	
	
}
