package com.tdc.component.service;


import org.springframework.stereotype.Service;

import com.tdc.component.bean.CableUnitTreeBean;


@Service
public class CableUnitServiceImpl implements CableUnitService {

public CableUnitTreeBean getCuTreeBeanDetail(String name) {
		// TODO Auto-generated method stub
		CableUnitTreeBean bean= new CableUnitTreeBean();
		bean.setCuId("dfdf");
		bean.setCuName("dfdfdf");
		return bean;
	}
	
	
}
