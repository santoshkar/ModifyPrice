package com.pricemodify;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * This program returns the number of modified prices for one or more items.
 * 
 * @author Santosh_Kar
 *
 */
public class ModifyPrice {
	
	public int verifyItems(String[] origItems, float[] origPrices, String[] items, float[] prices) {

		Map<String, Integer> originItemIndex = new HashMap<>(origItems.length);
		
		for(int i=0; i<origItems.length;i++){
			originItemIndex.put(origItems[i], i);
		}
		
		int changeCount = 0;
		
		String item;
		float originPrice;
		float price;
		for(int i=0; i<items.length; i++){
			item = items[i];
			if(originItemIndex.containsKey(item)){
				originPrice = origPrices[originItemIndex.get(item)];
				price = prices[i];
				
				if(originPrice != price){
					changeCount++;
				}
			}
		}
		
		
		
	    return changeCount;

	}
}
