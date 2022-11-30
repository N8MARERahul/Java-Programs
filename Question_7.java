/*
Consider you are designing vehicles engine with ‘speed:int, gear:int’. you can define your engine 
functionalities ‘speedUp(value)’ and ‘changeGear(value) in an interface. The class which is 
implementing the interface should implement all the methods in the interface.
*/

interface EngineFunctionalities {   //Create an interface...
    //Define the functions...
    public void speedUp(int top_speed);
    public void changeGear(int no_of_gear);
}

//Implement the interface in a class...
class EngineSpecs implements EngineFunctionalities {    

    //Inplements the functions of the interface...
    public void speedUp(int top_speed) {
        System.out.println("The Top Speed of the Engine is " + top_speed + " km/h...");
    }

    public void changeGear(int no_of_gear) {
         System.out.println("The Engine has " + no_of_gear + " gear...");
    }
    
}

public class Question_7 {
    public static void main(String[] args) {
        //Create an object of the class 'EngineSpecs'...
        EngineSpecs engine = new EngineSpecs(); 

        //Use the functions of the interface...
        engine.speedUp(400);
        engine.changeGear(6);
    }
}
