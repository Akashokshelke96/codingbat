package arrays2;

public class has22 {
    //Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
    public static void main(String[] args) {
        System.out.println(has22(new int[] {1,2,3,4,2,2,4}));
    }
    public static boolean has22(int[] nums) {
        boolean found;

        for(int i = 0 ; i<= nums.length-2 ; i++){
            if(nums[i] == 2 && nums[i+1] == 2){
                return true;
            }
        }
        return false;
    }

}
