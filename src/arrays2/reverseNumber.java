package arrays2;


public class reverseNumber {
    public static void main(String[] args) {

        int n = 23465;

        int rem = 0;
        int ans = 0;
        while (n > 0) {
            rem = n%10;
            ans = ans*10 + rem;

            n = n/10;
        }
        System.out.println(ans);
    }
}