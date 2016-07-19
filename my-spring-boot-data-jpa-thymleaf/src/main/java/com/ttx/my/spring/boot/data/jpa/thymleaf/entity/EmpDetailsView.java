package com.ttx.my.spring.boot.data.jpa.thymleaf.entity;
// Generated Jul 17, 2016 1:38:06 AM by Hibernate Tools 5.1.0.Alpha1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * EmpDetailsView generated by hbm2java
 */
@Entity
@Table(name = "EMP_DETAILS_VIEW")
public class EmpDetailsView implements java.io.Serializable {

	private EmpDetailsViewId id;

	public EmpDetailsView() {
	}

	public EmpDetailsView(EmpDetailsViewId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "employeeId", column = @Column(name = "EMPLOYEE_ID", nullable = false, precision = 6, scale = 0)),
			@AttributeOverride(name = "jobId", column = @Column(name = "JOB_ID", nullable = false, length = 10)),
			@AttributeOverride(name = "managerId", column = @Column(name = "MANAGER_ID", precision = 6, scale = 0)),
			@AttributeOverride(name = "departmentId", column = @Column(name = "DEPARTMENT_ID", precision = 4, scale = 0)),
			@AttributeOverride(name = "locationId", column = @Column(name = "LOCATION_ID", precision = 4, scale = 0)),
			@AttributeOverride(name = "countryId", column = @Column(name = "COUNTRY_ID", length = 2)),
			@AttributeOverride(name = "firstName", column = @Column(name = "FIRST_NAME", length = 20)),
			@AttributeOverride(name = "lastName", column = @Column(name = "LAST_NAME", nullable = false, length = 25)),
			@AttributeOverride(name = "salary", column = @Column(name = "SALARY", precision = 8)),
			@AttributeOverride(name = "commissionPct", column = @Column(name = "COMMISSION_PCT", precision = 2)),
			@AttributeOverride(name = "departmentName", column = @Column(name = "DEPARTMENT_NAME", nullable = false, length = 30)),
			@AttributeOverride(name = "jobTitle", column = @Column(name = "JOB_TITLE", nullable = false, length = 35)),
			@AttributeOverride(name = "city", column = @Column(name = "CITY", nullable = false, length = 30)),
			@AttributeOverride(name = "stateProvince", column = @Column(name = "STATE_PROVINCE", length = 25)),
			@AttributeOverride(name = "countryName", column = @Column(name = "COUNTRY_NAME", length = 40)),
			@AttributeOverride(name = "regionName", column = @Column(name = "REGION_NAME", length = 25)) })
	public EmpDetailsViewId getId() {
		return this.id;
	}

	public void setId(EmpDetailsViewId id) {
		this.id = id;
	}

}
