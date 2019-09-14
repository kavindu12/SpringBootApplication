package com.transportmanager.auth.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

import com.transportmanager.auth.entity.BusStop;
import com.transportmanager.auth.repository.BusStopRepository;


/**
 * The Class BusStopServiceImpl.
 */
@Service
public class BusStopServiceImpl implements BusStopService {
	
    /** logger for this class. */
    private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/** The bus stop repository. */
	@Autowired
	private BusStopRepository busStopRepository;
	
	/**
	 * implements getAllBusStops() method to get all bus stops
	 */
	@Override
	public List<BusStop> getAllBusStops(){
		
		return (List<BusStop>) busStopRepository.findAll();
	}
	
	/**
	 * implements evictCache() method
	 */
	@Override
	@CacheEvict(
			value="routes",
			allEntries=true)
	public void evictCache() {
		logger.info("> evictCache");
		logger.info("< evictCache");
	}

}
