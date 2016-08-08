package com.zmags.javachallenge;

import java.util.ArrayList;

/**
 * Created by karun on 24 Jul 2016
 */
public class Bag<T> {

	private ArrayList<T> items = new ArrayList<T>();

	// add items to Bag where item can be generic
	public void addBagItem(T item) {
		items.add(item);
	}

	// Remove item from Bag where item can be generic
	public void removeBagItem(T item) {
		items.remove(item);
	}

	// Remove all items from Bag where item can be generic
	public void removeAllBagItems() {
		items.clear();
	}

	// Check the Bag supports boolean
	public boolean isEmpty() {
		return (items.size() == 0);
	}

	// Get the size of the Bag
	public int getSize() {
		return items.size();
	}

	// and so..
}
