package o5_CodingBat.Warmup_1;

public class c11_frontBack {
    public static void main(String[] args) {
        //Given a string, return a new string where the first and last chars have been exchanged.

        System.out.println(frontBack("code")); // → "eodc"
        System.out.println(frontBack("a")); // → "a"
        System.out.println(frontBack("ab")); // → "ba"
    }

    public static String frontBack(String str) {
        if (str.length() <= 1) return str;
        String mid = str.substring(1, str.length() - 1);
        return str.charAt(str.length() - 1) + mid + str.charAt(0);
    }

}
