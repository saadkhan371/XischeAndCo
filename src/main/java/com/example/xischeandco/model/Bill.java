package com.example.xischeandco.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

// Bill class representing a bill on the retail website
@Getter
@Setter
@AllArgsConstructor
public class Bill {
    private double totalAmount; // Total amount of the bill
    private boolean isGrocery; // Flag indicating if the bill contains groceries
}
