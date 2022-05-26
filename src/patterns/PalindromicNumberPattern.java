package patterns;

public class PalindromicNumberPattern {
    public static void main(String[] args) {
        int n =5;

        for(int i =1; i<=n; i++){
            //printing the spaces
            for(int j = 1; j <= n-i ; j++){
                System.out.print(" ");
            }

            //printing the first half of numbers
            for(int j = i ; j >=1 ; j--){
                System.out.print(j);
            }

            //printing the 2nd half of numbers
            for(int j = 2; j<= i;j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
