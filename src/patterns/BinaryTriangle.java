package patterns;

public class BinaryTriangle {
    public static void main(String[] args) {
        int n = 7;

        //outer loop
        for(int i = 1; i<=n ; i++){
            //inner loop
            for(int j = 1;j<=i ; j++){  //when the coordinates of any index sums to EVEN it prints "1" ,else when Odd it Prints "0"
                int sum = i+j;
                if(sum%2==0){
                    System.out.print("1 ");
                }
                else if(sum%2==1){
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }
}
