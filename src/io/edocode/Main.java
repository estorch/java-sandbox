package io.edocode;

import io.edocode.Inheritance.*;

public class Main {

    public static void main(String[] args) {
	    Shape rectangle1 = new Rectangle(10, 10, Color.BLUE);
      Shape square1 = new Square(5, Color.BLUE);
      Shape triangle1 = new Triangle(10, 10, Color.RED);
      Shape circle1 = new Circle(2, Color.RED);

      System.out.println(rectangle1.getInfo());
      System.out.println(square1.getInfo());
      System.out.println(triangle1.getInfo());
      System.out.println(circle1.getInfo());
    }
}
