package com.transportmanager.auth.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.transportmanager.auth.entity.BusFare;


/**
 * The Interface BusFareService.
 */
@Service
public interface BusFareService {

	/**
	 * Adds the bus fare.
	 *
	 * @param busFare the bus fare
	 * @return the bus fare
	 */
	public BusFare addBusFare(BusFare busFare);
	
	/**
	 * Gets the all bus fares.
	 *
	 * @return the all bus fares
	 */
	public List<BusFare> getAllBusFares();
	
	/**
	 * Evict cache.
	 */
	public void evictCache();

}
