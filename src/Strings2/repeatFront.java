package Strings2;

public class repeatFront {
    public static void main(String[] args) {
        //Given a string and an int n, return a string made of the first n characters of the string,
        // followed by the first n-1 characters of the string, and so on. You may assume that n is between 0
        // and the length of the string, inclusive
        System.out.println(repeatFront("hummer",4));
    }
    public static String repeatFront(String str, int n) {
        String result = "";
        for(int i = 0; i< n ; i++){
            result += str.substring(0,n-i);;
        }
        return result;
    }
} //IF THIS HELPED PLEASE GIVE ME FOLLOW ON GITHUB, IT WILL REALLY MEANT A LOT..THANKS..HAPPY CODING!!
