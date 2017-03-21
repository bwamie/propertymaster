package com.property.mgt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.property.mgt.domain.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Long> {

//	@Query("SELECT lp FROM Payment p WHERE p.client.clientId =: clientId ")
//	List<Payment> findPaymentByClientId(long clientId);

	@Query("SELECT p FROM Payment p WHERE lp.unit.unitId =: unitId ")
	List<Payment> findPaymentByUnitId(long unitId);

}
