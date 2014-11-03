package org.junit;

import org.wahlzeit.location.MapcodeLocation;

import junit.framework.TestCase;

public class MapcodeLocationTest extends TestCase {

	MapcodeLocation mapcode;
	protected void setUp() throws Exception {
		mapcode = new MapcodeLocation("VJH79.B3B0");
	}
	
	public void testGetLatitude()
	{
		assertEquals(Math.round(mapcode.getLatitude()), Math.round(51.041394));
	}
	
	public void testGetLongtitude()
	{
		assertEquals(Math.round(mapcode.getLongtitude()), Math.round(11.733398));
	}
	
	public void testSetLatitude()
	{
		mapcode.setLatitude(12.897489);
		assertEquals(Math.round(mapcode.getLatitude()), Math.round(12.897489));
	}
	
	public void testSetLongtitude()
	{
		mapcode.setLongtitude(8.4375);
		assertEquals(Math.round(mapcode.getLongtitude()), Math.round(8.4375));
	}

}
