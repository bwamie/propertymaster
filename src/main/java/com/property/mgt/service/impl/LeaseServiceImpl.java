package com.property.mgt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.property.mgt.domain.Lease;
import com.property.mgt.repository.LeaseRepository;
import com.property.mgt.service.LeaseService;

@Service
@Transactional
public class LeaseServiceImpl implements LeaseService {
	
	@Autowired
	LeaseRepository leaseRepository;

	@Override
	public void saveUnit(Lease lease) {
		leaseRepository.save(lease);
	}

	@Override
	public void findOneUnitById(long leaseId) {
		leaseRepository.findOne(leaseId);
	}

	@Override
	public List<Lease> findAll() {
		return (List<Lease>)leaseRepository.findAll();
	}

	@Override
	public void deleteLease(long leaseId) {
		leaseRepository.delete(leaseId);
	}

	@Override
	public List<Lease> findLeasesByClientId(long clientId) {
		return (List<Lease>)leaseRepository.findLeasesByClientId(clientId);
	}

	@Override
	public List<Lease> findLeasesByUnitId(long unitId) {
		//return (List<Lease>)leaseRepository.findLeasesByUnitId(unitId);
		return null;
	}

}
