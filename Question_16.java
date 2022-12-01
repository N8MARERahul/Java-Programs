/* Write a Java program to find whether a region in the current string matches a region in another string.
Sample Output:
str1[0 - 7] == str2[28 - 35]? true
str1[9 - 15] == str2[9 - 15]? false
*/

import java.util.Scanner;

public class Question_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input two srings from user...
        System.out.println("Enter First string :");
        String string_1 = sc.nextLine();
        System.out.println("Enter the second string :");
        String string_2 = sc.nextLine();

        System.out.println("Enter the region of First String ->");
        System.out.print("Starting : ");
        int start_first = sc.nextInt();
        System.out.print("Ending : ");
        int end_first = sc.nextInt();

        System.out.println("Enter the region of Second String ->");
        System.out.print("Starting : ");
        int start_second = sc.nextInt();
        System.out.print("Ending : ");
        int end_second = sc.nextInt();

        if (end_first - start_first != end_second - start_second) {
            System.out.println("Length of both region is not same...\nEnter the same length of region...");
            System.exit(0); 
        }

        boolean flag = true;
        int j = start_second;
        for (int i = start_first; i <= end_first; i++, j++) {
            if (string_1.charAt(i) != string_2.charAt(j)) {
                flag = false;
                break;
            }
        }

        System.out.println("str1[" + start_first + " - " + end_first + "] == str2[" + start_second + " - " + end_second + "]? - " + flag);
    }
}