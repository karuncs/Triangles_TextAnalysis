package com.zmags.javachallenge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Created by karun on 24 Jul 2016
 */
public class BagsTest {

	Bag<String> fruits = new Bag<String>();

	@Test
	public void isEmpty() throws Exception {
		assertTrue("add", fruits.isEmpty());
	}

	@Test
	public void addString() throws Exception {

		fruits.addBagItem("Apple");
		fruits.addBagItem("orange");
		fruits.addBagItem("pears");
		assertEquals("add", 3, fruits.getSize());
	}

	@Test
	public void removeNumbers() throws Exception {
		Bag<Integer> numbers = new Bag<Integer>();
		numbers.addBagItem(100);
		numbers.addBagItem(100);
		numbers.addBagItem(100);
		numbers.addBagItem(2000);
		numbers.addBagItem(-23);
		assertEquals("add", 5, numbers.getSize());
		numbers.removeBagItem(201);
		assertEquals("add", 5, numbers.getSize());
		numbers.removeAllBagItems();
		assertEquals("add", 0, numbers.getSize());
	}

}
