package com.property.mgt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.property.mgt.domain.Unit;
import com.property.mgt.domain.View;
import com.property.mgt.repository.UnitRepository;
import com.property.mgt.repository.ViewRepository;
import com.property.mgt.service.UnitService;

@Service
@Transactional
public class UnitServiceImpl implements UnitService {
	
	@Autowired
	UnitRepository unitRepository;
	
//	@Autowired
	ViewRepository viewRepository;

	@Override
	public void saveUnit(Unit unit) {
		unitRepository.save(unit);
	}

	@Override
	public Unit findOneUnitById(long propertyId) {
		return unitRepository.findOne(propertyId);
	}

	@Override
	public List<Unit> findAll() {
		return (List<Unit>)unitRepository.findAll();
	}

	@Override
	public void deleteUnit(long propertyId) {
		unitRepository.delete(propertyId);
	}

	@Override
	public List<View> findViewsByClientId(long clientId) {
		return viewRepository.viewsByClientId(clientId);
	}

	@Override
	public List<View> findViewsByUnitId(long unitId) {
		return viewRepository.viewsByUnitId(unitId);
	}

}
