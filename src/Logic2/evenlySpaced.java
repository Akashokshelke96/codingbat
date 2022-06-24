package Logic2;
//For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more,
// so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less
// than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition,
// write a separate helper "public int round10(int num) {" and call it 3 times. Write the helper entirely below and at the same
// indent level as roundSum().
public class evenlySpaced {
    public static void main(String[] args) {
        //Given three ints, a b c, one of them is small, one is medium and one is large. Return tru
        //e if the three values are evenly spaced, so the difference between small and medium is the
        // same as the difference between medium and large.
        //
        System.out.println(evenlySpaced(2,4,6));
    }
    public static boolean evenlySpaced(int a, int b, int c) {
        int max = 0;
        int med = 0;
        int small = 0;

        if(a>b){
            if(a>c){
                max = a;
                med = c;
                small = b;
            }
            else{
                max = c;
                med = a;
                small = b;
            }
        }else if(b>c){
            max = b;
            med = a;
            small = c;

        }else{
            max = c;
            med = b;
            small = a;
        }

        if((med-small) == (max - med)){
            return true;

        }
        return false;

    }
}
