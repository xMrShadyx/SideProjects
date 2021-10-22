package o5_CodingBat.Warmup_1;

public class c29_lastDigit {
    public static void main(String[] args) {
        // Given two non-negative int values, return true if they have the same last digit,
        // such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.


        System.out.println(lastDigit(7, 17)); // → true
        System.out.println(lastDigit(6, 17)); // → false
        System.out.println(lastDigit(3, 113)); // → true
    }
    public static boolean lastDigit(int a, int b) {
        return a % 10 == b % 10;
    }
}
