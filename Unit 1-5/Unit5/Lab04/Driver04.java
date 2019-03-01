
//Name: Chamin Lim, Date: 02/19/18
import java.io.*; //the File class
import java.util.*; //the Scanner class
import java.lang.Comparable;

public class Driver04 {
    public static void main(String[] args) throws Exception {
        Comparable[] array = input("data.txt");
        sort(array);
        output(array, "output.txt");
    }

    public static Comparable[] input(String filename) throws Exception {
        Scanner infile = new Scanner(new File(filename));
        int numitems = infile.nextInt();
        Comparable[] array = new Weight[numitems];
        for (int k = 0; k < numitems; k++) {
            array[k] = new Weight(infile.nextInt(), infile.nextInt());
        }
        infile.close();
        return array;
    }

    public static void output(Object[] array, String filename) throws Exception {
        System.setOut(new PrintStream(new FileOutputStream(filename)));
        for (int k = 0; k < array.length; k++)
            System.out.println(array[k].toString());
    }

    public static void sort(Comparable[] array) {
        int maxPos;
        for (int k = 0; k < array.length; k++) {
            maxPos = findMax(array, array.length - k);
            swap(array, maxPos, array.length - k - 1);
        }
    }

    public static void swap(Comparable[] array, int x, int y) {
        Comparable temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    public static int findMax(Comparable[] array, int x) {
        int max = 0;
        for (int k = 0; k < x; k++) {
            if (array[k].compareTo(array[max]) > 0) {
                max = k;
            }
        }
        return max;
    }

}
