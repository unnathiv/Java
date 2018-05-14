package com.unnathi;

public class Cuboid implements Shape {
	private int l, w, h;

	public Cuboid(int l, int w, int h) {
		this.l = l;
		this.w = w;
		this.h = h;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		double volume = l * w * h;
		// System.out.println("Enter the value of l,w,h");
		return volume;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		double area = l * w + l * h + h * w;
		// System.out.println("Enter the values of l,h,w");
		return area;
	}
}
