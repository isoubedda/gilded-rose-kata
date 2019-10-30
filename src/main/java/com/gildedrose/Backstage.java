package com.gildedrose;

public class Backstage extends ItemCategory {
    void updateItemQuality(Item item) {

        incrementQualityIfIsNotMax(item);
        incrementQualityByDays(item, 10);
        incrementQualityByDays(item, 5);
        QualityZeroIfSellZeroOrLower(item);

    }

}
