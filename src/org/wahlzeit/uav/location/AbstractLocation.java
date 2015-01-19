package org.wahlzeit.uav.location;


public abstract class AbstractLocation implements Location {
	
	public abstract double[] getPoint();
	public abstract String getMapcode();
	public abstract void setMapcode(String mapcode);
	public abstract String asString();
	
	/**
	 * @methodtype get method
	 */
	public double getLatitude()
	{
		double[] point = getPoint();
		return point[0];
	}
	
	/**
	 * @methodtype get method
	 */
	public double getLongtitude()
	{
		double[] point = getPoint();
		return point[1];
	}
		
	/**
	 * @methodtype set method
	 */
	public void setPoint(double x, double y)
	{
		doSetPoint(x, y);
	}
	
	/**
	 * @methodtype get method
	 */
	protected abstract void doSetPoint(double x, double y);
}
