package com.unnathi;

public class Sphere implements Shape {
	private double r;
	final double pie = 3.14;

	public Sphere(double r) {
		this.r = r;
	}

	public double volume() {
		// final double pie=3.14;
		double volume = (4 / 3) * 3.14 * r * r;
		//// System.out.println("Enter the value of r");
		return volume;
	}

	public double area() {
		double area = 4 * 3.14 * r * r;
		// System.out.println("Enter the value of r");
		return area;
	}
}
