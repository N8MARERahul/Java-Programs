import java.util.Arrays;
import java.util.Scanner;

//  Write a Java program to remove a specific element from an array.

public class Question_10 {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements you want to enter: ");
        Scanner sc = new Scanner(System.in);    //Creat an object of main class...
        int length = sc.nextInt();  //Taking the length of the array...

        int Array[] = new int[length];    //Define the array...
        System.out.println("Enter the elements of the array :");
        //Taking the input of elements from user...
        for(int i = 0; i < length; i++) {
            Array[i] = sc.nextInt();
        }

        //Printing the array that inserted...
        System.out.println(Arrays.toString(Array));

        //Taking input the number that wanted to remove...
        System.out.println("\nEnter the element you want to remove :");
        int element = sc.nextInt();

        //Define two variables...
        boolean flag = false;
        int position = 0;
        //Perform Linear Search...
        for(int i = 0; i < length; i++) {
            if(Array[i] == element) {
                flag = true;
                position = i;
                break;
            }
        }

        //If the search not successful print the element is not in the array...
        if(!flag) {
            System.out.println("The element " + element + " is not in the array...");
        } else {    //Remove the element...
            for(int i = position; i < length - 1; i++) {
                Array[i] = Array[i +1];
            }
            //After removing print the array...
            System.out.println("After removing the element " + element + "-->");
            System.out.print("[");
            for(int i = 0; i < length - 1; i++) {
                System.out.print(Array[i] + ", ");
            }
            System.out.print("\b\b]");
        }
    }
}
