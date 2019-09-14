package com.transportmanager.auth.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.transportmanager.auth.entity.BusFare;

/**
 * The Interface BusFareRepository.
 */
@Repository
public interface BusFareRepository extends CrudRepository<BusFare, Long> {

}
