package com.dp.proxy.intrfc.impl;

import com.dp.proxy.intrfc.Image;

public class RealImage implements Image {
	private String fileName;
	
	public RealImage(String fileName) {
        this.fileName = fileName;
        loadImageFromDisk();
    }

	public void loadImageFromDisk() {
		System.out.println("Loading image: " + fileName);
	}

	@Override
	public void display() {
		System.out.println("Displaying image: " + fileName);
	}

}
