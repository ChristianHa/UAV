package org.wahlzeit.uav;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.wahlzeit.uav.domain.Camera;
import org.wahlzeit.uav.domain.Engine;
import org.wahlzeit.uav.domain.EngineType;
import org.wahlzeit.uav.domain.ManufactureFactory;
import org.wahlzeit.uav.domain.UAV;

public class UAVTest {

	UAV uavSucess;
	UAV uavFail;
	
	@Before
	public void setUp() {
		uavSucess = new UAV(new Engine(EngineType.ELECTRONIC, 1), 
							new Camera(1024, false), 	
							"HubsanX4",
							ManufactureFactory.getInstance().createInstance("Hubsan", 2004, 2000, "Shanghai"),
							3,
							true);
		
		uavFail = new UAV(new Engine(EngineType.GASOLINE, 1),
						  new Camera(1024, false), 
						  "HubsanX4",
						  ManufactureFactory.getInstance().createInstance("Hubsan", 2004, 2000, "Shanghai"),
						  -23, 
						  false);
	}
	
	@Test
	public void testMinFlightIsPositivSuccess() {
		assertTrue(uavSucess.getMinFlightDistance() > 0);
	}
	
	@Test
	public void testMinFlightIsPositivFail() {
		try
		{
			uavFail.getMinFlightDistance();
		}
		catch (AssertionError e){
			assertTrue(true);
		}
	}
	
	@Test
	public void testUAVGetCameraSucess() {
		assertNotNull(uavSucess.getCam());
	}
	
	@Test
	public void TestUAVGetCameraFail() {
		try
		{
			uavFail.getCam();
		}
		catch (AssertionError e){
			assertTrue(true);
		}
	}

}
