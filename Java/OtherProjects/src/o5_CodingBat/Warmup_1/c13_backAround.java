package o5_CodingBat.Warmup_1;

public class c13_backAround {
    public static void main(String[] args) {
        // Given a string, take the last char and return a new
        // string with the last char added at the front and back,
        // so "cat" yields "tcatt". The original string will be length 1 or more.

        System.out.println(backAround("cat")); // → "tcatt"
        System.out.println(backAround("Hello")); // → "oHelloo"
        System.out.println(backAround("a")); // → "aaa"
    }
    public static String backAround(String str) {
        String lastChar = str.substring(str.length() -1);
        return lastChar + str + lastChar;
    }
}
