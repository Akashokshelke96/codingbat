package Logic2;

public class blackJack {
    //Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.
    public static void main(String[] args) {
        int a =18;
        int b=20;
        System.out.println(blackjack(a,b));
    }

    public static int blackjack(int a, int b) {
        if(a > 21 && b > 21)
            return 0;

        if(a > 21)
            return b;

        if(b > 21)
            return a;

        return a > b ? a : b; //Ternary Operator
    }
    //Hope the code Helps and do give me a follow.

}
