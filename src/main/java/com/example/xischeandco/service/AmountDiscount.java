package com.example.xischeandco.service;

import com.example.xischeandco.model.Bill;
import com.example.xischeandco.model.User;

// Concrete class for amount discount
public class AmountDiscount implements Discount {
    private static final double DISCOUNT_PER_100_DOLLARS = 5; // $5 discount for every $100 on the bill

    @Override
    public double applyDiscount(User user, Bill bill) {
        double totalDiscount = Math.floor(bill.getTotalAmount() / 100) * DISCOUNT_PER_100_DOLLARS; // Calculate discount based on total amount
        // Ensure that the total discount does not exceed the total bill amount
        return Math.min(totalDiscount, bill.getTotalAmount());
    }
}
