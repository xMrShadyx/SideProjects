package o5_CodingBat.Warmup_1;

public class c18_in1020 {
    public static void main(String[] args) {
        //Given 2 int values, return true if either of them is in the range 10..20 inclusive.

        System.out.println(in1020(12, 99)); // → true
        System.out.println(in1020(21, 12)); // → true
        System.out.println(in1020(8, 99)); // → false
    }
    public static boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }
}
