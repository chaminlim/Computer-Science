//Listman
//February 2013

import java.io.*;
import java.util.*;

public class CompareSort {
    public static void main(String[] args) throws Exception {
        Scanner infile = new Scanner(new File("data.txt"));
        int numitems = infile.nextInt();

        double[] array = new double[numitems];
        for (int k = 0; k < numitems; k++)
            array[k] = infile.nextDouble();
        infile.close();

        System.out.println("The initial array:");
        //print(array);      //Task 1: Print the array

        Date d1 = new Date();
        System.out.println("The built-in sort:");
        Arrays.sort(array);
        Date d2 = new Date();
        System.out.println("Built-in Sorted in " + (d2.getTime() - d1.getTime()));

        System.out.println("\nThe scrambled array:");
        scramble(array);     //Task 2: Scramble
        //print(array);

        Date d3 = new Date();
        System.out.println("\nThe Selection Sort Array: ");
        selectionSort(array); //Task 3: Selection sort
        //print(array);
        Date d4 = new Date();
        System.out.println("Selection Sorted in " + (d4.getTime() - d3.getTime()));

        System.out.println("\nThe scrambled array:");
        scramble(array);
        //print(array);

        Date d5 = new Date();
        System.out.println("\nThe Bubble Sort array:");
        bubbleSort(array);   //Task 4: Bubble sort
        //print(array);
        Date d6 = new Date();
        System.out.println("Bubble Sorted in " + (d6.getTime() - d5.getTime()));

        System.out.println("\nThe scrambled array:");
        scramble(array);
        //print(array);

        Date d7 = new Date();
        System.out.println("\nThe Insert Sort array:");
        insertSort(array);   //Task 5: Insert sort
        //print(array);
        Date d8 = new Date();
        System.out.println("Insertion Sorted in " + (d8.getTime() - d7.getTime()));

        System.out.println("\nThe scrambled array:");
        scramble(array);
        //print(array);

        Date d9 = new Date();
        System.out.println("\nThe Quick Sort array:");
        quickSort(array, 0, array.length - 1);   //Task 6: Quick sort
        //print(array);
        Date d10 = new Date();
        System.out.println("Quick Sorted in " + (d10.getTime() - d9.getTime()));

        System.out.println("\nThe scrambled array:");
        scramble(array);
        //print(array);

        Date d11 = new Date();
        System.out.println("\nThe Merge Sort array:");
        mergeSort(array);   //Task 7: Merge sort
        //print(array);
        Date d12 = new Date();
        System.out.println("Merge Sorted in " + (d12.getTime() - d11.getTime()));

    }

    public static void selectionSort(double[] array) {
        int maxPos;
        for (int k = 0; k < array.length; k++) {
            maxPos = findMax(array, array.length - k - 1);
            swap(array, maxPos, array.length - k - 1);
            // print(array);
        }
    }

    public static int findMax(double[] array, int upper) {
        int maxPos = 0;

        for (int x = 1; x <= upper; x++) {
            if (array[maxPos] < array[x])
                maxPos = x;
        }
        return maxPos;
    }

    public static void swap(double[] array, int a, int b) {
        double temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void scramble(double[] array) {
        int temp;
        double tempElem;

        for (int k = 0; k < array.length; k++) {
            temp = (int) (Math.random() * array.length);
            tempElem = array[k];
            array[k] = array[temp];
            array[temp] = tempElem;
        }
    }

    public static void bubbleSort(double[] array) {
        for (int k = 0; k < array.length; k++) {

            for (int j = array.length - 1; j > k; j--) {
                if (array[j] < array[j - 1])
                    swap(array, j, j - 1);
            }
            //print(array);
        }
    }

    public static void insertSort(double[] array) {
        for (int k = 1; k < array.length; k++) {
            for (int j = k; j > 0; j--) {
                if (array[j] < array[j - 1])
                    swap(array, j, j - 1);
            }
            //print(array);
        }
    }

    public static void quickSort(double[] a, int left, int right) {
        if (left >= right)
            return;

        int i = left;
        int j = right;
        double pivotValue = a[(left + right) / 2];

        while (i <= j) {
            while (a[i] < pivotValue)
                i++;
            while (a[j] > pivotValue)
                j--;
            if (i <= j) {
                swap(a, i, j);
                i++;
                j--;
            }
        }
        quickSort(a, left, j);
        quickSort(a, i, right);
    }

    public static void mergeSort(double[] a) {
        double[] copyBuffer = new double[a.length];
        mergeSortHelper(a, copyBuffer, 0, a.length - 1);
        //print(array);
    }

    public static void mergeSortHelper(double[] a, double[] copy, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergeSortHelper(a, copy, low, middle);
            mergeSortHelper(a, copy, middle + 1, high);
            merge(a, copy, low, middle, high);
        }
    }

    public static void merge(double[] a, double[] copy, int low, int middle, int high) {
        int i1 = low, i2 = middle + 1;

        for (int i = low; i <= high; i++) {
            if (i1 > middle)
                copy[i] = a[i2++];
            else if (i2 > high)
                copy[i] = a[i1++];
            else if (a[i1] < a[i2])
                copy[i] = a[i1++];
            else
                copy[i] = a[i2++];
        }
        for (int i = low; i <= high; i++) {
            a[i] = copy[i];
        }
    }

    public static void print(double[] array) {
        for (int k = 0; k < array.length; k++)
            System.out.print(" " + array[k]);
        System.out.println();
    }
}

