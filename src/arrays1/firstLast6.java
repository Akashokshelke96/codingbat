package arrays1;

public class firstLast6 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6};
        System.out.println(firstLast6(nums));
    }


    public static boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1 ] == 6) {
            return true;
        }
        return false;
    }
}
