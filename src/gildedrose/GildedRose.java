package gildedrose;

public class GildedRose {

    CustomItem[] items;

    public GildedRose(Item[] items) {
        this.items = new CustomItem[items.length];
        for (int i = 0; i < items.length; i++) {
            switch (items[i].name) {
                case "normal":
                    this.items[i] = new Normal(items[i]);
                    break;
                case "Aged Brie":
                    this.items[i] = new AgedBrie(items[i]);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    this.items[i] = new Backstage(items[i]);
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    this.items[i] = new Sulfuras(items[i]);
                    break;
                default:
                    this.items[i] = new Normal(items[i]);
            }

        }
    }

    public void updateQuality() {
        for (CustomItem item : items) {
            item.update();
        }
    }

    public static void main(String[] args) {
        Item[] items = new Item[1];
        items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 5);
        GildedRose instance = new GildedRose(items);
        instance.updateQuality();
    }
}
