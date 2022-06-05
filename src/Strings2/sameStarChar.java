package Strings2;

public class sameStarChar {
    public static void main(String[] args) {
        //Returns true if for every '*' (star) in the string, if there are chars both immediately before
        // and after the star, they are the same.
        System.out.println(sameStarChar("abc*crtv"));
    }

    public static boolean sameStarChar(String str) {


        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
