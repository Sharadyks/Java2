// This class demonstrate how Comparator functional interface works
package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//class StringComparator implements Comparator<String>{
//    @Override
//    public int compare(String o1, String o2) {
//        return o1.length()-o2.length();
//    }
//}
//class MyComparator implements Comparator<Integer>{
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        return o2-o1;
//    }
//}
public class Example3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(6);

        list.sort((a,b) -> a-b);
        System.out.println(list);


        List<String> list1 = new ArrayList<>();
        list1.add("Sharad");
        list1.add("Sharma");
        list1.add("Hello");
        list1.add("Me");
        list1.add("Discrimination");

        list1.sort((a,b) -> b.length()-a.length());
        System.out.println(list1);
    }
}
