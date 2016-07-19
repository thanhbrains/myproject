package com.ttx.my.spring.boot.data.jpa.thymleaf.dao;

import java.util.List;

import com.ttx.my.spring.boot.data.jpa.thymleaf.entity.Regions;

public interface RegionsDao {

	void createRegions(Regions regions);

	void updateRegions(Regions regions);

	Regions getRegions(Long id);

	List<Regions> getLstRegions();
}
