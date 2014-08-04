package io.edocode.Inheritance;

import io.edocode.Color;

public class Rectangle extends Shape {
  protected double height;
  protected double width;

  public Rectangle() { }

  public Rectangle(float height, float width, Color color) {
    this.height = height;
    this.width = width;
    this.setArea();
    this.name = "Rectangle";
  }

  public Rectangle(float height, float width) {
    this.height = height;
    this.width = width;
    this.setArea();
    this.name = "Rectangle";
  }

  public double getHeight() {
    return this.height;
  }

  public double getWidth() {
    return this.width;
  }

  public void setHeight(float height) {
    this.height = height;
  }

  public void setWidth(float width) {
    this.width = width;
  }

  protected void setArea() {
    this.area = this.height * this.width;
  }

  public String getInfo() {
    StringBuilder sb = new StringBuilder();

    sb.append(
        String.format(
            "Shape: %s\n  Height: %.2f\n  Width: %.2f\n  Area: %.2f\n  Color: %s", this.name, this.height, this.width, this.area, this.color
        )
    );

    return sb.toString();
  }
}
