package Abstraction_and_Polymorphism.Abstraction.Programming_Challeneges;

public class Car extends Vehicle{
    public static void main(String[] args) {
        Car car = new Car();
        car.service();
    }
    @Override
    public void service(){
        System.out.println("The car is ready for servicing");
        super.service();
    }
}
