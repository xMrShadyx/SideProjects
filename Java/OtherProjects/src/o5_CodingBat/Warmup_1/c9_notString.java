package o5_CodingBat.Warmup_1;

public class c9_notString {
    public static void main(String[] args) {

        //Given a string, return a new string where "not " has been added to the front. However,
        // if the string already begins with "not", return the string unchanged.
        // Note: use .equals() to compare 2 strings.

        System.out.println(notString("candy")); // → "not candy"
        System.out.println(notString("x")); // → "not x"
        System.out.println(notString("not bad")); // → "not bad"
        System.out.println(notString("is not")); // → "not bad"
    }

    public static String notString(String str) {
        return (str.length() >= 3 && str.substring(0, 3).equals("not")) ? str : "not " + str;
    }

}
