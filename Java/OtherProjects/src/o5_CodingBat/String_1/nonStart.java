package o5_CodingBat.String_1;

public class nonStart {
    public static void main(String[] args) {

//        Given 2 strings, return their concatenation, except omit
//        the first char of each. The strings will be at least length 1.
//
//
        System.out.println(nonStart("Hello", "There")); // → "ellohere"
        System.out.println(nonStart("java", "code")); // → "avaode"
        System.out.println(nonStart("shotl", "java")); // → "hotlava"
    }

    public static String nonStart(String a, String b) {
        String firstWord = a.substring(1);
        String secondWord = b.substring(1);

        return firstWord + secondWord;
    }

}
