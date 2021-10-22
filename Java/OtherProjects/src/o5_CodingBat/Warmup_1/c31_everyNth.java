package o5_CodingBat.Warmup_1;

public class c31_everyNth {
    public static void main(String[] args) {
        // Given a non-empty string and an int N, return the string made starting with char 0,
        // and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.


        System.out.println(everyNth("Miracle", 2)); // → "Mrce"
        System.out.println(everyNth("abcdefg", 2)); // → "aceg"
    }

    public static String everyNth(String str, int n) {
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % n == 0) {
                temp += str.charAt(i);
            }
        }
        return temp;
    }
}
