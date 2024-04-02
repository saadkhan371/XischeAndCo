package com.example.xischeandco.service;

import com.example.xischeandco.model.Bill;
import com.example.xischeandco.model.User;

// DiscountCalculator class responsible for calculating total discount
public class DiscountCalculator {
    private final Discount[] discounts; // Array of discount strategies

    // Constructor to initialize DiscountCalculator with discount strategies
    public DiscountCalculator(Discount... discounts) {
        this.discounts = discounts;
    }

    // Method to calculate total discount based on user and bill
    public double calculateDiscount(User user, Bill bill) {
        double totalDiscount = 0; // Initialize total discount
        // Iterate through each discount strategy and apply discount
        for (Discount discount : discounts) {
            totalDiscount += discount.applyDiscount(user, bill); // Accumulate total discount
        }
        return totalDiscount; // Return total discount
    }
}
