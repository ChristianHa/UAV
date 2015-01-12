package org.wahlzeit.uav.domain;


public class Manufacture {
	// NORTHROP_GRUMMAN, LOCKHEED_MARTIN, BOING, UMS_Group, AMAZON, HUBSAN, PARROT, SIMULUS;
	private String companyName;
	private int foundingDate;
	private int employees;
	private String headquarter;
	
	/**
	 * @methodtype construktor
	 * @collaboration TypeObjectCollaboration
	 */
	protected Manufacture(String companyName, int foundingDate, int employees,
			String headquarter) {
		this.companyName = companyName;
		this.foundingDate = foundingDate;
		this.employees = employees;
		this.headquarter = headquarter;
	}

	/**
	 * @methodtype getMethod
	 */
	public String getCompanyName() {
		return companyName;
	}


	/**
	 * @methodtype getMethod
	 */
	public int getFoundingDate() {
		return foundingDate;
	}

	/**
	 * @methodtype getMethod
	 */
	public int getEmployees() {
		return employees;
	}

	/**
	 * @methodtype getMethod
	 */
	public String getHeadquarter() {
		return headquarter;
	}
}
