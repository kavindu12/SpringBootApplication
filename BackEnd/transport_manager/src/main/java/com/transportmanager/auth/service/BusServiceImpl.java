/*
 * 
 */
package com.transportmanager.auth.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

import com.transportmanager.auth.entity.Bus;
import com.transportmanager.auth.repository.BusRepository;

/**
 * The Class BusServiceImpl.
 */
@Service
public class BusServiceImpl implements BusService {
	
	/** logger for this class. */
    private Logger logger = LoggerFactory.getLogger(this.getClass());

	/** The bus repository. */
	@Autowired
	private BusRepository busRepository;
	
	/**
	 * implements addBus() method to save all bus details
	 */
	@Override
	public Bus addBus(Bus bus) {
		return busRepository.save(bus);
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
