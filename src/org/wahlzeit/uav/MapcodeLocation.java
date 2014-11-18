package org.wahlzeit.location;

import com.mapcode.MapcodeCodec;
import com.mapcode.Point;
import com.mapcode.UnknownMapcodeException;

public class MapcodeLocation extends LocationDefImpl {

	protected String mapcode;

	public MapcodeLocation(String mapcode){
		this.mapcode = mapcode;
	}
	
	@Override
	public double doGetLatitude() {
		double latitude = getLatitudeFromMapcode();
		return latitude;
	}

	private double getLatitudeFromMapcode() {
		Point p = null;
		try {
			p = MapcodeCodec.decode(mapcode);
		} catch (IllegalArgumentException | UnknownMapcodeException e) {
			e.printStackTrace();
		}
		return p.getLatDeg();
	}

	@Override
	public void doSetLatitude(double latitude) {
		double longtitude = getLongtitude();
		com.mapcode.Mapcode result = MapcodeCodec.encodeToInternational(latitude, longtitude);
		this.mapcode = result.toString();
	}

	@Override
	public double doGetLongtitude() {
		double longtitude = getLongtitudeFromMapcode();
		return longtitude;
	}

	private double getLongtitudeFromMapcode() {
		Point p = null;
		try {
			p = MapcodeCodec.decode(mapcode);
		} catch (IllegalArgumentException | UnknownMapcodeException e) {
			e.printStackTrace();
		}
		return p.getLonDeg();
	}

	@Override
	public void doSetLongtitude(double longtitude) {
		double latitude = getLatitude();
		com.mapcode.Mapcode result = MapcodeCodec.encodeToInternational(latitude, longtitude);
		this.mapcode = result.toString();
	}

	@Override
	public void doSetMapcode(String mapcode) {
		this.mapcode = mapcode;
	}

	@Override
	public String doGetMapcode() {
		return this.mapcode;
	}
}
