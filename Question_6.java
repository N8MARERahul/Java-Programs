/*
Create a base class ‘Square’ having instance variable side:double. Initiate variable using constructor, 
a method ‘getVolume() : double’ that calculates volume and print it. Create a derived class ‘Cylinder’ 
having instance variable height:double. Initiate variables of both classes through constructor, 
override method ‘getVolume() : double’ to calculate volume of cylinder taking ‘side’ variable of base 
class as ‘radius’ and print it.
*/

class Square {
    double side;   //Declaire a instance veriable...
    
    Square() {  //Initiate the variable using constructor...
        side = 5;
    }

    double getVolume() {
        //A function to calculate and return the volume of the square...
        double vol_square = side * side * side;       
        return vol_square;
    }
}

class Cylinder extends Square {
    double height;

    Cylinder() {    //Initiate variables of both classes through constructor...
        super.side = 7;
        height = 10;
    }

    @Override   //Override the function getVolume()...
    double getVolume() {
        //A function to calculate and return the volume of the cylinder...
        double vol_cylinder = 3.14 * side * side * height;
        return vol_cylinder;
    }
}

public class Question_6 {
    public static void main(String[] args) {

        Square square = new Square();   //Create an object of Square class...
        Cylinder cylinder = new Cylinder();     //Create an object of Cylinder class...

        //Print the volume of Square...
        System.out.println("Volume of the Square is = " + square.getVolume());
        //Print the volume of Cylinder...
        System.out.println("Volume of the Cylinder is = " + cylinder.getVolume());
    }
}
