package com.transportmanager.auth.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.transportmanager.auth.entity.BusStop;

/**
 * The Interface BusStopRepository.
 */
@Repository
public interface BusStopRepository extends CrudRepository<BusStop, Long> {

}
