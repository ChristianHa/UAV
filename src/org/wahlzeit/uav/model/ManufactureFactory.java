package org.wahlzeit.uav.model;

import java.util.HashMap;
import java.util.Map;

public class ManufactureFactory {
	
	private static Map<Integer, Manufacture> manufactureMap = new HashMap<>();
	private static ManufactureFactory manufactureFactory = null;
	
	/**
	 * @methodtype singelton
	 * @collaboration ManufactureManagerCollaboration
	 */
	public static ManufactureFactory getInstance()
	{
		if (manufactureFactory == null)
		{
			manufactureFactory = new ManufactureFactory();
		}
		return manufactureFactory;
	}
	
	/**
	 * @methodtype factory
	 * @collaboration ManufactureManagerCollaboration
	 */
	public synchronized Manufacture createInstance(String companyName, int foundingDate, int employees,
			String headquarter)
	{
		Integer hash = new StringBuilder().append(companyName.hashCode())
										 .append(foundingDate)
										 .append(employees)
										 .append(headquarter.hashCode())
										 .hashCode();
		
		if (!manufactureMap.containsKey(hash))
		{
			manufactureMap.put(hash, new Manufacture(companyName, foundingDate, employees, headquarter));
		}
		return manufactureMap.get(hash);
	}
}
