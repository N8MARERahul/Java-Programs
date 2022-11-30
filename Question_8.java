import java.util.Scanner;

// Write a program in java that handles both ‘ArrayIndexOutOfBoundsException’ and ‘ArithmeticException’.

public class Question_8 {
   public static void main(String[] args) {
    
    //Handling ArrayIndexOutOfBoundsException...
    //Declaire an array of 7 elements...
    int array[] = {4, 6, 10, 15, 100, 200};
    //Create an object of main class...
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the index of any element to show the element -->");
    int index = sc.nextInt();   //Taking index value from user...
    try {
        //Print the number of the given index...
        System.out.println("Element of the given index is -> " + array[index]);
    } catch (ArrayIndexOutOfBoundsException e) {
        //Print the Exception...
        System.out.println("The index you have entered is invalid\n" + e);
        System.out.println("Please enter an index number between 0 and 6");
    }
    System.out.println("\n\n");


    //Handling ArithmeticException...
    try {
        //Initialize two varible and trying to devide...
        int d = 0;
        int a = 20 / d;
        System.out.println("Answer = " + a);
    } catch (ArithmeticException e) {
        //Print the Exception...
        System.out.println("A number can't divide by 0\n" + e);
    }
   } 
}
