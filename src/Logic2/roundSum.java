package Logic2;

public class roundSum {
    public static void main(String[] args) {
        System.out.println(roundSum(12,342,6));
    }
    public  static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }
    public static int round10(int num){
        if(num % 10 <5){
            return num - (num%10);
        }
        else{
            return num + ( 10 - (num%10));
        }
    }//roundSum question form coding bat by Akash shelke
}
