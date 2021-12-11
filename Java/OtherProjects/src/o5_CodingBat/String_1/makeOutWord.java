package o5_CodingBat.String_1;

public class makeOutWord {
    public static void main(String[] args) {
//        Given an "out" string length 4, such as "<<>>", and a word, return
//        a new string where the word is in the middle of the out
//        string, e.g. "<<word>>". Note: use str.substring(i, j)
//        to extract the String starting at index i and going up to but not including index j.
//
//
        System.out.println(makeOutWord("<<>>", "Yay")); // → "<<Yay>>"
        System.out.println(makeOutWord("<<>>", "WooHoo")); // → "<<WooHoo>>"
        System.out.println(makeOutWord("[[]]", "word")); // → "[[word]]"
    }

    public static String makeOutWord(String out, String word) {
        String i = out.substring(0,2);
        String j = out.substring(2);
        return i + word + j;
    }

}
