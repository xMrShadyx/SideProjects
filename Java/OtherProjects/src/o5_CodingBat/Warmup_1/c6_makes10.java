package o5_CodingBat.Warmup_1;

public class c6_makes10 {
    public static void main(String[] args) {
        //Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.


        System.out.println(makes10(9, 10)); // → true
        System.out.println(makes10(9, 9)); // → false
        System.out.println(makes10(1, 9)); // → true
    }

    public static boolean makes10(int a, int b) {
        return (a + b == 10) || (a == 10 || b == 10);
    }

}
