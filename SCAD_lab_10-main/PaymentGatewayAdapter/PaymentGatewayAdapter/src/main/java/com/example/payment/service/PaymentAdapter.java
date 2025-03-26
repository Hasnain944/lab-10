package com.example.payment.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentAdapter implements NewPaymentGateway {
    private final OldPaymentGateway oldPaymentGateway;

    public PaymentAdapter(OldPaymentGateway oldPaymentGateway) {
        this.oldPaymentGateway = oldPaymentGateway;
    }

    @Override
    public String processPayment(String account, double amount) {
        return oldPaymentGateway.payWithCard(account, amount);
    }
}
