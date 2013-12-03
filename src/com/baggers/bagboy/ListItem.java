package com.baggers.bagboy;

public class ListItem {
	private String name;
	private String category;
	private String aisle;
	
	public ListItem(String name, String cat, String aisle)
	{
		this.name = name;
		this.category = cat;
		this.aisle = aisle;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public String getAisle() {
		return aisle;
	}
}
