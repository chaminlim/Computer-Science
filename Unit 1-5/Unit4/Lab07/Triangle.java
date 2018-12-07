public class Triangle extends Shape {
  private double mySide;

  public Triangle(double x) {
    mySide = x;
  }

  public double getSide() {
    return mySide;
  }

  public void setSide(double x) {
    mySide = x;
  }

  public double findArea() {
    return (Math.sqrt(3) * mySide * mySide) / 4;
  }

  public double findPerimeter() {
    return 3 * mySide;
  }
}
