package org.wahlzeit.uav.location;

import com.mapcode.Mapcode;
import com.mapcode.MapcodeCodec;
import com.mapcode.Point;
import com.mapcode.UnknownMapcodeException;

public class MapcodeLocation extends AbstractLocation {

	protected String mapcode;

	/**
	 * @methodtype constructor
	 * @collaboration LocationCollaboration
	 */
	public MapcodeLocation(String mapcode){
		this.mapcode = mapcode;
	}

	@Override
	public double[] getPoint() {
		double[] result = new double [2];
		Point p;
		try {
			p = MapcodeCodec.decode(mapcode);
			result[0] = p.getLatDeg();
			result[1] = p.getLonDeg();
		} catch (UnknownMapcodeException e) {
			throw new RuntimeException("Decoding error, could not decode mapcode");
		}
		return result;
	}

	/**
	 * @methodtype get method
	 */
	@Override
	public String getMapcode() {
		return mapcode;
	}

	/**
	 * @methodtype set method
	 */
	@Override
	public void setMapcode(String mapcode) {
		this.mapcode = mapcode;
	}

	@Override
	public String asString() {
		return mapcode;
	}

	/**
	 * @methodtype set method
	 */
	@Override
	protected void doSetPoint(double x, double y) {
		Mapcode mapcode = MapcodeCodec.encodeToInternational(x, y);
		this.mapcode = mapcode.toString();
	}
}
