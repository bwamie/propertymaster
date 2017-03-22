package com.property.mgt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.property.mgt.domain.PropertyStaff;

@Repository
public interface PropertyStaffRepository extends CrudRepository<PropertyStaff, Long> {
	
	@Query("SELECT ps FROM PropertyStaff ps WHERE staff.staffId =:staffId ")
	public List<PropertyStaff> findPropertiesByStaffId(@Param("staffId") long staffId);
	
	@Query("SELECT ps FROM PropertyStaff ps WHERE property.propertyId =:propertyId ")
	public List<PropertyStaff> findPropertiesByPropertyId(@Param("propertyId") long propertyId);

}
