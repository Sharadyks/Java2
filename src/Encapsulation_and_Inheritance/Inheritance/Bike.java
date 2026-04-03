package Encapsulation_and_Inheritance.Inheritance;

public class Bike extends Vehicle {
    public static void main(String[] args) {
        Bike bike1 = new Bike();
        bike1.start();
        bike1.refuel(9);
        bike1.start();
        bike1.setNoOfWheels(2);
        bike1.vehicleNumber = "";
//        bike1.noOfWheels = 2;
// Here, we can see that the child class Bike cannot directly access the private field of parent class, but there is another thing that in the perspective of memory, the child class holds the private field of its parent class in memory to smoothly operate with inherited public or protected methods that rely on private field.
    }
}
