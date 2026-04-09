package Abstraction_and_Polymorphism.Abstraction.Programming_Challeneges;
import java.util.Scanner;
public class Circle extends Shape{
    Scanner input = new Scanner(System.in);
    private double radius = input.nextDouble();

    @Override
    public void calculateArea() {
        double area = Math.PI * Math.pow(radius,2);
        System.out.println("Area of circle is "+ area);
    }

}
