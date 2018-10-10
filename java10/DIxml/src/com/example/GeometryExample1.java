package com.example;

public class GeometryExample1 {
	   private Shape shape;

	   /**
	    * Inject circle object via Constructor
	    */
	   public GeometryExample1(Shape shape) {
	      this.shape = shape;
	   }

	   public void drawShape() {
	      shape.draw();
	   }
	}
