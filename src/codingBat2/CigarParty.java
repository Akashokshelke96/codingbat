package codingBat2;

public class CigarParty {
    public static void main(String[] args) {
        System.out.println(cigarParty(70,true));
    }
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        return ((cigars >= 40 && cigars <=60) && (isWeekend != true) ||
                ((cigars >=40) && (isWeekend == true)));
    }
}
