package o5_CodingBat.Warmup_2;

public class c2_frontTimes {
    public static void main(String[] args) {
        // Given a string and a non-negative int n, we'll say that the
        // front of the string is the first 3 chars, or whatever
        // is there if the string is less than length 3. Return n copies of the front;


        System.out.println(frontTimes("Chocolate", 2)); // → "ChoCho"
        System.out.println(frontTimes("Chocolate", 3)); // → "ChoChoCho"
        System.out.println(frontTimes("Abc", 3)); // → "AbcAbcAbc"
    }
    public static String frontTimes(String str, int n) {
        String cutString = "";
        for (int i = 0; i < n; i++) {
            if (str.length() > 3) {
                cutString += str.substring(0, 3);
            } else {
                cutString += str;
            }
        }
        return cutString;

    }
}
