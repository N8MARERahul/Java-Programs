/* Write a Java program to find the length of the longest consecutive elements sequence from a given unsorted array of integers.
Sample array: [49, 1, 3, 200, 2, 4, 70, 5]
The longest consecutive elements sequence is [1, 2, 3, 4, 5], therefore the program will return its length 5
*/

import java.util.*;

public class Question_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total length of elements in the array :");
        int length = sc.nextInt(); // Taking the length of the array...

        int array[] = new int[length]; // Initialize the array...

        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < length; i++) // Taking the elements of the array...
            array[i] = sc.nextInt();

        // Printing the taken array...
        System.out.println("The given array is-->\n" + Arrays.toString(array));

        //If the array is empty then print 0...
        if (array.length == 0) {
            System.out.println("The longest consequtive sequence is 0.");
            System.exit(0); //Exit from the program...
        }
        Arrays.sort(array); //Sort the array in ascending order...
        //Initialize two veriable with 1...
        int longSequence = 1, currentSequence = 1;
        //Iterate the elements of the array...
        for (int i = 1; i < array.length; i++) {
            //If the previous and recent numbers are same then skip the previous one...
            if (array[i] != array[i-1]) {
                //If the the numbers are consecutive...
                if (array[i] == array[i-1]+1) {
                    //Increment the current sequence...
                    currentSequence += 1;
                }
                else {
                    //Take the maximum value between recent and previous sequences...
                    longSequence = Math.max(longSequence, currentSequence);
                    //Intialize the current sequence with 1...
                    currentSequence = 1;
                }
            }
        }
        //Take the maximum value between recent and previous sequences...
        longSequence = Math.max(longSequence, currentSequence);
        //Print the maximum value...
        System.out.println("The longest consecutive sequence is " + longSequence);
    }
}
