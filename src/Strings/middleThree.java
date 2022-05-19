package Strings;

public class middleThree {
    public static void main(String[] args) {
        System.out.println(middleThree("thisisgood"));
    }
    public static String middleThree(String str) {
        if(str.length()>3){
            return str.substring((str.length()/2)-1,(str.length()/2)+2);
        }
        else{
            return str;
        }
    }
}//IF THIS HELPED PLEASE GIVE ME FOLLOW ON GITHUB, IT WILL REALLY MEANT A LOT..THANKS..HAPPY CODING!!
