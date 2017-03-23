package com.property.mgt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.property.mgt.domain.Client;
import com.property.mgt.domain.Staff;

@Repository
public interface StaffRepository extends CrudRepository<Staff, Long> {

}
