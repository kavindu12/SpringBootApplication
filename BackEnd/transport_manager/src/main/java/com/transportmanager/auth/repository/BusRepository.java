package com.transportmanager.auth.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.transportmanager.auth.entity.Bus;

/**
 * The Interface BusRepository.
 */
@Repository
public interface BusRepository extends CrudRepository<Bus, Long> {

}
