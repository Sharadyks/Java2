package OOPS;

public class Car {
    int noOfSeats;

    String colour;

    float maxSpeed;

    static float currentFuelInLitres = 50;

    public Car start(){
        if (currentFuelInLitres==0){
            System.out.println("There is no fuel in vehicle!");
        } else if (currentFuelInLitres<5) {
            System.out.println("The car is in reserved mode, please refuel");
        } else {
            System.out.println("Welcome to Maruti Suzuki Fronx");
        }
        return this;
    }

    public Car drive(){
        System.out.println("Car is driving");
        currentFuelInLitres--;
        return this;
    }
    public Car addfuel(float fuel){
        currentFuelInLitres += fuel;
        return this;
    }
    public float getfuel(){
        return currentFuelInLitres;
    }

//    public Car setCurrentFuelInLitres(Float currentFuelInLitres) {
//        this.currentFuelInLitres = currentFuelInLitres;
//        return this;
//    }
}
