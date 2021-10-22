package o5_CodingBat.Warmup_1;

public class c14_or35 {
    public static void main(String[] args) {
        // Return true if the given non-negative number is a multiple of 3
        // or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod

        System.out.println(or35(3)); // → true
        System.out.println(or35(10)); // → true
        System.out.println(or35(8)); // → false
    }

    public static boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }
}
