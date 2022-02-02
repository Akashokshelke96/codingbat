package codingBat2;

public class FizzString2 {
    public static void main(String[] args) {
        System.out.println(fizzString("fabulousb"));
    }
    public static String fizzString(String str) {
        boolean fizz = str.startsWith("f");
        boolean buzz = str.endsWith("b");

        if (fizz && buzz) return "FizzBuzz";
        if(fizz) return "Fizz";
        if(buzz) return "Buzz";
        return str;


    }//solution to FizzString from codingbat by Akash Shelke
}
