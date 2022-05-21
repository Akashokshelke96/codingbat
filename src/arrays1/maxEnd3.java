package arrays1;

public class maxEnd3 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        System.out.println(maxEnd3(nums));
    }

    public static int[] maxEnd3(int[] nums) {

//        if (nums[0] > nums[2]) {
//            return new int[]{nums[0], nums[0], nums[0]};
//        } else {
//            return new int[]{nums[2], nums[2], nums[2]};
//        }
//    }

        //alternative solution
 int larger = Math.max(nums[0], nums[2]);
 nums[0] = larger;
 nums[1] = larger;
 nums[2] = larger;
 return nums;
    }
}//IF THIS HELPED PLEASE GIVE ME FOLLOW ON GITHUB, IT WILL REALLY MEANT A LOT..THANKS..HAPPY CODING!!
