package com.transportmanager.auth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


/**
 * The Class BusFare.
 */
@Entity
@Table(name="bus_fare")
public class BusFare {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@NotNull
	
	private Long id;
	
	/** The normal. */
	@Column(name="normal")
	private double normal[];
	
	/** The air conditioned. */
	@Column(name="air_conditioned")
	private double airConditioned[];
	
	/** The semi luxury. */
	@Column(name="semi_luxury")
	private double semiLuxury[];
	
	/**
	 * Instantiates a new bus fare.
	 */
	public BusFare() {
		
	}

	/**
	 * Instantiates a new bus fare.
	 *
	 * @param id the id
	 * @param normal the normal
	 * @param airConditioned the air conditioned
	 * @param semiLuxury the semi luxury
	 */
	public BusFare(@NotNull Long id, double[] normal, double[] airConditioned, double[] semiLuxury) {
		super();
		this.id = id;
		this.normal = normal;
		this.airConditioned = airConditioned;
		this.semiLuxury = semiLuxury;
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
	 * Gets the normal.
	 *
	 * @return the normal
	 */
	public double[] getNormal() {
		return normal;
	}

	/**
	 * Sets the normal.
	 *
	 * @param normal the new normal
	 */
	public void setNormal(double[] normal) {
		this.normal = normal;
	}

	/**
	 * Gets the air conditioned.
	 *
	 * @return the air conditioned
	 */
	public double[] getAirConditioned() {
		return airConditioned;
	}

	/**
	 * Sets the air conditioned.
	 *
	 * @param airConditioned the new air conditioned
	 */
	public void setAirConditioned(double[] airConditioned) {
		this.airConditioned = airConditioned;
	}

	/**
	 * Gets the semi luxury.
	 *
	 * @return the semi luxury
	 */
	public double[] getSemiLuxury() {
		return semiLuxury;
	}

	/**
	 * Sets the semi luxury.
	 *
	 * @param semiLuxury the new semi luxury
	 */
	public void setSemiLuxury(double[] semiLuxury) {
		this.semiLuxury = semiLuxury;
	}
		

}
