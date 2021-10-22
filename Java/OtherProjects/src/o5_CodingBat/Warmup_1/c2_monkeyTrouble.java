package o5_CodingBat.Warmup_1;

public class c2_monkeyTrouble {
    public static void main(String[] args) {

        //We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
        // We are in trouble if they are both smiling or if neither of them is smiling.
        // Return true if we are in trouble.

        monkeyTrouble(true, true); // → true
        monkeyTrouble(false, false); // → true
        monkeyTrouble(true, false); // → false
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile && bSmile || !aSmile && !bSmile;
    }

}
