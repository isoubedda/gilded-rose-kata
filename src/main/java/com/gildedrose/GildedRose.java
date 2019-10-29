package com.gildedrose;

class GildedRose {
    Item[] items;
    public GildedRose(Item[] items) {
        this.items = items;
    }
    public void updateItems() {
        for (Item item : items) {
            updateItem(item);
        }
    }

    private void updateItem(Item item) {
        updateItemQuality(item);
        updateItemSellIn(item);

    }

    private void updateItemSellIn(Item item) {
        if(item.name.equals("Sulfuras, Hand of Ragnaros")){

        }else{
            decrementSellInByOne(item);
        }
    }

    private void updateItemQuality(Item item) {
        switch (item.name) {
            case "Aged Brie":
                incrementQualityIfIsNotMax(item);
                if (item.sellIn <= 0) {
                    incrementQualityIfIsNotMax(item);
                }
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                incrementQualityIfIsNotMax(item);
                if (item.sellIn < 11) {
                    incrementQualityIfIsNotMax(item);
                }
                if (item.sellIn < 6) {
                    incrementQualityIfIsNotMax(item);
                }
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

    private void QualityZeroIfSellZeroOrLower(Item item) {
        if (item.sellIn <= 0) {
            item.quality = 0;
        }
    }

    private void decrementQualityIfIsNotMin(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }

    private void decrementSellInByOne(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    private void incrementQualityIfIsNotMax(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

}