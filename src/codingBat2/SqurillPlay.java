package codingBat2;

public class SqurillPlay {
    public static void main(String[] args) {
        System.out.println(squirrelPlay(89,true));
    }
    public static boolean squirrelPlay(int temp, boolean isSummer) {
        return ((temp >= 60 && temp <= 90 && isSummer == false ) ||
                (temp >=60 && temp <= 100 && isSummer ==  true));
    }
}
