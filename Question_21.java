// Write a program to create your own exception as NegativeSizeException whenever negative values are put in an array.
import java.util.Arrays;
import java.util.Scanner;

class NegativeSizeException extends Exception  {
    public NegativeSizeException (String Str){
        super(Str);
    }
}

public class Question_21 {
    static void check (int size) throws NegativeSizeException{
        if (size < 0)
            throw new NegativeSizeException("Size of array cannot be nagative");
        else
            System.out.println("Array creation succesful");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.print("Enter the size of the array : ");
        n = sc.nextInt();
        try {
            check(n);
        } catch (NegativeSizeException e) {
            System.out.println("Exception occured : "+ e);
            System.exit(0);
        }

        int arr [] = new int [n];
        System.out.println("Enter the elements of array : ");
        for (i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
    }
}