package codingBatRandom;

public class ParrotTrouble {
    public static void main(String[] args) {
        System.out.println(parrotTrouble(true,10));

    }
    public static boolean parrotTrouble(boolean talking, int hour) {

        return (talking && (hour < 7 || hour > 20));
    }
}
