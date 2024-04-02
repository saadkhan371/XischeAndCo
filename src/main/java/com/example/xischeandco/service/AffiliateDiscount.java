package com.example.xischeandco.service;

import com.example.xischeandco.model.Bill;
import com.example.xischeandco.model.User;

// Concrete class for affiliate discount
public class AffiliateDiscount implements Discount {
    private static final double DISCOUNT_PERCENTAGE = 0.1; // 10% discount for affiliates

    @Override
    public double applyDiscount(User user, Bill bill) {
        if (user.isAffiliate() && !bill.isGrocery()) {
            return bill.getTotalAmount() * DISCOUNT_PERCENTAGE; // Apply discount if user is affiliate and bill doesn't contain groceries
        }
        return 0; // No discount otherwise
    }
}
