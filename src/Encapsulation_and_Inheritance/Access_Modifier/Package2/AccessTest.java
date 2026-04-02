package Encapsulation_and_Inheritance.Access_Modifier.Package2;

import Encapsulation_and_Inheritance.Access_Modifier.Package1.Car;

public class AccessTest {
    public static void main(String[] args) {
        Car car1 = new Car("Black","Scorpio",52,2300000);
//        car1.fuelLevel;  // Here we cannot access double fuelLevel
        System.out.println(car1);
        // There is another one thing that if the constructor of class Car has been made default, we can't pass parameter in Encapsulation_and_Inheritance.Access_Modifier.Package2
    }
}
