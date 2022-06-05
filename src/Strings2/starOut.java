package Strings2;

public class starOut {
    public static void main(String[] args) {
        //Return a version of the given string, where for every star (*) in the string the star and the chars immediately to
        //its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
        System.out.println(starOut("abc*dba"));
    }
    public static String starOut(String str) {

        String finalString = "";

        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && str.charAt(i) != '*')
                finalString += str.charAt(i);

            if (i > 0 && str.charAt(i) != '*' && str.charAt(i-1) != '*')
                finalString += str.charAt(i);

            if (i > 0 && str.charAt(i) == '*' && str.charAt(i-1) != '*')
                finalString = finalString.substring(0,finalString.length()-1);

        }
        return finalString;
    }
}
