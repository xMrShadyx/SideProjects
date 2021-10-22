package o5_CodingBat.Warmup_1;

public class c23_startOz {
    public static void main(String[] args) {

        // Given a string, return a string made of the first 2 chars (if present),
        // however include first char only if it is 'o' and include the second
        // only if it is 'z', so "ozymandias" yields "oz".


        System.out.println(startOz("ozymandias")); // → "oz"
        System.out.println(startOz("bzoo")); // → "z"
        System.out.println(startOz("oxx")); // → "o"
    }

    public static String startOz(String str) {
        if (str.isEmpty()) {
            return str;
        }
        if (str.length() == 1) {
            if (str.charAt(0) == 'o' || str.charAt(0) == 'z') {
                return str;
            } else {
                return "";
            }
        }

        char charO = str.charAt(0);
        char charZ = str.charAt(1);


        if (charO == 'o' && charZ == 'z') {
            return "oz";
        } else if (charO == 'o') {
            return "o";
        } else if (charZ == 'z') {
            return "z";
        }
    return "";
    }
}
