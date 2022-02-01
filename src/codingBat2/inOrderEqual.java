package codingBat2;

public class inOrderEqual {
    public static void main(String[] args) {
        System.out.println(inOrderEqual(2,3,4,true));

    }
    public  static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        boolean order = ((a < b) &&  (b < c) && (a< c));
        boolean equal = ((a <= b) || (b <= c));

        if((a<b) && (b<c) && !equalOk){
            return true;
        }
        if(((a<= b) && (b<=c)) && equalOk){
            return true;

        }
        return false;

    }
}
