package Logic2;

public class loneSum {
    public static void main(String[] args) {
        System.out.println(loneSum(3,5,10));
        //Given 3 int values, a b c, return their sum. However, if one of the values is the same as another
        // of the values, it does not count towards the sum.
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
}//IF THIS HELPED PLEASE GIVE ME FOLLOW ON GITHUB, IT WILL REALLY MEANT A LOT..THANKS..HAPPY CODING!!
