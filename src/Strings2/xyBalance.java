package Strings2;

public class xyBalance {
    public static void main(String[] args) {
        /*We'll say that a String is xy-balanced if for all the 'x' chars in the string,
        there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not.
         One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
         */
        System.out.println(xyBalance("xyxxxy"));
    }
    public static boolean xyBalance(String str) {
        boolean foundY = false;
        for(int i = str.length()-1 ;i >= 0 ;i--){


            if(str.charAt(i)=='y'){
                foundY = true;
            }
            if(str.charAt(i) == 'x' && foundY==false){
                return false;
            }

        }return true;
    }
}//IF THIS HELPED PLEASE GIVE ME FOLLOW ON GITHUB, IT WILL REALLY MEANT A LOT..THANKS..HAPPY CODING!!
