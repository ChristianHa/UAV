package org.wahlzeit.uav.domain;

public class Camera {
	private int resolution;
	private boolean infrared;
	
	public Camera(int resolution, boolean infrared) {
		super();
		this.resolution = resolution;
		this.infrared = infrared;
	}

	public Camera() {
	}

	public int getResolution() {
		return resolution;
	}

	public boolean isInfrared() {
		return infrared;
	}
}
