package org.wahlzeit.uav.domain;

public class Resolution {
	private final int width;
	private final int height;
	
	/**
	 * @methodtype construktor
	 * 
	 */
	protected Resolution(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}
