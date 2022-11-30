import java.util.*;

public class Question_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of elements in the array :");
        int number = sc.nextInt();  //Taking the length of the array...

        int array[] = new int[number];  //Initialize the array...

        System.out.println("Enter the elements of the array :");
        for(int i = 0; i < number; i++)  //Taking the elements of the array...
            array[i] = sc.nextInt();
        
        //Printing the taken array...
        System.out.println("The given array is-->\n" + Arrays.toString(array));

        System.out.println("Enter the specific number :");
        int sum = sc.nextInt(); //Taking input the specific sum...

        boolean flag = false;
        //Finding the pairs...
        for(int i = 0; i < number; i++) {
            for(int j = 0; j < number; j++) {
                if(array[i] + array[j] == sum) {
                    System.out.println(array[i] + " + " + array[j] + " = " + sum);
                    flag = true;
                }
            }
        }
        //If no pair found put a message...
        if(!flag)
            System.out.println("No pair found...");
    }
}
