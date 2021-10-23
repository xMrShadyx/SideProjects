package o5_CodingBat.Warmup_2;

public class c1_stringTimes {
    public static void main(String[] args) {
        // Given a string and a non-negative int n, return a larger string that is n copies of the original string.


        System.out.println(stringTimes("Hi", 2)); // → "HiHi"
        System.out.println(stringTimes("Hi", 3)); // → "HiHiHi"
        System.out.println(stringTimes("Hi", 1)); // → "Hi"
    }
    public static String stringTimes(String str, int n ) {
        String repN = "";
        for (int i = 0; i < n; i++) {
            repN += str;
        }
        return repN;
    }
}
