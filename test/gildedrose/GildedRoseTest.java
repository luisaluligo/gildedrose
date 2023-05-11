package gildedrose;

import org.junit.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GildedRoseTest {

    public GildedRoseTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of updateQuality method, of class GildedRose.
     */
    @Test
    public void testUpdateQualityNormal() {
        Item[] items = new Item[1];
        items[0] = new Item("normal", 8, 5);
        GildedRose instance = new GildedRose(items);
        instance.updateQuality();
        assertEquals(4, instance.items[0].getQuality());
        assertEquals(7, instance.items[0].getSellIn());
    }

    @Test
    public void testUpdateQualityNormalExpired() {
        Item[] items = new Item[1];
        items[0] = new Item("normal", 0, 5);
        GildedRose instance = new GildedRose(items);
        instance.updateQuality();
        assertEquals(3, instance.items[0].getQuality());
        assertEquals(-1, instance.items[0].getSellIn());
    }

    @Test
    public void testUpdateQualityNormalZeroQuality() {
        Item[] items = new Item[1];
        items[0] = new Item("normal", 4, 0);
        GildedRose instance = new GildedRose(items);
        instance.updateQuality();
        assertEquals(0, instance.items[0].getQuality());
        assertEquals(3, instance.items[0].getSellIn());
    }

    @Test
    public void testUpdateQualityNormalExpiredZeroQuality() {
        Item[] items = new Item[1];
        items[0] = new Item("normal", 0, 1);
        GildedRose instance = new GildedRose(items);
        instance.updateQuality();
        assertEquals(0, instance.items[0].getQuality());
        assertEquals(-1, instance.items[0].getSellIn());
    }

    @Test
    public void testUpdateQualityAgedBrie() {
        Item[] items = new Item[1];
        items[0] = new Item("Aged Brie", 8, 5);
        GildedRose instance = new GildedRose(items);
        instance.updateQuality();
        assertEquals(6, instance.items[0].getQuality());
        assertEquals(7, instance.items[0].getSellIn());
    }

    @Test
    public void testUpdateQualityAgedBrieExpired() {
        Item[] items = new Item[1];
        items[0] = new Item("Aged Brie", 0, 5);
        GildedRose instance = new GildedRose(items);
        instance.updateQuality();
        assertEquals(7, instance.items[0].getQuality());
        assertEquals(-1, instance.items[0].getSellIn());
    }

    @Test
    public void testUpdateQualityAgedBrieMaxQuality() {
        Item[] items = new Item[1];
        items[0] = new Item("Aged Brie", 4, 50);
        GildedRose instance = new GildedRose(items);
        instance.updateQuality();
        assertEquals(50, instance.items[0].getQuality());
        assertEquals(3, instance.items[0].getSellIn());
    }

    @Test
    public void testUpdateQualityAgedBrieExpiredMaxQuality() {
        Item[] items = new Item[1];
        items[0] = new Item("Aged Brie", 0, 49);
        GildedRose instance = new GildedRose(items);
        instance.updateQuality();
        assertEquals(50, instance.items[0].getQuality());
        assertEquals(-1, instance.items[0].getSellIn());
    }

    @Test
    public void testUpdateQualityBackstage() {
        Item[] items = new Item[1];
        items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 5);
        GildedRose instance = new GildedRose(items);
        instance.updateQuality();
        assertEquals(6, instance.items[0].getQuality());
        assertEquals(14, instance.items[0].getSellIn());
    }
    @Test
    public void testUpdateQualityBackstage10Days() {
        Item[] items = new Item[1];
        items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 5);
        GildedRose instance = new GildedRose(items);
        instance.updateQuality();
        assertEquals(7, instance.items[0].getQuality());
        assertEquals(9, instance.items[0].getSellIn());
    }
    @Test
    public void testUpdateQualityBackstage5Days() {
        Item[] items = new Item[1];
        items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 5);
        GildedRose instance = new GildedRose(items);
        instance.updateQuality();
        assertEquals(8, instance.items[0].getQuality());
        assertEquals(4, instance.items[0].getSellIn());
    }
    @Test
    public void testUpdateQualityBackstageMaxQuality() {
        Item[] items = new Item[1];
        items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 50);
        GildedRose instance = new GildedRose(items);
        instance.updateQuality();
        assertEquals(50, instance.items[0].getQuality());
        assertEquals(14, instance.items[0].getSellIn());
    }
    @Test
    public void testUpdateQualityBackstage10DaysMaxQuality() {
        Item[] items = new Item[1];
        items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49);
        GildedRose instance = new GildedRose(items);
        instance.updateQuality();
        assertEquals(50, instance.items[0].getQuality());
        assertEquals(9, instance.items[0].getSellIn());
    }
    @Test
    public void testUpdateQualityBackstage5DaysMaxQuality() {
        Item[] items = new Item[1];
        items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 48);
        GildedRose instance = new GildedRose(items);
        instance.updateQuality();
        assertEquals(50, instance.items[0].getQuality());
        assertEquals(4, instance.items[0].getSellIn());
    }

    @Test
    public void testUpdateQualityBackstageExpired() {
        Item[] items = new Item[1];
        items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 50);
        GildedRose instance = new GildedRose(items);
        instance.updateQuality();
        assertEquals(0, instance.items[0].getQuality());
        assertEquals(-1, instance.items[0].getSellIn());
    }

    @Test
    public void testUpdateQualitySulfuras(){
        Item[] items = new Item[1];
        items[0] = new Item("Sulfuras, Hand of Ragnaros", 20, 80);
        GildedRose instance = new GildedRose(items);
        instance.updateQuality();
        assertEquals(80, instance.items[0].getQuality());
        assertEquals(20, instance.items[0].getSellIn());
    }

}
