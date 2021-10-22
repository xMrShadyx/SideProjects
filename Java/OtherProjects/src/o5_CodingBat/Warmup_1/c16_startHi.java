package o5_CodingBat.Warmup_1;

public class c16_startHi {
    public static void main(String[] args) {
        ////Given a string, return true if the string starts with "hi" and false otherwise.

        System.out.println(startHi("hi there")); // → true
        System.out.println(startHi("hi")); // → true
        System.out.println(startHi("hello hi")); // → false
    }

    public static boolean startHi(String str) {
        return str.startsWith("hi");
    }
}
