package Strings2;

public class endAnother {
    public static void main(String[] args) {
        //Given two strings, return true if either of the strings appears at the very end of the other string,
        // ignoring upper/lower case differences
        System.out.println(endOther("akabc","niabc"));
    }
    public static boolean endOther(String a, String b) {
        if(a.length() < b.length()) {
            String temp = a;
            a = b.toLowerCase();
            b = temp.toLowerCase();
        }
        return a.substring(a.length() - b.length()).equals(b);
    }
}//IF THIS HELPED PLEASE GIVE ME FOLLOW ON GITHUB, IT WILL REALLY MEANT A LOT..THANKS..HAPPY CODING!!
