package arrays2;

public class lucky13 {
    //Given an array of ints, return true if the array contains no 1's and no 3's.
    public static void main(String[] args) {
        System.out.println(lucky13(new int[] {1,2,3,4,5,6,7}));
    }
    public  static boolean lucky13(int[] nums) {

        if(nums.length == 0){
            return true;
        }
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 1 || nums[i] == 3){
                return false;
            }
        }
        return true;
    }

}
