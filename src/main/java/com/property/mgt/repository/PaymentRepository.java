package com.property.mgt.repository;

import org.springframework.data.repository.CrudRepository;

import com.property.mgt.domain.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Long> {

}
