package com.transportmanager.auth.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.transportmanager.auth.entity.Route;
import com.transportmanager.auth.repository.RouteRepository;


/**
 * The Class RouteServiceImpl.
 */
@Service
public class RouteServiceImpl implements RouteService {
	
	
	
    /** logger for this class. */
    private Logger logger = LoggerFactory.getLogger(this.getClass());

	
	/** The route repository. */
	@Autowired
	private RouteRepository routeRepository;
	
	/** implements getAllRoutes() to get all routeDetails
	 */
	@Override
	public List<Route> getAllRoutes(){
		return (List<Route>) routeRepository.findAll();
	}
	
	/**
	 * implements addRoute method to save route data 
	 */
	@Override
	public Route addRoute(Route route) {
		return routeRepository.save(route);
	}
	
	/**
	 * implements dissableRoute when user is given a particular id to dissable route
	 */
	@Override
	public ResponseEntity<Object> dissableRoute(Long routeNumber){
		Route routeObj=routeRepository.findById(routeNumber).get();
		routeObj.setStatus(false);
		routeRepository.save(routeObj);
		return ResponseEntity.noContent().build();
	}
	
	/**
	 * implements enableRoute when user is given a particular id to enable route
	 *
	 */
	@Override
	public ResponseEntity<Object> enableRoute(Long routeNumber){
		Route routeObj=routeRepository.findById(routeNumber).get();
		routeObj.setStatus(true);
		routeRepository.save(routeObj);
		return ResponseEntity.noContent().build();
	}
	
	/**
	 * implements evictCache method
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
