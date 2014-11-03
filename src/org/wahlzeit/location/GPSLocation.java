package org.wahlzeit.location;

import com.mapcode.MapcodeCodec;
import com.mapcode.Point;
import com.mapcode.UnknownMapcodeException;

public class GPSLocation extends LocationDefImpl {

	protected double latitude;
	protected double longtitude;
	
	public GPSLocation(double latitude, double longtitude)
	{
		this.latitude = latitude;
		this.longtitude = longtitude;
	}
	
	@Override
	public double getLatitude() {
		return this.latitude;
	}
	
	@Override
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	@Override
	public double getLongtitude() {
		return this.longtitude;
	}
	
	@Override
	public void setLongtitude(double longtitude) {
		this.longtitude = longtitude; 
	}

	@Override
	public String getMapcode() {
		com.mapcode.Mapcode result = MapcodeCodec.encodeToInternational(latitude, longtitude);
		String mapcode = result.toString();
		return mapcode;
	}
	
	@Override
	public void doSetMapcode(String mapcode) {
			Point p = null;
			try {
				p = MapcodeCodec.decode(mapcode);
			} catch (IllegalArgumentException | UnknownMapcodeException e) {
				e.printStackTrace();
			}
			this.latitude = p.getLatDeg();
			this.latitude = p.getLonDeg();
	}
}
