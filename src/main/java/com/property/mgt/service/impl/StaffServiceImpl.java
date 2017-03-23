package com.property.mgt.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.property.mgt.domain.Client;
import com.property.mgt.domain.Contact;
import com.property.mgt.domain.Owner;
import com.property.mgt.domain.Person;
import com.property.mgt.domain.PersonOwner;
import com.property.mgt.domain.Staff;
import com.property.mgt.repository.StaffRepository;
import com.property.mgt.repository.StaffRepository;
import com.property.mgt.service.StaffService;
import com.property.mgt.service.StaffService;

@Service
@Transactional
public class StaffServiceImpl implements StaffService {
	
	@Autowired
	StaffRepository staffRepository;

	@Override
	public List<Staff> findAll() {
		return (List<Staff>)staffRepository.findAll();
	}
	

	
	@Override
	public void save(Staff staff) {
		staffRepository.save(staff);
	}



	@Override
	public Staff update(Staff staff) {
		
		return null;
	}



	@Override
	public Staff findOne(long id) {
		
		return staffRepository.findOne(id);
	}



	@Override
	public void delete(Staff staff) {
	
		staffRepository.delete(staff);
	}



	
	
  
}
