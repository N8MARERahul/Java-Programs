/*
Write a program in java with class Employee and do the following operations on it
a) Create two constructor default and with Object as parameter to initialize class variables.
b) Create a function Calculate which calculates the pf and allowances on the salary of employee and 
return the all values as an object.
*/

class Employee {
    double gross_salary;
    double pf, allowances, professonal_tax, insurance, inhand;
    Employee(Employee employee) {
        gross_salary = employee.gross_salary;
    }

    Employee(double salary) {
        gross_salary = salary;
    }
  
    Employee Calculate() {     
        Employee emp = new Employee(gross_salary);
        emp.pf = gross_salary * 12 / 100;
        emp.professonal_tax = 200;
        emp.insurance = 250;
        emp.allowances = emp.pf + emp.professonal_tax + emp.insurance; 
        emp.inhand = gross_salary - emp.allowances;
        return emp;
    }
}

public class Question_20 {
    public static void main(String[] args) {
        Employee employee = new Employee(40000);
        // Employee employee2 = new Employee(employee);
        Employee employee2 = employee.Calculate();

        System.out.println("Total Salary = Rs. " + employee2.gross_salary + "\nPF = 12 % of Total Salary = Rs. " + employee2.pf);
        System.out.println("Allowances = (PF + Professonal Tax + Insurance) \n= " + "(" + employee2.pf + " + " + employee2.professonal_tax + " + " + employee2.insurance + ") \n= Rs. " + employee2.allowances);
        System.out.println("In Hand Salary = (Total Salary - Allowance)" + "\n= (" + employee2.gross_salary + " - " + employee2.allowances + ")\n= Rs. " + employee2.inhand);
        // System.out.println(employee2.gross_salary);
    }
}
