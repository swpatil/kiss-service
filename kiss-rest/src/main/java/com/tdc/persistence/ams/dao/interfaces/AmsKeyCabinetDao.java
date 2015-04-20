package com.tdc.persistence.ams.dao.interfaces;

import com.tdc.persistence.ams.dao.entity.Amskeycabinet;

public interface AmsKeyCabinetDao extends GenericAmsDAO<Amskeycabinet, Long> {

	
	String findByAmsid(Long id);

}
