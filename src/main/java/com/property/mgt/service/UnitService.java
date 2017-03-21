package com.property.mgt.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.property.mgt.domain.Unit;
import com.property.mgt.domain.View;

public interface UnitService {

	public void saveUnit(Unit unit);

	public void findOneUnitById(long propertyId);

	public List<Unit> findAll();
	
	public void deleteUnit(long propertyId);
	
	public List<View> findViewsByClientId(long clientId);
	
	public List<View> findViewsByUnitId(long unitId);

}
