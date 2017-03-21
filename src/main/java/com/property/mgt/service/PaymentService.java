package com.property.mgt.service;

import java.util.List;

import com.property.mgt.domain.Unit;
import com.property.mgt.domain.View;

public interface PaymentService {
	
	public void saveUnit(Payment payment);

	public void findOneUnitById(long propertyId);

	public List<Unit> findAll();
	
	public void deleteUnit(long propertyId);
	
	public List<View> findViewsByClientId(long clientId);
	
	public List<View> findViewsByUnitId(long unitId);

}
