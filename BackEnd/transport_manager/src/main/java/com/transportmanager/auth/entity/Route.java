package com.transportmanager.auth.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import com.transportmanager.auth.entity.BusStop;


/**
 * The Class Route.
 */
@Entity
@Table(name="route")
public class Route {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@NotNull
	private Long id;
	
	/** The route number. */
	@Column(name="route_number")
	private String routeNumber;
		
	/** The status. */
	@Column(name="status")
	private boolean status;
	
	/**
	 * Instantiates a new route.
	 */
	public Route() {
		
	}
	
	/**
	 * Instantiates a new route.
	 *
	 * @param id the id
	 */
	public Route(@NotNull Long id) {
		super();
		this.id = id;
	}



	/**
	 * Instantiates a new route.
	 *
	 * @param id the id
	 * @param routeNumber the route number
	 * @param status the status
	 */
	public Route(@NotNull Long id, String routeNumber, boolean status) {
		super();
		this.id = id;
		this.routeNumber = routeNumber;
		this.status = status;
	}

	/** The bus stops. */
	@ManyToMany(fetch = FetchType.LAZY,
	            cascade = {
	                CascadeType.PERSIST,
	                CascadeType.MERGE
	            })
	
	@JoinTable(name = "route_busstop",
            joinColumns = {@JoinColumn (name = "busstop_id") },
            inverseJoinColumns = { @JoinColumn(name = "route_id") })
	private Set<BusStop> busStops=new HashSet<>();

	/** The route ups. */
	@ElementCollection(fetch=FetchType.LAZY)
	 @CollectionTable(
			 name="route_up",
			 joinColumns=@JoinColumn(name="id")
			 )
	private Set<RouteUp> routeUps=new HashSet<>();
	
	/** The route downs. */
	@ElementCollection(fetch=FetchType.LAZY)
		@CollectionTable(
				name="route_down",
				joinColumns=@JoinColumn(name="id")
				)
	private Set<RouteDown> routeDowns=new HashSet<>();
	
	
	/** The buses. */
	@OneToMany(mappedBy="route",cascade=CascadeType.ALL)
	private Set<Bus> buses=new HashSet<>();

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
	 * Gets the route number.
	 *
	 * @return the route number
	 */
	public String getRouteNumber() {
		return routeNumber;
	}

	/**
	 * Sets the route number.
	 *
	 * @param routeNumber the new route number
	 */
	public void setRouteNumber(String routeNumber) {
		this.routeNumber = routeNumber;
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
	 * Gets the route ups.
	 *
	 * @return the route ups
	 */
	public Set<RouteUp> getRouteUps() {
		return routeUps;
	}

	/**
	 * Sets the route ups.
	 *
	 * @param routeUps the new route ups
	 */
	public void setRouteUps(Set<RouteUp> routeUps) {
		this.routeUps = routeUps;
	}

	/**
	 * Gets the route downs.
	 *
	 * @return the route downs
	 */
	public Set<RouteDown> getRouteDowns() {
		return routeDowns;
	}

	/**
	 * Sets the route downs.
	 *
	 * @param routeDowns the new route downs
	 */
	public void setRouteDowns(Set<RouteDown> routeDowns) {
		this.routeDowns = routeDowns;
	}

	/**
	 * Gets the bus stops.
	 *
	 * @return the bus stops
	 */
	public Set<BusStop> getBusStops() {
		return busStops;
	}

	/**
	 * Sets the bus stops.
	 *
	 * @param busStops the new bus stops
	 */
	public void setBusStops(Set<BusStop> busStops) {
		this.busStops = busStops;
	}

	/**
	 * Gets the buses.
	 *
	 * @return the buses
	 */
	public Set<Bus> getBuses() {
		return buses;
	}

	/**
	 * Sets the buses.
	 *
	 * @param buses the new buses
	 */
	public void setBuses(Set<Bus> buses) {
		this.buses = buses;
	}

	
	
}
