package com.ttx.my.spring.boot.data.jpa.thymleaf.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class RegionsDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5662356192949863958L;

	private Long regionId;
	private String regionName;
	private Set<CountriesDTO> countrieses = new HashSet<CountriesDTO>(0);

	public RegionsDTO() {
	}

	public RegionsDTO(Long regionId) {
		this.regionId = regionId;
	}

	public RegionsDTO(Long regionId, String regionName, Set<CountriesDTO> countrieses) {
		this.regionId = regionId;
		this.regionName = regionName;
		this.countrieses = countrieses;
	}

	public Long getRegionId() {
		return this.regionId;
	}

	public void setRegionId(Long regionId) {
		this.regionId = regionId;
	}

	public String getRegionName() {
		return this.regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public Set<CountriesDTO> getCountrieses() {
		return countrieses;
	}

	public void setCountrieses(Set<CountriesDTO> countrieses) {
		this.countrieses = countrieses;
	}

}
