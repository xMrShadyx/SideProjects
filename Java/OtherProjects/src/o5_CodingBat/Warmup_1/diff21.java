package o5_CodingBat.Warmup_1;

public class diff21 {
    public static void main(String[] args) {

//        Given an int n, return the absolute difference between n and 21,
//        except return double the absolute difference if n is over 21.

        System.out.println(diff21(19)); // -> 2
        System.out.println(diff21(10)); // -> 11
        System.out.println(diff21(21)); // -> 0
    }

    public static int diff21(int n) {
        return n <= 21 ?  21 - n: (n - 21) * 2;
    }

}
