package com.gildedrose;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

public class GildedRoseTest {

	  @Test
	    public void updateQuality() {
	        Item[] items = new Item[] { new Item("foo", 0, 0) };
	        GildedRose app = new GildedRose(items);
	        app.updateQuality();
	        assertEquals("foo", app.items[0].name);
	    }
	  
	  
	  @Test
	  public void agelBrie() {
		  Item aged= new AgedBrie(2, 10);
		  aged.doUpdateQuality();
		  assertEquals("Aged Brie", aged.name);
		  assertNotEquals(aged.quality,10);
	  }
	  
	  @Test
	  public void backstagePass() {
		  Item back= new BackstagePass(1, 1);
		  back.doUpdateQuality();
		  assertNotEquals("Aged Brie", back.name);
	  }
	  	  
	  

}
