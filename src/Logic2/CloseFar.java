package Logic2;

public class CloseFar {
    public static void main(String[] args) {
        System.out.println(closeFar(23,45,78));
    }
    public static boolean closeFar(int a, int b, int c) {
        return !close(b,c)&(close(a,b)^close(a,c));
    }
    public static boolean close(int a, int b) {
        return Math.abs(a-b)<=1;

    }
}
