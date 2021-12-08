package com.inheritance;

public class Desktop extends Computer {
	public void desktopSize() {
System.out.println("15.6");
	}
public static void main(String[] args) {
	Desktop d = new Desktop();
	d.computerModel();
	d.desktopSize();
}
}
