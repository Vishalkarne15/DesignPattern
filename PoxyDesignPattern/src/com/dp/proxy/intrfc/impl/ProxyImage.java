package com.dp.proxy.intrfc.impl;

import com.dp.proxy.intrfc.Image;

public class ProxyImage implements Image {
	
	private String fileName;
	private RealImage realImage;
	
	public ProxyImage(String fileName) {
		this.fileName=fileName;
	}

	@Override
	public void display() {
		if(realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}
	
	
}
