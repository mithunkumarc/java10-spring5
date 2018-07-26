package com.example;

public class Circle implements Shape {
	int x;
	int y;
	
	public Circle(int x, int y) {
		this.x = x;
		this.y = y;
	}
   		
	@Override
   public void draw() {
      System.out.println("circle drawn, co-ordinates are "+x+":"+y);
   }
}
