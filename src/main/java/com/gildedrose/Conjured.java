package com.gildedrose;

public class Conjured extends ItemCategory {
    void updateItemQuality(Item item) {

        decrementQualityIfIsNotMin(item);
        decrementQualityIfIsNotMin(item);
        if (item.sellIn < 0) {
            decrementQualityIfIsNotMin(item);
            decrementQualityIfIsNotMin(item);
        }
    }

}
