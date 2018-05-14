package com.unnathi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the shape for volume and area");
		String shapes = sc.next();
		if (shapes.equalsIgnoreCase("cube")) {
			System.out.println("Enter the value of a ");
			Double s = sc.nextDouble();
			Cube c = new Cube(s);
			System.out.println("Volume of the Cube" + c.volume());
			System.out.println("Area of the cube" + c.area());
		} else if (shapes.equalsIgnoreCase("cuboid"))

		{
			System.out.println("Enter the value of l");
			int s1 = sc.nextInt();
			System.out.println("Enter the value of h");
			int s2 = sc.nextInt();
			System.out.println("Enter the value of w");
			int s3 = sc.nextInt();
			Cuboid cu = new Cuboid(s1, s2, s3);
			System.out.println("Volume of the cuboid" + cu.volume());
			System.out.println("Area of the cube" + cu.area());
		} else if (shapes.equalsIgnoreCase("sphere"))

		{
			System.out.println("Enter the value of r");
			double s3 = sc.nextDouble();
			Sphere sp = new Sphere(s3);
			System.out.println("Volume of the sphere" + sp.volume());
			System.out.println("Area of the sphere" + sp.area());

		}
	}

}
