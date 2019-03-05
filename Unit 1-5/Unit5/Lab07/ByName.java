import java.util.Comparator;

public class ByName implements Comparator<Salesperson> {
    public int compare(Salesperson arg1, Salesperson arg2) {
        return arg2.getName().compareToIgnoreCase(arg1.getName());
    }
}
