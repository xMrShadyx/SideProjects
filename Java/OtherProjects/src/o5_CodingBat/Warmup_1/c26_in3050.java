package o5_CodingBat.Warmup_1;

public class c26_in3050 {
    public static void main(String[] args) {
        // Given 2 int values, return true if they are both in the range 30..40 inclusive,
        // or they are both in the range 40..50 inclusive.


        System.out.println(in3050(30, 31)); // → true
        System.out.println(in3050(30, 41)); // → false
        System.out.println(in3050(40, 50)); // → true
    }

    public static boolean in3050(int a, int b) {
        return (a >= 30 && a <= 40 && b >= 30 && b <= 40) ||
                (a >= 40 && a <= 50 && b >= 40 && b <= 50);
    }
}
