package arrays1;

public class commonEnd {

//Given 2 arrays of ints, a and b, return true if they have the same first element or they have the
// same last element. Both arrays will be length 1 or more.
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6};
        int[] nums1 = new int[]{6,4,3,2,6};
        System.out.println(commonEnd(nums,nums1));
    }
    public static boolean commonEnd(int[] a, int[] b) {

        return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
    }
}
