//Name: Chamin Lim, Date: 2019-03-21, Period: 2


import java.io.*;                         //the File class
import java.util.*;                        //the Scanner class
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Driver15 {
    public static int comparisons = 0;

    public static int linear(double[] array, double target) {
        for (int a = 0; a < array.length; a++) {
            comparisons += 1;
            if (array[a] == target) {
                return a;
            }
        }
        return -1;
    }

    public static int binary(double[] array, double target, int first, int last) {
        if (first > last) {
            return -1;
        }
        int mid = (first + last) / 2;
        comparisons += 1;
        if (array[mid] == target) {
            return mid;
        }
        if (array[mid] > target) {
            return binary(array, target, first, mid - 1);
        }
        return binary(array, target, mid + 1, last);
    }

    public static void main(String[] args) throws Exception {
        Scanner infile = new Scanner(new File("data.txt"));
        int numitems = infile.nextInt();
        double[] array = new double[numitems];
        for (int k = 0; k < numitems; k++)
            array[k] = infile.nextDouble();
        Arrays.sort(array);

        int choice = 0, position;
        double target;
        while (choice != 3) {
            String message = "Size = " + numitems + "\n";
            message = message + "\n1. Linear Search.";
            message = message + "\n2. Binary Search.";
            message = message + "\n3. Quit.";
            choice = (int) Double.parseDouble(JOptionPane.showInputDialog(message));
            switch (choice) {
                case 1:
                    target = Double.parseDouble(JOptionPane.showInputDialog("Decimal Target between 0.0 and 10.0: "));
                    position = linear(array, target);
                    JOptionPane.showMessageDialog(null,
                            "" + target + (position == -1 ? " not found" :
                                    (" found at position " +
                                            position)) +
                                    " using " + comparisons + " comparisons.");
                    comparisons = 0;
                    break;
                case 2:
                    target = Double.parseDouble(JOptionPane.showInputDialog("Decimal Target between 0.0 and 10.0: "));
                    position = binary(array, target, 0, array.length - 1);
                    JOptionPane.showMessageDialog(null,
                            "" + target + (position == -1 ? " not found" :
                                    (" found at position " +
                                            position)) +
                                    " using " + comparisons + " comparisons.");
                    comparisons = 0;
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Bye-bye!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Not a valid selection.");
                    break;
            }
        }

        System.exit(0);
    }

}