package Abstraction_and_Polymorphism.Abstraction.Programming_Challeneges;

public class Calculator {
    public int sum(int a, int b){
        return a+b;
    }
    public int sum(int a, int b, int c){
        return a+b+c;
    }
    public double sum(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(4,5));
        System.out.println(cal.sum(3,4,9));
        System.out.println(cal.sum(4.2,5));
    }
}
