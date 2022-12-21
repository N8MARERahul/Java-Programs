//WAP to delete all the consonents from a string and print the result string...

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String string = sc.nextLine(); // Input the string from user...

        int i, count, k;
        char ch;
        String strRes = "", consonant = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        
        for (i = 0; i < string.length(); i++) {
            count = 0;
            ch = string.charAt(i);
            for (k = 0; k < consonant.length(); k++) {
                if (ch == consonant.charAt(k))
                    count++;
            }
            if (count == 0)
                strRes = strRes + ch;
        }

        System.out.println("After deleting all consonants from the string->>");
        System.out.println(strRes); // Print the string after reamoving all the consonants...
    }
}
