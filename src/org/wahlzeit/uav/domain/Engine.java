package org.wahlzeit.uav.domain;

public class Engine {
	private EngineType motor;
	private int horsepower;
	
	/**
	 * @methodtype construktor
	 * @collaboration UAVCollaboration
	 */
	public Engine(EngineType motor, int horsepower) {
		super();
		this.motor = motor;
		this.horsepower = horsepower;
	}
	
	/**
	 * @methodtype construktor
	 * @collaboration UAVCollaboration
	 */
	public Engine() {
	}

	/**
	 * @methodtype getMethod
	 */
	public EngineType getMotor() {
		return motor;
	}

	/**
	 * @methodtype getMethod
	 */
	public int getHorsepower() {
		return horsepower;
	}
	
}
