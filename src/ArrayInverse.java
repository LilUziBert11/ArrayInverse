/*
* ArrayInverse
*  Programmer: Albert Duenas
   Date: 10-4-22
   Version: 1.2
   Description: Displaying the even numbers between 1 and 20. As well as displaying the reverser even numbers between 1 and 20*/


public class ArrayInverse {

    public static int[] reverseArray (int[] arrayToReverse){
        // Declaring a new array with size equal to passed in array
        int[] reversedArray = new int[arrayToReverse.length];
        // Backwards for loop to reverse array values
        for (int i = arrayToReverse.length-1; i>=0; i--){
            reversedArray[(arrayToReverse.length-1)-i]=arrayToReverse[i];
        }
        // Returning reversed array
        return reversedArray;
    }

    public static void main(String[] args) {
        // Declaring array literal
        int[] evenArray = new int[]{ 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        // Printing out values in array
        for (int j : evenArray) {
            System.out.format("%d\r\n", j);
        }
        // Creating second array
        int[] reversedArray;
        // Reversing the array
        reversedArray = reverseArray(evenArray);
        // Printing out values in array
        for (int j : reversedArray) {
            System.out.format("%d\r\n", j);
        }

    }

}
