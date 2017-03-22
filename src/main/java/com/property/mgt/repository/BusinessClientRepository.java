package com.property.mgt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.property.mgt.domain.BusinessClient;

@Repository
public interface BusinessClientRepository extends CrudRepository<BusinessClient, Long> {

}
