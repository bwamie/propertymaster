package com.property.mgt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.property.mgt.domain.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Long> {

	@Query("SELECT p FROM Payment p WHERE p.lease.client.clientId =:clientId ")
	List<Payment> findPaymentByClientId(@Param("clientId") long clientId);

	@Query("SELECT p FROM Payment p WHERE p.lease.unit.unitId =:unitId ")
	List<Payment> findPaymentByUnitId(@Param("unitId") long unitId);

	@Query("SELECT lp FROM Payment lp WHERE lp.lease.leaseId =:leaseId ")
	List<Payment> findPaymentByLeaseId(@Param("leaseId") long leaseId);

}
