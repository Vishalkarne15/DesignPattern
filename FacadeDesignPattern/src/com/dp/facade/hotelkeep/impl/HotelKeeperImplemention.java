package com.dp.facade.hotelkeep.impl;

import java.util.ArrayList;
import java.util.List;

import com.dp.facade.intrfc.HotelKeeper;
import com.dp.facade.intrfc.Menus;
import com.dp.facade.menu.impl.BothMenu;
import com.dp.facade.menu.impl.NonVegMenu;
import com.dp.facade.menu.impl.VegMenu;

public class HotelKeeperImplemention implements HotelKeeper {

	@Override
	public VegMenu getVegMenu() {
		List<Menus> vegMenuList = new ArrayList<>();
		vegMenuList.add(new VegMenu(1, "Paneer Tikka Masala", 350.00));
		
		VegMenu vMenu = new VegMenu();
		vMenu.setMenuList(vegMenuList);
		return vMenu;
	}

	@Override
	public NonVegMenu getNonVegMenu() {
		List<Menus> nonVegMenuList = new ArrayList<>();
		nonVegMenuList.add(new NonVegMenu(1, "Chicken Tikka Masala", 450.00));
		
		NonVegMenu nVegMenu = new NonVegMenu();
		nVegMenu.setMenuList(nonVegMenuList);
		return nVegMenu;
	}

	@Override
	public BothMenu getBothMenu() {
		List<Menus> bothMenuList = new ArrayList<>();
		bothMenuList.add(new BothMenu(1, "Paneer Tikka Masala", 350.00));
		bothMenuList.add(new BothMenu(2, "Chicken Tikka Masala", 450.00));
		
		BothMenu bMenu = new BothMenu();
		bMenu.setMenuList(bothMenuList);
		return bMenu;
		
	}

}
