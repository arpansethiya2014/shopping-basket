package com.arpan.shopping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingBasketCalculator {

	public int calculateTotal(List<String> items) {
		Map<Item, Integer> itemCount = new HashMap<>();

		for (String name : items) {
			Item.fromName(name).ifPresent(item -> itemCount.put(item, itemCount.getOrDefault(item, 0) + 1));
		}

		int total = 0;

		for (Map.Entry<Item, Integer> entry : itemCount.entrySet()) {
			Item item = entry.getKey();
			int count = entry.getValue();
			int payable = count;

			if (item.hasOffer()) {
				int group = item.getOfferGroupSize();
				if (item == Item.MELON) {
					payable = (count / 2) + (count % 2);
				} else if (item == Item.LIME) {
					payable = (count / 3) * 2 + (count % 3);
				}
			}

			total += payable * item.getPriceInPence();
		}

		return total;
	}
}
