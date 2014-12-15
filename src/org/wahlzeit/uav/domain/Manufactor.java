package org.wahlzeit.uav.domain;


public class Manufactor {
	// NORTHROP_GRUMMAN, LOCKHEED_MARTIN, BOING, UMS_Group, AMAZON, HUBSAN, PARROT, SIMULUS;
	private String companyName;
	private int foundingDate;
	private int employees;
	private String headquarter;
	
	/**
	 * @methodtype construktor
	 * 
	 */
	protected Manufactor(String companyName, int foundingDate, int employees,
			String headquarter) {
		this.companyName = companyName;
		this.foundingDate = foundingDate;
		this.employees = employees;
		this.headquarter = headquarter;
	}

	public String getCompanyName() {
		return companyName;
	}


	public int getFoundingDate() {
		return foundingDate;
	}


	public int getEmployees() {
		return employees;
	}


	public String getHeadquarter() {
		return headquarter;
	}
}
