//WAP to sorts half of elements in ascending and rest of the elements in decending order...

import java.util.Scanner;

public class Question_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  //Create an object...

        System.out.print("Enter the total number of elements to be inserted: ");
        int n = sc.nextInt();   //Taking the length of the list from user...

        int arr[] = new int[n];   //Initialize array...

        System.out.println("Enter the Elements: ");
        for (int i = 0; i < n; i++)     //Taking the elements from the user...
            arr[i] = sc.nextInt();

        System.out.println("The numbers are :");
        for (int i = 0; i < n; i++)     //Display the list...
            System.out.print(arr[i] + "\t");

        System.out.println();

        for (int i = 0; i < n / 2 - 1; i++) {       //Sort the 1st half of the list in ascending order...
            for (int j = 0; j < n / 2 - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }

        for (int i = 0; i < n / 2 - 1; i++) {       //Sort the 2nd half of the list in descending order...
            for (int j = n / 2 + 1; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        System.out.println("The Numbers Arranged 1st half in assending and 2nd half in Decending orders are:");
        for (int i = 0; i < n; i++)     //Print the sorted list...
            System.out.print(arr[i] + "\t");
    }
}