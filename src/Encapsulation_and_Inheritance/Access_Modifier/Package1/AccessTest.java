package Encapsulation_and_Inheritance.Access_Modifier.Package1;

public class AccessTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "Silver";
        car1.model = "Baleno";
//        car1.fuellevel; // Because the fuellevel is made private it cannot be accessed in class AccessTest
        car1.costOfPurchase = 4541; // The field costOfPurchase is made default as we didn't write any modifier, So it can only be accessed in the class which is in same package as Car
        Car car2 = new Car("Black","Scorpio",53,6000000);
        System.out.println(car1);
        System.out.println(car2);
    }
}
