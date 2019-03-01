
//Name: Chamin Lim, Date: 02/14/19

import java.io.*;
import java.util.*;

public class Driver01Ext {

    public static void main(String[] args) throws Exception {
        //input
        Scanner infile = new Scanner(new File("../Lab00/data.txt"));
        int numitems = infile.nextInt();
        double[] array = new double[numitems];
        for (int k = 0; k < numitems; k++) {
            array[k] = infile.nextDouble();
        }
        infile.close();

        //sort the array
        int maxIndex = 0;
        double temp;
        int n = array.length;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < n; j++) {
                if (array[j] >= array[maxIndex]) {
                    maxIndex = j;
                }
            }
            temp = array[maxIndex];
            array[maxIndex] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
            n--;
        }

        //output
        System.setOut(new PrintStream(new FileOutputStream("output.txt")));
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
