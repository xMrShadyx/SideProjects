package o5_CodingBat.Warmup_1;

public class c28_stringE {
    public static void main(String[] args) {
        // Return true if the given string contains between 1 and 3 'e' chars.


        System.out.println(stringE("Hello")); // → true
        System.out.println(stringE("Heelle")); // → true
        System.out.println(stringE("Heelele")); // → false
    }
    public static boolean stringE(String str) {
        int temp = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                temp++;
            }
        }
        return temp >= 1 && temp <= 3;
    }
}
