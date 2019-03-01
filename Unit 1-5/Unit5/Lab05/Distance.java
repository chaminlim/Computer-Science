public class Distance implements Comparable<Distance> {
    private int myFeet, myInches;

    public Distance() {
        myFeet = myInches = 0;
    }

    public Distance(int x, int y) {
        myFeet = x;
        myInches = y;
    }

    public int getPounds() {
        return myFeet;
    }

    public int getOunces() {
        return myInches;
    }

    public void setPounds(int x) {
        myFeet = x;
    }

    public void setOunces(int x) {
        myInches = x;
    }

    public int compareTo(Distance w) {
        if (myFeet < w.getPounds())
            return -1;
        if (myFeet > w.getPounds())
            return 1;
        if (myInches < w.getOunces())
            return -1;
        if (myInches > w.getOunces())
            return 1;
        return 0;
    }

    // public boolean equals(Weight arg){
    //     return compareTo(arg) == 0;
    // }

    public String toString() {
        return myFeet + " feet " + myInches + " inches ";
    }
}
