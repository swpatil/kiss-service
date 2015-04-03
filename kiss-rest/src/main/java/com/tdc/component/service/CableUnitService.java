package com.tdc.component.service;

import com.tdc.component.bean.CableUnitVO;





public interface CableUnitService {
		
  public CableUnitVO getCuTreeBeanDetail(String name);
  public CableUnitVO findByCUNumber(String name);
}
