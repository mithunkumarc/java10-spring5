package com.example;

import org.springframework.beans.factory.annotation.Autowired;

public class GeometryExample2 {
	   private Shape shape;

	   /**
	    * Inject Rectangle object via Setter method
	    */
	   @Autowired
	   public void setGeometry(Shape shape) {
	      this.shape = shape;
	   }

	   public void drawShape() {
	      shape.draw();
	   }
	}

