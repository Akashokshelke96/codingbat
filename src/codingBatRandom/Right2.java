package codingBatRandom;

public class Right2 {
    public static void main(String[] args) {
        System.out.println(right2("yallo"));
    }
    public  static String right2(String str) {
        if(str.length() > 2){
            return (str.substring(str.length() - 2 , str.length()) + str.substring(0,str.length() - 2));
        }else{
            return str;
        }
    }
}
