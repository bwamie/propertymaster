package com.property.mgt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.property.mgt.domain.Owner;
import com.property.mgt.repository.OwnerRepository;
import com.property.mgt.service.OwnerService;

@Service
@Transactional
public class OwnerServiceImpl implements OwnerService {
	
	@Autowired
	OwnerRepository ownerRepository;

	@Override
	public void saveOwner(Owner owner) {
		ownerRepository.save(owner);
	}

	@Override
	public void findOneOwnerById(long ownerId) {
		ownerRepository.findOne(ownerId);
	}

	@Override
	public List<Owner> findAll() {
		return (List<Owner>)ownerRepository.findAll();
	}

	@Override
	public void deleteOwner(long ownerId) {
		ownerRepository.delete(ownerId); 
	}

}
