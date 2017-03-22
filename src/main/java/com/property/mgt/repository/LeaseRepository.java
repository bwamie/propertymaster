package com.property.mgt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.property.mgt.domain.Lease;

@Repository
public interface LeaseRepository extends CrudRepository<Lease, Long> {

	@Query("SELECT l FROM Lease l WHERE l.client.clientId =:clientId ")
	List<Lease> findLeasesByClientId(long clientId);

//	@Query("SELECT l FROM Lease l WHERE l.unit.unitId =:unitId ")
//	List<Lease> findLeasesByUnitId(long unitId); 

}
