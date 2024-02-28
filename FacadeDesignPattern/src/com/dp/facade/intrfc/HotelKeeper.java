package com.dp.facade.intrfc;

import java.util.List;

import com.dp.facade.menu.impl.BothMenu;
import com.dp.facade.menu.impl.NonVegMenu;
import com.dp.facade.menu.impl.VegMenu;

public interface HotelKeeper {
	public VegMenu getVegMenu();
	public NonVegMenu getNonVegMenu();
	public BothMenu getBothMenu();
}
