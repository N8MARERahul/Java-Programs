//WAP to delete all the consonents from a string and print the result string...

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String string = sc.nextLine();     //Input the string from user...

        //Replace all the consonants with ""...
        string = string.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]", "");

        System.out.println("After deleting all consonants from the string->>");
        System.out.println(string);        //Print the string after reamoving all the consonants...
    }
}
