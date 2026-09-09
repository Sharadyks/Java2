package Collections.LinkedList;

public class Example1 {
    public static void main(String[] args) {
        Node node1 = new Node();
        Node node2 = new Node();
        node1.value = 10;
        node2.value = 20;
        node1.next = node2;
        node2.next = null;
        System.out.println(node1);
        
    }
}

class Node{
    int value;
    Node next;

    @Override
    public String toString() {
        return "Node 1 holds: " + value + " and point to: " + next;
    }
}


