package arrays2;

public class centeredAverage {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(centeredAverage(arr));
    }

    public static int centeredAverage(int[] nums) {

        int sum = 0;
        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }


        return (sum - min - max) / (nums.length - 2);
    }
}