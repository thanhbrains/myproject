package com.ttx.my.spring.boot.data.jpa.thymleaf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ttx.my.spring.boot.data.jpa.thymleaf.entity.Regions;

public interface RegionsRepository extends CrudRepository<Regions, Long> {

	/**
	 * Test @Query
	 * 
	 * @return
	 */
	@Query(nativeQuery = true, value = "select * from Regions")
	List<Regions> lstRegions();
}
