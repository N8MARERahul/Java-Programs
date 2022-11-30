import java.util.Arrays;
import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of elements in the array :");
        int number = sc.nextInt();  //Taking the length of the array...

        int array[] = new int[number];  //Initialize the array...

        System.out.println("Enter the elements of the array :");
        for(i = 0; i < number; i++)  //Taking the elements of the array...
            array[i] = sc.nextInt();
        
        //Printing the taken array...
        System.out.println("The given array is-->\n" + Arrays.toString(array));

        System.out.println("Enter a number to insert into the array :");
        int element = sc.nextInt(); //The number that want to insert...

        System.out.println("Enter the position in where you want to input :");
        int position = sc.nextInt();    //The position where want to insert...

        int array_2[] = new int[number + 1];  //Initialize another array...
        for(i = 0; i < number; i++)  //Copy the values from the other array...
            array_2[i] = array[i];

        //insertiing the element into the specific location...
        for(i = number - 1; i >= position; i--) {
            array_2[i + 1] = array_2[i];
            if(i == position)
                array_2[i] = element;
        }

        //Printing the final array after insertion...
        System.out.println("After insertion the array is-->\n" + Arrays.toString(array_2));
    }
}
