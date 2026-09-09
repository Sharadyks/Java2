package Collections.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;
public class VectorList {
    public static void main(String[] args) {
        Vector<Object> list = new Vector<>(3,2);
        list.add("Sharad");
        list.add(10);
        list.add("Sharma");
        System.out.println(list.capacity());
        list.add("Hello");
        System.out.println(list.capacity());

        Vector<Object> vectorList = new Vector<>(Arrays.asList("Aman", 34,26));
        System.out.println(vectorList.get(1));

        LinkedList<Object> linkedlist = new LinkedList<>();
        linkedlist.add("Hi");
        linkedlist.add(3);
        linkedlist.add(7);

        Vector<Object> vectorList2 = new Vector<>(linkedlist);
        System.out.println(vectorList2.get(2));
    }
}
