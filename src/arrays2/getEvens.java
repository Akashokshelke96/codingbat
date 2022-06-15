package arrays2;

public class getEvens {
    public static void main(String[] args) {
       int[] arr = {2,3,4,3,2,6,8};
        System.out.println(countEvens(arr));
    }
    public static int countEvens(int[] nums) {
        int count = 0;
        for(int i = 0; i<nums.length ;i++){
            if(nums[i] % 2==0 ){
                count++;
            }
        }
        return count;
    }

}
