package com.neemroz.ecommerce.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @PostMapping
    public String processPayment(@RequestBody com.neemroz.ecommerce.controller.PaymentRequest paymentRequest) {
        // Payment processing logic
        System.out.println("Processing payment for: " + paymentRequest);

        // Here, you would typically call a service to handle the payment processing
        // For example:
        // paymentService.processPayment(paymentRequest);

        return "Payment successful";
    }
}
