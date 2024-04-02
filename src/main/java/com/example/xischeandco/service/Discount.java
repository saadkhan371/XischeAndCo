package com.example.xischeandco.service;

import com.example.xischeandco.model.Bill;
import com.example.xischeandco.model.User;

// Interface representing a discount strategy
public interface Discount {
    double applyDiscount(User user, Bill bill); // Method to apply discount based on user and bill
}
