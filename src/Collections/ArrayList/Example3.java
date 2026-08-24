package Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(6);

        list.sort(null);
        System.out.println(list);
    }
}
