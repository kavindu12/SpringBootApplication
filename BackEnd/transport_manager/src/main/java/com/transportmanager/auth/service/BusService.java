package com.transportmanager.auth.service;

import org.springframework.stereotype.Service;

import com.transportmanager.auth.entity.Bus;




/**
 * The Interface BusService.
 */
@Service
public interface BusService {

	/**
	 * Adds the bus.
	 *
	 * @param bus the bus
	 * @return the bus
	 */
	public Bus addBus(Bus bus);
	
	/**
	 * Evict cache.
	 */
	public void evictCache();

}
