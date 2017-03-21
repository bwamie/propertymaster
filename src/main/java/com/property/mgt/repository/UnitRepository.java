package com.property.mgt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.property.mgt.domain.Unit;

@Repository
public interface UnitRepository extends CrudRepository<Unit, Long> {

}
