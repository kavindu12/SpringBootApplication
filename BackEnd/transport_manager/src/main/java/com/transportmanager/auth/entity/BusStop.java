package com.transportmanager.auth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class BusStop.
 */
@Entity
@Table(name="busstop")
public class BusStop {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
		
	/** The location. */
	@Column(name="location")
	private String location;
	
	/** The name. */
	@Column(name="name")
	private String name;
	
	/**
	 * Instantiates a new bus stop.
	 */
	public BusStop() {
		
	}

	/**
	 * Instantiates a new bus stop.
	 *
	 * @param id the id
	 * @param location the location
	 * @param name the name
	 */
	public BusStop(Long id, String location, String name) {
		super();
		this.id = id;
		this.location = location;
		this.name = name;
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
	 * Gets the location.
	 *
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Sets the location.
	 *
	 * @param location the new location
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
