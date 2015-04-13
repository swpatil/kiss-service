package com.tdc.persistence.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tdc.persistence.ams.dao.entity.Addresses;

public interface AddressRepository extends JpaRepository<Addresses, Long>, JpaSpecificationExecutor<Addresses> {
	
	List<Addresses> findByHousenoAndFloor(String hsnr,String floorNo);
	
	@Query("Select add from Addresses add where add.streets.streetname= :streetName")
	List<Addresses> findByStreetsAndHouseno(@Param("streetName") String streetName);
	
	
	

}
