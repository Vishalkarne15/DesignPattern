package com.dp.facade.menu.impl;

import java.util.ArrayList;
import java.util.List;

import com.dp.facade.intrfc.Menus;

public class VegMenu implements Menus {

	private int itemId;
	private String itemName;
	private double price;
	
	private List<Menus> menuList;
	
	public VegMenu() {
		
	}

	public VegMenu(int itemId, String itemName, double price) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
	}

	@Override
	public void setMenuList(List<Menus> menuList) {
		this.menuList = menuList;
	}
	
	@Override
	public List<Menus> printMenuList() {
		return this.menuList;
	}
	
	@Override
	public String toString() {
		return "VegMenu [itemId=" + itemId + ", itemName=" + itemName + ", price=" + price + ", menuList=" + menuList
				+ "]";
	}

}
