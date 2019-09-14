package com.transportmanager.auth.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

import com.transportmanager.auth.entity.BusFare;
import com.transportmanager.auth.repository.BusFareRepository;

/**
 * The Class BusFareServiceImpl.
 */
@Service
public class BusFareServiceImpl implements BusFareService {
	
    /** logger for this class. */
    private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/** The bus fare repository. */
	@Autowired
	private BusFareRepository busFareRepository;
	
	/** 
	 * implements addBusFare() method
	 */
	@Override
	public BusFare addBusFare(BusFare busFare) {
		return busFareRepository.save(busFare);
	}
	
	/**
	 * implements getAllBusFares() method
	 */
	@Override
	public List<BusFare> getAllBusFares(){
		return (List<BusFare>) busFareRepository.findAll();
	}
	
	/**
	 * implements evitCache() method
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
