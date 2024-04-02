package com.example.xischeandco.service;

import com.example.xischeandco.model.Bill;
import com.example.xischeandco.model.User;

// Concrete class for employee discount
public class EmployeeDiscount implements Discount {
    private static final double DISCOUNT_PERCENTAGE = 0.3; // 30% discount for employees

    @Override
    public double applyDiscount(User user, Bill bill) {
        if (user.isEmployee() && !bill.isGrocery()) {
            return bill.getTotalAmount() * DISCOUNT_PERCENTAGE; // Apply discount if user is employee and bill doesn't contain groceries
        }
        return 0; // No discount otherwise
    }
}
