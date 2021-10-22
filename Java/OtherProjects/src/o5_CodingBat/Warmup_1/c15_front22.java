package o5_CodingBat.Warmup_1;

public class c15_front22 {
    public static void main(String[] args) {
        // Given a string, take the first 2 chars and return the
        // string with the 2 chars added at both the front and back,
        // so "kitten" yields"kikittenki". If the string length is less than 2,
        // use whatever chars are there.

        System.out.println(front22("kitten")); // → "kikittenki"
        System.out.println(front22("Ha")); // → "HaHaHa"
        System.out.println(front22("abc")); // → "ababcab"

    }

    public static String front22(String str) {
        String front;
        if (str.length() >= 2) {
            front = str.substring(0,2);
        } else {
            return str + str + str;
        }
        return front + str + front;
    }
}
