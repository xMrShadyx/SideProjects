package o5_CodingBat.Warmup_1;

public class c20_loneTeen {
    public static void main(String[] args) {
        // We'll say that a number is "teen" if it is in the range 13..19
        // inclusive. Given 2 int values, return true if one or the other is teen, but not both.


        System.out.println(loneTeen(13, 99)); // → true
        System.out.println(loneTeen(21, 19)); // → true
        System.out.println(loneTeen(13, 13)); // → false
    }
    public static boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);

        return (aTeen && !bTeen) || (!aTeen && bTeen);

    }
}
