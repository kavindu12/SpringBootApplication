package io.transport_manager.springbootapplication.transport_manager.service;

import java.util.Collection;

import javax.transaction.Transactional;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.transportmanager.auth.entity.BusFare;
import com.transportmanager.auth.service.BusFareService;

import io.transport_manager.springbootapplication.transport_manager.AbstractTest;

/**
 * The Class BusFareServiceTest.
 */
@Transactional
public class BusFareServiceTest extends AbstractTest {

	/** The bus fare service. */
	@Autowired
	private BusFareService busFareService;
	
	
	/**
	 * Sets the up.
	 */
	@Before
	public void setUp() {
		busFareService.evictCache();
	}
	
	/**
	 * Tear down.
	 */
	@After
	public void tearDown() {
		//clean after each test
	}
	
	/**
	 * Test get all bus fare.
	 */
	@Test
	public void testGetAllBusFare() {
		Collection<BusFare> list=busFareService.getAllBusFares();
		Assert.assertNotNull("failure -expected not null",list);
		Assert.assertEquals("failure -expected size",0, list.size());
	}
	
	/**
	 * Test add bus fare.
	 */
	@Test
	public void testAddBusFare() {
		double[] normal= {1,3,4,5};
		double[] airConditioned={1,3,4,5};
		double[] semiLuxury={1,3,4,5};
		BusFare busFare=new BusFare(1L, normal, airConditioned, semiLuxury);
		
		BusFare createdEntity=busFareService.addBusFare(busFare);
		Assert.assertNotNull("failure -expected not null",createdEntity);
		
	}
}
