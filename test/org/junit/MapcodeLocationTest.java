package org.junit;

import org.wahlzeit.location.MapcodeLocation;

import junit.framework.TestCase;

public class MapcodeLocationTest extends TestCase {

	MapcodeLocation mapcode;
	protected void setUp() throws Exception {
		mapcode = new MapcodeLocation("VJH79.B3B0");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	
	public void testGetLatitude()
	{
		assertEquals(mapcode.getLatitude(), 51.041394);
	}
	
	public void testGetLongtitude()
	{
		assertEquals(mapcode.getLongtitude(), 11.733398);
	}
	
	public void testSetLatitude()
	{
	}

}
