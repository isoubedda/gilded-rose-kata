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

    void QualityZeroIfSellZeroOrLower(Item item) {
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
        switch (item.name) {
            case "Aged Brie":
                incrementQualityIfIsNotMax(item);
                incrementQualityByDays(item, 0);
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                incrementQualityIfIsNotMax(item);
                incrementQualityByDays(item, 10);
                incrementQualityByDays(item, 5);
                QualityZeroIfSellZeroOrLower(item);
                break;
            case "Conjured":
                decrementQualityIfIsNotMin(item);
                decrementQualityIfIsNotMin(item);
                if (item.sellIn < 0) {
                    decrementQualityIfIsNotMin(item);
                    decrementQualityIfIsNotMin(item);
                }
                break;
            case "Sulfuras, Hand of Ragnaros":

                break;
            default:
                decrementQualityIfIsNotMin(item);
                if (item.sellIn <= 0) {
                    decrementQualityIfIsNotMin(item);
                }

                break;
        }
    }

    void updateItemSellIn(Item item) {
        if(item.name.equals("Sulfuras, Hand of Ragnaros")){

        }else{
            decrementSellInByOne(item);
        }
    }

    void updateItem(Item item) {
        updateItemQuality(item);
        updateItemSellIn(item);

    }
}
