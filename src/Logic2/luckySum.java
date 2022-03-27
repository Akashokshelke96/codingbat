package Logic2;

public class luckySum {
    public static void main(String[] args) {
        System.out.println(luckySum(12,34,64));
    }
    public static int luckySum(int a, int b, int c) {
        if( a == 13){
            return 0;
        }
        else if( b == 13){
            return a;

        }
        else if( c == 13){
            return a + b ;
        }
        return a + b + c;
    }
} //codingBat question of luckySum by Akash Shelke.
