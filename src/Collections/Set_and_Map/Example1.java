package Collections.Set_and_Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<>();

        set.add("Sharad");
        set.add("Rohan");
//        set.add("Khushi");
//        set.add("Sita");
//        set.add("Rahul");
        System.out.println(set);
        System.out.println(set.contains("Khushi"));

        Map<Object,Object> map = new HashMap<>();

        map.put("Lead","Sharad");
        map.put("Co-Lead","Rohan");
        System.out.println(map);
        System.out.println(map.equals(set));
    }
}
