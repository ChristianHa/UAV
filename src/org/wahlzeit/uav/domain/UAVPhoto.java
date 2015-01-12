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
	private static final String MINFLIGHTDISTANCE = "minFlightDistance";
	private static final String HASCAMERA = "hasCamera";
	
	private static final String ENGINETYP = "enginetyp";
	private static final String HORSEPOWER = "horsepower";

	private static final String RESOLUTION = "resolution";
	private static final String INFRARED = "infrared";
	
	private static final String COMPANYNAME = "companyname";
	private static final String FOUNDINGDATE = "foundingDate";
	private static final String EMPLOYEES= "employees";
	private static final String HEADQUARTER = "headquarter";


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
		
		String companyname = rset.getString(COMPANYNAME);
		int foundingDate = rset.getInt(FOUNDINGDATE);
		int employees = rset.getInt(EMPLOYEES);
		String headquarter = rset.getString(HEADQUARTER);
		
		Manufacture uavmanufacture = ManufactureFactory.getInstance().createInstance(companyname, foundingDate, employees, headquarter);
		
		String name = rset.getString(NAME);
		int minFlightDistance = rset.getInt(MINFLIGHTDISTANCE);
		boolean hasCamera = rset.getBoolean(HASCAMERA);
		
		EngineType motor = EngineType.valueOf(rset.getString(ENGINETYP));
		int horsepower = rset.getInt(HORSEPOWER);
		
		int resolution = rset.getInt(RESOLUTION);
		boolean infrared = rset.getBoolean(INFRARED);
		
		uav = UAVFactory.getInstance(new Engine(motor, horsepower), new Camera(resolution, infrared), name, uavmanufacture, minFlightDistance, hasCamera);
	}
	
	@Override
	public void writeOn(ResultSet rset) throws SQLException
	{
	super.writeOn(rset);
	
	rset.updateString(COMPANYNAME, uav.getManufactor().getCompanyName());
	rset.updateInt(FOUNDINGDATE, uav.getManufactor().getFoundingDate());
	rset.updateInt(EMPLOYEES, uav.getManufactor().getEmployees());
	rset.updateString(HEADQUARTER, uav.getManufactor().getCompanyName());
	
	
	rset.updateString(NAME, uav.getName());
	rset.updateInt(MINFLIGHTDISTANCE, uav.getMinFlightDistance());
	rset.updateBoolean(HASCAMERA, uav.hasCamera());
	
	rset.updateString(ENGINETYP, uav.getEngine().getMotor().name());
	rset.updateInt(HORSEPOWER, uav.getEngine().getHorsepower());
	
	rset.updateInt(RESOLUTION, uav.cam.getResolution());
	rset.updateBoolean(INFRARED, uav.getCam().isInfrared());
	}
	
}
