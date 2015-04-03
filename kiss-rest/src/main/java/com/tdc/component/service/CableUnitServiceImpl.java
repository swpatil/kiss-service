package com.tdc.component.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tdc.component.bean.CableUnitTreeBean;
import com.tdc.persistence.dao.entity.Cableunit;
import com.tdc.persistence.dao.interfaces.CableUnitDAO;


@Service
public class CableUnitServiceImpl extends CommonServiceImpl implements CableUnitService {

@Autowired	
private CableUnitDAO cableUnitDAO;




@Transactional
public CableUnitTreeBean getCuTreeBeanDetail(String id) {
		
		Cableunit cableunit=cableUnitDAO.find(id);
		CableUnitTreeBean bean =dozerBeanMapper.map(cableunit, CableUnitTreeBean.class);
		return bean;
	}
	
@Transactional
public CableUnitTreeBean findByCUNumber(String id) {

		Cableunit cableunit=cableUnitDAO.findByCUNumber(id);
		CableUnitTreeBean bean =dozerBeanMapper.map(cableunit, CableUnitTreeBean.class);
		return bean;
	}
	
}
