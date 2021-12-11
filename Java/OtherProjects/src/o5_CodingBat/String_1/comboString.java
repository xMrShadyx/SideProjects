package o5_CodingBat.String_1;

public class comboString {
    public static void main(String[] args) {
//        Given 2 strings, a and b, return a string of the form short+long+short,
//        with the shorter string on the outside and the longer string on the
//        inside. The strings will not be the same length, but they may be empty (length 0).
//
//
//        comboString("Hello", "hi") → "hiHellohi"
//        comboString("hi", "Hello") → "hiHellohi"
//        comboString("aaa", "b") → "baaab"
    }

    public static String comboString(String a, String b) {
        return a.length() < b.length() ? a + b + a : b + a + b;
    }

}
