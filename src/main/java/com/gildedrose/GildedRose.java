package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateItems() {
        for (Item item : items) {
            ItemCategory itemCategory = categoriser(item);
            itemCategory.updateItem(item);
        }
    }

    private ItemCategory categoriser(Item item) {
        switch (item.name) {
            case "Aged Brie":
                return new AgedBrie();
            case "Backstage passes to a TAFKAL80ETC concert":
                return new Backstage();
            case "Sulfuras, Hand of Ragnaros":
                return new Sulfuras();
            case "Conjured":
                return new Conjured();
        }

        return new ItemCategory();
    }

}