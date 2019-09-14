package io.transport_manager.springbootapplication.transport_manager.service;

import javax.transaction.Transactional;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.transportmanager.auth.entity.Bus;
import com.transportmanager.auth.entity.Route;
import com.transportmanager.auth.service.BusService;

import io.transport_manager.springbootapplication.transport_manager.AbstractTest;


/**
 * The Class BusServiceTest.
 */
@Transactional
public class BusServiceTest extends AbstractTest {

	/** The bus service. */
	@Autowired
	private BusService busService;
	
	/**
	 * Sets the up.
	 */
	@Before
	public void setUp() {
		busService.evictCache();
	}
	
	/**
	 * Tear down.
	 */
	@After
	public void tearDown() {
		//clean after each test
	}
	
	/**
	 * Test add bus.
	 */
	@Test
	public void testAddBus() {
		Route routeId=new Route(3L);
		Bus bus=new Bus(2L, "NA-1234", true, "12345678", "9876543", "routeUP",routeId);
		Bus createdEntity=busService.addBus(bus);
		Assert.assertNotNull("failure -expected not null",createdEntity);
	}
}
