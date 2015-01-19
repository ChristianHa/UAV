package org.wahlzeit.uav.location;

public interface Location {
	
	double getLatitude();
	double getLongtitude();
	
	double[] getPoint();
	String getMapcode();
	
	void setMapcode(String mapcode);
	void setPoint(double x, double y);
	
	String asString();
}