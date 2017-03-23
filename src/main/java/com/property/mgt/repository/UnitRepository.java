package com.property.mgt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.property.mgt.domain.Unit;

@Repository
public interface UnitRepository extends CrudRepository<Unit, Long> {

	
	@Query("SELECT v FROM Unit v WHERE property.propertyId =:propertyId ")
	public List<Unit> findUnitsByBuildingId(@Param("propertyId") long buildingId);

}
