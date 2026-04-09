package Abstraction_and_Polymorphism.Abstraction;

public class TestAbstraction {
    public static void main(String[] args) {
//        Vehicle veh = new Vehicle(2);
        Car car = new Car();
        car.commute();
        car.makeStartSound();
        car.getSetGo();
        Transport.refuel();
    }
}
