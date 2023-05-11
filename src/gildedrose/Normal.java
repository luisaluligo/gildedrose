package gildedrose;

public class Normal extends Item implements CustomItem {

    public Normal( Item item) {
        super(item.name, item.sellIn, item.quality);
    }

    @Override
    public void update() {
        sellIn -= 1;
        if(quality == 0) return;
        quality -=1;
        if(sellIn < 0 && quality > 0) {
            quality -= 1;
        }
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