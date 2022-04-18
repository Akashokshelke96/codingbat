package arrays1;

public class makeLast {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6};
        System.out.println(makeLast(nums));
    }
    public static int[] makeLast(int[] nums) {
        //copy from here as answer in codingBat
        int[] arr2 = new int[2 * nums.length];
        arr2[arr2.length - 1] = nums[nums.length - 1];
        return arr2;
    }

    }
