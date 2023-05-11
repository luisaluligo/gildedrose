package gildedrose;

public class AgedBrie extends Item implements CustomItem{

    public AgedBrie(Item item) {
        super(item.name, item.sellIn, item.quality);
    }

    @Override
    public void update() {
        sellIn -= 1;
        if(quality == 50) return;
        quality +=1;
        if(sellIn < 0 && quality < 50) {
            quality += 1;
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