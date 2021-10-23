package o5_CodingBat.Warmup_2;

public class c5_stringBits {
    public static void main(String[] args) {
        // Given a string, return a new string made of every other
        // char starting with the first, so "Hello" yields "Hlo".


        System.out.println(stringBits("Hello")); // → "Hlo"
        System.out.println(stringBits("Hi")); // → "H"
        System.out.println(stringBits("Heeololeo")); // → "Hello"
    }
    public static String stringBits(String str) {
        String tempResult = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                tempResult += str.charAt(i);
            }
        }
        return tempResult;
    }
}
