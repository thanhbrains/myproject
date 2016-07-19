package com.ttx.my.spring.boot.data.jpa.thymleaf.dto;
// Generated Jul 17, 2016 1:38:06 AM by Hibernate Tools 5.1.0.Alpha1

import java.util.HashSet;
import java.util.Set;

/**
 * Departments generated by hbm2java
 */
public class DepartmentsDTO implements java.io.Serializable {

	private short departmentId;
	private LocationsDTO locations;
	private EmployeesDTO employees;
	private String departmentName;
	private Set<EmployeesDTO> employeeses = new HashSet<EmployeesDTO>(0);
	private Set<JobHistoryDTO> jobHistories = new HashSet<JobHistoryDTO>(0);

	public DepartmentsDTO() {
	}

	public DepartmentsDTO(short departmentId, String departmentName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	public DepartmentsDTO(short departmentId, LocationsDTO locations, EmployeesDTO employees, String departmentName,
			Set<EmployeesDTO> employeeses, Set<JobHistoryDTO> jobHistories) {
		this.departmentId = departmentId;
		this.locations = locations;
		this.employees = employees;
		this.departmentName = departmentName;
		this.employeeses = employeeses;
		this.jobHistories = jobHistories;
	}

	public short getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(short departmentId) {
		this.departmentId = departmentId;
	}

	public LocationsDTO getLocations() {
		return locations;
	}

	public void setLocations(LocationsDTO locations) {
		this.locations = locations;
	}

	public EmployeesDTO getEmployees() {
		return employees;
	}

	public void setEmployees(EmployeesDTO employees) {
		this.employees = employees;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Set<EmployeesDTO> getEmployeeses() {
		return employeeses;
	}

	public void setEmployeeses(Set<EmployeesDTO> employeeses) {
		this.employeeses = employeeses;
	}

	public Set<JobHistoryDTO> getJobHistories() {
		return jobHistories;
	}

	public void setJobHistories(Set<JobHistoryDTO> jobHistories) {
		this.jobHistories = jobHistories;
	}

}