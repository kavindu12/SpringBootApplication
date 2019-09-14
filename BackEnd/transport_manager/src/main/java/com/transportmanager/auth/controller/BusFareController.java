package com.transportmanager.auth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.transportmanager.auth.entity.BusFare;
import com.transportmanager.auth.service.BusFareService;

/**
 * The Class BusFareController.
 */
@RestController
@RequestMapping("/busFare")
public class BusFareController {
	
	/** The bus fare service. */
	@Autowired
	private BusFareService busFareService;
	
	/**
	 * Adds the bus fare.
	 *
	 * @param busFare the bus fare
	 * @return the bus fare
	 */
	@ResponseBody
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public BusFare addBusFare(@RequestBody BusFare busFare) {
		return busFareService.addBusFare(busFare);
	}
	
	/**
	 * Gets the all bus fares.
	 *
	 * @return the all bus fares
	 */
	@ResponseBody
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public List<BusFare> getAllBusFares(){
		return busFareService.getAllBusFares();
	}
	
}
