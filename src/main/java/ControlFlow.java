import java.util.ArrayList;
import java.util.List;

public class ControlFlow {
    public static void main(String[] args){}
    //Complete the code so that the program print only odd numbers between 0 and 100.
    public static void onlyEvens(short start, short end){
        List<Short> evens = new ArrayList<Short>();

        for (short i = start; i < end; i++) {
            if ((i & 1) == 0) {
                evens.add(i);
            }
        }
        for (Short even : evens){
            System.out.println(/*add odd number here*/ +even);
        }
    }
    public static void onlyEvens(){
        List<Short> evens = new ArrayList<Short>();

        for (short i = 1; i < 100; i++) {
            if ((i & 1) == 0) {
                evens.add(i);
            }
        }
        for (Short even : evens){
            System.out.println(/*add odd number here*/ +even);
        }
    }
}
