package o5_CodingBat.Warmup_2;

public class c4_doubleX {
    public static void main(String[] args) {
        // Given a string, return true if the first instance of "x"
        // in the string is immediately followed by another "x".


        System.out.println(doubleX("axxbb")); // → true
        System.out.println(doubleX("axaxax")); // → false
        System.out.println(doubleX("xxxxx")); // → true
    }
    public static boolean doubleX(String str){
        int i = str.indexOf("x");
        if (i == -1) return false;

        if (i+1 >= str.length()) return false;
        return str.substring(i+1, i+2).equals("x");

    }
}
