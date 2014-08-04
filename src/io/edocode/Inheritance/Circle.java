package io.edocode.Inheritance;

import io.edocode.Color;

public class Circle extends Shape {
  private double radius;
  private final double PI = 3.14;

  public Circle() { }

  public Circle(double radius, Color color) {
    this.radius = radius;
    this.setArea();
    this.name = "Circle";
  }

  public Circle(float height, float width) {
    this.setArea();
    this.name = "Circle";
  }

  protected void setArea() {
    this.area = PI * Math.pow(radius, 2.0);
  }

  public String getInfo() {
    StringBuilder sb = new StringBuilder();

    sb.append(
        String.format(
            "Shape: %s\n  Radius: %.2f\n  Area: %.2f\n  Color: %s", this.name, this.radius, this.area, this.color
        )
    );

    return sb.toString();
  }
}
