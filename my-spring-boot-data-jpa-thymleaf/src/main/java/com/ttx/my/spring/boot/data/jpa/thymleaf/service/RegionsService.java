package com.ttx.my.spring.boot.data.jpa.thymleaf.service;

import java.util.List;

import com.ttx.my.spring.boot.data.jpa.thymleaf.dto.RegionsDTO;

public interface RegionsService {

	void createRegions(RegionsDTO regions);

	void updateRegions(RegionsDTO regions);

	RegionsDTO getRegions(Long id);

	List<RegionsDTO> getLstRegions();
}
