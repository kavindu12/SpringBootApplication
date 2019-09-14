package com.transportmanager.auth.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The Class Bus.
 */
@Entity
@Table(name="Bus")
public class Bus {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	

	
	/** The bus number. */
	@Column(name="bus_number")
	private String busNumber;
	
	/** The status. */
	@Column(name="status")
	private boolean status;
	
	/** The current longitude. */
	@Column(name="current_longitude")
	private String currentLongitude;
	
	/** The current latitude. */
	@Column(name="current_latitude")
	private String currentLatitude;
	
	/** The route status. */
	@Column(name="route_status")
	private String routeStatus;
	
	/** The route. */
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="route_id")
	private Route route;
	
	/**
	 * Instantiates a new bus.
	 */
	public Bus() {
		
	}
	
	

	/**
	 * Instantiates a new bus.
	 *
	 * @param id the id
	 * @param busNumber the bus number
	 * @param status the status
	 * @param currentLongitude the current longitude
	 * @param currentLatitude the current latitude
	 * @param routeStatus the route status
	 * @param route the route
	 */
	public Bus(Long id, String busNumber, boolean status, String currentLongitude, String currentLatitude,
			String routeStatus, Route route) {
		super();
		this.id = id;
		this.busNumber = busNumber;
		this.status = status;
		this.currentLongitude = currentLongitude;
		this.currentLatitude = currentLatitude;
		this.routeStatus = routeStatus;
		this.route = route;
	}



	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}


	/**
	 * Gets the bus number.
	 *
	 * @return the bus number
	 */
	public String getBusNumber() {
		return busNumber;
	}

	/**
	 * Sets the bus number.
	 *
	 * @param busNumber the new bus number
	 */
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	/**
	 * Checks if is status.
	 *
	 * @return true, if is status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * Gets the current longitude.
	 *
	 * @return the current longitude
	 */
	public String getCurrentLongitude() {
		return currentLongitude;
	}

	/**
	 * Sets the current longitude.
	 *
	 * @param currentLongitude the new current longitude
	 */
	public void setCurrentLongitude(String currentLongitude) {
		this.currentLongitude = currentLongitude;
	}

	/**
	 * Gets the current latitude.
	 *
	 * @return the current latitude
	 */
	public String getCurrentLatitude() {
		return currentLatitude;
	}

	/**
	 * Sets the current latitude.
	 *
	 * @param currentLatitude the new current latitude
	 */
	public void setCurrentLatitude(String currentLatitude) {
		this.currentLatitude = currentLatitude;
	}

	/**
	 * Gets the route status.
	 *
	 * @return the route status
	 */
	public String getRouteStatus() {
		return routeStatus;
	}

	/**
	 * Sets the route status.
	 *
	 * @param routeStatus the new route status
	 */
	public void setRouteStatus(String routeStatus) {
		this.routeStatus = routeStatus;
	}

	/**
	 * Gets the route.
	 *
	 * @return the route
	 */
	public Route getRoute() {
		return route;
	}

	/**
	 * Sets the route.
	 *
	 * @param route the new route
	 */
	public void setRoute(Route route) {
		this.route = route;
	}
		
	
}
