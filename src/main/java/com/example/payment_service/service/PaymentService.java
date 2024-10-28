package com.example.payment_service.service;

import com.example.payment_service.entity.Payment;
import com.example.payment_service.repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {
    @Autowired
    PaymentRepo paymentRepo;

    public Payment doPayment(){
        Payment payment=new Payment();
        payment.setTranscationId(UUID.randomUUID().toString());
        payment.setPaymentStatus(thirdPartypaymentApi());
        return paymentRepo.save(payment);
    }
    //3rd party api call
    public String thirdPartypaymentApi(){
        return new Random().nextBoolean()?"Success":"Fail";
    }
}
