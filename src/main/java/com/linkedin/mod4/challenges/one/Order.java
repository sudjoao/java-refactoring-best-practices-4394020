package com.linkedin.mod4.challenges.one;

public interface Order {

    // calculate the total amount
    // apply any discounts
    // process the payment
    // send confirmation emails
    // update the inventory
    // update the order status

    double calculateTotalAmount();

    double applyDiscounts(double amount);

    void processPayment(double value);

    void updateOrderStatus(OrderStatusEnum status);
}
