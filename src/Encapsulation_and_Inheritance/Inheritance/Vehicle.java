package Encapsulation_and_Inheritance.Inheritance;

public class Vehicle {
    private int noOfWheels;
    protected String vehicleNumber;
    public String insuranceID;
    public int fuelLevelinLitres;


    public void start(){
        if (fuelLevelinLitres==0){
            System.out.println("The vehicle is ran out of fuel! please refuel it");
        } else if (fuelLevelinLitres<3) {
            System.out.println("THe vehicle is in reserve mode");
        } else {
            System.out.println("The vehicle has started");
        }
    }
    public void setNoOfWheels(int noOfWheels){
        this.noOfWheels = noOfWheels;
    }
    public void refuel(int fuel){
        fuelLevelinLitres += fuel;
    }

}
