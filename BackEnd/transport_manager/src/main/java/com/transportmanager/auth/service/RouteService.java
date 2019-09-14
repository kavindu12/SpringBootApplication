package com.transportmanager.auth.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.transportmanager.auth.entity.Route;


/**
 * The Interface RouteService.
 */
public interface RouteService {
	
	/**
	 * Gets the all routes.
	 *
	 * @return the all routes
	 */
	public List<Route> getAllRoutes();
	
	/**
	 * Adds the route.
	 *
	 * @param route the route
	 * @return the route
	 */
	public Route addRoute(Route route);
	
	/**
	 * Dissable route.
	 *
	 * @param routeNumber the route number
	 * @return the response entity
	 */
	public ResponseEntity<Object> dissableRoute(Long routeNumber);
	
	/**
	 * Enable route.
	 *
	 * @param routeNumber the route number
	 * @return the response entity
	 */
	public ResponseEntity<Object> enableRoute(Long routeNumber);
	
	/**
	 * Evict cache.
	 */
	void evictCache();
	
}
