package Collections.Stack;

import java.util.Stack;

public class Example1 {
    public static void main(String[] args) {
        Stack<Object> stack = new Stack<>();
        stack.push(2);
        stack.push("Sharad");
        stack.push(4);
        stack.push(10);
//        System.out.println(stack);
        stack.pop();
//        System.out.println(stack);
//        System.out.println(stack.peek());
//        System.out.println(stack);
//        System.out.println(stack.capacity());
        stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.push(10);
        System.out.println(stack.capacity());
        stack.push(10);
        System.out.println(stack.capacity());
        System.out.println(stack.get(1));
    }
}
