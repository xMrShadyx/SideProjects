package o5_CodingBat.Warmup_2;

public class c8_arrayCount9 {
    public static void main(String[] args) {
        // Given an array of ints, return the number of 9's in the array.


        System.out.println(arrayCount9(new int[]{1, 2, 9})); // → 1
        System.out.println(arrayCount9(new int[]{1, 9, 9})); // → 2
        System.out.println(arrayCount9(new int[]{1, 9, 9, 3, 9})); // → 3
    }
    public static int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }
}
