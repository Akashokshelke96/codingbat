package Strings;

public class hasBad {
    public static void main(String[] args) {
        System.out.println(hasBad("badxxx"));
    }
    public static boolean hasBad(String str) {
        if(str.length()<3){
            return false;
        }else if( str.substring(0,3).equals("bad")){
            return true;
        }else if(str.length()>3){
            if(str.substring(1,4).equals("bad")){
                return true;
            }
        }return false;
    }
}//IF THIS HELPED PLEASE GIVE ME FOLLOW ON GITHUB, IT WILL REALLY MEANT A LOT..THANKS..HAPPY CODING!!
