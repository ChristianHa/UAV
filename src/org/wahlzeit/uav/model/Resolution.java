package org.wahlzeit.uav.model;

public class Resolution {
	private final int width;
	private final int height;
	
	/**
	 * @methodtype constructor
	 */
	protected Resolution(int width, int height) {
		this.width = width;
		this.height = height;
	}

	/**
	 * @methodtype getMethod
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @methodtype getMethod
	 */
	public int getHeight() {
		return height;
	}
}
