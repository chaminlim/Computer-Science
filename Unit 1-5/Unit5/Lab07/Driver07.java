
//Name: Chamin Lim, Date: 02/27/19

import java.io.*; //the File class
import java.util.*; //the Scanner class
import javax.swing.JOptionPane;
import java.util.Comparator;

public class Driver07 {
    public static void main(String[] args) {
        Salesperson[] array = input("data.txt");
        menu(array);
        System.exit(0);
    }

    public static Salesperson[] input(String filename) {
        Scanner infile = null;
        try {
            infile = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "The file could not be found.");
            System.exit(0);
        }
        int numitems = infile.nextInt();
        Salesperson[] array = new Salesperson[numitems];
        for (int k = 0; k < numitems; k++) {
            array[k] = new Salesperson(infile.next(), infile.nextInt(), infile.nextInt());
        }
        infile.close();
        return array;
    }

    public static void menu(Salesperson[] array) {
        int choice = 0;
        while (choice != 7) {
            String message = "";
            message = message + "\n1. List Alphabetically.";
            message = message + "\n2. List by Cars Sold.";
            message = message + "\n3. List by Trucks Sold.";
            message = message + "\n4. List by Total Sales.";
            message = message + "\n5. Add Sales.";
            message = message + "\n6. Save data to file.";
            message = message + "\n7. Quit.";
            choice = Integer.parseInt(JOptionPane.showInputDialog(message));
            switch (choice) {
            case 1:
                display(array, new ByName());
                break;
            case 2:
                display(array, new ByCars());
                break;
            case 3:
                display(array, new ByTrucks());
                break;
            case 4:
                display(array, new ByTotalSales());
                break;
            case 5:
                add(array);
                break;
            case 6:
                save(array);
                break;
            case 7:
                for (int k = 0; k < 25; k++)
                    System.out.println();
                System.out.println("Bye-bye!");
                break;
            default:
                System.out.println("Not a valid selection.");
                break;
            }
            System.out.println();
        }
    }

    public static void save(Salesperson[] array) {
        PrintStream outfile = null;
        try {
            outfile = new PrintStream(new FileOutputStream("data.txt"));
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "The file could not be created.");
        }
        outfile.println(array.length);
        for (int i = 0; i < array.length; i++) {
            outfile.println(array[i].getName() + "\n" + array[i].getCars() + "\n" + array[i].getTrucks());
        }
        outfile.close();
        System.out.println("Saved.");
    }

    public static void add(Salesperson[] array) {
        //first input message about adding name
        int index;
        String name;
        do {
            name = JOptionPane.showInputDialog("What is the name of this salesperson?");
            index = search(array, name);
        } while (index == -1); //returns -1 when array and name does not match

        //second input message asking about type of object: Cars or Trucks
        String type;
        do {
            type = JOptionPane.showInputDialog("What type of object? Cars? Trucks?").toLowerCase();
        } while ((!type.equals("cars")) && (!type.equals("trucks")));

        //third input message about adding amount of cars or trucks
        int amount;
        do {
            amount = Integer.parseInt(JOptionPane.showInputDialog("How many " + type));
        } while (amount <= 0);

        if (type.equals("cars")) {
            array[index].setCars(array[index].getCars() + amount);
        } else {
            array[index].setTrucks(array[index].getTrucks() + amount);
        }
        System.out.println("Sales added.");
    }

    public static int search(Salesperson[] array, String name) {
        for (int i = 0; i < array.length; i++) {
            if (name.equals(array[i].getName())) {
                return i;
            }
        }
        return -99; //in order to compile
    }

    public static void display(Salesperson[] array, Comparator c) {
        sort(array, c);
        System.out.println("Name\tCar\tTrucks\tTotal");
        System.out.println("------------------------");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getName() + "\t" + array[i].getCars() + "\t" + array[i].getTrucks() + "\t"
                    + array[i].getTotals());
        }
    }

    public static void sort(Object[] array, Comparator c) {
        int minPos;
        for (int k = 0; k < array.length; k++) {
            minPos = findMin(array, array.length - k, c);
            swap(array, minPos, array.length - k - 1);
        }
    }

    public static int findMin(Object[] array, int upper, Comparator c) {
        int minPos = 0;
        for (int i = 1; i < upper; i++) {
            if (c.compare(array[i], array[minPos]) < 0) {
                minPos = i;
            }
        }
        return minPos;
    }

    public static void swap(Object[] array, int a, int b) {
        Object temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
