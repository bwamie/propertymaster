package com.property.mgt.service;

import java.util.List;

import com.property.mgt.domain.Unit;

public interface UnitService {

	public void saveUnit(Unit unit);

	public void findOneUnitById(long propertyId);

	public List<Unit> findAll();
	
	public void deleteUnit(long propertyId);

}
