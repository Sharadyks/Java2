package Abstraction_and_Polymorphism.Abstraction;

public interface Transport {

    void getSetGo();
    static void refuel(){
        System.out.println("Vehicle is refueling");
    }

}
