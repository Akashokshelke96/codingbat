package arrays2;

public class sum28 {
    public static void main(String[] args) {
        //Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
        int [] nums = {1,2,2,2,2,3,4,5,6};
        System.out.println(sum28(nums));
    }
    public static boolean sum28(int[] nums) {
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 2){
                sum += 2;
            }
        }
        if(sum == 8){
            return true;
        }
        return false;
    }
}
