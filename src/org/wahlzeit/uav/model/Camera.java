package org.wahlzeit.uav.model;

public class Camera {
	private int resolution;
	private boolean infrared;
	
	/**
	 * @methodtype construktor
	 * @collaboration UAVCollaboration
	 */
	public Camera(int resolution, boolean infrared) {
		super();
		this.resolution = resolution;
		this.infrared = infrared;
	}

	/**
	 * @methodtype construktor
	 * @collaboration UAVCollaboration
	 */
	public Camera() {
	}

	/**
	 * @methodtype getMethod
	 */
	public int getResolution() {
		return resolution;
	}

	/**
	 * @methodtype booleanQuery
	 */
	public boolean isInfrared() {
		return infrared;
	}
}
