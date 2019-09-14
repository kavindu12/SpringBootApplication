package com.transportmanager.auth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.transportmanager.auth.entity.Route;
import com.transportmanager.auth.service.RouteService;


/**
 * The Class RouteController.
 */
@RestController
@RequestMapping("/route")
public class RouteController {
	
	/** The route service. */
	@Autowired
	private RouteService routeService;
	
	/**
	 * Gets the all routes.
	 *
	 * @return the all routes
	 */
	@ResponseBody
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public List<Route> getAllRoutes(){
		return routeService.getAllRoutes();
	}
	
	/**
	 * Adds the route.
	 *
	 * @param route the route
	 * @return the route
	 */
	@ResponseBody
	@RequestMapping(value="/addRoute",method=RequestMethod.POST)
	public Route addRoute(@RequestBody Route route) {
		return routeService.addRoute(route);
	}
	
	/**
	 * Dissable route.
	 *
	 * @param routeNumber the route number
	 * @return the response entity
	 */
	@ResponseBody
	@RequestMapping(value="/{routeNumber}/dissableRoute",method=RequestMethod.PUT)
	public ResponseEntity<Object> dissableRoute(@PathVariable("routeNumber") Long routeNumber ){
		return routeService.dissableRoute(routeNumber);
	}
	
	/**
	 * Enable route.
	 *
	 * @param routeNumber the route number
	 * @return the response entity
	 */
	@ResponseBody
	@RequestMapping(value="/{routeNumber}/enableRoute",method=RequestMethod.PUT)
	public ResponseEntity<Object> enableRoute(@PathVariable("routeNumber") Long routeNumber ){
		return routeService.enableRoute(routeNumber);
	}

}
