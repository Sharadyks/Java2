package Abstraction_and_Polymorphism.Abstraction;

public abstract class Vehicle implements Transport {
    private int noOfTyres;

    public abstract void makeStartSound();
    public Vehicle(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    @Override
    public void getSetGo() {
        System.out.println("Welcome, Enjoy your ride");
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
