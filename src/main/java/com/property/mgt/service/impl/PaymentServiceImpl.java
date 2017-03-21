package com.property.mgt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.property.mgt.domain.Payment;
import com.property.mgt.repository.PaymentRepository;
import com.property.mgt.service.PaymentService;

public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	PaymentRepository paymentRepository;
	

	@Override
	public void saveUnit(Payment payment) {
		paymentRepository.save(payment);
	}

	@Override
	public void findOnePaymentById(long paymentId) {
		paymentRepository.findOne(paymentId);
	}

	@Override
	public List<Payment> findAll() {
		return (List<Payment>) paymentRepository.findAll() ;
	}

	@Override
	public void deletePayment(long paymentId) {
		paymentRepository.delete(paymentId);
	}

	@Override
	public List<Payment> findPaymentByClientId(long clientId) {
		//return (List<Payment>) paymentRepository.findPaymentByClientId(clientId) ;
		return null;
	}

	@Override
	public List<Payment> findPaymentByUnitId(long unitId) {
		return (List<Payment>) paymentRepository.findPaymentByUnitId(unitId) ;
	}

}
