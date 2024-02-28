package com.dp.facade.client;

import com.dp.facade.hotelkeep.impl.HotelKeeperImplemention;
import com.dp.facade.intrfc.HotelKeeper;
import com.dp.facade.menu.impl.BothMenu;
import com.dp.facade.menu.impl.NonVegMenu;
import com.dp.facade.menu.impl.VegMenu;

public class MainClient {

	public static void main(String[] args) {
		HotelKeeper keeper = new HotelKeeperImplemention();
        
        VegMenu v = keeper.getVegMenu();
        v.printMenuList().forEach(vMenu -> System.out.println(vMenu));
        NonVegMenu nv = keeper.getNonVegMenu();
        nv.printMenuList().forEach(nvMenu -> System.out.println(nvMenu));
        BothMenu bm = keeper.getBothMenu();
        bm.printMenuList().forEach(vnvMenu -> System.out.println(vnvMenu));
	}

}
