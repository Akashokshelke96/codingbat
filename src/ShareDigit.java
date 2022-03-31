public class ShareDigit {
    public static void main(String[] args) {
        System.out.println(shareDigit(2,34));
    }
    public static boolean shareDigit(int a, int b) {
        return((a/10 == b /10)||(a%10 == b%10) || (a/10 == b% 10) || (a%10 == b/10));
    }

}
