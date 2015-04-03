package com.tdc.component.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tdc.component.bean.CableUnitVO;
import com.tdc.component.bean.CaseFolderVO;
import com.tdc.persistence.dao.entity.Cableunit;
import com.tdc.persistence.dao.entity.Casefolder;
import com.tdc.persistence.dao.interfaces.CableUnitDAO;
import com.tdc.persistence.dao.interfaces.CaseFolderDAO;


@Service
public class CableUnitServiceImpl extends CommonServiceImpl implements CableUnitService {

@Autowired	
private CableUnitDAO cableUnitDAO;

@Autowired	
private CaseFolderDAO caseFolderDAO;






@Transactional
public CableUnitVO getCuTreeBeanDetail(String id) {
		
		Cableunit cableunit=cableUnitDAO.find(id);
		CableUnitVO bean =dozerBeanMapper.map(cableunit, CableUnitVO.class);
		Set<Casefolder> caseFolder=cableunit.getCaseFolder();
		return bean;
	}
	
@Transactional
public CableUnitVO findByCUNumber(String id) {

		Cableunit cableunit=cableUnitDAO.findByCUNumber(id);
		CableUnitVO bean =dozerBeanMapper.map(cableunit, CableUnitVO.class);
		
		  List<Casefolder> caseFolderList=caseFolderDAO.findByCUNumber(id);
		  List<CaseFolderVO> caseFolderVO=new ArrayList<CaseFolderVO>();
			List<CaseFolderVO> CaseFolderVOList = mapArray(caseFolderList,
					CaseFolderVO.class);
			/*
	    for (Casefolder casefolder2 : caseFolderBeanList) {
	    	CaseFolderVO ex= new CaseFolderVO();
	    	ex=dozerBeanMapper.map(casefolder2, CaseFolderVO.class);
	    	caseFolderVO.add(ex);
	    	System.out.println(caseFolderBeanList.get(0));
		}*/
	    	
		return bean;
	}
	
}
