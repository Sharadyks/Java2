package Encapsulation_and_Inheritance.Nested_Class;

public class Car {

    private int noOfDoors;

    public void repair(){
        Tyre tyre = new Tyre();
    }
    public class Tyre {

        private double width;

        private double pressure;

        private double materal;

        public void inflate(){
            noOfDoors = 4;
            class Pressuretool{
                 double maxLimit;
                 int totalAmount;
            }
        }
    }
}
