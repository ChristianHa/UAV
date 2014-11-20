package org.location;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.wahlzeit.uav.location.GPSLocation;

public class GPSLocationTest {
	GPSLocation loc;

	@Before
	public void setUp() throws Exception {
		loc = new GPSLocation(51.041394, 11.733398);

	}

	@Test
	public void TestGetLatitude()
	{
		assertTrue(51.041394 == loc.getLatitude());
	}
	
	@Test
	public void TestDoSetMapcode() {
		loc.setMapcode("LJ72Z.3T6M");
		assertTrue(loc.getMapcode().contains("LJ72Z.3T6M"));
	}
	
	@Test
	public void TestGetMapcode() {
		assertTrue(loc.getMapcode().contains("VJH79.B3B0"));
	}

}
