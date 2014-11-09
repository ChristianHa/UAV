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
	
	public GPSLocation() 
	{
		latitude = 0;
		longtitude = 0;	
	}
	
	@Override
	public double doGetLatitude() {
		return this.latitude;
	}
	
	@Override
	public void doSetLatitude(double latitude) {
		this.latitude = latitude;
	}

	@Override
	public double doGetLongtitude() {
		return this.longtitude;
	}
	
	@Override
	public void doSetLongtitude(double longtitude) {
		this.longtitude = longtitude; 
	}

	@Override
	public String doGetMapcode() {
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
			this.longtitude = p.getLonDeg();
	}
}
