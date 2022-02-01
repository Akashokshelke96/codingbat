package codingBat2;

public class TwoAsOne {
    public static void main(String[] args) {
        System.out.println(twoAsOne(12,18,30));
    }
    public  static boolean twoAsOne(int a, int b, int c) {
        return (((a + b) == c) || ((b + c) == a) || ((a + c) == b));
    }

}
