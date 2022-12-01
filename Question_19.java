/*
Write a program in java to create Box class with parameterized constructor with an object argument
to initialize length, breadth and height also create a function volume which returns the volume of the 
box and print it in main method.
*/

class Box {
    double length, breadth, height;

    Box(Box box) {
        length = box.length;
        breadth = box.breadth;
        height = box.height;
    }

    Box(double len, double bre, double hei) {
        length = len;
        breadth = bre;
        height = hei;
    }

    double volume() {
        return length * breadth * height;
    }
}

public class Question_19 {
    public static void main(String[] args) {
        
        Box box = new Box(10, 20, 30);
        Box newbox = new Box(box);

        System.out.println("Volume of the NewBox is : " + newbox.volume() + " cube unit.");
    }
}
