public class Rectangle extends Shape {
  private double myLength;
  private double myHeight;

  public Rectangle(double x, double y) {
    myLength = x;
    myHeight = y;
  }

  public double getLength() {
    return myLength;
  }

  public double getHeight() {
    return myHeight;
  }

  public void setLength(double x) {
    myLength = x;
  }

  public void setHeight(double y) {
    myHeight = y;
  }

  public double findArea() {
    return myLength * myHeight;
  }

  public double findPerimeter() {
    return 2 * (myLength + myHeight);
  }

  public double findDiagonal() {
    return Math.sqrt((myLength * myLength) + (myHeight * myHeight));
  }
}
