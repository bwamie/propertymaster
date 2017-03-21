package com.property.mgt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.property.mgt.domain.Property;

@Repository
public interface PropertyRepository extends CrudRepository<Property, Long> {

}
