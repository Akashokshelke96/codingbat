package Strings2;

public class bobThere {
    public static void main(String[] args) {
        //Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
        System.out.println(bobThere("abcbeb"));
    }
    public static boolean bobThere(String str) {
        for(int i = 0 ; i<str.length()-2;i++){
            if(str.charAt(i) == ('b') && str.charAt(i+2) == ('b')){
                return true;
            }
        }return false;
    }

}//IF THIS HELPED PLEASE GIVE ME FOLLOW ON GITHUB, IT WILL REALLY MEANT A LOT..THANKS..HAPPY CODING!!
