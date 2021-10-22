package o5_CodingBat.Warmup_1;

public class c24_intMax {
    public static void main(String[] args) {
        //Given three int values, a b c, return the largest.


        System.out.println(intMax(1, 2, 3)); // → 3
        System.out.println(intMax(1, 3, 2)); // → 3
        System.out.println(intMax(3, 2, 1)); // → 3
    }
    public static int intMax(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }
}
