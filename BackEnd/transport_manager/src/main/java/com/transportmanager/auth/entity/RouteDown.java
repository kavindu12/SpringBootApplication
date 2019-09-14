package com.transportmanager.auth.entity;

import javax.persistence.Embeddable;
import javax.validation.constraints.Size;

/**
 * The Class RouteDown.
 */
@Embeddable
public class RouteDown {
	
	/** The halt name. */
	@Size(max=20)
	private String haltName;
	
	/** The description. */
	@Size(max=100)
	private String description;
	
	/** The latitude. */
	@Size(max=20)
	private String latitude;
	
	/** The longitude. */
	@Size(max=20)
	private String longitude;
	
	/** The next stop. */
	@Size(max=50)
	private String nextStop;
	
	/** The previous stop. */
	@Size(max=50)
	private String previousStop;

	/**
	 * Gets the halt name.
	 *
	 * @return the halt name
	 */
	public String getHaltName() {
		return haltName;
	}

	/**
	 * Sets the halt name.
	 *
	 * @param haltName the new halt name
	 */
	public void setHaltName(String haltName) {
		this.haltName = haltName;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the latitude.
	 *
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}

	/**
	 * Sets the latitude.
	 *
	 * @param latitude the new latitude
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * Gets the longitude.
	 *
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}
	
	/**
	 * Instantiates a new route down.
	 */
	public RouteDown() {
		
	}

	/**
	 * Instantiates a new route down.
	 *
	 * @param haltName the halt name
	 * @param description the description
	 * @param latitude the latitude
	 * @param longitude the longitude
	 * @param nextStop the next stop
	 * @param previousStop the previous stop
	 */
	public RouteDown(@Size(max = 20) String haltName, @Size(max = 100) String description,
			@Size(max = 20) String latitude, @Size(max = 20) String longitude, @Size(max = 50) String nextStop,
			@Size(max = 50) String previousStop) {
		super();
		this.haltName = haltName;
		this.description = description;
		this.latitude = latitude;
		this.longitude = longitude;
		this.nextStop = nextStop;
		this.previousStop = previousStop;
	}

	/**
	 * Sets the longitude.
	 *
	 * @param longitude the new longitude
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/**
	 * Gets the next stop.
	 *
	 * @return the next stop
	 */
	public String getNextStop() {
		return nextStop;
	}

	/**
	 * Sets the next stop.
	 *
	 * @param nextStop the new next stop
	 */
	public void setNextStop(String nextStop) {
		this.nextStop = nextStop;
	}

	/**
	 * Gets the previous stop.
	 *
	 * @return the previous stop
	 */
	public String getPreviousStop() {
		return previousStop;
	}

	/**
	 * Sets the previous stop.
	 *
	 * @param previousStop the new previous stop
	 */
	public void setPreviousStop(String previousStop) {
		this.previousStop = previousStop;
	}
	

}
