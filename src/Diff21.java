public class Diff21 {
    public static void main(String[] args) {
        int n = 25;
        System.out.println(diff21(n));

    }


    public static int diff21(int n) {
        if(n<=21){
            return 21 - n;

        }
        else{

            return (n -21 ) * 2;
        }
    }
}
//learning nad solving questions from codingbat by akash shelke
