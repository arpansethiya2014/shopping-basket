package com.arpan;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.arpan.shopping.ShoppingBasketCalculator;

class ShoppingApplicationTests {

	private final ShoppingBasketCalculator calculator = new ShoppingBasketCalculator();

	@Test
	void testEmptyBasket() {
		assertEquals(0, calculator.calculateTotal(List.of()));
	}

	@Test
	void testApplesAndBananasOnly() {
		List<String> items = Arrays.asList("Apple", "Apple", "Banana");
		assertEquals(35 * 2 + 20, calculator.calculateTotal(items));
	}

	@Test
	void testMixedBasket() {
		List<String> items = Arrays.asList("Apple", "Banana", "Melon", "Melon", "Lime", "Lime", "Lime");
		int expected = 35 + 20 + 50 + 0 + (15 * 2); // BOGO melon, 3-for-2 lime
		assertEquals(expected, calculator.calculateTotal(items));
	}

	@Test
	void testInvalidItemIsIgnored() {
		List<String> items = Arrays.asList("Apple", "Chocolate");
		assertEquals(35, calculator.calculateTotal(items));
	}

	@Test
	void testMelon() {
		List<String> items = Arrays.asList("Melon", "Melon", "Melon");
		assertEquals(50 * 2, calculator.calculateTotal(items)); // 3 Melons = Pay for 2
	}

	@Test
	void testLimeThreeForTwo() {
		List<String> items = Arrays.asList("Lime", "Lime", "Lime", "Lime");
		assertEquals(15 * 3, calculator.calculateTotal(items)); // 4 Limes = Pay for 3
	}

}
