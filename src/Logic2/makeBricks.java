package Logic2;

public class makeBricks {
    public static void main(String[] args) {
        System.out.println(makeBricks(1,5,86));
    }
    public static boolean makeBricks(int small, int big, int goal) {
        if(goal > big*5 + small){
            return false;
        }
        if(goal%5 > small) return false;
        return true;
    }//makebricks question of codingbat logic-2 by Akash Shelke
}
