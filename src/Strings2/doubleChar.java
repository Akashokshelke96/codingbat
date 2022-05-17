package Strings2;

public class doubleChar {
    public static void main(String[] args) {
        //Given a string, return a string where for every char in the original, there are two chars.
        System.out.println(doubleChar("akash"));
    }
    public static String doubleChar(String str) {
        String result = "";

        for(int i = 0 ; i <= str.length()-1; i++){
            result = result + str.charAt(i) + str.charAt(i);
        }return result;
    }
}
