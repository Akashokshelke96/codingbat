package codingBatRandom;

public class maxMod5 {

    public static void main(String[] args) {
        System.out.println(maxMod5(4,6));

    }
    public static int maxMod5(int a, int b) {
        if(a == b)
            return 0;
        if(a % 5 == b % 5)
            return (a < b) ? a : b;
        return (a > b) ? a : b;
    }

}
