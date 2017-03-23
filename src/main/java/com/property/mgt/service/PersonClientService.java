package com.property.mgt.service;

import java.util.List;

import com.property.mgt.domain.PersonClient;

public interface PersonClientService {

	
	List<PersonClient> findAll();

	void save(PersonClient client);

	PersonClient findOne(long personClientId);

	void delete(PersonClient findOne);

}
