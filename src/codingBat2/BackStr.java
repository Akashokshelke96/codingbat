package codingBat2;

public class BackStr {
    public static String frontBack(String str) {
        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length()-1);

        // last + mid + first
        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(frontBack("akash"));
    }
}//solution to BackStr from codingbat by Akash Shelke
