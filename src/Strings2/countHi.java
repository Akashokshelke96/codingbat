package Strings2;

public class countHi {
    public static void main(String[] args) {
        //Return the number of times that the string "hi" appears anywhere in the given string.
        System.out.println(countHi("akash hi , say hi"));
    }
    public static int countHi(String str) {
        int count = 0 ;

        for(int i =0 ; i< str.length() -1 ; i++){
            if(str.substring(i,i+2).equals("hi")){
                count++;
            }
        }
        return count;
    }
}//IF THIS HELPED PLEASE GIVE ME FOLLOW ON GITHUB, IT WILL REALLY MEANT A LOT..THANKS..HAPPY CODING!!
