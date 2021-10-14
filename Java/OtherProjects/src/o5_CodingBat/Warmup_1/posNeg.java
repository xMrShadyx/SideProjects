package o5_CodingBat.Warmup_1;

public class posNeg {
    public static void main(String[] args) {
        // Given 2 int values, return true if one is negative and one is positive.
        // Except if the parameter "negative" is true, then return true only if both are negative.

        System.out.println(posNeg(1, -1, false)); // → true
        System.out.println(posNeg(-1, 1, false)); // → true
        System.out.println(posNeg(-4, -5, true)); // → true
    }

    public static boolean posNeg(int a, int b, boolean negative) {
        return (negative && (a < 0 && b < 0) || (!negative && ((a < 0 && b > 0) || (a > 0 && b < 0))));

    }

}
