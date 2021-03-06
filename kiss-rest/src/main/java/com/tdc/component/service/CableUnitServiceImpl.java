package com.tdc.component.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tdc.component.bean.CableUnitSO;
import com.tdc.component.bean.CableUnitTreeSO;
import com.tdc.component.bean.CaseFolderSO;
import com.tdc.component.bean.CaseFolderTreeSO;
import com.tdc.component.bean.OfferSO;
import com.tdc.component.bean.OfferTreeSO;
import com.tdc.component.bean.SearchEntityBean;
import com.tdc.persistence.kiss.dao.entity.Cableunit;
import com.tdc.persistence.kiss.dao.interfaces.CableUnitDAO;
import com.tdc.persistence.kiss.dao.interfaces.CaseFolderDAO;

@Service
public class CableUnitServiceImpl extends CommonServiceImpl implements
		CableUnitService {

	@Autowired
	private CableUnitDAO cableUnitDAO;

	@Autowired
	private CaseFolderDAO caseFolderDAO;
	
	@Autowired
	private SearchEntityBean searchEntiyBean;

	@Transactional
	public CableUnitSO getCuTreeBeanDetail(String id) {

		Cableunit cableunit = cableUnitDAO.find(id);
		CableUnitSO bean = dozerBeanMapper.map(cableunit, CableUnitSO.class);

		return bean;
	}

	@Transactional
	public CableUnitTreeSO findByCUNumber(String customerNumber) {

		Cableunit cableunit = cableUnitDAO.findByCUNumber(customerNumber);
		CableUnitSO cableUnitSO = dozerBeanMapper.map(cableunit,
				CableUnitSO.class);

		CableUnitTreeSO cableUnitTreeSO = formCableUnitTree(cableUnitSO);
		return cableUnitTreeSO;
	}

	public CableUnitTreeSO formCableUnitTree(CableUnitSO cableUnitSO) {

		CableUnitTreeSO cableUnitTreeSO = new CableUnitTreeSO();
		cableUnitTreeSO.setId(cableUnitSO.getAnlAnlaegsnr());
		cableUnitTreeSO.setTitle(cableUnitSO.getAnlAnlaegsnavn());
		cableUnitTreeSO.setType("cu");
		Set<CaseFolderTreeSO> caseFolderTreeSet = new HashSet<CaseFolderTreeSO>();
		for (CaseFolderSO caseFolderSO : cableUnitSO.getCaseFolder()) {
			Set<OfferTreeSO> offerTreeSOSet = new HashSet<OfferTreeSO>();
			CaseFolderTreeSO caseFolderTreeSO = new CaseFolderTreeSO();
			caseFolderTreeSO.setId(caseFolderSO.getId());
			caseFolderTreeSO.setTitle(caseFolderSO.getSalestype().getHead()
					+ " " + caseFolderSO.getSagsnr());
			caseFolderTreeSO.setType("case");
			for (OfferSO offerSO : caseFolderSO.getOffers()) {

				OfferTreeSO offerTree = new OfferTreeSO();
				if (offerSO.getId() != null) {
					offerTree.setType("offer");
					offerTree.setId(offerSO.getId());
					if (offerSO.getSalesconcept() != null)
						offerTree.setTitle(offerSO.getSalesconcept().getCode());
					else
						offerTree.setTitle("ej tildelt");
					offerTreeSOSet.add(offerTree);
				}
			}
			caseFolderTreeSO.setNodes(offerTreeSOSet);
			caseFolderTreeSet.add(caseFolderTreeSO);
		}
		cableUnitTreeSO.setNodes(caseFolderTreeSet);
		return cableUnitTreeSO;
	}

	@Override
	public List<String> findCusByNumber(String customerNumber) {
		// TODO Auto-generated method stub
		return cableUnitDAO.findCusByNumber(customerNumber);
		
		//return null;
	}

	@Override
	public List<String> searchCubyNumber(String cuNumber) {
		// TODO Auto-generated method stub
		
		/*String[] fieldstoSearch ={"anlAnlaegsnr","anlAnlaegsnavn"};
		
		List<Cableunit> cus =searchEntiyBean.hibernatesearch(fieldstoSearch, cuNumber, Cableunit.class);
		
		List<String> cuNos = new ArrayList<String>();
		
		if(cus !=null || !cus.isEmpty()){
			
		for(Cableunit cu:cus){
			cuNos.add(cu.getAnlAnlaegsnavn() +' '+cu.getAnlAnlaegsnr());
		}
		}		
		return cuNos;*/
		return cableUnitDAO.findCusByName(cuNumber);
		
	}

}
