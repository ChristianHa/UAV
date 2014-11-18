package org.wahlzeit.uav;

public abstract class LocationDefImpl implements Location {
	
	public double getLatitude()
	{
		return doGetLatitude();
	}
	abstract double doGetLatitude();
	
	public void setLatitude(double latitude)
	{
		doSetLatitude(latitude);
	}
	abstract void doSetLatitude(double latitude);
	
	public double getLongtitude()
	{
		return doGetLongtitude();
	}
	abstract double doGetLongtitude();
		
		
	public void setLongtitude(double longtitude)
	{
		doSetLongtitude(longtitude);
	}
	abstract void doSetLongtitude(double longtitude);

	
	public void setMapcode(String mapcode)
	{
			doSetMapcode(mapcode);
	}
	abstract void doSetMapcode(String mapcode);
	
	public String getMapcode()
	{
		return doGetMapcode();
	}
	abstract String doGetMapcode();
}
