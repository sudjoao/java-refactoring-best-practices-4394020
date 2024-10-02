package com.linkedin.mod4.challenges.one;

public class OrderService {
    public static void process(Order order) {
        double totalAmount = order.calculateTotalAmount();
        double totalValue = order.applyDiscounts(totalAmount);
        order.processPayment(totalValue);
        order.updateOrderStatus(OrderStatusEnum.SUCCESS);

    }
}
