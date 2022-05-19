package Strings;

public class twoChar {
    public static void main(String[] args) {
        //Given a string and an index, return a string length 2 starting at the given index.
        // If the index is too big or too small to define a string length 2, use the first 2 chars.
        // The string length will be at least 2.
        System.out.println(twoChar("akashS",3));
    }
    public static String twoChar(String str, int index) {
        if (str.length() <= index + 1 || index < 0){
            return str.substring(0,2);
        }
        else{

            return str.substring(index, index + 2);
        }
    }
}//IF THIS HELPED PLEASE GIVE ME FOLLOW ON GITHUB, IT WILL REALLY MEANT A LOT..THANKS..HAPPY CODING!!
