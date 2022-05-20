package Logic2;

public class makeBricks {
    public static void main(String[] args) {
        System.out.println(makeBricks(1,5,86));
        //We want to make a row of bricks that is goal inches long. We have a number of small bricks
        // (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks.
    }
    public static boolean makeBricks(int small, int big, int goal) {
        if(goal > big*5 + small){
            return false;
        }
        if(goal%5 > small) return false;
        return true;
    }//makebricks question of codingbat logic-2 by Akash Shelke
}
//IF THIS HELPED PLEASE GIVE ME FOLLOW ON GITHUB, IT WILL REALLY MEANT A LOT..THANKS..HAPPY CODING!!