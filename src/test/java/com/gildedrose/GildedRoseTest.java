package com.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.Test;



public class GildedRoseTest {

    @Test
    public void updateItems() throws Exception {

        String[] name ={"foo","Aged Brie","Backstage passes to a TAFKAL80ETC concert",
                "Sulfuras, Hand of Ragnaros","Sulfuras, Hand of Ragnaros"};
        Integer[] sellIn = {-1,0,6,11};
        Integer[] quality = {0,1,50,49};
        CombinationApprovals.verifyAllCombinations(this::toUpdateItems, name,sellIn,quality);

    }

    private Item toUpdateItems(String name, int sellIn, int quality) {
        Item[] items = new Item[] { new Item(name,sellIn,quality) };
        GildedRose app = new GildedRose(items);
        app.updateItems();
        return items[0];
    }

}