import java.util.*;

public class BitSetAnd {
    public static void main(String[] args) {

        BitSet b1 = new BitSet();
        BitSet b2 = new BitSet();

        b1.set(1);
        b1.set(2);

        b2.set(2);
        b2.set(3);

        b1.and(b2);

        System.out.println("AND Result:");
        System.out.println(b1);
    }
}