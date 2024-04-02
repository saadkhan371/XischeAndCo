package com.example.xischeandco.service;

import com.example.xischeandco.model.Bill;
import com.example.xischeandco.model.User;

import java.util.Date;

// Concrete class for customer discount
public class CustomerDiscount implements Discount {
    private static final double DISCOUNT_PERCENTAGE = 0.05; // 5% discount for customers over 2 years

    @Override
    public double applyDiscount(User user, Bill bill) {
        // Apply discount if user has been a customer for over 2 years and bill doesn't contain groceries
        if (user.getCustomerSince() != null && !bill.isGrocery() && user.getCustomerSince().before(new Date(System.currentTimeMillis() - 2 * 365 * 24 * 60 * 60 * 1000L))) {
            return bill.getTotalAmount() * DISCOUNT_PERCENTAGE;
        }
        return 0; // No discount otherwise
    }
}
