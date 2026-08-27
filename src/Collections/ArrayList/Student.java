package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Example4{
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Sharad",7.6));
        list.add(new Student("Rohan",7.2));
        list.add(new Student("Anuj",7.8));
        list.add(new Student("Luv",7.2));

//        list.sort((o1,o2) ->{
//            if (o2.getGpa() - o1.getGpa() > 0){return 1;}
//            else if (o2.getGpa() - o1.getGpa() < 0) {return -1;}
//            else {return 0;}
//        });
//
//

        Comparator<Student> compare = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
        list.sort(compare);
        for (Student s : list){
            System.out.println("Name: "+ s.getName() + " || GPA: " + s.getGpa());
        }

    }
}
public class Student {
    private final String name;
    private final double gpa;

    public Student(String name, double gpa){
        this.gpa = gpa;
        this.name = name;
    }
    public String getName(){return name;}

    public double getGpa() {return gpa;}
}
