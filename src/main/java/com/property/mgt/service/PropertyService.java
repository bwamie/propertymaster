package com.property.mgt.service;

import java.util.List;

import com.property.mgt.domain.Property;

public interface PropertyService {
	
	public void saveProperty(Property property);
	
	public void findOnePropertyById(long propertyId);

	public List<Property> findAll();
	
	public void deleteProperty(long propertyId);
}
