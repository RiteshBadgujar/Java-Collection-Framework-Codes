import java.util.*;

public class BitSetFlip {
    public static void main(String[] args) {

        BitSet b = new BitSet();

        b.set(1);

        System.out.println("Before Flip:");
        System.out.println(b);

        b.flip(1);

        System.out.println("After Flip:");
        System.out.println(b);
    }
}