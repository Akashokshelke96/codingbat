package Strings;

public class ntwice {


    public static void main(String[] args) {
        String str = "chococlate";
        System.out.println(nTwice("chocolate",3));
    }
    public static String nTwice(String str, int n) {
        String word =   str.substring(0,n) + str.substring(str.length()-n,str.length());
        return word;
    }
}//IF THIS HELPED PLEASE GIVE ME FOLLOW ON GITHUB, IT WILL REALLY MEANT A LOT..THANKS..HAPPY CODING!!
