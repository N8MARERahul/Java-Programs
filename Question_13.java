//Write a Java program to remove the duplicate elements of a given array and return the new length of that array.

import java.util.*;

public class Question_13 {
    public static void main(String[] args) {
        int i, j, k;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total length of elements in the array :");
        int length = sc.nextInt(); // Taking the length of the array...

        int array[] = new int[length]; // Initialize the array...

        System.out.println("Enter the elements of the array :");
        for (i = 0; i < length; i++) // Taking the elements of the array...
            array[i] = sc.nextInt();

        // Printing the taken array...
        System.out.println("The given array is-->\n" + Arrays.toString(array));

        // use nested for loop to find the duplicate elements in array...
        for (i = 0; i < length; i++) {
            for (j = i + 1; j < length; j++) {
                // use if statement to check duplicate element...
                if (array[i] == array[j]) {
                    // delete the current position of the duplicate element...
                    for (k = j; k < length - 1; k++) {
                        array[k] = array[k + 1];
                    }
                    // decrease the length of array after removing duplicate element...
                    length--;
                    // if the position of the elements is changes, don't increase the index j...
                    j--;
                }
            }
        }
        //Print the length of the array...
        System.out.println("The new lenght of the array is = " + length);
        System.out.println("The new array after removing duplicate iteam is-->");
        //Print the new array...
        System.out.print("[");
        for (i = 0; i < length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("\b\b]");
    }
}
