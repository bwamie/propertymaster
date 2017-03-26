package com.property.mgt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.property.mgt.domain.PersonClient;

@Repository
public interface PersonClientRepository extends CrudRepository<PersonClient, Long> {

	@Query("SELECT p FROM PersonClient p WHERE p.person.firstName =:firstName")
	List<PersonClient> getClientByFirstName(@Param("firstName") String firstName);

}
