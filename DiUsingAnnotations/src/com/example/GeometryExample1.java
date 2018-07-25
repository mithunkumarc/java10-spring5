package com.example;

import org.springframework.beans.factory.annotation.Autowired;

public class GeometryExample1 {
	   private Shape shape;

	   /**
	    * Inject circle object via Constructor
	    */
	   @Autowired
	   public GeometryExample1(Shape shape) {
	      this.shape = shape;
	   }

	   public void drawShape() {
	      shape.draw();
	   }
	}
