/*
A class called MyPoint, which models a 2D point with x and y coordinates. It contains:
• Two instance variables x (int) and y (int).
• A default (or "no-argument" or "no-arg") constructor that construct a point at the default location 
    of (0, 0).
• A overloaded constructor that constructs a point with the given x and y coordinates.
• A method setXY() to set both x and y.
• A method getXY() which returns the x and y in a 2-element int array.
• A toString() method that returns a string description of the instance in the format "(x, y)".
• A method called distance(int x, int y) that returns the distance from this point to another point at the 
given (x, y) coordinates, Write the MyPoint class. Also write a test driver (called TestMyPoint) to test 
all the public methods defined in the class.
*/

class MyPoint {
    int x, y;       //Declaire two inatance variables x and y...

    MyPoint() {
        //Initialize both veriables x, y at 0, 0 thorough default constructor...
        x = 0;
        y = 0;
    }

    MyPoint(int a, int b) {
        //Initialize both veriables x, y thorough overload constructor...
        x = a;
        y = b;
    }

    void setXY(int a, int b) {
        //Initialize both veriables x, y...
        x = a;
        y = b;
    }

    int[] getXY() {
        //Enter the values of x, y in a array and return it...
        int arr[] = new int[2];
        arr[0] = this.x;
        arr[1] = this.y;
        return arr;
    }

    String tostring() {
        //Return the values of x, y as a string...
        return "(" + x + ", " + y + ")";
    }

    double distance(int a, int b) {
        //Calculate the distance...
        return Math.pow((Math.pow((a - x), 2) + Math.pow((b - y), 2)), 0.5);
    }
}

public class Question_4 {
    public static void main(String[] args) {

        //Create an object and test the deafult constructor...
        MyPoint point_1 = new MyPoint();
        //Test getXY() function...
        System.out.println("array [0] = " + point_1.getXY()[0] + "\narray [1] = " + point_1.getXY()[1]);
        System.out.println(point_1.tostring()); //Test tostring() function...
        //Test distance() function...
        System.out.println("Distance between the Points (0, 0) and (30, 30) is --> " + point_1.distance(30, 30) + " unit...\n");
        
        //Create an object and test the overload constructor...
        MyPoint point_2 = new MyPoint(10, 10);
        //Test getXY() function...
        System.out.println("array [0] = " + point_2.getXY()[0] + "\narray [1] = " + point_2.getXY()[1]);
        System.out.println(point_2.tostring()); //Test tostring() function...
        //Test distance() function...
        System.out.println("Distance between the Points (10, 10) and (30, 30) is --> " + point_2.distance(30, 30) + " unit...\n");

        //Create an object and test the setXY() function...
        MyPoint point_3 = new MyPoint();
        point_3.setXY(5, 5);
        //Test getXY() function...
        System.out.println("array [0] = " + point_3.getXY()[0] + "\narray [1] = " + point_3.getXY()[1]);
        System.out.println(point_3.tostring()); //Test tostring() function...
        //Test distance() function...
        System.out.println("Distance between the Points (5, 5) and (30, 30) is --> " + point_3.distance(30, 30) + " unit...\n");
    }
}