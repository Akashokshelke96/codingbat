package Strings2;

public class countCode {
    public static void main(String[] args) {
        System.out.println(countCode("coxecodecodecole"));
    }
    public static int countCode(String str) {
        int count = 0;
        for(int i=0;i<str.length()-3;i++){
            if(str.substring(i,i+2).equals("co") && str.substring(i+3,i+4).equals("e")){
                count++;
            }
        }return count;
    }
}//IF THIS HELPED PLEASE GIVE ME FOLLOW ON GITHUB, IT WILL REALLY MEANT A LOT..THANKS..HAPPY CODING!!
