
//name: Chamin Lim;   date: 12/7/18

import java.io.*; //the File class
import java.util.*; //the Scanner class
import javax.swing.JOptionPane;

public class Driver04 {
  public static void main(String[] args) {
    Scanner infile = null;
    while (infile == null) {
      try {
        String filename = JOptionPane.showInputDialog("Enter filename");
        infile = new Scanner(new File(filename));
      } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: File not found.");
      }
    }

    int num = infile.nextInt();
    double sum = 0;
    double max = 0;
    double min = 1000;
    for (int i = 1; i <= num; i++) {
      double number = infile.nextDouble();
      sum += number;
      min = Math.min(min, number);
      max = Math.max(max, number);
    }

    System.out.println("Sum: " + sum);
    System.out.println("Avg: " + sum / num);
    System.out.println("Min: " + min);
    System.out.println("Max: " + max);
  }
}
/************************************
Sum: 3291074.1965423366
Avg: 504.3791872095535
Min: 0.027375512843708094
Max: 999.9780398236477

*************************************/
