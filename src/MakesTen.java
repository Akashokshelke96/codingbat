public class MakesTen {
    public static void main(String[] args) {
        System.out.println(makes10(4,6));

    }
    public static boolean makes10(int a, int b) {
        return ((a==10) || (b==10) || (a + b ==10));

    }
}
