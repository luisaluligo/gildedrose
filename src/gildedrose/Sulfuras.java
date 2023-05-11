package gildedrose;

public class Sulfuras extends Item implements CustomItem{

    public Sulfuras(Item item) {
        super(item.name, item.sellIn, item.quality);
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
