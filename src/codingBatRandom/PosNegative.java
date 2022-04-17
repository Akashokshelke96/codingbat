package codingBatRandom;

public class PosNegative {
    public static void main(String[] args) {
      //  System.out.println(posNeg(-12, -3, true));
//    }
//
//    public static boolean posNeg(int a, int b, boolean negative) {
//        if (negative) {
//            return (a < 0 && b < 0);
//        } else {
//            return ((a < 0 && b > 0) || (a > 0 && b < 0));
//        }
        // it returns weather a number is positive , negative.
        int ar[] = new int[]{1,2,3,4,5,6,7,8,9};
        int n = ar.length+1;
        int total = n*(n+1)/2;
        for(int i=0;i<ar.length;i++){
            total -= ar[i];}
        System.out.println(total);
        }
    }
