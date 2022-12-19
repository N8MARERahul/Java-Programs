// Write a program to create your own exception as NegativeSizeException whenever negative values are put in an array.
public class Question_21 {
    public static void main(String[] args) {
        
        // Tring to initialize an array length with negative value...
        int[] array = new int[-6];

        System.out.println("Array length: " + array.length);
    }
}
