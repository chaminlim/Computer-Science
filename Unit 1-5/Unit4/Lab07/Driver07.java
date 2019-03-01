
//Name: Chamin Lim, Date: 4/9/18
import java.io.*;

public class Driver07 {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(new FileOutputStream("output.txt")));

        Shape[] arr = new Shape[(int) (Math.random() * 50 + 10)];
        for (int x = 0; x < arr.length; x++) {
            double ranNum = Math.random() * 100;
            switch ((int) (Math.random() * 4)) {
            case 0:
                arr[x] = new Circle(ranNum);
                break;
            case 1:
                arr[x] = new Rectangle(ranNum, Math.random() * 100);
                break;
            case 2:
                arr[x] = new Triangle(ranNum);
                break;
            case 3:
                arr[x] = new Square(ranNum);
                break;
            }
        }

        System.out.println("Shape");
        System.out.println("------");
        double perimeter = 0;
        for (int k = 0; k < arr.length; k++) {
            double area = arr[k].findArea();
            if (arr[k] instanceof Circle)
                perimeter = ((Circle) arr[k]).findCircumference();
            if (arr[k] instanceof Rectangle)
                perimeter = ((Rectangle) arr[k]).findPerimeter();
            if (arr[k] instanceof Square)
                perimeter = ((Square) arr[k]).findPerimeter();
            if (arr[k] instanceof Triangle)
                perimeter = ((Triangle) arr[k]).findPerimeter();
            System.out.println("Area = " + area + "\tPerimeter: " + perimeter + "\t" + arr[k].toString());
        }
    }
}
