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

	protected UAV uav;
	
	private static final String NAME = "name";
	private static final String MANUFACTOR = "manufactor";
	private static final String MINFLIGHTDISTANCE = "minFlightDistance";
	private static final String HASCAMERA = "hasCamera";
	
	private static final String ENGINETYP = "enginetyp";
	private static final String HORSEPOWER = "horsepower";

	private static final String RESOLUTION = "resolution";
	private static final String INFRARED = "infrared";


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
	
}
