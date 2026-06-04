package entities;

public class Rectangle {
  public double width;
  public double height;

  public double area() {
    return width * height;
  }

  public double perimeter() {
    return 2.0 * (width + height);
  }

  public double diagonal() {
    return Math.sqrt(width * width + height * height);
  }

  @Override
  public String toString() {
    return "Area: " + String.format("%.2f", area())
        + "\nPerimeter: " + String.format("%.2f", perimeter())
        + "\nDiagonal: " + String.format("%.2f", diagonal());
  }
}

