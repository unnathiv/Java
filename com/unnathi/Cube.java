package com.unnathi;

public class Cube implements Shape {
	private Double s;
	
	public Cube(double s) {
		this.s=s;
	}
	
  public double volume() {
	 
	double volume = s*s*s;
	//System.out.println("Enter the value of s");
	return volume; 
  }	
  public double area() {
	  double area=6*s*s;
	 // System.out.println("Enter the value of s");
	  return area;
  }
}
