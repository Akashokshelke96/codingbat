public class Fix23 {
    public static void main(String[] args) {
        int[] nums = {23,342,56,5};
        System.out.println(fix23(nums));
    }
    public static int[] fix23(int[] nums) {
        for (int i=0; i<(nums.length-1); i++) {
            if (nums[i]==2 && nums[i+1]==3) {
                nums[i +1] = 0;
                return nums;
            }
        }
        return nums;
    }

}
