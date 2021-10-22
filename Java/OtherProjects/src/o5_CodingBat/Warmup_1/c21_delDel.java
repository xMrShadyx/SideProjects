package o5_CodingBat.Warmup_1;

import java.util.Arrays;

public class c21_delDel {
    public static void main(String[] args) {
        // Given a string, if the string "del" appears starting at index 1,
        // return a string where that "del" has been deleted. Otherwise, return the string unchanged.

        System.out.println(delDel("adelbc")); // → "abc"
        System.out.println(delDel("adelHello")); // → "aHello"
        System.out.println(delDel("adedbc")); // → "adedbc"
        System.out.println(delDel("abcdel")); // → "abcdel"
        System.out.println(delDel("del")); // → "del"
        System.out.println(delDel("aadelbb")); // → "aadelbb"
    }
    public static String delDel(String str) {
        String temp = "";
        if (str.length() >= 4 && str.substring(1,4).equals("del")) {
            String[] tempArray = str.split("del");
            return temp = String.join("", tempArray);
        }
        return str;


    }
}
