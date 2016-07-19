package com.ttx.my.spring.boot.data.jpa.thymleaf.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ttx.my.spring.boot.data.jpa.thymleaf.entity.Regions;
import com.ttx.my.spring.boot.data.jpa.thymleaf.repository.RegionsRepository;

@Repository
public class RegionsDaoImpl implements RegionsDao {

	@Autowired
	RegionsRepository regionsRepository;
	
	public void createRegions(Regions regions){
		regionsRepository.save(regions);
	}
	
	public void updateRegions(Regions regions){
		if(regions.getRegionId()!=null){
			regionsRepository.save(regions);
		}
	}
	
	public Regions getRegions(Long id){
		return regionsRepository.findOne(id);
	}
	
	public List<Regions> getLstRegions(){
		return regionsRepository.lstRegions();
	}
}
