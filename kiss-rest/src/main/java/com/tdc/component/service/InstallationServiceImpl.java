package com.tdc.component.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tdc.component.bean.CableUnitSO;
import com.tdc.component.bean.InstallationSO;
import com.tdc.persistence.dao.entity.Installation;
import com.tdc.persistence.dao.interfaces.InstallationDao;

@Service
public class InstallationServiceImpl extends CommonServiceImpl implements InstallationService {

	@Autowired
	private InstallationDao installationDao;
	
	@Transactional
	public List<InstallationSO> getInstallationsByCustomerNumber(String customerNumber) {
		// TODO Auto-generated method stub
		List<Installation> insts = installationDao.findByCustomer(customerNumber);
		//InstallationSO bean =dozerBeanMapper.map(insts, InstallationSO.class);
		
		return mapArray(insts, InstallationSO.class);
		//return bean;
	}

}
