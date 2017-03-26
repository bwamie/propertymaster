package com.property.mgt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.property.mgt.domain.PersonClient;
import com.property.mgt.repository.PersonClientRepository;
import com.property.mgt.service.PersonClientService;

@Service
@Transactional
public class PersonClientServiceImpl implements PersonClientService {
	
	@Autowired
	PersonClientRepository personClientRepository;

	@Override
	public List<PersonClient> findAll() {
		return (List<PersonClient>) personClientRepository.findAll();
		
	}

	@Override
	public void save(PersonClient client) {
		personClientRepository.save(client);
		
	}

	@Override
	public PersonClient findOne(long personClientId) {
		return (PersonClient)personClientRepository.findOne(personClientId);
	}

	@Override
	public void delete(PersonClient personClient) {
		personClientRepository.delete(personClient);
		
	}

	@Override
	public List<PersonClient> getClientByFirstName(String firstName) {
		return personClientRepository.getClientByFirstName(firstName);
			}

}
