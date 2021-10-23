package o5_CodingBat.Warmup_2;

public class c3_countXX {
    public static void main(String[] args) {
        // Count the number of "xx" in the given string. We'll
        // say that overlapping is allowed, so "xxx" contains 2 "xx".


        System.out.println(countXX("abcxx")); // → 1
        System.out.println(countXX("xxx")); // → 2
        System.out.println(countXX("xxxx")); // → 3
    }
    public static int countXX(String str) {
        int counter = 0;
        String[] splitStr = str.split(" ");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                counter++;
            }
        }
        return counter == 0 ? 0 : counter - splitStr.length;
    }
}
