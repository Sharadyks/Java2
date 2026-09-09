package Collections.LinkedList;

import java.util.LinkedList;

public class Example2 {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        list.add(2);
        list.add("Sharad");
        System.out.println(list);
        System.out.println(list.get(1)); // O(n)
        list.remove(1);
        list.addLast(4); // O(1)
        list.addFirst("Sharma"); // O(1)
        System.out.println(list);
    }
}
