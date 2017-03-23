package com.property.mgt.service;

import java.util.List;

import com.property.mgt.domain.Client;
import com.property.mgt.domain.PersonClient;
import com.property.mgt.domain.Staff;

import com.property.mgt.domain.Staff;

public interface StaffService {

	
	List<Staff> findAll();	
    void save(Staff staff);
    Staff update(Staff staff);
    Staff findOne(long id);
    void delete(Staff staff);
    
   
	 

}
