import java.io.*;
import java.util.*;

public class Driver00 {
    public static void main(String[] args) throws Exception {
        Scanner infile = new Scanner(new File("data.txt"));
        int numitems = infile.nextInt();
        double[] array = new double[numitems];
        for (int k = 0; k < numitems; k++) {
            array[k] = infile.nextDouble();
        }
        infile.close();
        int minPos, maxPos;
        minPos = findMin(array);
        maxPos = findMax(array);
        System.out.println("Minimum value: " + array[minPos]);
        System.out.println("Index value of minimun: " + minPos);
        System.out.println("Maximum value: " + array[maxPos]);
        System.out.println("Index value of maximum: " + maxPos);
    }

    private static int findMin(double[] apple) {
        int pos = 0;
        for (int k = 0; k < apple.length - 1; k++) {
            if (apple[k] <= apple[pos])
                pos = k;
        }
        return pos;
    }

    private static int findMax(double[] banana) {
        int pos = 0;
        for (int k = 0; k < banana.length - 1; k++) {
            if (banana[k] >= banana[pos])
                pos = k;
        }
        return pos;
    }

}
