package com.property.mgt.service;

import java.util.List;

import com.property.mgt.domain.Owner;

public interface OwnerService {
	
	public void saveOwner(Owner owner);
	
	public void findOneOwnerById(long ownerId);

	public List<Owner> findAll();
	
	public void deleteOwner(long ownerId);
}
