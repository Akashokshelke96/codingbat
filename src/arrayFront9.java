public class arrayFront9 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(arrayFront9(arr));
    }
    public static boolean arrayFront9(int[] nums) {


        int end = nums.length;
        if(end > 4){
            end = 4;
        }
        for(int i =0; i< end ; i++){
            if(nums[i] == 9){
                return true;
            }
        } return false;
    }


    //   boolean found = false;
    //   if(nums.length>=4){
    //   for(int i = 0 ; i< 4 ; i++){
    //   if(nums[i] == 9){
    //     found = true;
    //   }
    //   }
    //   }
    //   else{
    //     for(int i = 0 ; i< nums.length ; i++){
    //     if(nums[i] == 9){
    //     found = true;
    //   }
    //   }
    // }
    // return found;
// }
}
