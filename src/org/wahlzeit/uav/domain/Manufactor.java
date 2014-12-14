package org.wahlzeit.uav.domain;

import java.util.Date;

public class Manufactor {
	// NORTHROP_GRUMMAN, LOCKHEED_MARTIN, BOING, UMS_Group, AMAZON, HUBSAN, PARROT, SIMULUS;
	private String companyName;
	private Date foundingDate;
	private int employees;
	private String headquarter;
	
	
	protected Manufactor(String companyName, Date foundingDate, int employees,
			String headquarter) {
		this.companyName = companyName;
		this.foundingDate = foundingDate;
		this.employees = employees;
		this.headquarter = headquarter;
	}

	public String getCompanyName() {
		return companyName;
	}


	public Date getFoundingDate() {
		return foundingDate;
	}


	public int getEmployees() {
		return employees;
	}


	public String getHeadquarter() {
		return headquarter;
	}
}
