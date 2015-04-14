package com.tdc.component.service;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class CommonServiceImpl {
	@Autowired
	protected DozerBeanMapper dozerBeanMapper;
	
	
	protected <T> List<T> mapArray(List<?> sourceClass, Class<T> destListClass) {
		List<T> result = new ArrayList<T>();
		for (Object o : sourceClass) {
			if (o != null) {
				result.add(destListClass.cast(dozerBeanMapper.map(o, destListClass)));
			}
		}
		return result;
	}
	
	

}
