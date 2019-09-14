package com.transportmanager.auth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.transportmanager.auth.entity.BusStop;
import com.transportmanager.auth.service.BusStopService;

/**
 * The Class BusStopController.
 */
@RestController
@RequestMapping("/busStop")
public class BusStopController {
	
	/** The bus stop service. */
	@Autowired
	private BusStopService busStopService;
	
	/**
	 * Gets the all bus stops.
	 *
	 * @return the all bus stops
	 */
	@ResponseBody
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public List<BusStop> getAllBusStops(){
		return busStopService.getAllBusStops();
	}

}
