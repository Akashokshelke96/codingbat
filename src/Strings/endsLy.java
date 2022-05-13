package Strings;

public class endsLy {
    public static void main(String[] args) {
        String word = "oddly";
        System.out.println(endsLy(word));
    }
    public static boolean endsLy(String str) {
        String found = "ly";
        if(str.length()<2){
            return false;
        }
        else if(str.substring(str.length()-2,str.length()).equals(found)){
            return true;
        }
        else return false;
    }

}
