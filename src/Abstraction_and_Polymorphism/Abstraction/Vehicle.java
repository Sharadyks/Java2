package Abstraction_and_Polymorphism.Abstraction;

public abstract class Vehicle {
    private int noOfTyres;

    public Vehicle(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    public int getNoOfTyres() {
        return noOfTyres;
    }

    public void setNoOfTyres(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }
    public void commute(){
        System.out.println("Going....");
    }
}
