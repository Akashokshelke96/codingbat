package Strings2;

public class zipZap {
    public static void main(String[] args) {
        System.out.println(zipZap("zipabzap"));
    }

    public static String zipZap(String str) {

        String str2 = "";

        if (str.length() <= 2) {
            return str;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                str2 = str2 + str.charAt(i) + str.charAt(i + 2);
                i += 2;
            } else {
                str2 = str2 + str.charAt(i);
            }
        }
        return str2;
    }
}
