package o5_CodingBat.String_1;

public class extraEnd {
    public static void main(String[] args) {

//        Given a string, return a new string made of 3 copies of the last 2
//        chars of the original string. The string length will be at least 2.
//
//
        System.out.println(extraEnd("Hello")); // → "lololo"
        System.out.println(extraEnd("ab")); // → "ababab"
        System.out.println(extraEnd("Hi")); // → "HiHiHi"
    }

    public static String extraEnd(String str) {
        String i = str.substring(str.length() - 2);
        return i.repeat(3);
    }

}
