package Logic2;

public class Old35 {
    //Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator
    public static void main(String[] args) {
        System.out.println(old35(15));
    }
    public static boolean old35(int n) {
        return((n % 3 == 0 && n % 5 != 0) || (n % 3 != 0 && n % 5 == 0));
    }
}
