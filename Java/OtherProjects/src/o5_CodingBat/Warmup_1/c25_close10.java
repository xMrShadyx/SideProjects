package o5_CodingBat.Warmup_1;

public class c25_close10 {
    public static void main(String[] args) {
        //Given 2 int values, return whichever value is nearest to the value 10,
        // or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.


        System.out.println(close10(8, 13)); // → 8
        System.out.println(close10(13, 8)); // → 8
        System.out.println(close10(13, 7)); // → 0
    }
    public static int close10(int a, int b) {
        int res1 = Math.abs(a - 10);
        int res2 = Math.abs(b - 10);

        if (res1 < res2) {
            return a;
        } else if (res2 < res1) {
            return b;
        } else {
            return 0;
        }
    }
}
