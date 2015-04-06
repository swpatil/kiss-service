package com.tdc.component.service;

import com.tdc.component.bean.CableUnitTreeSO;
import com.tdc.component.bean.CableUnitSO;





public interface CableUnitService {
		
  public CableUnitSO getCuTreeBeanDetail(String name);
  public CableUnitTreeSO findByCUNumber(String customerNumber);
}
