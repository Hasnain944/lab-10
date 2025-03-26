package com.example.payment.service;

public interface NewPaymentGateway {
    String processPayment(String account, double amount);
}
