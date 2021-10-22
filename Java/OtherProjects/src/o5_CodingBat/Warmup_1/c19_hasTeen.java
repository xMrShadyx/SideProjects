package o5_CodingBat.Warmup_1;

public class c19_hasTeen {
    public static void main(String[] args) {
        // We'll say that a number is "teen" if it is in the range 13..19
        // inclusive. Given 3 int values, return true if 1 or more of them are teen.

        System.out.println(hasTeen(13, 20, 10)); // → true
        System.out.println(hasTeen(20, 19, 10)); // → true
        System.out.println(hasTeen(20, 10, 13)); // → true
    }

    public static boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }
}
