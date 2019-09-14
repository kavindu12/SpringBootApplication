package com.transportmanager.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.transportmanager.auth.entity.Bus;
import com.transportmanager.auth.service.BusService;

/**
 * The Class BusController.
 */
@Controller
@RequestMapping("/bus")
public class BusController {
	
	/** The bus service. */
	@Autowired 
	private BusService busService;
	
	/**
	 * Adds the bus.
	 *
	 * @param bus the bus
	 * @return the bus
	 */
	@ResponseBody
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public Bus addBus(@RequestBody Bus bus) {
		return busService.addBus(bus);
	}

}
