package io.edocode.Inheritance;

import io.edocode.Color;

public class Square extends Shape {
  protected double side;

  public Square() { }

  public Square(float side, Color color) {
    this.side = side;
    this.setArea();
    this.name = "Square";
  }

  public Square(float side) {
    this.side = side;
    this.setArea();
    this.name = "Square";
  }

  public double getSide() {
    return this.side;
  }

  public void setSide(float height) {
    this.side = side;
  }

  protected void setArea() {
    this.area = Math.pow(this.side, 2.0);
  }

  public String getInfo() {
    StringBuilder sb = new StringBuilder();

    sb.append(
        String.format(
            "Shape: %s\n  Side: %.2f\n  Area: %.2f\n  Color: %s", this.name, this.side, this.area, this.color
        )
    );

    return sb.toString();
  }
}
