package io.edocode.Inheritance;

import io.edocode.Color;

public class Triangle extends Shape {
  private double base;
  private double height;

  public Triangle() { }

  public Triangle(double base, double height, Color color) {
    this.base = base;
    this.height = height;
    this.setArea();
    this.name = "Triangle";
  }

  public Triangle(double base, double height) {
    this.base = base;
    this.height = height;
    this.setArea();
    this.name = "Triangle";
  }

  protected void setArea() {
    this.area = (this.base * this.height) / 2.0;
  }

  public String getInfo() {
    StringBuilder sb = new StringBuilder();

    sb.append(
        String.format(
            "Shape: %s\n  Base: %.2f\n  Height: %.2f\n  Area: %.2f\n  Color: %s", this.name, this.base, this.height, this.area, this.color
        )
    );

    return sb.toString();
  }
}
