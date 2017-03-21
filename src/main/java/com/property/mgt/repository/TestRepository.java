package com.property.mgt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.property.mgt.domain.Owner;

@Repository
public interface TestRepository extends CrudRepository<Owner, Long> {
	
	//public void save(Contact contact);
	
}
