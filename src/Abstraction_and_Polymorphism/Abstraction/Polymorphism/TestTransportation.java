package Abstraction_and_Polymorphism.Abstraction.Polymorphism;

public class TestTransportation {
    public static void main(String[] args) {
        Car c = new Car();
        Vehicle v = new Vehicle();
        Plane p = new Plane();
        Vehicle veh = new Car();
//        castTest(v);
        castTest(c);
//        castTest(p);
    }
    private static void castTest(Vehicle veh){
//        veh.start();
        Car car = (Car)veh;
//        car.start();
        ((Car) veh).noOfDoors();
    }
}
