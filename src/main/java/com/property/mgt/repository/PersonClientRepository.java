package com.property.mgt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.property.mgt.domain.PersonClient;

@Repository
public interface PersonClientRepository extends CrudRepository<PersonClient, Long> {

}
