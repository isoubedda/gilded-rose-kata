package com.gildedrose;

public class ItemCategory {
    void incrementQualityIfIsNotMax(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    void decrementSellInByOne(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    void decrementQualityIfIsNotMin(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }

    void QualityZeroForSellNegative(Item item) {
        if (item.sellIn <= 0) {
            item.quality = 0;
        }
    }

    void incrementQualityByDays(Item item, int days) {
        if (item.sellIn <= days) {
            incrementQualityIfIsNotMax(item);
        }
    }

    void updateItemQuality(Item item) {
        decrementQualityIfIsNotMin(item);
        if (item.sellIn <= 0) {
            decrementQualityIfIsNotMin(item);
        }
    }

    void updateItemSellIn(Item item) {

        decrementSellInByOne(item);

    }

    void updateItem(Item item) {
        updateItemQuality(item);
        updateItemSellIn(item);

    }
}
