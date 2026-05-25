import java.util.*;

public class BitSetDemo {
    public static void main(String[] args) {

        BitSet b = new BitSet();

        // Set bits
        b.set(0);
        b.set(2);
        b.set(4);

        System.out.println("BitSet:");

        System.out.println(b);
    }
}