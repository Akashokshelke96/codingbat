package codingBat2;

public class WithoutEnd {
    public static void main(String[] args) {
        System.out.println(withoutEnd2(2));
    }
    public static int[] withoutEnd2(Integer integer) {
        int[] nums = new int[0];
        int larger = Math.max(nums[0], nums[2]);
        nums[0] = larger;
        nums[1] = larger;
        nums[2] = larger;
        System.out.println(nums);
        return nums;
    }
}
