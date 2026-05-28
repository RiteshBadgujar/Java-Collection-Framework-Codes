import java.util.*;

public class BitSetClear {
    public static void main(String[] args) {

        BitSet b = new BitSet();

        b.set(1);
        b.set(2);

        System.out.println("Before Clear:");
        System.out.println(b);

        b.clear(1);

        System.out.println("After Clear:");
        System.out.println(b);
    }
}