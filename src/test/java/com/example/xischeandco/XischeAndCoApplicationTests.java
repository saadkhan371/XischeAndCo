package com.example.xischeandco;

import com.example.xischeandco.model.*;
import com.example.xischeandco.service.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class XischeAndCoApplicationTests {

	@Test
	void contextLoads() {
	}

		@Test
		public void testCalculateDiscount() {
//		1. If the user is an employee of the store, he gets a 30% discount
//		2. If the user is an affiliate of the store, he gets a 10% discount
//		3. If the user has been a customer for over 2 years, he gets a 5% discount.
//		4. For every $100 on the bill, there would be a $ 5 discount (e.g. for $ 990, you
//		get $ 45 as a discount).
//		5. The percentage based discounts do not apply on groceries.
//		6. A user can get only one of the percentage based discounts on a bill.
		User user = new User(true, false, new Date(System.currentTimeMillis() - 3 * 365 * 24 * 60 * 60 * 1000L));
		Bill bill = new Bill(1000, false);

		// Create a discount calculator with various discount strategies
		DiscountCalculator discountCalculator = new DiscountCalculator(new EmployeeDiscount(),
				new AffiliateDiscount(), new CustomerDiscount(), new AmountDiscount());

		// Calculate total discount and net payable amount
		double totalDiscount = discountCalculator.calculateDiscount(user, bill);
		double netPayableAmount = bill.getTotalAmount() - totalDiscount;

		// Assert the net payable amount after discount
		assertEquals(600, netPayableAmount, 0);
	}

}
