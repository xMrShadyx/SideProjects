package o5_CodingBat.Warmup_1;

public class c27_max1020 {
    public static void main(String[] args) {
        // Given 2 positive int values, return the larger value that is in the
        // range 10..20 inclusive, or return 0 if neither is in that range.


        System.out.println(max1020(11, 19)); // → 19
        System.out.println(max1020(19, 11)); // → 19
        System.out.println(max1020(11, 9)); // → 11
        System.out.println(max1020(9, 21)); // → 0
        System.out.println(max1020(10, 21)); // → 10
        System.out.println(max1020(21, 10)); // → 10
    }
    public static int max1020(int a, int b) {
        int temp = a;
        if (b > a) {
            a = b;
            b = temp;
        }

        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }
}
