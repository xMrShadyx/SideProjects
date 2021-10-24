package o5_CodingBat.Warmup_2;

public class c9_arrayFront9 {
    public static void main(String[] args) {
        // Given an array of ints, return true if one of the first 4
        // elements in the array is a 9. The array length may be less than 4.


        System.out.println(arrayFront9(new int[]{1, 2, 9, 3, 4})); // → true
        System.out.println(arrayFront9(new int[]{1, 2, 3, 4, 9})); // → false
        System.out.println(arrayFront9(new int[]{1, 2, 3, 4, 5})); // → false
    }

    public static boolean arrayFront9(int[] nums) {
        if (nums.length < 4) {
            for (int n : nums) {
                if (n == 9) {
                    return true;
                }
            }
        } else {
            for (int i = 0; i < 4; i++) {
                if (nums[i] == 9) {
                    return true;
                }
            }
        }
        return false;
    }
}
