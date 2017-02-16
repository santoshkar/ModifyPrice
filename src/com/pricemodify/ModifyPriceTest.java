package com.pricemodify;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * 
 * 
 * @author Santosh_Kar
 *
 */
public class ModifyPriceTest {
	
	private String[] origItems;
	private float[] origPrices;
	
	@Before
	public void init(){
		origItems = new String[]{"rice","dal","oil"};
		origPrices = new float[]{10.25f, 20.45f,18.11f};
	}
	
	@Test
	public void testVerifyItems1() {
		
		int count = 0;
		
		String[] items = {"rice","dal","oil"};
		float[] prices = {10.25f, 20.45f, 18.11f};
		
		ModifyPrice obj = new ModifyPrice();
		count = obj.verifyItems(origItems, origPrices, items, prices);
		Assert.assertSame(count,0);
		
	}
	
	@Test
	public void testVerifyItems2() {
		
		int count = 0;
		
		String[] items = {"rice","dal","oil"};
		float[] prices = {12.25f, 20.45f, 18.11f};
		
		ModifyPrice obj = new ModifyPrice();
		count = obj.verifyItems(origItems, origPrices, items, prices);
		Assert.assertSame(count,1);
		
	}
	
	@Test
	public void testVerifyItems3() {
		
		int count = 0;
		
		String[] items = {"rice","dal","oil"};
		float[] prices = {12.25f, 20.45f, 20.11f};
		
		ModifyPrice obj = new ModifyPrice();
		count = obj.verifyItems(origItems, origPrices, items, prices);
		Assert.assertSame(count,2);
		
	}
	
	@Test
	public void testVerifyItems4() {
		
		int count = 0;
		
		String[] items = {"rice","dal","oil"};
		float[] prices = {10.25f, 28.45f, 23.21f};
		
		ModifyPrice obj = new ModifyPrice();
		count = obj.verifyItems(origItems, origPrices, items, prices);
		Assert.assertSame(count,2);
		
	}
	
	@Test
	public void testVerifyItems5() {
		
		int count = 0;
		
		String[] items = {"rice","dal","oil"};
		float[] prices = {13.25f, 21.4f, 23.21f};
		
		ModifyPrice obj = new ModifyPrice();
		count = obj.verifyItems(origItems, origPrices, items, prices);
		Assert.assertSame(count,3);
		
	}
	
	@Test
	public void testVerifyItems6() {
		
		int count = 0;
		
		String[] items = {"rice","oil"};
		float[] prices = {13.25f, 18.11f};
		
		ModifyPrice obj = new ModifyPrice();
		count = obj.verifyItems(origItems, origPrices, items, prices);
		Assert.assertSame(count,1);
		
	}
	
	@Test
	public void testVerifyItems7() {
		
		int count = 0;
		
		String[] items = {"oil"};
		float[] prices = {18.11f};
		
		ModifyPrice obj = new ModifyPrice();
		count = obj.verifyItems(origItems, origPrices, items, prices);
		Assert.assertSame(count,0);
		
	}
	
	@Test
	public void testVerifyItems8() {
		
		int count = 0;
		
		String[] items = {"oil"};
		float[] prices = {21.11f};
		
		ModifyPrice obj = new ModifyPrice();
		count = obj.verifyItems(origItems, origPrices, items, prices);
		Assert.assertSame(count,1);
		
	}
}
