package Abstraction_and_Polymorphism.Abstraction.Polymorphism;


public class Car extends Vehicle{

    @Override
    public void start() {
        System.out.println("Welcome to Maruti Suzuki");
    }
    public int noOfDoors(){
        return 5;
    }
}
