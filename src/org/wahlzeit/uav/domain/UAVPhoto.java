package org.wahlzeit.uav.domain;

import org.wahlzeit.model.Photo;

/**
 * @author christian
 * 
 */
public class UAVPhoto extends Photo {

	private String name;
	private UAVManufactor manufactor;
	private Engine engine;
	private int minFlightDistance;
	private Camera cam;
	private boolean hasCamera;
	
	
	/**
	 * @pre minFlightDistance must be positiv
	 */
	
	public UAVPhoto(String name, UAVManufactor manufactor,
			int minFlightDistance, int weight, int height, int width) {
		super();
		this.name = name;
		this.manufactor = manufactor;
		this.minFlightDistance = minFlightDistance;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setManufactor(UAVManufactor manufactor) {
		this.manufactor = manufactor;
	}
	
	/**
	 * @pre minFlightDistance must be positiv
	 */
	
	public void setMinFlightDistance(int minFlightDistance) {
		assert minFlightDistance > 0;
		this.minFlightDistance = minFlightDistance;
	}
	
	/**
	 * @pre engine does not be null
	 */
	public void setEngine(Engine engine) {
		assert engine != null;
		this.engine = engine;
	}

	/**
	 * @pre cam does not be null
	 */
	public void setCam(Camera cam) {
		assert cam != null;
		this.cam = cam;
	}

	public void setHasCamera(boolean hasCamera) {
		this.hasCamera = hasCamera;
	}

	public String getName() {
		return name;
	}

	public UAVManufactor getManufactor() {
		return manufactor;
	}

	/**
	 * @post minFlightDistance is positiv
	 */
	public int getMinFlightDistance() {
		assert this.minFlightDistance > 0;
		return minFlightDistance;
	}

	public Engine getEngine() {
		return engine;
	}

	/**
	 * @pre hasCamera must be true
	 * @post don't return null
	 */
	public Camera getCam() {
		assert this.hasCamera == true;
		assert this.cam != null;
		return cam;
	}

	public boolean isHasCamera() {
		return hasCamera;
	}
	
}
