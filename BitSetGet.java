import java.util.*;

public class BitSetGet {
    public static void main(String[] args) {

        BitSet b = new BitSet();

        b.set(1);
        b.set(3);

        System.out.println(b);

        System.out.println("Bit at index 1: " +
                b.get(1));

        System.out.println("Bit at index 2: " +
                b.get(2));
    }
}