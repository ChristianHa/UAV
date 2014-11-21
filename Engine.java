package org.wahlzeit.uav.domain;

public class Engine {
	private EngineType motor;
	private int horsepower;
	
	public Engine(EngineType motor, int horsepower) {
		super();
		this.motor = motor;
		this.horsepower = horsepower;
	}

	public Engine() {
	}

	public EngineType getMotor() {
		return motor;
	}

	public int getHorsepower() {
		return horsepower;
	}
	
}
