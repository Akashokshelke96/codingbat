package Strings2;

public class doubleX {
    public static void main(String[] args) {
        //Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
        System.out.println(doubleX("xxkashxxx"));
    }
    static boolean doubleX(String str) {
        for(int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == 'x') {
                if(str.charAt(i + 1) == 'x')
                    return true;
                else
                    return false;
            }
        }
        return false;
    }
}//IF THIS HELPED PLEASE GIVE ME FOLLOW ON GITHUB, IT WILL REALLY MEANT A LOT..THANKS..HAPPY CODING!!
