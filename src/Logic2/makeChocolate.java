package Logic2;

public class makeChocolate {

//    We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
//    Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.
    public static void main(String[] args) {
        System.out.println(makeChocolate1(20,1,17));
    }
    public  static int makeChocolate1(int small, int big, int goal) {
        if(goal>=5){
            if(goal/5 >= big){
                goal -= big*5;
            }else{
                goal = goal%5;
            }
        }
        if(goal<=small)return goal;
        else return -1;
    }
}
