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
        if(item.name.equals("Aged Brie")){
            return new AgedBrie();
        }
        if(item.name.equals("Backstage passes to a TAFKAL80ETC concert")){
            return new Backstage();
        }
        if(item.name.equals("Sulfuras, Hand of Ragnaros")){
            return new Sulfuras();
        }
        if(item.name.equals("Conjured")){
            return new Conjured();
        }

        return new ItemCategory();
    }

}