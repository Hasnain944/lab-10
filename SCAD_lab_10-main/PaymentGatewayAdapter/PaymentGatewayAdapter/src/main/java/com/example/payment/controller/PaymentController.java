package com.example.payment.controller;

import com.example.payment.service.NewPaymentGateway;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    private final NewPaymentGateway paymentGateway;

    public PaymentController(NewPaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @PostMapping("/process")
    public String processPayment(@RequestParam String account, @RequestParam double amount) {
        return paymentGateway.processPayment(account, amount);
    }
}
