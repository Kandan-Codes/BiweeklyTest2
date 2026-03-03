package biweekly;

public class EncodedStringCount {
    public static void main(String[] args) {
        String str = "06";
        System.out.println(encodedStringCount(str));
    }

    private static int encodedStringCount(String str) {
        //base case: if str is empty or starts with 0 then return 0
        if(str.isEmpty()) return 1;
        if(str.charAt(0) == '0') return 0;

        //recursive call for single digit count of encoded string
        int oneSetEncodedCount = encodedStringCount(str.substring(1));
        int twoSetEncodedCount = 0;
        //recursive call for double-digit count of encoded string
        if(str.length() > 1 && Integer.parseInt(str.substring(0, 2)) >= 10 && Integer.parseInt(str.substring(0, 2)) <= 26) {
            twoSetEncodedCount = encodedStringCount(str.substring(2));
        }
        return oneSetEncodedCount + twoSetEncodedCount;
    }
}
