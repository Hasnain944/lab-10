package com.example.payment.service;

import org.springframework.stereotype.Service;

@Service
public class OldPaymentGateway {
    public String payWithCard(String cardNumber, double amount) {
        return "Payment of $" + amount + " processed using card: " + cardNumber;
    }
}
