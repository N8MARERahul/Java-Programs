import java.util.Scanner;

/*
Create a superclass ‘Person’ and two subclasses ‘Student’ and ‘Staff’. The following are the instance 
    variables and methods:
a. For ‘Person’ instance variables: name:String, address:String. Initiate variable through constructor, incorporate one method 
    setPerson() that updates Person variables , another method tostring() that shows Person details as “Person[name=?,address=?”.
b. For ‘Student’ sub class instance variables: program:String, year:String, fees:double. Initiate both ‘Student’ and ‘Person’ variables 
    through constructor, incorporate one method setStudent() that updates both student and ‘Person’ data, another method tostring() that
    shows ‘Person-Student’ details as “Person[name=?,address=?,Program=?,Year=?,Fees=?”.
c. For ‘Staff’ subclass instance variables: school:String, pay:double. Initiate both ‘Staff’ and ‘Person’ variables through constructor,
    incorporate one method setStaff() that updates both ‘staff’ and ‘Person’ data, another method tostring() that shows ‘Person-Staff’ 
    details as “Person[name=?,address=?,School=?,Pays=?”.
Write the classes and a test driver main class to test all functions mentioned above.
*/

class Person {
    String name, address;   //Declaire two inatance variables name and address...

    Person() {
        //Initialize both veriables name and address thorough constructor...
        name = "Rahul";
        address = "Howrah";
    }

    void setPerson(String _name, String _address) {
        //Initialize the variables name and address...
        name = _name;
        address = _address;
    }

    String tostring() {
        //Return the values of name and address as a string...
        return "Person[name = " + name + ", address = " + address + "]..";
    }
}

class Student extends Person {      //Declaire a subclass which inherite the super class Person...
    //Declaire three inatance variables program, year and fees...
    String program;
    String year;
    double fees;
    Student() { //Initiate both ‘Student’ and ‘Person’ variables through constructor...
        super.name = "Pal";
        super.address = "Kolkata";
        program = "Java";
        year = "2022";
        fees = 4000.00;
    }

    void setStudent(String _name, String _address, String _program, String _year, double _fees) {
        //updates both student and ‘Person’ data...
        super.name = _name;
        super.address = _address;
        program = _program;
        year = _year;
        fees = _fees;
    }
    
    String tostring() {
        //Return the values of all veriables as a string...
        return "Person[name = " + name + ", address = " + address + ", Program = " + program + ", Year = " + year + "Fees = " + fees + "]..";
    }
}

class Staff extends Person {    //Declaire a subclass which inherite the super class Person...
    //Declaire two inatance variables school and pay...
    String school;
    double pay;
    Staff() {   //Initiate both ‘Staff’ and ‘Person’ variables through constructor...
        super.name = "Das";
        super.address = "Delhi";
        school = "ABCD School";
        pay = 10000.00;
    }

    void getStaff(String _name, String _address, String _school, double _pay) {
        //updates both staff and ‘Person’ data
        super.name = _name;
        super.address = _address;
        school = _school;
        pay = _pay;
    }

    String tostring() {
        //Return the values of all veriables as a string...
        return "Person[name = " + name + ", address = " + address + ", School = " + school + ", Pays = "+ pay + "]..";
    }
}

public class Question_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);    //Create an object of main class...

        //Create a menu driven to test the constructor and functions seperately...
        System.out.println("Press 1 to print deafult values");
        System.out.println("Press 2 to print Entered values");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        if(ch == 1) {  
        Person person = new Person();   //Create an object of 'Person' class and test constructor...
        System.out.println(person.tostring());
        Student student = new Student();    //Create an object of 'Student' class and test constructor...
        System.out.println(student.tostring());
        Staff staff = new Staff();  //Create an object of 'Staff' class and test constructor...
        System.out.println(staff.tostring());
        }
        else if (ch == 2) {
            Person person = new Person();   //Create an object of 'Person' class and test setPerson() function...
            person.setPerson("Steve", "USA");
            System.out.println(person.tostring());
            Student student = new Student();    //Create an object of 'Student' class and test setStudent() function...
            student.setStudent("Williams", "Newyork", "Java coding", "2022", 100000);
            System.out.println(student.tostring());
            Staff staff = new Staff();  //Create an object of 'Staff' class and test setStaff() function...
            staff.getStaff("RDJ", "America", "ABCD International", 50000);
            System.out.println(staff.tostring());
        }
        else {
            System.out.println("Wrong choice...");
        }
    }
}
