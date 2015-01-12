package org.wahlzeit.uav.domain;


public class UAV
{
	protected Engine engine = new Engine();
	protected Camera cam = new Camera();
	
	private String name;
	private Manufacture manufactor;
	private int minFlightDistance;
	private boolean hasCamera;
	
	/**
	 * @methodtype constructor
	 * @pre minFlightDistance has to be positive
	 * @collaboration UAVPhotoCollaboration
	 */
	public UAV(Engine engine, Camera cam, String name,
			Manufacture manufacture, int minFlightDistance, boolean hasCamera) {
		super();
		this.engine = engine;
		this.cam = cam;
		this.name = name;
		this.manufactor = manufacture;
		this.minFlightDistance = minFlightDistance;
		this.hasCamera = hasCamera;
	}

	/**
	 * @methodtype getMethod
	 */
	public String getName() {
		return name;
	}

	/**
	 * @methodtype getMethod
	 */
	public Manufacture getManufactor() {
		return manufactor;
	}

	
	/**
	 * @methodtype getMethod
	 * @post minFlightDistance is positive
	 */
	public int getMinFlightDistance() {
		assert this.minFlightDistance > 0;
		return minFlightDistance;
	}

	
	/**
	 * @methodtype getMethod
	 */
	public Engine getEngine() {
		return engine;
	}

	
	/**
	 * @pre hasCamera has to be true
	 * @post don't return null
	 * @methodtype getMethod
	 */
	public Camera getCam() {
		assert this.hasCamera == true; //pre
		assert this.cam != null; //post
		return cam;
	}

	
	/**
	 * @methodtype booleanQuery
	 */
	public boolean hasCamera() {
		return hasCamera;
	}
}
