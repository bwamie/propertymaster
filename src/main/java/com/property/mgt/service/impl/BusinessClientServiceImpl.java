package com.property.mgt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.property.mgt.domain.BusinessClient;
import com.property.mgt.repository.BusinessClientRepository;
import com.property.mgt.service.BusinessClientService;

@Service
@Transactional
public class BusinessClientServiceImpl implements BusinessClientService {

	@Autowired
	BusinessClientRepository businessClientRepository;
	
	@Override
	public List<BusinessClient> findAll() {
		return (List<BusinessClient>) businessClientRepository.findAll();
	}

	@Override
	public void save(BusinessClient businessClient) {
		businessClientRepository.save(businessClient);
	}

}
