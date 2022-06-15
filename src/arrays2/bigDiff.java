package arrays2;

public class bigDiff {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6,7};
        System.out.println(bigDiff(arr));
    }
    public  static int bigDiff(int[] nums) {

        int max = nums[0];
        int min = nums[0];


        for(int i = 0 ; i < nums.length ; i++){
            min = Math.min(nums[i],min);
            max = Math.max(nums[i],max);
        }
        return max - min;

    }
}
