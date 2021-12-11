package o5_CodingBat.String_1;

public class firstHalf {
    public static void main(String[] args) {
//        Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
//
//
//        firstHalf("WooHoo") → "Woo"
//        firstHalf("HelloThere") → "Hello"
//        firstHalf("abcdef") → "abc"
    }

    public static String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

}
