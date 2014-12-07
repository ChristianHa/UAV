package org.wahlzeit.uav.domain;


public class UAV
{
	protected Engine engine = new Engine();
	protected Camera cam = new Camera();
	
	private String name;
	private UAVManufactor manufactor;
	private int minFlightDistance;
	private boolean hasCamera;
	
	/**
	 * @methodtype construktor
	 */
	public UAV(Engine engine, Camera cam, String name,
			UAVManufactor manufactor, int minFlightDistance, boolean hasCamera) {
		super();
		this.engine = engine;
		this.cam = cam;
		this.name = name;
		this.manufactor = manufactor;
		this.minFlightDistance = minFlightDistance;
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
