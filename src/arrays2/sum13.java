package arrays2;

public class sum13 {
    public static void main(String[] args) {
        int[] num = {13,2,3,13,5,6,7,8,9};
        System.out.println(sum13(num));
    }
    public static int sum13(int[] nums) {
        int sum = 0;
        int  i = 0;
        while(i<nums.length){
            if(nums[i] == 13){
                i+=2;
            }
            else{
                sum += nums[i];
                i++;
            }
        }return sum;
    }
}
