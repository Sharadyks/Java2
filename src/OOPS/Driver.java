package OOPS;

public class Driver {
    public static void main(String[] args) {
        Car fronx = new Car();
        fronx.currentFuelInLitres = 23F;
        fronx.start();
        fronx.drive();
        System.out.println(fronx.getfuel());
        fronx.addfuel(5);
        fronx.drive();
        System.out.println(fronx.getfuel());
    }
}
