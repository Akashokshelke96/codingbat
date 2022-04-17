package codingBatRandom;

public class Arrays2D_HR {
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        int maxSum = Integer.MIN_VALUE;;
        int sum = 0;

        for(int i=0; i < 6; i++)
        {
            for(int j=0; j < 6; j++)
            {

                if(i > 1 && j > 1)
                {
                    sum = arr[i][j] + arr[i][j - 1] + arr[i][j - 2]
                            + arr[i - 1][j - 1]
                            + arr[i - 2][j] + arr[i - 2][j - 1]
                            + arr[i -2][j - 2];

                    if(sum > maxSum)
                    {
                        maxSum = sum;
                    }
                }
            }
        }
        System.out.println(maxSum);
    }
}
//learning arrays 2D questions from codingbat by akash shelke
