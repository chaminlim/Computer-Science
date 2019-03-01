import java.io.*; //the File class
import java.util.*; //the Scanner class

public class Driver06 {
    public static void main(String[] args) throws Exception {
        String[] array = input("data.txt");
        sort(array);
        output(array, "output.txt");
    }

    public static String[] input(String filename) throws Exception {
        Scanner infile = new Scanner(new File(filename));
        int numitems = infile.nextInt();
        String[] array = new String[numitems];
        for (int k = 0; k < numitems; k++) {
            array[k] = infile.next();
        }
        infile.close();
        return array;
    }

    public static void output(Object[] array, String filename) throws Exception {
        System.setOut(new PrintStream(new FileOutputStream(filename)));
        for (int k = 0; k < array.length; k++)
            System.out.println(array[k].toString());
    }

    public static void sort(String[] array) {
        int maxPos;
        for (int k = 0; k < array.length; k++) {
            maxPos = findMax(array, array.length - k);
            swap(array, maxPos, array.length - k - 1);
        }
    }

    public static void swap(String[] array, int x, int y) {
        String temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    public static int findMax(String[] array, int x) {
        int max = 0;
        for (int k = 0; k < x; k++) {
            if (array[k].compareTo(array[max]) > 0) {
                max = k;
            }
        }
        return max;
    }

}
