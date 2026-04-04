package Encapsulation_and_Inheritance.Equals;


public class EqualsandHashCodeTest {
    public static void main(String[] args){
        Person person1 = new Person("Sharad Sharma",20,"EIT209");
        Person person2 = new Person("Sharad Sharma",20,"EIT209");
        System.out.println(person1.equals(person2));  //Here when we are using equals() for comparing two objects it says that they are not equal because, when we default use equals, it compares the references as it has already written in the Object class. So if we want to compare the values, we have to override equals method.

//        System.out.println(person1.equals(person2)); // Now after writing override method equals it is comparing the value of objects
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }


}
