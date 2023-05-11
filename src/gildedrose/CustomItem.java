package gildedrose;

public interface CustomItem {
    default void update(){

    }

    int getQuality();
    int getSellIn();
}
