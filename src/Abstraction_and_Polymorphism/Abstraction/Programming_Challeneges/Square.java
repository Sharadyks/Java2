package Abstraction_and_Polymorphism.Abstraction.Programming_Challeneges;
import java.util.Scanner;
public class Square extends Shape{
    Scanner input = new Scanner(System.in);
    private double side = input.nextDouble();

    @Override
    public void calculateArea() {
        double area = Math.pow(side,2);
        System.out.println("The area of square is: "+ area);
    }
}
