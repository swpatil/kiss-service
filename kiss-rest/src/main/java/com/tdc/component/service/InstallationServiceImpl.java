package com.tdc.component.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tdc.component.bean.AddressSO;
import com.tdc.component.bean.ErrorDetailSO;
import com.tdc.component.bean.InstallationResult;
import com.tdc.component.bean.InstallationSO;
import com.tdc.persistence.ams.dao.entity.Addresses;
import com.tdc.persistence.ams.dao.entity.Amskeycabinet;
import com.tdc.persistence.ams.dao.interfaces.AddressDAO;
import com.tdc.persistence.kiss.dao.entity.Generaltypevalue;
import com.tdc.persistence.kiss.dao.entity.Installation;
import com.tdc.persistence.kiss.dao.entity.Installationkeycabinet;
import com.tdc.persistence.kiss.dao.entity.InstallationkeycabinetId;
import com.tdc.persistence.kiss.dao.interfaces.GeneraltypevalueDao;
import com.tdc.persistence.kiss.dao.interfaces.InstallationDao;
import com.tdc.persistence.kiss.dao.interfaces.InstallationKeyCabinetDao;
import com.tdc.persistence.repositories.AddressRepository;
import com.tdc.persistence.repositories.AmsKeyCabinetRepository;

@Service
public class InstallationServiceImpl extends CommonServiceImpl implements InstallationService {
	
	private static final int PAGE_SIZE = 200;

	@Autowired
	private InstallationDao installationDao;
	
	@Autowired
	private AddressDAO addressDao;
	
	@Autowired
	private AddressRepository addressRepo;
	
	@Autowired
	private InstallationKeyCabinetDao ikcDao;
	
	@Autowired
	private GeneraltypevalueDao gtvDao;
	
	@Autowired
	private AmsKeyCabinetRepository amsKeyCabinetRepository;
	
	@Transactional
	public List<InstallationSO> getInstallationsByCuNumber(String customerNumber) {
		// TODO Auto-generated method stub
		List<Installation> insts = installationDao.findByCustomer(customerNumber);
		//InstallationSO bean =dozerBeanMapper.map(insts, InstallationSO.class);
		
		 List<InstallationSO> instso = mapArray(insts, InstallationSO.class);
		 
		 
		return instso;
	}

	@Transactional
	public InstallationResult getInstallationsByCustomerNumber(
			String customerNumber,int pagNo) {

		Map<Long, List<String> >  addressIdsMap = installationDao.getAllAddressIdsWithInstallation(customerNumber);
		Set<Long> addressKeys = addressIdsMap.keySet();
		//TODO :sorting
		// List<Long> sortedAddressIds =amsAddressFunction.getSortedAddressIds(addressKeys);
		
		List<String> installationIds = new ArrayList<String>();
			Iterator<Long> it= addressKeys.iterator();
			while(it.hasNext()) {
				List<String> iList = addressIdsMap.get(it.next());
				if(iList.size()>0){
				for(int j=0;j<iList.size();j++){
					installationIds.add(iList.get(j));
				}
			}
			}
		
	   /* int count=0;
        if(sortedAddressIds!=null)
        {
            for(int j=0; j<sortedAddressIds.size() ;j++)
            {
              List<String> idList= addressIdsMap.get(sortedAddressIds.get(j));
              if(idList!=null && idList.size()>0)
              {
                 for(int i =0; i<idList.size(); i++,count++)
                 {
                     if(count>=startIndex && count<endIndex)
                     {
                         installationIds.add(idList.get(i));
                     }

                 }
                  if(count>endIndex)
                  {
                      break;
                  }
              }

            }
        }*/
		 int firstResult = (pagNo==0)?0:(pagNo-1) * PAGE_SIZE;
		 List<Installation> insts = installationDao.getCableUnitInstallationsForInstallationIds(customerNumber, installationIds,firstResult,200);
		 	 
		
		 float nrOfPages = (float)this.installationDao.countInstallations()/PAGE_SIZE;		 
		 int maxPages = (int)( ((nrOfPages>(int)nrOfPages) || nrOfPages==0.0)?nrOfPages+1:nrOfPages);

			

		// Total no of records
     /*   int totalRecord=0;
        for(Long addressKey : addressKeys)
        {
            if(addressIdsMap.get(addressKey)!=null)s
            {
                totalRecord+=addressIdsMap.get(addressKey).size();
            }
        }*/
        
         List<InstallationSO> list = mapArray(insts, InstallationSO.class);
		
		for(InstallationSO inst:list){
			Long id = inst.getAddressid();
			if(id !=null ){
			Addresses address = addressRepo.findByIdAddressId(inst.getAddressid());
			if(address!=null){
			 AddressSO addso=dozerBeanMapper.map(address, AddressSO.class);
			 inst.setAddress(addso);
			 }
			}
		}
		
		 InstallationResult installationResult = new InstallationResult();
		 installationResult.setInstallations(list);
		 installationResult.setTotalPages(maxPages);
		 
		return installationResult;
	}
	
	@Transactional
	public ErrorDetailSO createCableUnitInstallations(String cableUnitNumber,List<Long> addressIds) {
		// TODO Auto-generated method stub
		//check Cableunit exist or not
		
		ErrorDetailSO errorDetailSO = null;
		//check for already available
		for(Long addressId:addressIds){
			Collection instIds = checkInstallationByAddressLocation(addressId, null);
			System.out.println("insIds:" +instIds);
			
			if(instIds == null || instIds.isEmpty()){
				//create cu installation
				if(!createCableunitInstallation(cableUnitNumber, addressId)){
					errorDetailSO = new ErrorDetailSO("103","Unable to find casperId for the given amsid");
				}
			}else{
				errorDetailSO = new ErrorDetailSO("101","Installations Already attached");
			}
			
			}
		if(errorDetailSO == null){
			errorDetailSO = new ErrorDetailSO("200","Installations added successfully");
		}
		
		return errorDetailSO;
	}
	
	private Collection checkInstallationByAddressLocation(Long addressId,String location){
		return installationDao.findByAddressLocation(addressId, location);
	}
	
	private boolean createCableunitInstallation(String cuNumber,Long addressId){
		//getAMSLocalService().findCasperIdByAmsId(addressId);
		boolean result = false;
		String casperId = null;
		Amskeycabinet amskeycabinate = amsKeyCabinetRepository.findbyamsId(addressId);
		casperId ="0005302983";
		if(amskeycabinate != null){
			 casperId = amskeycabinate.getId().getCasperid();
		}
		
		System.out.println("Casper Id:"+casperId);
	//find max lbnr by addressId and CasperId
		if(casperId != null){
		int maxlbnr = ikcDao.findMaxlbnr(casperId, addressId);
		maxlbnr++;
		Generaltypevalue gtv = gtvDao.findByValuCode("0-IS");
		Date startDate = Calendar.getInstance().getTime();
        Integer underMovement = 0;
		
		//create ikc
		Installationkeycabinet ikc = new Installationkeycabinet();
		InstallationkeycabinetId ikcId = new InstallationkeycabinetId();
		
		ikcId.setAddressid(addressId);
		ikcId.setStartdato(startDate);
		
		ikc.setId(ikcId);
		
		ikc.setCasperaddressid(casperId);
		ikc.setStatus(getStatus(gtv).byteValue());
		ikc.setUnderFlytning(new BigDecimal(underMovement));
		ikc.setAnlxg(cuNumber);
		
		Installationkeycabinet ikcCreated = ikcDao.save(ikc);
		
		//create installtion
		Installation inst = new Installation();
		inst.setAddressid(addressId);
		inst.setCableunitid(cuNumber);
		inst.setInstallationseq(ikcCreated.getId().getInstallationseq());
		
		installationDao.save(inst);
		
		result = true;
		} else{
			result = false;
		}
		
		return result;
	}
	
	 public Integer getStatus(Generaltypevalue generalTypeValue){
	        Integer status = 0;
	        if(generalTypeValue.getCode().indexOf("-")>0){
	            String[] temps = generalTypeValue.getCode().split("-");
	            status = Integer.parseInt(temps[0]);
	        }
	        return status;
	    }

}
