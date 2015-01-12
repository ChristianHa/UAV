package org.wahlzeit.uav.domain;

import java.util.HashMap;
import java.util.Map;

public class ManufactorFactory {
	
	private static Map<Integer, Manufactor> manufactorMap = new HashMap<>();
	private static ManufactorFactory manufactorFactory = null;
	
	/**
	 * @methodtype singelton
	 * @collaboration ManufactorManagerCollaboration
	 */
	public static ManufactorFactory getInstance()
	{
		if (manufactorFactory == null)
		{
			manufactorFactory = new ManufactorFactory();
		}
		return manufactorFactory;
	}
	
	/**
	 * @methodtype factory
	 * @collaboration ManufactorManagerCollaboration
	 */
	public synchronized Manufactor createInstance(String companyName, int foundingDate, int employees,
			String headquarter)
	{
		Integer hash = new StringBuilder().append(companyName.hashCode())
										 .append(foundingDate)
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
