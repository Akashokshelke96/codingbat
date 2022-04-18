package arrays1;

public class no23 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2};
        for (int element: nums) {
            System.out.println(element);
        }
    }
    public static boolean no23(int[] nums) {
        return (((nums[0] != 2 && nums[1] != 2)) && ((nums[0] != 3 && nums[1] != 3)));
    }
}
