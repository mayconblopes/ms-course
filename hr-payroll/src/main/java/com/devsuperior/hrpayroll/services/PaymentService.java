package com.devsuperior.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.devsuperior.hrpayroll.entities.Payment;

@Service
/*This annotation is to register the class as a Spring service*/
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("Mike", 200.00, days);
	}
}
