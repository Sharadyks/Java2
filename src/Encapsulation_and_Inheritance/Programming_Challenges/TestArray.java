package Encapsulation_and_Inheritance.Programming_Challenges;

public class TestArray {
    public static void main(String[] args) {
        ArrayOperation opr = new ArrayOperation(new int[]{4,8,3,6});
        ArrayOperation.Statistics statistics= opr.new Statistics();
        System.out.println(statistics.mean());
    }
}
