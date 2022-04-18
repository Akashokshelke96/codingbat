package arrays1;

public class sameFirstLast {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6};
        System.out.println(sameFirstLast(nums));
    }
    public static boolean sameFirstLast(int[] nums) {
        return (nums.length >= 1 && nums[0] == nums [nums.length - 1]);
    }


}
