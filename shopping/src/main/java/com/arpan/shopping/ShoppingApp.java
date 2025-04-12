package com.arpan.shopping;


import java.util.Arrays;
import java.util.List;

public class ShoppingApp {
	public static void main(String[] args) {
		List<String> basket = Arrays.asList("Apple", "Apple", "Banana", "Melon", "Melon", "Melon", "Lime", "Lime", "Lime", "Lime");

		ShoppingBasketCalculator calculator = new ShoppingBasketCalculator();
		int total = calculator.calculateTotal(basket);
		System.out.printf("Total: " + total / 100.0);
	}
}
