package com.transportmanager.auth.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.transportmanager.auth.entity.BusStop;


/**
 * The Interface BusStopService.
 */
@Service
public interface BusStopService {

	/**
	 * Gets the all bus stops.
	 *
	 * @return the all bus stops
	 */
	public List<BusStop> getAllBusStops();
	
	/**
	 * Evict cache.
	 */
	public void evictCache();

}
