package com.linkedin.mod4.challenges.one;

// It is part of a fictional legacy e-commerce application with a
// CheckoutController class that has a method processOrder that
// handles the checkout process, including calculating the total
// amount, applying discounts, and processing the payment.
// The method has grown too large and contains too much functionality.
// Refactor the method to make it more concise and easier to maintain.
// The actual implementation is left out for simplicity.
// The solution can also just contain comments in the extracted methods.

public class CheckoutController {
    final Order order;
    final MailService mailService;

    public CheckoutController(Order order, MailService mailService) {
        this.order = order;
        this.mailService = mailService;
    }

    public void processOrder() {
        OrderService.process(order);
        mailService.sendMail("", "Order processed", "Your order info:" + order);
        updateInventory();
    }

    public void updateInventory() {

    }
}

