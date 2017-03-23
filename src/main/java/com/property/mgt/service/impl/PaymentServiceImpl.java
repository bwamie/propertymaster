package com.property.mgt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.property.mgt.domain.Payment;
import com.property.mgt.repository.PaymentRepository;
import com.property.mgt.service.PaymentService;
@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	PaymentRepository paymentRepository;
	

	@Override
	public void savePayment(Payment payment) {
		paymentRepository.save(payment);
	}

	@Override
	public Payment findOnePaymentById(long paymentId) {
		return paymentRepository.findOne(paymentId);
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
		return (List<Payment>) paymentRepository.findPaymentByClientId(clientId) ;
	}

	@Override
	public List<Payment> findPaymentByUnitId(long unitId) {
		return (List<Payment>) paymentRepository.findPaymentByUnitId(unitId) ;
	}

	@Override
	public List<Payment> findPaymentByLeaseId(long LeaseId) {
		return (List<Payment>) paymentRepository.findPaymentByLeaseId(LeaseId) ;
	}

}
