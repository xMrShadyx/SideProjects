package o5_CodingBat.Warmup_1;

public class c10_missingChar {
    public static void main(String[] args) {
        //Given a non-empty string and an int n,
        // return a new string where the char at index n has been removed.
        // The value of n will be a valid index of a char in the original
        // string (i.e. n will be in the range 0..str.length()-1 inclusive).

        System.out.println(missingChar("kitten", 1)); // → "ktten"
        System.out.println(missingChar("kitten", 0)); // → "itten"
        System.out.println(missingChar("kitten", 4)); // → "kittn"
    }

    public static String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n+1);
        return front + back;
    }
}
