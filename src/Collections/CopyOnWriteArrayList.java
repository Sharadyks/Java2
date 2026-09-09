package Collections;

import java.util.ArrayList;
import java.util.List;

public class CopyOnWriteArrayList {
    public static void main(String[] args) {
        // Since ArrayList and Linked list are not thread safe therefore there will be inconsistency while doing concurrent modification
        // And, Stack and Vector are synchronised, but it is getting locked, therefore we'll use CopywriterArrayList.


        // Copy on Write means, when a write operation
        // like adding or removing an element
        // instead of directly modifying the existing list
        // A new copy of that list is created, and the modification applied to that copy
        // this ensure that the other threads reading the list while it's being modified are unaffected

        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("Apple");
        shoppingList.add("Banana");
        shoppingList.add("Egg");
        System.out.println("Initial shopping list: " + shoppingList);

        for (String item : shoppingList){
            System.out.println(item);
            if (item.equals("Egg")){
                shoppingList.add("Butter");
                shoppingList.add("Condensed Milk");
            }
        }
        System.out.println("Updated shopping list: " + shoppingList);
    }
}
