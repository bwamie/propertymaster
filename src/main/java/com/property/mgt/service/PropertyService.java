package com.property.mgt.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.property.mgt.domain.Property;
import com.property.mgt.domain.PropertyStaff;

public interface PropertyService {
	
	public void saveProperty(Property property);
	
	public Property findOnePropertyById(long propertyId);

	public List<Property> findAll();
	
	public void deleteProperty(long propertyId);
	
	public List<PropertyStaff> findPropertiesByStaffId(long staffId);
	
	public List<PropertyStaff> findPropertiesByPropertyId(long propertyId);
	
	public List<Property> findAllBuildings();
}
