package o5_CodingBat.Warmup_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class c10_array123 {
    public static void main(String[] args) {
        // Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.


        System.out.println(array123(new int[]{1, 1, 2, 3, 1})); // → true
        System.out.println(array123(new int[]{1, 1, 2, 4, 1})); // → false
        System.out.println(array123(new int[]{1, 1, 2, 1, 2, 3})); // → true
    }
    public static boolean array123(int[] nums){
        String joinArray = "";
        for (int n : nums) {
            joinArray += n;
        }
        return joinArray.contains("123");
    }
}
