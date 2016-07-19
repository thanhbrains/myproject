package com.ttx.my.spring.boot.data.jpa.thymleaf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ttx.my.spring.boot.data.jpa.thymleaf.dao.RegionsDao;
import com.ttx.my.spring.boot.data.jpa.thymleaf.dto.RegionsDTO;
import com.ttx.my.spring.boot.data.jpa.thymleaf.entity.Regions;
import com.ttx.my.spring.boot.data.jpa.thymleaf.utils.EntityDtoHelper;

@Service
public class RegionsServiceImpl implements RegionsService {

	@Autowired
	RegionsDao regionsDao;

	public void createRegions(RegionsDTO regions) {
		regionsDao.createRegions(null);
	}

	public void updateRegions(RegionsDTO regions) {
		if (regions.getRegionId() != null) {
			regionsDao.updateRegions(null);
		}
	}

	public RegionsDTO getRegions(Long id){
		Regions regions = regionsDao.getRegions(id);
		return EntityDtoHelper.singleMapper(regions, RegionsDTO.class);
	}

	public List<RegionsDTO> getLstRegions() {
		List<Regions> regions = regionsDao.getLstRegions();
		return EntityDtoHelper.listMapper(regions, RegionsDTO.class);
	}
}
