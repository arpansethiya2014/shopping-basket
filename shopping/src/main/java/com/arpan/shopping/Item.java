package com.arpan.shopping;

import java.util.Arrays;
import java.util.Optional;

public enum Item {
	
    APPLE("Apple", 35, false, 0),
    BANANA("Banana", 20, false, 0),
    MELON("Melon", 50, true, 2), 
    LIME("Lime", 15, true, 3);   

    private final String name;
    private final int priceInPence;
    private final boolean hasOffer;
    private final int offerGroupSize;

    Item(String name, int priceInPence, boolean hasOffer, int offerGroupSize) {
        this.name = name;
        this.priceInPence = priceInPence;
        this.hasOffer = hasOffer;
        this.offerGroupSize = offerGroupSize;
    }

    public int getPriceInPence() {
        return priceInPence;
    }

    public boolean hasOffer() {
        return hasOffer;
    }

    public int getOfferGroupSize() {
        return offerGroupSize;
    }

    public static Optional<Item> fromName(String name) {
        return Arrays.stream(values())
                .filter(i -> i.name.equalsIgnoreCase(name))
                .findFirst();
    }
}
