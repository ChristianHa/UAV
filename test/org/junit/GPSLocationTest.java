package org.junit;

import static org.junit.Assert.*;

import org.wahlzeit.location.GPSLocation;

public class GPSLocationTest {
	GPSLocation loc;

	@Before
	public void setUp() throws Exception {
		loc = new GPSLocation(51.041394, 11.733398);

	}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public void TestGetMapcode() {
//		System.out.println(loc.getMapcode());
//		assertEquals("VJH79.B3B0", loc.getMapcode());
//	}
	
	@Test
	public void TestDoSetMapcode() {
		System.out.println(loc.getMapcode());
		assertEquals("VJH79.B3B0", loc.getMapcode());
	}
	
	@Test
	public void TestGetMapcode() {
		System.out.println(loc.getMapcode());
		assertEquals("VJH79.B3B0", loc.getMapcode());
	}

}
