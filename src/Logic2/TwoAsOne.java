package Logic2;

public class TwoAsOne {
    //Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
    public static void main(String[] args) {
        System.out.println(twoAsOne(12,13,14));
    }
    public static boolean twoAsOne(int a, int b, int c) {
        return (((a + b) == c) || ((b + c) == a) || ((a + c) == b));
    }

}
