package Encapsulation_and_Inheritance.Programming_Challenges;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Sharad Sharma",20);
        Person person2 = new Person("Sharad Sharma",20);
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person1.equals(person2));
    }
}
