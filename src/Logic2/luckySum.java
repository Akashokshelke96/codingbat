package Logic2;

public class luckySum {
    public static void main(String[] args) {
        System.out.println(luckySum(12,34,64));
        //Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not
        // count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.
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
//IF THIS HELPED PLEASE GIVE ME FOLLOW ON GITHUB, IT WILL REALLY MEANT A LOT..THANKS..HAPPY CODING!!
