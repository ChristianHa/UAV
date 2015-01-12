package org.wahlzeit.uav.domain;

import java.util.Map;
import java.util.WeakHashMap;

public class UAVFactory {

	private static Map<Integer, UAV> sharedUAVMap = new WeakHashMap<>();
	
	/**
	 * @methodtype factory
	 * @collaboration UAVManagerCollaboration
	 */
	public static synchronized UAV getInstance(Engine engine, Camera cam, String name,
			Manufacture manufacture, int minFlightDistance, boolean hasCamera)
	{
		Integer hash = new StringBuilder().append(engine.hashCode())
										 .append(cam.hashCode())
										 .append(name.hashCode())
										 .append(manufacture.hashCode())
										 .append(minFlightDistance)
										 .append(hasCamera)
										 .hashCode();
		
		if (!sharedUAVMap.containsKey(hash))
		{
			sharedUAVMap.put(hash, new UAV(engine, cam, name, manufacture, minFlightDistance, hasCamera));
		}
		return sharedUAVMap.get(hash);
	}
}
