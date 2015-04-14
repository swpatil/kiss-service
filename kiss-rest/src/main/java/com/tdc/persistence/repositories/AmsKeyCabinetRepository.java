package com.tdc.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tdc.persistence.ams.dao.entity.Amskeycabinet;

public interface AmsKeyCabinetRepository extends JpaRepository<Amskeycabinet, Long>, JpaSpecificationExecutor<Amskeycabinet> {
	
	//@Query("select amsKey from Amskeycabinet amsKey where amsKey.id.amsid= :amsKeyId")
	Amskeycabinet findByIdAmsid(long id);
	
	@Query("select amskey from Amskeycabinet amskey where amskey.id.amsid=:id")
	Amskeycabinet findbyamsId(@Param("id") long id);
	
}
