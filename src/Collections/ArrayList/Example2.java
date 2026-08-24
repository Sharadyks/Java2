package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example2 {
    public static void main(String[] args){
        List<String> list1 = Arrays.asList("Sharad", "Sharma", "Hello");
//        Arrays.asList("Hi", "Me", " You");

        list1.set(0,"Nice");
        List<String> list3 = new ArrayList<>(list1);
        list3.add("You");
        System.out.println(list3);


        List<String> list2 = List.of("Earth","Mars","Neptune");

        List<String> list4 = new ArrayList<>(list2);
        list4.add("Uranus");
        System.out.println(list4);
        list4.set(0,"Saturn");
        System.out.println(list4);
    }
}
