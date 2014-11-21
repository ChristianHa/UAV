package org.wahlzeit.uav.domain;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.wahlzeit.model.Photo;
import org.wahlzeit.model.PhotoId;

/**
 * @author christian
 * 
 */
public class UAVPhoto extends Photo {

	
	protected Engine engine = new Engine();
	protected Camera cam = new Camera();
	
	
	private static final String NAME = "name";
	private static final String MANUFACTOR = "manufactor";
	private static final String MINFLIGHTDISTANCE = "minFlightDistance";
	private static final String HASCAMERA = "hasCamera";
	
	private static final String ENGINETYP = "enginetyp";
	private static final String HORSEPOWER = "horsepower";

	private static final String RESOLUTION = "resolution";
	private static final String INFRARED = "infrared";


	private String name;
	private UAVManufactor manufactor;
	private int minFlightDistance;
	private boolean hasCamera;
	
	
	public UAVPhoto()
	{
		super();
	}
	
	public UAVPhoto(PhotoId myId)
	{
		super(myId);
	}
	
	public UAVPhoto(ResultSet rset) throws SQLException
	{
		super(rset);
	}
	
	@Override
	public void readFrom(ResultSet rset) throws SQLException
	{
		super.readFrom(rset);
		
		name = rset.getString(NAME);
		manufactor  = UAVManufactor.valueOf(rset.getString(MANUFACTOR));
		minFlightDistance = rset.getInt(MINFLIGHTDISTANCE);
		hasCamera = rset.getBoolean(HASCAMERA);
		
		EngineType motor = EngineType.valueOf(rset.getString(ENGINETYP));
		int horsepower = rset.getInt(HORSEPOWER);
		this.engine = new Engine(motor, horsepower);
		
		int resolution = rset.getInt(RESOLUTION);
		boolean infrared = rset.getBoolean(INFRARED);
		this.cam = new Camera(resolution, infrared);
	}
	
	@Override
	public void writeOn(ResultSet rset) throws SQLException
	{
	super.writeOn(rset);
	
	rset.updateString(NAME, name);
	rset.updateString(MANUFACTOR, manufactor.name());
	rset.updateInt(MINFLIGHTDISTANCE, minFlightDistance);
	rset.updateBoolean(HASCAMERA, hasCamera);
	
	rset.updateString(ENGINETYP, engine.getMotor().name());
	rset.updateInt(HORSEPOWER, engine.getHorsepower());
	
	rset.updateInt(RESOLUTION, cam.getResolution());
	rset.updateBoolean(INFRARED, cam.isInfrared());
	}
	
//	/**
//	 * @pre minFlightDistance must be positiv
//	 */
//	public UAVPhoto(String name, UAVManufactor manufactor, Engine engine,
//			int minFlightDistance, Camera cam, boolean hasCamera) {
//		super();
//		this.name = name;
//		this.manufactor = manufactor;
//		this.engine = engine;
//		this.minFlightDistance = minFlightDistance;
//		this.cam = cam;
//		this.hasCamera = hasCamera;
//	}
	
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
