package o5_CodingBat.Warmup_2;

public class c6_stringSplosion {
    public static void main(String[] args) {
        // Given a non-empty string like "Code" return a string like "CCoCodCode".


        System.out.println(stringSplosion("Code")); // → "CCoCodCode"
        System.out.println(stringSplosion("abc")); // → "aababc"
        System.out.println(stringSplosion("ab")); // → "aab"
    }
    public static String stringSplosion(String str) {
        String tempStrig = "";
        for (int i = 0; i < str.length(); i++) {
            tempStrig += str.substring(0,i);
        }
        return tempStrig + str;
    }
}
