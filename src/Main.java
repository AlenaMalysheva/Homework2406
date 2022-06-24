import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 7, 89, 24, 56, 76, 45, 100};
        indexOfMax(arr); //task 2

        System.out.println("Sum = " + sumOfIntArray());//task 3
    }
    /**Implement a method that returns the index of the biggest element
     *  of a given array of int{5,7,89,24,56,76,45,100} */
    private static int indexOfMax(int[] arr) {  // task 2
        int indexMax = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[indexMax]) {
                indexMax = i;
            }
        }
        System.out.println("index of the biggest element of array is " + indexMax);
        return indexMax;
    }
    /**
     * Implement a method that returns the sum of elements
     * of the given array of int{10, 3, 23, 5, -9} -> 32
     */
    private static int sumOfIntArray() {  // task 3
        int[] arr = new int[]{10, 3, 23, 5, -9};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}