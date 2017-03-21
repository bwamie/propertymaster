package com.property.mgt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.property.mgt.domain.Property;
import com.property.mgt.repository.PropertyRepository;
import com.property.mgt.service.PropertyService;

@Service
@Transactional
public class PropertyServiceImpl implements PropertyService {
	
	@Autowired
	PropertyRepository propertyRepository;

	@Override
	public void saveProperty(Property property) {
		propertyRepository.save(property);
	}

	@Override
	public void findOnePropertyById(long propertyId) {
		propertyRepository.findOne(propertyId);
	}

	@Override
	public List<Property> findAll() {
		return (List<Property>)propertyRepository.findAll();
	}

	@Override
	public void deleteProperty(long propertyId) {
		propertyRepository.delete(propertyId); 
	}

}
