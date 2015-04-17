package com.tdc.persistence.kiss.dao.interfaces;

import com.tdc.persistence.ams.dao.entity.Amskeycabinet;

public interface AmsKeyCabinetDao extends GenericDAO<Amskeycabinet, Long> {

	
	Amskeycabinet findByAmsid(long id);

}
