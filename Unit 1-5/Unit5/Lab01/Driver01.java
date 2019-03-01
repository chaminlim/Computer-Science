
//Name: Chamin Lim, Date: 02/14/19

import java.io.*;

public class Driver01 {

    public static void main(String[] args) {
        //input
        double[] myArray = { 2.0, 3.7, 9.9, 8.1, 8.5, 7.4, 1.0, 6.2 };

        //sort the array
        int maxIndex = 0;
        double temp;
        int n = myArray.length;

        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = 0; j < n; j++) {
                if (myArray[j] >= myArray[maxIndex]) {
                    maxIndex = j;
                }
            }
            temp = myArray[maxIndex];
            myArray[maxIndex] = myArray[myArray.length - i - 1];
            myArray[myArray.length - i - 1] = temp;
            n--;
            for (int k = 0; k < myArray.length; k++) {
                System.out.print(myArray[k] + " ");
            }
            System.out.println("");
        }

        //output
        System.out.println("Answer:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}
