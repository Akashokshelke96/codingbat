package arrays1;

public class double23 {
    public static void main(String[] args) {
        int[] nums = new int[] {3,3,3};
        System.out.println(double23(nums));
    }
    public static boolean double23(int[] nums) {
        if (nums.length != 1 && nums.length != 0 )
            return ((nums[0] == 2 && nums[1] == 2)
                    || (nums[0] == 3 && nums[1] == 3 ));
        else {
            return false;
        }
    }
}
