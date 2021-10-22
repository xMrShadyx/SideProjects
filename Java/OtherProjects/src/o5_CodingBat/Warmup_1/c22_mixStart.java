package o5_CodingBat.Warmup_1;

public class c22_mixStart {
    public static void main(String[] args) {
        // Return true if the given string begins with "mix",
        // except the 'm' can be anything, so "pix", "9ix" .. all count.


        System.out.println(mixStart("mix snacks")); // → true
        System.out.println(mixStart("pix snacks")); // → true
        System.out.println(mixStart("piz snacks")); // → false
    }
    public static boolean mixStart(String str) {
        String[] temp = str.split(" ");
        return temp[0].contains("ix");
    }
}
