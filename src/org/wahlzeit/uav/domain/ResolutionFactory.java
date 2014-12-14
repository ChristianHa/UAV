package org.wahlzeit.uav.domain;

import java.util.HashMap;
import java.util.Map;

public class ResolutionFactory {
	private static Map<String, Resolution> resolutionMap = new HashMap<>();
	
	/**
	 * @methodtype factory
	 */
	public static synchronized Resolution getResolution(int width, int height)
	{
		String inputResolution = new StringBuilder().append(width)
													.append("+")
													.append(height)
													.toString();
		
		if(!resolutionMap.containsKey(inputResolution))
				{
					 Resolution newResolution = new Resolution(width, height);
					 resolutionMap.put(inputResolution, newResolution);
				}
		return resolutionMap.get(inputResolution);
	}
}
