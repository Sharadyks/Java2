package Encapsulation_and_Inheritance.Programming_Challenges;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)){
            return false;
        }
        Person person = (Person) obj;
        return person.name.equals(name) &&
                person.age==age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}


