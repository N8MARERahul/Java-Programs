// Write a java program to compare two strings lexicographically.

import java.util.Scanner;

public class Question_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input two srings from user...
        System.out.println("Enter First string :");
        String string_1 = sc.nextLine();
        System.out.println("Enter the second string :");
        String string_2 = sc.nextLine();
        //Compare two strings...
        int compare = string_1.compareTo(string_2);

        if (compare < 0) {
            System.out.println("str1 is greater than str2\n" + compare);
        } else if (compare == 0) {
            System.out.println("str1 is equal to str2\n" + compare);
        } else {
            System.out.println("str1 is less than str2\n" + compare);
        }
    }
}
