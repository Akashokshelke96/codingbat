package codingBat2;

public class FizzString {
    public static void main(String[] args) {
        System.out.println(fizzString2(9));
    }
    public static String fizzString2(int n) {
        boolean fizz = n % 3 == 0;
        boolean buzz = n % 5 == 0;

        if(fizz && !buzz) {
            return "Fizz!";
        }
        if(buzz && !fizz) {
            return "Buzz!";
        }
        if(fizz && buzz) {
            return "FizzBuzz!";
        }
        else {
            return n+"!";
        }
    }

}
