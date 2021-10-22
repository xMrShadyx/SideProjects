package o5_CodingBat.Warmup_1;

public class c17_icyHot {
    public static void main(String[] args) {
        //Given two temperatures, return true if one is less than 0 and the other is greater than 100.

        System.out.println(icyHot(120, -1)); // → true
        System.out.println(icyHot(-1, 120)); // → true
        System.out.println(icyHot(2, 120)); // → false
    }
    public static boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 || temp2 < 0) && (temp1 > 100 || temp2 > 100);

    }
}
