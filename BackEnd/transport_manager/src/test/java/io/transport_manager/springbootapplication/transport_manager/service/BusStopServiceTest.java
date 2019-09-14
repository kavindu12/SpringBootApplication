package io.transport_manager.springbootapplication.transport_manager.service;

import java.util.Collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.transportmanager.auth.entity.BusStop;
import com.transportmanager.auth.service.BusStopService;

import io.transport_manager.springbootapplication.transport_manager.AbstractTest;


/**
 * The Class BusStopServiceTest.
 */
public class BusStopServiceTest extends AbstractTest {
	
	/** The bus stop service. */
	@Autowired
	private BusStopService busStopService;
	
	/**
	 * Sets the up.
	 */
	@Before
	public void setUp() {
		busStopService.evictCache();
	}
	
	/**
	 * Tear down.
	 */
	@After
	public void tearDown() {
		//clean after each test
	}
	
	/**
	 * Test get all bus stops.
	 */
	@Test
	public void testGetAllBusStops() {
		
		Collection<BusStop> list =busStopService.getAllBusStops();
		Assert.assertNotNull("failure -expected not null",list);
		Assert.assertEquals("failure -expected size",1, list.size());
	}
}
