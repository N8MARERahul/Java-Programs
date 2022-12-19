/*
Create an abstract class employee, having its properties and abstract function for calculating net 
salary and displaying the information. Derive manager and clerk class from this abstract class and
implement the abstract method net salary and override the display method
*/

abstract class Employe {
    abstract void salary();
    abstract void display();
}

class Manager extends Employe {
    double manager_salary;
    void salary() {
        manager_salary = 50000;
    }
    void display() {
        System.out.println("Salary of Manager is = " + manager_salary);
    }
}

class Clerk extends Employe {
    double clerk_salary;
    void salary() {
        clerk_salary = 20000;
    }
    void display() {
        System.out.println("Salary of Clerk is = " + clerk_salary);
    }
}

public class Question_23 {
    public static void main(String[] args) {
        Employe mymanger = new Manager();
        Employe myclerk = new Clerk();
        mymanger.salary();
        mymanger.display();
        myclerk.salary();
        myclerk.display();
    }
}
