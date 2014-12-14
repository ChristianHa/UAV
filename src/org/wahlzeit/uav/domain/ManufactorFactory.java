package org.wahlzeit.uav.domain;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ManufactorFactory {
	
	private static Map<Integer, Manufactor> manufactorMap = new HashMap<>();

	/**
	 * @methodtype factory
	 */
	public static synchronized Manufactor getInstance(String companyName, Date foundingDate, int employees,
			String headquarter)
	{
		Integer hash = new StringBuilder().append(companyName.hashCode())
										 .append(foundingDate.hashCode())
										 .append(employees)
										 .append(headquarter.hashCode())
										 .hashCode();
		
		if (!manufactorMap.containsKey(hash))
		{
			manufactorMap.put(hash, new Manufactor(companyName, foundingDate, employees, headquarter));
		}
		return manufactorMap.get(hash);
	}
}
