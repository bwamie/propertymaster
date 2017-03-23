package com.property.mgt.service;

import java.util.List;

import com.property.mgt.domain.BusinessClient;

public interface BusinessClientService {

	List<BusinessClient> findAll();

	void save(BusinessClient businessClient);

}
