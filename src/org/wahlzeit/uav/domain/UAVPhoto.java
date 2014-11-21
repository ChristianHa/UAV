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
	public UAVPhoto(String name, UAVManufactor manufactor, Engine engine,
			int minFlightDistance, Camera cam, boolean hasCamera) {
		super();
		this.name = name;
		this.manufactor = manufactor;
		this.engine = engine;
		this.minFlightDistance = minFlightDistance;
		this.cam = cam;
		this.hasCamera = hasCamera;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setManufactor(UAVManufactor manufactor) {
		this.manufactor = manufactor;
	}
	
	/**
	 * @pre minFlightDistance has to be positive
	 */
	
	public void setMinFlightDistance(int minFlightDistance) {
		assert minFlightDistance > 0;
		this.minFlightDistance = minFlightDistance;
	}
	

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void setCam(Camera cam) {
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
	 * @post minFlightDistance is positive
	 */
	public int getMinFlightDistance() {
		assert this.minFlightDistance > 0;
		return minFlightDistance;
	}

	public Engine getEngine() {
		return engine;
	}

	/**
	 * @pre hasCamera has to be true
	 * @post don't return null
	 */
	public Camera getCam() {
		assert this.hasCamera == true; //pre
		assert this.cam != null; //post
		return cam;
	}

	public boolean hasCamera() {
		return hasCamera;
	}
	
}
