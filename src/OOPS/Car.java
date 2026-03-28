package OOPS;

public class Car {
    int noOfSeats;

    String colour;

    float maxSpeed;

    Float currentFuelInLitres;

    public void start(){
        if (currentFuelInLitres==0){
            System.out.println("There is no fuel in vehicle!");
        } else if (currentFuelInLitres<5) {
            System.out.println("The car is in reserved mode, please refuel");
        } else {
            System.out.println("Welcome to Maruti Suzuki Fronx");
        }
    }

    public void drive(){
        System.out.println("Car is driving");
        currentFuelInLitres--;
    }
    public void addfuel(float fuel){
        currentFuelInLitres += fuel;
    }
    public float getfuel(){
        return currentFuelInLitres;
    }

}
