package gildedrose;

public class Conjured extends Item implements CustomItem{

    public Conjured(Item item) {
        super(item.name, item.sellIn, item.quality);
    }

    @Override
    public void update() {
        sellIn -= 1;
        if(quality == 0) return;
        quality -=2;
        if(sellIn < 0) {
            quality -= 2;
        }
        if(quality < 0) quality = 0;
    }


    @Override
    public int getQuality() {
        return quality;
    }

    @Override
    public int getSellIn() {
        return sellIn;
    }
}
