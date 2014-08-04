package io.edocode.Inheritance;

import io.edocode.Color;

public abstract class Shape {
  protected String name;
  protected double area;
  protected Color color;

  public Shape() { }

  public double getArea() {
    return this.area;
  }

  public Color getColor() {
    return this.color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  protected abstract void setArea();

  public abstract String getInfo();
}
