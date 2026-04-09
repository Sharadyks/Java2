package Abstraction_and_Polymorphism.Abstraction.Programming_Challeneges;

public class TestShape {
    public static void main(String[] args) {
        Circle cir = new Circle();
        Square sqr = new Square();
        cir.calculateArea();
        sqr.calculateArea();
    }
}
