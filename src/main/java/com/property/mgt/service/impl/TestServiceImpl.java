package com.property.mgt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.property.mgt.domain.Contact;
import com.property.mgt.domain.Owner;
import com.property.mgt.repository.TestRepository;
import com.property.mgt.service.TestService;

@Service
@Transactional
public class TestServiceImpl implements TestService {
	
	@Autowired
	TestRepository testRepository;

//	@Override
//	public void Save(Contact contact) {
//		testRepository.save(contact);
//	}
	
	@Override
	public void Save(Owner owner) {
		testRepository.save(owner);
	}

}
