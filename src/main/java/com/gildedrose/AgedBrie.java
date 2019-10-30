package com.gildedrose;

public class AgedBrie extends ItemCategory {
    void updateItemQuality(Item item) {

        incrementQualityIfIsNotMax(item);
        incrementQualityByDays(item, 0);

    }

}
