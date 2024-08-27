package com.neemroz.ecommerce.controller;

public class PaymentRequest {

    private Long cartId;
    private String paymentMethod;

    // Default constructor
    public PaymentRequest() {
    }

    // Parameterized constructor
    public PaymentRequest(Long cartId, String paymentMethod) {
        this.cartId = cartId;
        this.paymentMethod = paymentMethod;
    }

    // Getters and Setters
    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "PaymentRequest{" +
                "cartId=" + cartId +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
