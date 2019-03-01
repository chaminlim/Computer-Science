public class Driver03 {
    public static void main(String[] args) {
        int[] array = { 100, 101, 102, 103, 104, 105, 106, 107, 108, 109 };
        print(array);
        scramble(array);
        //print(array);
        sort(array);
        print(array);

        // scramble(array);
        // bubblesort(array);
        // print(array);

        scramble(array);
        insertionsort(array);
        print(array);
    }

    public static void scramble(int[] x) {
        System.out.println("Scrambled Array: ");
        for (int i = 0; i < x.length; i++) {
            int random1 = (int) (Math.random() * 10);
            int random2 = (int) (Math.random() * 10);
            swap(x, random1, random2);
        }
        print(x);
    }

    public static void sort(int[] x) {
        System.out.println("Selection Sort: ");
        int maxIndex;
        for (int i = 0; i < x.length - 1; i++) {
            maxIndex = 0;
            for (int j = 0; j < x.length - i; j++) {
                if (x[j] > x[maxIndex]) {
                    maxIndex = j;
                }
            }
            swap(x, maxIndex, x.length - i - 1);
            print(x);
        }
    }

    public static void bubblesort(int[] x) {
        System.out.println("Bubble Sort: ");
        // for (int i = x.length - 1; i >= 0; i--) {
        //     for (int j = x.length - 1; j >= 0; j--) {
        //         if (x[j] <= x[i]) {
        //             swap(x, j, i);
        //         }
        //     }
        //     print(x);
        // }

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length - i - 1; j++) {
                if (x[j] >= x[j + 1])
                    swap(x, j, j + 1);
            }
            print(x);
        }

    }

    public static void insertionsort(int[] x) {
        System.out.println("Insertion Sort: ");
        for (int i = 1; i < x.length - 1; i++) {
            int temp = i;
            while (i >= 0 && x[i + 1] <= x[i]) {
                swap(x, i, i + 1);
                i--;
            }
            i = temp;
            print(x);
        }

    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

}
