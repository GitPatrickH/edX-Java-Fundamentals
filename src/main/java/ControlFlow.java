import java.util.ArrayList;
import java.util.List;

public class ControlFlow {
    public static List<Short> onlyEvens() {
        List<Short> evens = new ArrayList<Short>();

        for (short i = 1; i < 100; i++) {
            if ((i & 1) == 0) {
                evens.add(i);
            }
        }
        return evens;
    }

    //Complete the code so that the program print only odd numbers between 0 and 100.
    public static List<Short> onlyEvens(final short start, final short end) {
        List<Short> evens = new ArrayList<Short>();

        for (short i = start; i < end; i++) {
            if ((i & 1) == 0) {
                evens.add(i);
            }
        }
        return evens;
    }
}
