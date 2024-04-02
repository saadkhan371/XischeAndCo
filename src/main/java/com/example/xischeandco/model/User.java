package com.example.xischeandco.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private boolean isEmployee; // Flag indicating if the user is an employee
    private boolean isAffiliate; // Flag indicating if the user is an affiliate
    private Date customerSince; // Date since the user has been a customer
}
