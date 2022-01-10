public class sumDouble {
    public static void main(String[] args) {
    int a = 5;
    int b = 5;
        System.out.println(sumDouble(a,b));
    }
    public static int sumDouble(int a, int b) {
        int sum = a + b;
        if (a == b){
            sum = 2*sum ;
        }
        return sum;

    }
}
