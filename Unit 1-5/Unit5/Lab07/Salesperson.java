//Name: Chamin Lim, Date: 02/27/19
public class Salesperson {
    //data fields
    private String myName;
    private int myCars, myTrucks;

    //constructors
    public Salesperson(String name, int car, int truck) {
        myName = name;
        myCars = car;
        myTrucks = truck;
    }

    //accessors and modifiers
    public String getName() {
        return myName;
    }

    public int getCars() {
        return myCars;
    }

    public int getTrucks() {
        return myTrucks;
    }

    public int getTotals() {
        return myCars + myTrucks;
    }

    public void setName(String n) {
        myName = n;
    }

    public void setCars(int c) {
        myCars = c;
    }

    public void setTrucks(int t) {
        myTrucks = t;
    }

    //other methods: toString
    public String toString() {
        return myName + "\t" + myCars + "\t" + myTrucks + "\t" + this.getTotals();
    }
}
