package Logic2;

public class loneSum {
    public static void main(String[] args) {
        System.out.println(loneSum(3,5,10));
    }
    public static int loneSum(int a, int b, int c) {
        if((a == b) && (b == c)){
            return 0;
        }
        else if(a == b){
            return c;
        }
        else if (b == c){
            return a;
        }
        else if(a == c){
            return b;

        }
        return a + b +c ;
    }// loneSum question of codingBat by Akash Shelke
}
