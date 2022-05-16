package Strings2;

public class doubleChar {
    public static void main(String[] args) {
        System.out.println(doubleChar("akash"));
    }
    public static String doubleChar(String str) {
        String result = "";

        for(int i = 0 ; i <= str.length()-1; i++){
            result = result + str.charAt(i) + str.charAt(i);
        }return result;
    }
}
