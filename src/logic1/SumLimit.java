package logic1;

public class SumLimit {
    public static void main(String[] args) {
        System.out.println(sumLimit(12,18));
    }
    public  static int sumLimit(int a, int b) {
        int ab = a + b;
        int len = String.valueOf(ab).length();
        int len2 = String.valueOf(a).length();
        if(len == len2) {
            return  ab;
        }
        return a;
    }
}
