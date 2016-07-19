package com.ttx.my.spring.boot.data.jpa.thymleaf.dto;
// Generated Jul 17, 2016 1:38:06 AM by Hibernate Tools 5.1.0.Alpha1

import java.math.BigDecimal;

import javax.persistence.Column;

public class EmpDetailsViewIdDTO implements java.io.Serializable {

	private int employeeId;
	private String jobId;
	private Integer managerId;
	private Short departmentId;
	private Short locationId;
	private String countryId;
	private String firstName;
	private String lastName;
	private BigDecimal salary;
	private BigDecimal commissionPct;
	private String departmentName;
	private String jobTitle;
	private String city;
	private String stateProvince;
	private String countryName;
	private String regionName;

	public EmpDetailsViewIdDTO() {
	}

	public EmpDetailsViewIdDTO(int employeeId, String jobId, String lastName, String departmentName, String jobTitle,
			String city) {
		this.employeeId = employeeId;
		this.jobId = jobId;
		this.lastName = lastName;
		this.departmentName = departmentName;
		this.jobTitle = jobTitle;
		this.city = city;
	}

	public EmpDetailsViewIdDTO(int employeeId, String jobId, Integer managerId, Short departmentId, Short locationId,
			String countryId, String firstName, String lastName, BigDecimal salary, BigDecimal commissionPct,
			String departmentName, String jobTitle, String city, String stateProvince, String countryName,
			String regionName) {
		this.employeeId = employeeId;
		this.jobId = jobId;
		this.managerId = managerId;
		this.departmentId = departmentId;
		this.locationId = locationId;
		this.countryId = countryId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.commissionPct = commissionPct;
		this.departmentName = departmentName;
		this.jobTitle = jobTitle;
		this.city = city;
		this.stateProvince = stateProvince;
		this.countryName = countryName;
		this.regionName = regionName;
	}

	@Column(name = "EMPLOYEE_ID", nullable = false, precision = 6, scale = 0)
	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Column(name = "JOB_ID", nullable = false, length = 10)
	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	@Column(name = "MANAGER_ID", precision = 6, scale = 0)
	public Integer getManagerId() {
		return this.managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	@Column(name = "DEPARTMENT_ID", precision = 4, scale = 0)
	public Short getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Short departmentId) {
		this.departmentId = departmentId;
	}

	@Column(name = "LOCATION_ID", precision = 4, scale = 0)
	public Short getLocationId() {
		return this.locationId;
	}

	public void setLocationId(Short locationId) {
		this.locationId = locationId;
	}

	@Column(name = "COUNTRY_ID", length = 2)
	public String getCountryId() {
		return this.countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	@Column(name = "FIRST_NAME", length = 20)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "LAST_NAME", nullable = false, length = 25)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "SALARY", precision = 8)
	public BigDecimal getSalary() {
		return this.salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Column(name = "COMMISSION_PCT", precision = 2)
	public BigDecimal getCommissionPct() {
		return this.commissionPct;
	}

	public void setCommissionPct(BigDecimal commissionPct) {
		this.commissionPct = commissionPct;
	}

	@Column(name = "DEPARTMENT_NAME", nullable = false, length = 30)
	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Column(name = "JOB_TITLE", nullable = false, length = 35)
	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Column(name = "CITY", nullable = false, length = 30)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "STATE_PROVINCE", length = 25)
	public String getStateProvince() {
		return this.stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	@Column(name = "COUNTRY_NAME", length = 40)
	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Column(name = "REGION_NAME", length = 25)
	public String getRegionName() {
		return this.regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EmpDetailsViewIdDTO))
			return false;
		EmpDetailsViewIdDTO castOther = (EmpDetailsViewIdDTO) other;

		return (this.getEmployeeId() == castOther.getEmployeeId())
				&& ((this.getJobId() == castOther.getJobId()) || (this.getJobId() != null
						&& castOther.getJobId() != null && this.getJobId().equals(castOther.getJobId())))
				&& ((this.getManagerId() == castOther.getManagerId()) || (this.getManagerId() != null
						&& castOther.getManagerId() != null && this.getManagerId().equals(castOther.getManagerId())))
				&& ((this.getDepartmentId() == castOther.getDepartmentId())
						|| (this.getDepartmentId() != null && castOther.getDepartmentId() != null
								&& this.getDepartmentId().equals(castOther.getDepartmentId())))
				&& ((this.getLocationId() == castOther.getLocationId()) || (this.getLocationId() != null
						&& castOther.getLocationId() != null && this.getLocationId().equals(castOther.getLocationId())))
				&& ((this.getCountryId() == castOther.getCountryId()) || (this.getCountryId() != null
						&& castOther.getCountryId() != null && this.getCountryId().equals(castOther.getCountryId())))
				&& ((this.getFirstName() == castOther.getFirstName()) || (this.getFirstName() != null
						&& castOther.getFirstName() != null && this.getFirstName().equals(castOther.getFirstName())))
				&& ((this.getLastName() == castOther.getLastName()) || (this.getLastName() != null
						&& castOther.getLastName() != null && this.getLastName().equals(castOther.getLastName())))
				&& ((this.getSalary() == castOther.getSalary()) || (this.getSalary() != null
						&& castOther.getSalary() != null && this.getSalary().equals(castOther.getSalary())))
				&& ((this.getCommissionPct() == castOther.getCommissionPct())
						|| (this.getCommissionPct() != null && castOther.getCommissionPct() != null
								&& this.getCommissionPct().equals(castOther.getCommissionPct())))
				&& ((this.getDepartmentName() == castOther.getDepartmentName())
						|| (this.getDepartmentName() != null && castOther.getDepartmentName() != null
								&& this.getDepartmentName().equals(castOther.getDepartmentName())))
				&& ((this.getJobTitle() == castOther.getJobTitle()) || (this.getJobTitle() != null
						&& castOther.getJobTitle() != null && this.getJobTitle().equals(castOther.getJobTitle())))
				&& ((this.getCity() == castOther.getCity()) || (this.getCity() != null && castOther.getCity() != null
						&& this.getCity().equals(castOther.getCity())))
				&& ((this.getStateProvince() == castOther.getStateProvince())
						|| (this.getStateProvince() != null && castOther.getStateProvince() != null
								&& this.getStateProvince().equals(castOther.getStateProvince())))
				&& ((this.getCountryName() == castOther.getCountryName())
						|| (this.getCountryName() != null && castOther.getCountryName() != null
								&& this.getCountryName().equals(castOther.getCountryName())))
				&& ((this.getRegionName() == castOther.getRegionName())
						|| (this.getRegionName() != null && castOther.getRegionName() != null
								&& this.getRegionName().equals(castOther.getRegionName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getEmployeeId();
		result = 37 * result + (getJobId() == null ? 0 : this.getJobId().hashCode());
		result = 37 * result + (getManagerId() == null ? 0 : this.getManagerId().hashCode());
		result = 37 * result + (getDepartmentId() == null ? 0 : this.getDepartmentId().hashCode());
		result = 37 * result + (getLocationId() == null ? 0 : this.getLocationId().hashCode());
		result = 37 * result + (getCountryId() == null ? 0 : this.getCountryId().hashCode());
		result = 37 * result + (getFirstName() == null ? 0 : this.getFirstName().hashCode());
		result = 37 * result + (getLastName() == null ? 0 : this.getLastName().hashCode());
		result = 37 * result + (getSalary() == null ? 0 : this.getSalary().hashCode());
		result = 37 * result + (getCommissionPct() == null ? 0 : this.getCommissionPct().hashCode());
		result = 37 * result + (getDepartmentName() == null ? 0 : this.getDepartmentName().hashCode());
		result = 37 * result + (getJobTitle() == null ? 0 : this.getJobTitle().hashCode());
		result = 37 * result + (getCity() == null ? 0 : this.getCity().hashCode());
		result = 37 * result + (getStateProvince() == null ? 0 : this.getStateProvince().hashCode());
		result = 37 * result + (getCountryName() == null ? 0 : this.getCountryName().hashCode());
		result = 37 * result + (getRegionName() == null ? 0 : this.getRegionName().hashCode());
		return result;
	}

}
