/* 
Write a Java method to count all words in a string.
Test Data:
Input the string: The quick brown fox jumps over the lazy dog.
 Expected Output:
Number of words in the string: 9
*/

import java.util.Scanner;

public class Question_18 {
    //Method to count no of words in the string...
    static int word_count(String str) {
        // Check the string is null or empty then return 0...
        if (str == null || str.isEmpty())
            return 0;

        int count = 0;
        boolean isword = false;
        int end_of_string = str.length() - 1;
        // Converting the given string into character array...
        char[] ch = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            /*
            Check if the character is a letter
            and index of character array doesn't
            equal to end of line that means, it is
            a word and set isWord by true...
            */
            if (Character.isLetter(ch[i]) && i != end_of_string)
                isword = true;
            /*
            Check if the character is not a letter
            that means there is a space, then we
            increment the wordCount by one and set
            the isWord by false...
            */
            else if (!Character.isLetter(ch[i]) && isword) {
                count ++;
                isword = false;
            }     
            // Check for the last word of the sentence and increment the wordCount by one...
            else if (Character.isLetter(ch[i]) && i == end_of_string)
                count ++;
        }
        //Return the total number of words in the string...
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input a string from user...
        System.out.println("Enter a string : ");
        String string = sc.nextLine();
        //Printing the result...
        System.out.println("No of Words : " + word_count(string));
    }
}
