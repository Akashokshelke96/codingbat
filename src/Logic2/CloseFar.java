package Logic2;

public class CloseFar {
    public static void main(String[] args) {
        //Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1),
        // while the other is "far", differing from both other values by 2 or more.
        System.out.println(closeFar(23,45,78));
    }
    public static boolean closeFar(int a, int b, int c) {
        return !close(b,c)&(close(a,b)^close(a,c));
    }
    public static boolean close(int a, int b) {
        return Math.abs(a-b)<=1;

    }
}//IF THIS HELPED PLEASE GIVE ME FOLLOW ON GITHUB, IT WILL REALLY MEANT A LOT..THANKS..HAPPY CODING!!
