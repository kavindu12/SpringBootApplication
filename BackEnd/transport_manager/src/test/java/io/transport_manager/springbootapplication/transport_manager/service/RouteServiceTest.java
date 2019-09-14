package io.transport_manager.springbootapplication.transport_manager.service;

import java.util.Collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;

import com.transportmanager.auth.entity.Bus;
import com.transportmanager.auth.entity.BusStop;
import com.transportmanager.auth.entity.Route;
import com.transportmanager.auth.entity.RouteDown;
import com.transportmanager.auth.entity.RouteUp;
import com.transportmanager.auth.service.RouteService;

import io.transport_manager.springbootapplication.transport_manager.AbstractTest;


/**
 * The Class RouteServiceTest.
 */
@Transactional
public class RouteServiceTest extends AbstractTest {
	
	/** The route service. */
	@Autowired
	private RouteService routeService;
	
	/*instruct the test runner to execute some logic to prepare 
	 for the execution of test */
	
	/**
	 * Sets the up.
	 */
	//method will be executed prior to each test class
	@Before
	public void setUp() {
		routeService.evictCache();
	}
	
	/**
	 * Tear down.
	 */
	@After
	public void tearDown() {
		//clean after each test
	}
	
	/**
	 * Test add route.
	 */
	@Test
	public void testAddRoute() {
		
		Route route =new Route(2L,"123",true);
		route.getBusStops().add(new BusStop(3L,"Delthota","rex"));
		route.getRouteUps().add(new RouteUp("borella","atob","1234","45678","Gemunupura","kad"));
		route.getRouteDowns().add(new RouteDown("borella","atob","1234","45678","Gemunupura","kad"));
		route.getBuses().add(new Bus());
		
		Route createdEntity=routeService.addRoute(route);
		Assert.assertNotNull("failure -expected not null",createdEntity);
	}
	
	/**
	 * Test find all.
	 */
	@Test
	public void testFindAll() {
		Collection<Route> list=routeService.getAllRoutes();
		
		//Expecting returning collection is not null
		
		Assert.assertNotNull("failure -expected not null",list);
		Assert.assertEquals("failure -expected size",1, list.size());
	}
	
	/**
	 * Test enable route.
	 */
	@Test
	public void testEnableRoute() {
		
		ResponseEntity<Object> updatedEntity=routeService.enableRoute(3L);	
		Assert.assertNotNull("failure -expected not null",updatedEntity);
		
	}
	
	/**
	 * Test disable route.
	 */
	@Test
	public void testDisableRoute() {
		
		ResponseEntity<Object> updatedEntity=routeService.dissableRoute(3L);
		Assert.assertNotNull("failure -expected not null",updatedEntity);

	}
	
}
