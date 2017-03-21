package com.property.mgt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.property.mgt.domain.PropertyStaff;
import com.property.mgt.domain.View;

@Repository
public interface ViewRepository extends CrudRepository<View, Long> {
	
	@Query("SELECT v FROM View v WHERE client.clientId =: clientId ")
	public List<View> viewsByClientId(@Param("clientId") long clientId);
	
	@Query("SELECT v FROM View v WHERE unit.unitId =: unitId ")
	public List<View> viewsByUnitId(@Param("unitId") long unitId);

}
