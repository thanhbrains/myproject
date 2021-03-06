package com.ttx.my.spring.boot.data.jpa.thymleaf.dto;
// Generated Jul 17, 2016 1:38:06 AM by Hibernate Tools 5.1.0.Alpha1

import java.util.HashSet;
import java.util.Set;

/**
 * Countries generated by hbm2java
 */
public class CountriesDTO implements java.io.Serializable {

	private String countryId;
	private RegionsDTO regions;
	private String countryName;
	private Set<LocationsDTO> locationses = new HashSet<LocationsDTO>(0);

	public CountriesDTO() {
	}

	public CountriesDTO(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public RegionsDTO getRegions() {
		return regions;
	}

	public void setRegions(RegionsDTO regions) {
		this.regions = regions;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Set<LocationsDTO> getLocationses() {
		return locationses;
	}

	public void setLocationses(Set<LocationsDTO> locationses) {
		this.locationses = locationses;
	}

}
