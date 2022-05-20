package Logic2;

public class noTeenSum {
    public static void main(String[] args) {
        System.out.println(noTeenSum(14,13,12));
        //Given 3 int values, a b c, return their sum. However, if any of the values is a teen --
        // in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens.
    }
    public  static int noTeenSum(int a, int b, int c) {

        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }
    public static int fixTeen(int n){
        if ((n >= 13) && (n <= 19) && (n != 15) && (n != 16 )){
            return 0;

        }
        else {
            return n;
        }
    }
}//IF THIS HELPED PLEASE GIVE ME FOLLOW ON GITHUB, IT WILL REALLY MEANT A LOT..THANKS..HAPPY CODING!!
