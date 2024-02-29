package com.dp.proxy.client;

import com.dp.proxy.intrfc.Image;
import com.dp.proxy.intrfc.impl.ProxyImage;

public class MainClient {

	public static void main(String[] args) {
        Image image = new ProxyImage("example.jpg");
        image.display();
        image.display();
    }

}
