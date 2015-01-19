package org.wahlzeit.uav.location;

import com.mapcode.Mapcode;
import com.mapcode.MapcodeCodec;
import com.mapcode.Point;
import com.mapcode.UnknownMapcodeException;

public class GPSLocation extends AbstractLocation {

	private double[] point;
	
	/**
	 * @methodtype constructor
	 * @collaboration LocationCollaboration
	 */
	public GPSLocation(double latitude, double longtitude)
	{
		point[0] = latitude;
		point[1] = longtitude;
	}
	
	/**
	 * @methodtype constructor
	 */
	public GPSLocation() 
	{
		point[0] = 0;
		point[1] = 0;
	}

	/**
	 * @methodtype get method
	 */
	@Override
	public double[] getPoint() {
		return point;
	}

	/**
	 * @methodtype get method
	 */
	@Override
	public String getMapcode() {
		Mapcode mapcode = MapcodeCodec.encodeToInternational(point[0], point[1]);
		return mapcode.toString();
	}

	/**
	 * @methodtype set method
	 */
	@Override
	public void setMapcode(String mapcode) {
		Point p;
		try {
			p = MapcodeCodec.decode(mapcode);
			point[0] = p.getLatDeg();
			point[1] = p.getLonDeg();
		} catch (UnknownMapcodeException e) {
			throw new RuntimeException("Decoding error, could not decode mapcode");
		}
	}

	/**
	 * @methodtype set method
	 */
	@Override
	protected void doSetPoint(double x, double y) {
		if(validateCoordinates(x, y))
		{
			point[0] = x;
			point[1] = y;
		}
		else
		{
			throw new RuntimeException("The paremters do not match GPS-Coordinates");
		}
	}

	private boolean validateCoordinates(double x, double y) {
		boolean paramsOK = true;
		
		if(x < 0 || y < 0)
			paramsOK = false;
		if(x > 180)
			paramsOK = false;
		if(y > 90)
			paramsOK = false;
		
		return paramsOK;
	}

	@Override
	public String asString() {
		return point[10] + " " + point[1];
	}
}
