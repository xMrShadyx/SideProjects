package o5_CodingBat.Warmup_1;

import java.util.Locale;

public class c30_endUp {
    public static void main(String[] args) {
        // Given a string, return a new string where the last 3 chars are now in upper case.
        // If the string has less than 3 chars, uppercase whatever is there. Note that
        // str.toUpperCase() returns the uppercase version of a string.


        System.out.println(endUp("Hello")); // → "HeLLO"
        System.out.println(endUp("hi there")); // → "hi thERE"
        System.out.println(endUp("hi")); // → "HI"
    }
    public static String endUp(String str) {
        if (str.length() < 3) {
            return str.toUpperCase(Locale.ROOT);
        }
        return str.substring(0, str.length() -3) + str.substring(str.length() - 3).toUpperCase(Locale.ROOT);
    }
}
