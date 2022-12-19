/*
22. Create a class Student with following operations
a) create parameterized constructor to initialize the objects.
b) create a function isEqual() to check whether the two objects are equal or not which returns the 
Boolean value and gets two objects.
c) print the result in main method if objects are equals or not (take variables as your assumption)
*/

class Student {

    String name, city;

    Student(String name, String city) {
        this.name = name;
        this.city = city;
    }

    boolean isEqual(Object obj_1, Object obj_2) {
        
        return obj_1.equals(obj_2);
    }
}

public class Question_22 {
    public static void main(String[] args) {
        
        Student student_1 = new Student("Rahul", "Howrah");
        Student student_2 = new Student("Amit", "Kolkata");

        System.out.println(student_1.isEqual(student_1, student_2));
    }
}
