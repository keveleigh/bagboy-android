package com.baggers.bagboy;

public class ListItem {
	private String name;
	private int aisle;
	
	public ListItem(String name)
	{
		this.name = name;
		this.aisle = ListManager.loadAislesFromProductName(name);
	}

	public String getName() {
		return name;
	}

	public int getAisle() {
		return aisle;
	}
	
	@Override
	public String toString()
	{
		return name + "   -   Aisle " + Integer.toString(aisle);
	}
}
