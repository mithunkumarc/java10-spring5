package com.example;

public class GeometryExample2 {
	   private Shape shape;

	   /**
	    * Inject Rectangle object via Setter method
	    */
	   public void setGeometry(Shape shape) {
	      this.shape = shape;
	   }

	   public void drawShape() {
	      shape.draw();
	   }
	}

