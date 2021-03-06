package codingBatRandom;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Array2DQ {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] myIntArray = getIntegers(5);
//        printArray(myIntArray);
        System.out.println("Average is " + getAverage(myIntArray));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Please Enter " + number + " integer values");
        int intArray[] = new int[number];
        for (int i = 0; i < number; i++) {
            Scanner scanner = new Scanner(System.in);

            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }

    public static void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static double getAverage(int[] intArray) {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        return (double) sum / (double) intArray.length;
    }

}//learning arrays 2D questions from codingbat by akash shelke