package com.property.mgt.service;

import java.util.List;

import com.property.mgt.domain.Payment;
import com.property.mgt.domain.Unit;
import com.property.mgt.domain.View;

public interface PaymentService {
	
	public void savePayment(Payment payment);

	public Payment findOnePaymentById(long paymentId);

	public List<Payment> findAll();
	
	public void deletePayment(long paymentId);
	
	public List<Payment> findPaymentByClientId(long clientId);
	
	public List<Payment> findPaymentByUnitId(long unitId);
	
	public List<Payment> findPaymentByLeaseId(long unitId);

}
