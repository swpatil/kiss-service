package com.tdc.component.service;

import java.util.List;

import com.tdc.component.bean.CableUnitSO;
import com.tdc.component.bean.CableUnitTreeSO;





public interface CableUnitService {
		
  public CableUnitSO getCuTreeBeanDetail(String name);
  public CableUnitTreeSO findByCUNumber(String customerNumber);
  public List<String> findCusByNumber(String customerNumber);
  public List<String> searchCubyNumber(String cuNumber);
}
