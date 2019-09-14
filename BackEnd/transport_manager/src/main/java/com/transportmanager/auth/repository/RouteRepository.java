package com.transportmanager.auth.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.transportmanager.auth.entity.Route;

/**
 * The Interface RouteRepository.
 */
@Repository
public interface RouteRepository extends CrudRepository<Route,Long> {

}
