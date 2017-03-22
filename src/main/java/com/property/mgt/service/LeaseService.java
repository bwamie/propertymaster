package com.property.mgt.service;

import java.util.List;

import com.property.mgt.domain.Lease;
import com.property.mgt.domain.Unit;
import com.property.mgt.domain.View;

public interface LeaseService {
	public void saveLease(Lease lease);

	public Lease findOneLeaseById(long propertyId);

	public List<Lease> findAll();
	
	public void deleteLease(long leaseId);
	
	public List<Lease> findLeasesByClientId(long clientId);
	
	public List<Lease> findLeasesByUnitId(long unitId);
}
